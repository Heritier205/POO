/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.fichier.metier;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author herit
 */
public class FichierSimple extends Fichier{
    String donnee;
    
    public FichierSimple(){
        
    }
    
    @Override
    public int getTaille() {
        return donnee.length();
    }
    
    public FichierSimple(String nom, Repertoire repertoireParent){
        super(nom, repertoireParent);
        
    }

    @Override
    public boolean estRepertoire() {
        return false;
    }
    
    
}
