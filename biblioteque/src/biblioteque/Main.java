/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biblioteque;

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
        Livre livre1 = new Livre();
        Livre livre2 = new Livre("Story", "Heritier", 2021, true );
        Livre livre3 = new Livre(livre2);
        livre2.afficher();
        livre3.afficher();
        livre2.emprunter();
        livre2.afficher();
    }
    
}
