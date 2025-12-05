/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteque;

/**
 *
 * @author herit
 */
public class Livre {
    private String titre, auteur;
    private int anneePublication;
    private boolean disponible ;
    
    public Livre(){
        
    }
    public Livre(String titre, String auteur, int anneePublication, boolean disponible){
        this.titre = titre ;
        this.auteur = auteur;
        this.anneePublication = anneePublication;
        this.disponible = disponible;
    }
    public Livre(Livre livre){
        this.titre = livre.titre ;
        this.auteur = livre.auteur;
        this.anneePublication = livre.anneePublication;
        this.disponible = livre.disponible;
    }
    
    public void afficher(){
        System.out.println("Le livre :/ " + this.titre + ", Auteur : "
                + this.auteur + ", publie en : " + this.anneePublication 
                + (this.disponible? ", disponible" : ", non disponible"));
    }
    
    public void emprunter(){
        this.disponible = false;
    }
    public void retourner(){
        this.disponible = true;
    }
    
}
