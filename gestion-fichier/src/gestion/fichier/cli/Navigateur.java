/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.fichier.cli;

import gestion.fichier.metier.Repertoire;

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
}
