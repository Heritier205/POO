/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.fichier.cli;

import gestion.fichier.metier.Fichier;
import gestion.fichier.metier.FichierSimple;
import gestion.fichier.metier.Repertoire;
import java.io.FileNotFoundException;
import java.util.Arrays;

/**
 *
 * @author herit
 */
public class CmCp extends  Commande{
    private String source, destination;
    
    @Override
    public void executer() {
        
        
                
        try {
            String[] cheminSource = source.split("/");
            String cible = cheminSource[cheminSource.length - 1];
            String repertoireSource = "";

            if (cheminSource.length > 1){
                String[] reste = Arrays.copyOf(cheminSource, cheminSource.length - 1);
                repertoireSource = String.join("/", reste);
            }
            
            Repertoire src = Navigateur.getInstance().getRepertoireChemin(repertoireSource);
            Repertoire dst = Navigateur.getInstance().getRepertoireChemin(destination);
            
            Fichier FichierCible = src.getFichier(cible);
            
            if(FichierCible.estRepertoire()){
                Repertoire repCible = (Repertoire) FichierCible;
                if(!dst.existeRepertoire(cible)){
                    dst.copierRepertoire(repCible);
                }else{
                    System.out.println("Repertoire Existant");
                }
                
            }else{
                FichierSimple ficCible = (FichierSimple) FichierCible;
                if(!dst.existeFichierSimple(cible)){
                    dst.copierFichierSimple(ficCible);
                }else{
                    System.out.println("Fichier existant");
                }
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }catch (NullPointerException e){
            System.out.println("This command needs at least one argument !");
        }
        
    }

    @Override
    public void setParametres(String[] parametre) {
        this.source = parametre[0];
        if(parametre.length > 1){
            this.destination = parametre[1];
        }else{
            this.destination = "";
        }
    }
}
