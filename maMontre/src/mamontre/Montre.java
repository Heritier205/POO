/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mamontre;

/**
 *
 * @author herit
 */
public class Montre {
    private static int compteur = 1;
    
    private int numSerie;
    private int annee;
    private int mois;
    private int jour;
    private int heure;
    private int minute;
    private int seconde;
    
    public Montre(){
        this.numSerie = compteur;
        compteur++;
    }
    
    public Montre(int _annee, int _mois, int _jour, int _heure, int _minute, 
            int _seconde){
        this();
//        this.numSerie = compteur;
//        compteur++;
        this.annee = _annee;
        this.mois = _mois;
        this.jour = _jour;
        this.heure = _heure;
        this.minute = _minute;
        this.seconde = _seconde;
    }
    public Montre(Montre montre){
        this();
//        this.numSerie = compteur;
//        compteur++;
        this.annee = montre.annee;
        this.mois = montre.mois;
        this.jour = montre.jour;
        this.heure = montre.heure;
        this.minute = montre.minute;
        this.seconde = montre.seconde;
    }
    
    // Accesseurs
    public int getNumSerie(){
        return this.numSerie;
    }
    public void setNumSerie(int numSerie){
        this.numSerie = numSerie;
    }
    
    public int getAnnee(){
        return this.annee;
    }
    public void setAnnee(int _annee){
        this.annee = _annee;
    }
    
    public int getMois(){
        return this.mois;
    }
    public void setMois(int _mois){
        this.mois = _mois;
    }
    
    public int getJour(){
        return this.jour;
    }
    public void setJour(int jour){
        this.jour = jour;
    }
    
    public int getHeure(){
        return this.heure;
    }
    public void setHeure(int heure){
        this.heure = heure;
    }
    
    public int getMinute(){
        return this.minute;
    }
    public void setMinute(int minute){
        this.minute = minute;
    }
    
    public int getSeconde(){
        return this.seconde;
    }
    public void setSeconde(int seconde){
        this.seconde = seconde;
    }
    
    
    public String toString(){
        
        return this.numSerie + ": " + this.annee + "-" + this.mois + "-" + this.jour + " " + this.heure
                + ":" + this.minute + ":" + this.seconde ;
    }
}
