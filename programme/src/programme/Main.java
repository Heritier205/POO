/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programme;

/**
 *
 * @author herit
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Personne p1 = new Personne();
        p1.setNom("KOFFI");
        p1.afficher();
        Personne p2 = p1;
        p2.setNom("KODJO");
//        on s'attend a ce que le programme affiche KOFFI et puis KODJO
//        eh oui le resultats correspondent bien a mes attentes 
    }
    
}
