/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_simple_programs;

/**
 *
 * @author hemas
 */
public class TwoDimensionalArray {
    public static void main(String[] args){
        int number = 0;
        int[][] matrix = new int[10][10];
        /*int[] a = new int[]{1,2,3};
        int[][] c = new int[][]{a,{1,1,1}};
        int[][] d = new int[][]{a,a,a,a,a};
        int[][][] e = new int[][][]{{{1,1,1},{1,1,1}},c};*/
        dimensionalArray(matrix,number);
    }
    public static void dimensionalArray(int[][] matrix,int number){
        int sum = 0;
        for(int i=0 ;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                /*System.out.println("i="+i+" j="+j);
                System.out.println("number: "+number);
                System.out.println("sum: "+sum);*/
                if(i==j){
                    matrix[i][j]=number;
                    sum=sum+matrix[i][j];
                    number++;
                }else{
                    matrix[i][j]=0;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The sum of diagonal numbers is: "+sum);
    
    }  
}
