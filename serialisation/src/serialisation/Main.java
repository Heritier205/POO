/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package serialisation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

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
        try{
//            sauvegarder();
            restaurer();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public static void sauvegarder() throws Exception{
        Personne personne = new Personne("HOETOWOU", "Yaovi", 25);
        FileOutputStream fichier = new FileOutputStream("C:\\Users\\herit\\Desktop\\MEGA\\Desktop\\NOTES\\SortiesJava\\personne.ser");
        ObjectOutputStream objectOtputStream = new ObjectOutputStream(fichier);
        objectOtputStream.writeObject(personne);
        objectOtputStream.flush();
        
    }
    public static void restaurer() throws Exception{
        FileInputStream fichier = new FileInputStream("C:\\Users\\herit\\Desktop\\MEGA\\Desktop\\NOTES\\SortiesJava\\personne.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fichier);
        Personne personne = (Personne) objectInputStream.readObject();
        System.out.println(personne);
        
    }
    
}
