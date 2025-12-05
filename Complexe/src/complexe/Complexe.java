/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package complexe;

/**
 *
 * @author herit
 */
public class Complexe {
    private double a = 1;
    private double b = 2;
    
    
    
    
    public Complexe Conjugue(){
        Complexe cp0 = new Complexe();
        cp0.a = this.a;
        cp0.b = -this.b;
        return cp0; 
    }
    
    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    
    
    public Complexe carre(){
        Complexe cp0 = new Complexe();
        cp0.a = this.a*this.a - this.b*this.b;
        cp0.b = 2*(this.a*this.b);
        return cp0;    
    }
    
    public Complexe fois(Complexe cp){
        Complexe cp0 = new Complexe();
        cp0.a = this.a*cp.getA() - this.b*cp.getB();
        cp0.b = 2*(this.a*cp.getB());
        return cp0;    
    }
    
    public double module(){
        return Math.sqrt(this.a*this.a+this.b*this.b);
    }
    
    public Complexe plus(Complexe cp){
        Complexe cp0 = new Complexe();
        cp0.a = this.a+cp.getA();
        cp0.b = this.b+cp.getB();
        return cp0;   
    }
    
    public boolean estEgal(Complexe cp){
        return (this.a == cp.getA() && this.b == cp.getB());
    }
    
    public String toString(){
        
        return this.a + (this.b>0 ? "+" : "") + this.b + "i";
        
    }
}
