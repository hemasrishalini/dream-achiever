/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_simple_programs;

/**
 *
 * @author hemas
 */
public class ProductOfRealNumbers {
    public static void main(String[] args){
        double[] nums = new double[]{1.1,2.9,3.8};
        product(nums);
    }
    public static double product(double[] nums){
        double pr = 1;
        for( int i=0; i<nums.length; i++){
            pr = pr*nums[i];
        }
        System.out.println(pr);
        return pr;
    }
}
// pr=0 i=2
// nums =1,2,3
//i=     0,1,2