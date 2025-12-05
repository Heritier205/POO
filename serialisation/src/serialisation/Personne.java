/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serialisation;

import java.io.Serial;
import java.io.Serializable;

/**
 *
 * @author herit
 */
public class Personne implements Serializable{
    @java.io.Serial
    static final long serialVersionUID = -3387516993124229948L;
    private String nom;
    private String prenom;
    private int age, id;
    
    public Personne(){
                   
    }
    
    public Personne(String nom, String prenom, int age){
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    @Override
    public String toString() {
        return this.nom + "\t" + this.prenom + "\t" + this.age;
    }
    
    
    
}
