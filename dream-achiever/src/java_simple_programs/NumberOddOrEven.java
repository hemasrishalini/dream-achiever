/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_simple_programs;

/**
 *
 * @author hemas
 */
public class NumberOddOrEven {
    public void oddOrEven (int number){
        int reminder = number%2;
        if(reminder==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        } 
    }
    public static void main(String[] args){
       NumberOddOrEven obj = new NumberOddOrEven();  
       obj.oddOrEven(20);
       obj.oddOrEven(3);
       obj.oddOrEven(0);
       obj.oddOrEven(-1);
    }
}
