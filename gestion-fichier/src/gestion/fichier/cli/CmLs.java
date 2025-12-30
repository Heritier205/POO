/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.fichier.cli;

import gestion.fichier.metier.Repertoire;
import java.io.FileNotFoundException;

/**
 *
 * @author herit
 */
public class CmLs extends Commande{
    private String chemin;

    @Override
    public void executer() {
        if(chemin != null){
            try {
                Navigateur.getInstance().getRepertoireChemin(chemin).AfficherContenu();
            } catch (FileNotFoundException ex) {
                System.out.println(ex.getMessage());
            }
        }else{
            Navigateur.getInstance().getRepertoireCourrant().AfficherContenu();
        }
    }

    @Override
    public void setParametres(String[] paramatre) {
        this.chemin = paramatre[0];

    }
    
}
