/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_simple_programs;

/**
 *
 * @author hemas
 */
public class BMI {
    public static void main(String[] args){
        float w = 52;
        float h = 56;
        value(h,w);
    }
    public static  double value(float h ,float w){
        
        double bmi = (w/ Math.pow(h, 2) * 703);
        System.out.println(bmi);
        if(bmi<16.66){
            System.out.println("starvation");
        }else if(bmi>=16.00 && bmi <= 16.99){
            System.out.println("emaciation");
        }else if(bmi>=17.00 && bmi <= 18.49){
            System.out.println("underweight");
        }else if(bmi>=18.50 && bmi<=22.99){
            System.out.println("normal, low range");
        }else if(bmi>=23.00 && bmi<=24.99){
            System.out.println("normal, high range");
        }else if(bmi>=25.00 && bmi<=27.49){
            System.out.println("overweight, low range");
        }else if(bmi>=27.50 && bmi<=29.99){
            System.out.println("overweight, high range");
        }else if(bmi>=30.00 && bmi<=34.9){
            System.out.println("1st degree obesity");
        }else if(bmi>=35.00 && bmi<=39.90){
            System.out.println("2nd degree obesity");
        }else{
            System.out.println("3rd degree obesity");
        }
        return bmi;
    }
    
        
}
