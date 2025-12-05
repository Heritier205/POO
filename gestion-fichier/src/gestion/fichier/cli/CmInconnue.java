/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.fichier.cli;

/**
 *
 * @author herit
 */
public class CmInconnue extends Commande{

    @Override
    public void executer() {
        System.out.println("Commande inconnue");
    }

    @Override
    public void setParametres(String[] paramatre) {
    }
    
    
}
