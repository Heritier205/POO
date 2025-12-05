/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestion.exception;

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
        methode1();
    }
    
    private static void methode1(){
        System.out.println("Debut Methode 1");
        methode2();
        System.out.println("Fin Methode 1");
    }
    private static void methode2(){
        System.out.println("Debut Methode 2");
        try{
            methode3();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Fin Methode 2");
    }
    private static void methode3()throws Exception{
        System.out.println("Debut Methode 3");
        int a = 5;
        int b = 0;
        float c = diviser(a, b);
//        try {
//            float c = diviser(a, b);
//        }catch(ArithmeticException ex){
//            
//        }
        System.out.println("Fin Methode 3");
    }
    
    private static float diviser(int a, int b)throws Exception{
        if (b != 0){
            return a / b;
        }else{
            throw new Exception("Le diviseur ne doit pas etre nul");
        }
    }
}
