/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_simple_programs;

/**
 *
 * @author hemas
 */
public class AreaOfTriangle {
    public double triAngle(int a,int b,int c){
        double area =0,s=0;
        if((a+b)>c && (a+c)>b && (b+c)>a){
            s=(a+b+c)/2;
            area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println("Area of triangle is:" + area);
        }else{
            System.out.println("Area of triangle is not exist");
        }
        return s;
    }
    public static void main(String[] args){
        AreaOfTriangle obj = new AreaOfTriangle();
        obj.triAngle(5,6,7);
    }
}
