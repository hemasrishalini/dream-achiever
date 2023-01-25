/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_simple_programs;

/**
 *
 * @author hemas
 */
//



public class IntegerRange {
    public static void main(String[] args){
        integerRange(2,3);
    }
    public static void integerRange(int start, int end){
        for(int i=start; i<end; i++){
            int num = i;
            int sum = 0;
            while(num!=0){
                int digit = num%10; 
                sum = sum+digit; 
                num = num/10; 
            }
            if(sum%2==0){
                System.out.println(i);
            }
        }
    }
    
}
