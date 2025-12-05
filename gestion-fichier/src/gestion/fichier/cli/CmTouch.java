/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.fichier.cli;

import gestion.fichier.metier.Repertoire;

/**
 *
 * @author herit
 */
public class CmTouch extends Commande{
    private String nom;

    @Override
    public void executer() {
        if(!Navigateur.getInstance().getRepertoireCourrant().existeFichierSimple(nom)){
            Navigateur.getInstance().getRepertoireCourrant().ajouterFichierSimple(nom);        
        }else{
            System.out.println("Fichier existant");
        }
        
    }

    @Override
    public void setParametres(String[] paramatre) {
        this.nom = paramatre[0];

    }
    
}
