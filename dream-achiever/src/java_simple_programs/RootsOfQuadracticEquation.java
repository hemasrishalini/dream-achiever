/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_simple_programs;

/**
 *
 * @author hemas
 */
public class RootsOfQuadracticEquation {
    public static void main(String[] args){
        quadratic(2,3,4);
        
    }
    public static void quadratic(double a ,double b, double c){
        double r1,r2;
        double d = (b*b)-(4*a*c);
        System.out.println(d);
        if(d==0){
            System.out.println("roots are real and equal");
            r1= -b/(2*a);
            r2= -b/(2*a);
            System.out.println("R1 = " +r1);
            System.out.println("R2 = " +r2);
        }else if (d>0){
            System.out.println("roots are real and distinct");
            r1=(-b + Math.sqrt(d))/(2*a);
            r2=(-b - Math.sqrt(-d))/(2*a);
            System.out.println("R1 = " +r1);
            System.out.println("R2 = " +r2);
        }else{
            System.out.println("roots are distinct and imaginary");
            double x = -b/(2*a);
            double y = Math.sqrt(-d)/(2*a);
            System.out.println("r1 = " + x + "+i" + y);
            System.out.println("r2 = " + x + "-i" + y);
        }        
    } 
    
}
