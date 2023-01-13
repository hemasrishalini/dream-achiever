/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_simple_programs;

/**
 *
 * @author hemas
 */
public class MatrixMultiplication {
    public static void main(String[] args){
        int[][] a = {{1,1,1},{1,1,1},{1,1,1}};
        int[][] b = {{1,1,1},{1,1,1},{1,1,1}};
        multiple(a,b,a.length);
        
    }
    public static int[][] multiple(int[][] a,int[][] b, int n){
        int[][] c = new int[n][n];
        for(int i =0; i<n; i++){
            for(int j =0; j<n; j++){
                c[i][j] = a[i][j]*b[i][j];
                System.out.print(c[i][j] +" ");
            }
            System.out.println(" ");
        }
        return c;
    }
    
}
