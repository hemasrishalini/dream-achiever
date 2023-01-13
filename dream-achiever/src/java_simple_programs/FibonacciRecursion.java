/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_simple_programs;

/**
 *
 * @author hemas
 */
public class FibonacciRecursion {
    public static void main(String[] args){
        int n = 4; 
       System.out.println(number(n));
    }
    public static  int  number(int n ){
        if(n==1){
            return 0; 
        }else if(n==2){
            return 1;
        }else{
            return number(n-1)+number(n-2);
        }
    }
    
}
