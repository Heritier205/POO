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
public class CmMkdir extends Commande{
    private String nom;

    @Override
    public void executer() {
        if(!Navigateur.getInstance().getRepertoireCourrant().existeRepertoire(nom)){
            Navigateur.getInstance().getRepertoireCourrant().ajouterRepertoire(nom);
        }else{
            System.out.println("Repertoire existant");
        }
    }

    @Override
    public void setParametres(String[] paramatre) {
        this.nom = paramatre[0];

    }
    
}
