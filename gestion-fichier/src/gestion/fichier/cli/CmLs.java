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
public class CmLs extends Commande{
//    private String nom;

    @Override
    public void executer() {
        Navigateur.getInstance().getRepertoireCourrant().AfficherContenu();
    }

    @Override
    public void setParametres(String[] paramatre) {
//        this.nom = paramatre[0];

    }
    
}
