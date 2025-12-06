/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.fichier.metier;

import java.io.FileNotFoundException;
import java.io.Serial;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author herit
 */
public class Repertoire extends Fichier{
    @Serial
    static final long serialVersionUID = -3387516993124229948L;
    private List<Fichier> fichiers = new ArrayList<>();

    public Repertoire(){
        
    }
    public Repertoire(String nom, Repertoire repertoireParent){
        super(nom, repertoireParent);
        
    }
    
    
    @Override
    public int getTaille() {
        int taille = 0;
        for(Fichier f : fichiers){
            taille += f.getTaille();
        }
        return taille;
    }
    
    
    public void ajouterRepertoire(String nom){
        new Repertoire(nom, this);
    }
    
    public void ajouterFichierSimple(String nom){
        new FichierSimple(nom, this);
    }
    
    public void AfficherContenu(){
        for(Fichier f : fichiers){
            System.out.println(f.getNom() + "\t");
        }
    }
    
    public List<Fichier> getFichiers(){
        return this.fichiers;
    }

    @Override
    public boolean estRepertoire() {
        return true;
    }
    
    public boolean existeFichierSimple(String nom){
        if(nom == null){
            return false;
        }
        for(Fichier f : fichiers){
            if(f.getNom().equals(nom)&&!f.estRepertoire()){
                return true;
            }
        }
        return false;
    }
    
    public boolean existeRepertoire(String nom){
        if(nom == null){
            return false;
        }
        for(Fichier f : fichiers){
            if(f.getNom().equals(nom)&&f.estRepertoire()){
                return true;
            }
        }
        return false;
    }
    
    public Repertoire getRepertoire(String nom)throws FileNotFoundException{
        for(Fichier f : fichiers){
            if(f.getNom().equals(nom)&&f.estRepertoire()){
                return (Repertoire)f ;
            }
        }
        throw new FileNotFoundException("Repertoire '" + nom + "' non trouve");
    }    
}
