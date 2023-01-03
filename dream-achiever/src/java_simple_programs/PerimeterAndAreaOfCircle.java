/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_simple_programs;

/**
 *
 * @author hemas
 */
public class PerimeterAndAreaOfCircle {
    public static void main(String[] args){
        circle(9.9);
        
    }
    public static void circle(double rad){
        double perimeter = 2*Math.PI*rad;
        double area = Math.PI*rad*rad;
        System.out.println(perimeter);
        System.out.println(area);
    }
}
