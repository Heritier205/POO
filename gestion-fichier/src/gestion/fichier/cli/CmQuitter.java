/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.fichier.cli;

import gestion.fichier.metier.Fichier;
import java.util.Scanner;

/**
 *
 * @author herit
 */
public class CmQuitter extends Commande{
    @Override
    public void executer() {
        Scanner clavier = new Scanner(System.in);
        System.out.print("Quitter le programme (o/N) ? ");
        String reponse = clavier.next().toUpperCase();
        if(reponse.equals("O")){
            try{
                Fichier.sauvegarder();
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.println("A bientot ");
            System.exit(0);
            
        }
    }

    @Override
    public void setParametres(String[] paramatre) {
        
    }
}
