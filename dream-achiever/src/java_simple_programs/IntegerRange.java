/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_simple_programs;

/**
 *
 * @author hemas
 */
public class IntegerRange {
    public static void main(String[] args){
        
    }
    public static void integerRange(int start, int end){
        for(int i=start; i<end; i++){
            int num = i;//123
            int sum = 0;
            while(num!=0){
                int digit = num%10;//123%10=3
                sum = sum+digit;//0+3=3
                num = num/10;//123/10=12
            }
            if(sum%2==0){
                System.out.println(i);
            }
        }
    }
    
}
