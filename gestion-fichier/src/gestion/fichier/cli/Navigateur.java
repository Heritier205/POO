/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.fichier.cli;

import gestion.fichier.metier.Repertoire;
import java.io.FileNotFoundException;

/**
 *
 * @author herit
 */
public class Navigateur {
    private static Navigateur instance; 
    private Repertoire repertoireCourrant;
    static{
        instance = new Navigateur();
    }
    
    
    
    private Navigateur(){
        
    }
    
    public static Navigateur getInstance(){
        return instance;
    }
    
    public Repertoire getRepertoireCourrant(){
        return this.repertoireCourrant;
    }
    
    public void setRepertoireCourant(Repertoire repertoireCourant){
        this.repertoireCourrant = repertoireCourant;
    }
    
    public void changeRepertoire(String nom) throws FileNotFoundException{
        if(nom == null){
            return;
        }
        String[] nomsRepertoire = nom.split("/");
        Repertoire rep = this.repertoireCourrant;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
        try {
            changeRepertoire(nomsRepertoire);
        }catch (FileNotFoundException e) {
            this.repertoireCourrant = rep;
            throw e;
        } 
    }   
    
    public void changeRepertoire(String[] nomsRepertoire)throws FileNotFoundException{
        for(String nomRep : nomsRepertoire){
            if(nomRep.equals("..") && this.repertoireCourrant.getRepertoireParent() != null){
                this.repertoireCourrant = this.repertoireCourrant.getRepertoireParent();
                continue;
            }
            this.repertoireCourrant = this.repertoireCourrant.getRepertoire(nomRep);
        }
    }
    
}
