/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principes.poo;

/**
 *
 * @author herit
 */
public abstract class Personne {
    protected String nom;
    protected String prenom;
    protected int age;
    
//    Abstract methods 
    public abstract void sePresenter();
    
    public String getPresentation(){
        return this.nom + " " + this.prenom;
    }
    
//    Constructors
    public Personne(){
        System.out.println("je suis appele");
    }
    
    public Personne(String nom, String prenom){
        this.nom = nom;
        this.prenom = prenom;
    }
    
    
//    Getters & Setters
    
    public void setAge(int age){
        if(age<0){
            System.out.println("L'age est invalide");
        }else{
            this.age = age;
        }
    }
    public int getAge(){
        return this.age;
    }
    
    public void setNom(String nom){
        this.nom = nom;
    }
    public String getNom(){
        return this.nom;
    }
    
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }
    public String getPrenom(){
        return this.prenom;
    }
    
    @Override
    public String toString(){
        return "nom : " + this.nom + ", prenom : " + this.prenom
                + ", age : " + this.age;
    }
    
}
