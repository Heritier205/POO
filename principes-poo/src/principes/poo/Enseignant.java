/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principes.poo;
import java.util.List;
/**
 *
 * @author herit
 */
public class Enseignant extends Personne{
    List<Etudiant> personne;
    private String specialite;
    
    public Enseignant(String nom, String prenom){
        super(nom,prenom);
    }
    
    @Override
    public String getPresentation(){
        return "Je suis l'enseignant "+ this.nom + " " + this.prenom;
    }
    
    @Override
    public void sePresenter(){
        
    }
}
