/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equationseconddegre;

/**
 *
 * @author herit
 */
public class EquationSecondDegree {
    private int a=-2, b=-3, c=-1;
    
    
    
    public void afficher(){
        if(a!=1){
            System.out.print(this.a + "x2");
        }else{
            System.out.print("x2");
        }
        if(b>0){
            System.out.print("+");
        }
        System.out.print(this.b + "x");
        if(c>0){
            System.out.print("+");
        }
        System.out.println(this.c);
    }
    private double getDiscriminant(){
        return b*b-4*a*c;
    }
    private boolean admetSolution(){
        return getDiscriminant()>0;
    }
    public void resoudre(){
        if(admetSolution()){
            double x1 = (-b-Math.sqrt(getDiscriminant()))/(2*a) ;
            double x2 = (-b+Math.sqrt(getDiscriminant()))/(2*a) ;
            System.out.println("Il existe deux solution x1 : "+ x1 +" et x2 : "+ x2);
        }
    }
}


