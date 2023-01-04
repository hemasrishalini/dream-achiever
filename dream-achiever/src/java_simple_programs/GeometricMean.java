/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_simple_programs;

/**
 *
 * @author hemas
 */
public class GeometricMean {
    public static void main(String[] args){
        double[] nums = new double[]{3,3,3};
        geometricMean(nums);
    }
    public static double geometricMean(double[] nums){
        double pr = 1;
        for(int i = 0; i<nums.length; i++){
            pr = pr*nums[i];
        }
        //geometric mean product power 1/n //(number,powervalue)
        double gm = Math.pow(pr,1.0/nums.length);
        System.out.println(gm);
        return gm;
    }
    
}
