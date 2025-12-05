/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automobile;

/**
 *
 * @author herit
 */
public class Voiture {
    private String marque, modele, couleur, numeroDeChassis;
    private static int nombreVoitures;
    private int nombreDePlaces, numSerie ; 
    
    public Voiture(){
        this.numSerie = nombreVoitures;
        nombreVoitures++;
    }
    public Voiture(String marque, String modele, String numeroDeChassis, int nombreDePlaces){
        this(); // doit etre la premiere instruction selon mes recherches
        this.marque = marque;
        this.modele = modele;
//        this.couleur = couleur;
        this.numeroDeChassis = numeroDeChassis;
        this.nombreDePlaces = nombreDePlaces;
    }
    public Voiture(Voiture voiture){
        this(); // doit etre la premiere instruction selon mes recherches
        this.marque = voiture.marque;
        this.modele = voiture.modele;
        this.couleur = voiture.couleur;
        this.numeroDeChassis = voiture.numeroDeChassis;
        this.nombreDePlaces = voiture.nombreDePlaces;
    }
    
    public void afficher(){
        System.out.println("Voiture No : " + this.numSerie+ " " +
                this.modele + " de marque : " + this.marque + 
                " NoChassis : " + this.numeroDeChassis 
                + " de Couleur : " + this.couleur + "de " 
                + this.nombreDePlaces + " places");
    }
    
    
//    getters 
    
//    setters et getters de var de classe 
    public int getnombreVoiture(){
        return this.nombreVoitures;
    }
    public void setnombreVoiture(int _nombreVoitures){
        this.nombreVoitures = _nombreVoitures;
    }
    
//    setters et getters de var objets
    public String getMarque(){
        return this.marque;
    }
    public void setMarque(String _marque){
        this.marque = _marque;
    }
    
    public String getModele(){
        return this.modele;
    }
    public void setModele(String _modele){
        this.modele = _modele;
    }
    
    public String getnumeroDeChassis(){
        return this.numeroDeChassis;
    }
    public void setnumeroDeChassis(String _numeroDeChassis){
        this.numeroDeChassis = _numeroDeChassis;
    }
    
    public String Couleur(){
        return this.couleur;
    }
    public void Couleur(String _couleur){
        this.couleur = _couleur;
    }
    
    public int getNombreDePlaces(){
        return this.nombreDePlaces;
    }
    public void setNombreDePlaces(int _nombreDePlaces){
        this.nombreDePlaces = _nombreDePlaces;
    }
    
    public String estEgal(Voiture voiture){
            if(this.numeroDeChassis.equals(voiture.getnumeroDeChassis())){
                return "Vrai";
            } else return "Faux";
        }
}
