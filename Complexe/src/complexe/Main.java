/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package complexe;

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
        Complexe cp1 = new Complexe();
        Complexe cp2 = new Complexe();
        System.out.println(cp1);
        System.out.println(cp1.Conjugue());
        System.out.println(cp1.carre());
        System.out.println(cp1.module());
        System.out.println(cp1.plus(cp2));
        System.out.println(cp1.fois(cp2));
        System.out.println(cp1.estEgal(cp2));        
    }
    
}
