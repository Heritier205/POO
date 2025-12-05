/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo1;

/**
 *
 * @author herit
 */
public class Etudiant {
    private String nom;
    private String prenom;
    private int age;
    public Etudiant (String nom, String prenom, int age){
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }
    public void sePresenter(){
        System.out.print("Moi c'est ");
        System.out.print(this.nom + " " + this.prenom + ". ");
        System.out.print("J'ai " + this.age + " ans \n");
    }
    
    public void setNom(String nom){
        this.nom = nom;
    }
    
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public String getNom(){
        return nom;
    }
    
    public String getPrenom(){
        return prenom;
    }
    
    public int getAge(){
        return age;
    }
    
}
