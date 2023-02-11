/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_simple_programs;

/**
 *
 * @author hemas
 */
public class CalculateTax {
    public static void main(String[] args){
        double netvalue = 9.99;
        double VAT = 23.0;
        double grossvalue = netvalue + (VAT*netvalue/100);
        System.out.println("the gross value is : "+ grossvalue);
        double grossvaluemultiplyby10000 = grossvalue*10000;
        System.out.println("the gross value for 10000 : "+grossvaluemultiplyby10000);
        double excludingVAT = grossvaluemultiplyby10000 - (VAT*grossvaluemultiplyby10000/100);
        System.out.println("the value of excluding VAT is : "+ excludingVAT);
    }
    
}
