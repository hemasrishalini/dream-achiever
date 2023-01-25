/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_simple_programs;

/**
 *
 * @author hemas
 */
public class MultipleRange {
    public static void main(String[] args){
        multiple(10,50,6);
    }
    public static void multiple(int start ,int end,int m ){
        for(int i=start; i<end; i++){
            if(i%m==0){
                System.out.println(i);
            }
        }
        
    }
    
}
