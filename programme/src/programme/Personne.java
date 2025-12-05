/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programme;

/**
 *
 * @author herit
 */
public class Personne {
    private String nom;
    public Personne(){
//        this.nom = _nom;
    }
    
//    getters and setters 
    public void setNom(String _nom){
        this.nom = _nom;
    }
    public String getNom(){
        return nom;
    }
    
    
    public void afficher(){
        System.out.println("la personne s'appelle " + this.nom);
    }
}
