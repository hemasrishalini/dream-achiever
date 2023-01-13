/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_simple_programs;

/**
 *
 * @author hemas
 */
public class LeapYear {
    public static void main(String[] args){
       leapYear(1900); 
    }
    public static void leapYear(int year){
        boolean leap = false;
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    leap=true;  
                }else{
                    leap=false;
                }
            }else{
                leap=true;    
            }        
        }else{
            leap=false;
        }
        if(leap){
            System.out.println(year +" is a leap year");
        }else{
            System.out.println(year+" is not a leap year");
        }
    }
    
}
