/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_simple_programs;

/**
 *
 * @author hemas
 */
public class AreaOfRectangle {
    public static void main(String[] args){
        rectangle(23 ,15);
    }
    public static void rectangle(int length, int width){
        int area = 0 , perimeter= 0;
        if(length!=width){
            perimeter = 2*(length+width);
            area = length*width;
            System.out.println("area of rectangle is :" + area);
        }else{ 
            System.out.println("area of rectangle is not exist");
        }
    }    
}
     


