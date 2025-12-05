/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package automobile;

/**
 *
 * @author herit
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Voiture voiture1 = new Voiture();
        Voiture voiture2 = new Voiture("Renault", "Clio_RS_Line","VRF13A84527", 7);
        Voiture voiture3 = new Voiture(voiture2);
        Voiture voiture4 = new Voiture(voiture3);
        voiture1.afficher();
        voiture2.afficher();
        voiture3.afficher();
        voiture4.afficher();
        System.out.println("avec == on a : " + (voiture4 == voiture3) + 
                " et avec estEgal on a : " + voiture4.estEgal(voiture3) );
        
    }
    
}
