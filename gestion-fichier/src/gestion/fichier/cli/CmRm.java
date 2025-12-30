/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.fichier.cli;

import gestion.fichier.metier.FichierSimple;
import gestion.fichier.metier.Repertoire;
import java.io.FileNotFoundException;
import java.util.Arrays;

/**
 *
 * @author herit
 */
public class CmRm extends Commande{
    String source;
    @Override
    public void executer() {
        String[] cheminSource = source.split("/");
        String cible = cheminSource[cheminSource.length - 1];
        String repertoireSource = "";
        
        if (cheminSource.length > 1){
            String[] reste = Arrays.copyOf(cheminSource, cheminSource.length - 1);
            repertoireSource = String.join("/", reste);
        }
        
        
        try {
            Repertoire src = Navigateur.getInstance().getRepertoireChemin(repertoireSource);
            src.removeFichier(src.getFichier(cible));
            
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void setParametres(String[] parametre) {
        this.source = parametre[0];
    }
    
}
