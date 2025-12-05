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
public class CmCD extends Commande{
    private String nom;
    private Repertoire newRepCourant;
    @Override
    public void executer() {
        if(newRepCourant!=null){
            Navigateur.getInstance().setRepertoireCourant(newRepCourant);
        }else{
            System.out.println("Repertoire non trouve !");
        }
   
    }

    @Override
    public void setParametres(String[] paramatre) {
        this.nom = paramatre[0];
        if(nom.equals("..")){
            this.newRepCourant = (Repertoire) Navigateur.getInstance().getRepertoireCourrant().getRepertoireParent();
        }else {
            this.newRepCourant = (Repertoire) Navigateur.getInstance().getRepertoireCourrant().getRepertoire(nom);
        }
    }
    
}
