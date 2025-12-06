/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.fichier.metier;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author herit
 */
public abstract class Fichier implements Serializable{
    private static Repertoire root = new Repertoire("\\root", null);
    public static final String path = "C:\\Users\\herit\\Desktop\\MEGA\\Desktop\\NOTES\\SortiesJava\\gestion_fichiers.ser";
    private LocalDate dateCreation ; 
    private String nom;
    private Repertoire repertoireParent;
    
    public Fichier(){
        this.dateCreation = LocalDate.now();
    }
    
    public Fichier(String nom){
        this();
        this.nom = nom;
    }
    
    public Fichier(String nom, Repertoire repertoireParent){
        this(nom);
        this.repertoireParent = repertoireParent;
        if(this.repertoireParent != null){
            this.repertoireParent.getFichiers().add(this);
        }
    }
    
        public static void sauvegarder() throws Exception{
        FileOutputStream fichier = new FileOutputStream(Fichier.path);
        ObjectOutputStream objectOtputStream = new ObjectOutputStream(fichier);
        objectOtputStream.writeObject(root);
        objectOtputStream.flush();
    }
    
    public static void restaurer(){
        try{
            FileInputStream fichier = new FileInputStream(Fichier.path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fichier);
            root = (Repertoire) objectInputStream.readObject();
        }catch (FileNotFoundException e){
            
        }catch (IOException e){
            
        }catch (ClassNotFoundException e){
            
        }
        
    }
    
    public static Repertoire getRoot(){
        return root;
    }
    
    public abstract int getTaille();
    public abstract boolean estRepertoire();
    
    public String getNom(){
        return this.nom;
    }
    
    
    public String getNomComplet(){
        if(repertoireParent == null){
            return this.nom;
        }
        return repertoireParent.getNomComplet() + "\\" + this.nom;
    }
    
    public Repertoire getRepertoireParent(){
        return repertoireParent;
    }
}
