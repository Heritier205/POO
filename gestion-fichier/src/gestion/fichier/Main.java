/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestion.fichier;

import gestion.fichier.cli.Commande;
import gestion.fichier.cli.Navigateur;
import gestion.fichier.cli.ParseurCommande;
import gestion.fichier.metier.Fichier;
import gestion.fichier.metier.Repertoire;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 *
 * @author herit
 */
public class Main {
    private static Scanner clavier = new Scanner(System.in);
    private static ParseurCommande parseur = new ParseurCommande();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Bonjour !!!");   
        try{
            Fichier.restaurer();
        }catch (Exception e){
            e.printStackTrace();
        }
            
        Navigateur.getInstance().setRepertoireCourant(Fichier.getRoot());
        while (true){
            String chemin = "heritie@dell" + 
                    Navigateur.getInstance().getRepertoireCourrant().getNomComplet() +
                    ">";
            
            System.out.print(chemin);
            String strCmde = clavier.nextLine();
            Commande commande = parseur.parser(strCmde);
            commande.executer();
        }
        
        // TODO code application logic here
    }
}
