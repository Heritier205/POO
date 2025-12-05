/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mamontre;

/**
 *
 * @author herit
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        Montre montre1 = new Montre();
        montre1.setAnnee(2028);
        montre1.setHeure(15);
        System.out.println(montre1);
        Montre montre2 = new Montre(2025,10,22,15,45,59);
        System.out.println(montre2);
        
        Montre montre3 = new Montre(montre2);
        System.out.println(montre3);
        
        Montre montre4 = montre2;
//        System.out.println(montre4);
//        montre2.setAnnee(2040);
//        System.out.println(montre4);

        System.out.println(montre2.equals(montre3));
        System.out.println(montre2.equals(montre4));
    }
    
}
