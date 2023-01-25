/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_simple_programs;

/**
 *
 * @author hemas
 */
//Java program to find the area of a triangle whose three sides are given 

public class AreaOfTriangle {
    public static void main(String[] args){
        AreaOfTriangle obj = new AreaOfTriangle();
        obj.triangle(4,5,6);
    }
    public double triangle(int a,int b,int c){
        double area = 0,s = 0;
        if((a+b)>c && (b+c)>a && (a+c)>b){
            s = (a+b+c)/2;
            area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println("area of triangle is :" + area);
        }else{
            System.out.println("area of triangle is not exist");
        }
        return s;
    }
     
}
