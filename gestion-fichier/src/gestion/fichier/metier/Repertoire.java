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

    
    public Repertoire(Repertoire rep){
        super(rep);
        if(rep.getFichiers() != null){
            for(Fichier f : rep.fichiers){
                if(f.estRepertoire()){
                    Repertoire repertoire = (Repertoire) f;
                    Repertoire copie = new Repertoire(repertoire);
                    this.copierRepertoire(copie);
                }else{
                    FichierSimple fichier = (FichierSimple) f;
                    FichierSimple copie = new FichierSimple(fichier);
                    this.copierFichierSimple(copie);
                }
            }
        }
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
    public void copierRepertoire(Repertoire rep){
        Repertoire copie = new Repertoire(rep);
        copie.setRepertoirePaent(this);
        this.getFichiers().add(copie);
    }

    public void ajouterFichierSimple(String nom){
        new FichierSimple(nom, this);
    }
    public void copierFichierSimple(FichierSimple f){
        FichierSimple copie = new FichierSimple(f);
        copie.setRepertoirePaent(this);
        this.getFichiers().add(copie);
    }
    
    public void deplacerFichier(Fichier fic){
        if(fic.getRepertoireParent().getFichiers() != null){
            for(Fichier f : fic.getRepertoireParent().getFichiers()){
                if(f.getNom().equals(fic.getNom())){
                    fic.getRepertoireParent().getFichiers().remove(f);
                    break;
                }
            }
        }
        
        fic.setRepertoirePaent(this);
        this.getFichiers().add(fic);
    }
    
    public void removeFichier(Fichier fic){
        if(fic.getRepertoireParent().getFichiers() != null){
            for(Fichier f : fic.getRepertoireParent().getFichiers()){
                if(f.getNom().equals(fic.getNom())){
                    fic.getRepertoireParent().getFichiers().remove(f);
                    break;
                }
            }
        }
    }
    
    
    public void AfficherContenu(){
        if(this.fichiers.isEmpty()){
            System.out.println("\tDossier vide !");
        }
        for(Fichier f : fichiers){
            System.out.print("\t");
            if(f.estRepertoire()){
                System.out.print("<DIR>\t");
            }else{
                System.out.print("\t");
            }
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
    public boolean existeFichier(String nom){
        if(nom == null){
            return false;
        }
        for(Fichier f : fichiers){
            if(f.getNom().equals(nom)){
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
    
    public FichierSimple getFIchierSimple(String nom) throws FileNotFoundException{
        for(Fichier f : fichiers){
            if(f.getNom().equals(nom)&&!f.estRepertoire()){
                return (FichierSimple)f ;
            }
        }
        throw new FileNotFoundException("Fichier '" + nom + "' non trouve");
    }
    
    public Fichier getFichier(String nom) throws FileNotFoundException{
        for(Fichier f : fichiers){
            if(f.getNom().equals(nom)){
                return f ;
            }
        }
        throw new FileNotFoundException("Fichier '" + nom + "' non trouve");
    }
}
