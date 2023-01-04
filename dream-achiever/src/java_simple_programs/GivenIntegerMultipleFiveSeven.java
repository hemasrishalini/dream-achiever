/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_simple_programs;

/**
 *
 * @author hemas
 */
public class GivenIntegerMultipleFiveSeven {
    public static void main(String[] args){
        fiveSeven(35);
        fiveSeven(43);
    }
    public static void fiveSeven(int num){
        int reminder =num%5;
        int reminder2 =num%7;
        if((reminder==0)&&(reminder2==0)){
            System.out.println(num+"is a multiple of 5 & 7");
        }else{
            System.out.println(num+"is not a multiple of 5 & 7");
        }
    }
    
}
