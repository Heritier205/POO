/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo1;

/**
 *
 * @author herit
 */
public class Poo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Etudiant etudiant1 = new Etudiant("AMAH", "Kwatcha", 18) ;
        etudiant1.sePresenter();
        Etudiant etudiant2 = new Etudiant("ABALO", "Afi", 21) ;
        etudiant2.sePresenter();
        Etudiant etudiant3 = new Etudiant("AKAKPO", "Tha-Esso", 21) ;
        etudiant3.sePresenter();
        
        etudiant1.setAge(22);
        etudiant1.sePresenter();
        
        Enseignant enseignant1 = new Enseignant("ASSIDENOU", "Komla", 18) ;
        enseignant1.sePresenter();
        Enseignant enseignant2 = new Enseignant("ANAKPA", "Manawa", 21) ;
        enseignant2.sePresenter();
        Enseignant enseignant3 = new Enseignant("KOUDAWO", "Kate", 21) ;
        enseignant3.sePresenter();
        
        enseignant1.setAge(22);
        enseignant1.sePresenter();
    }
}