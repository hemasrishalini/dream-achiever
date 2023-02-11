/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_simple_programs;

/**
 *
 * @author hemas
 */
//Java program to implement matrix addition


public class MatrixAddiction {
    public static void main(String[] args){
        int a[][] = new int[][] {{6,5,4},{3,2,1}};
        int b[][] = new int[][]{{1,2,3},{4,5,6}};
        add(a,b,a.length); 
    }
    public static int[][] add(int a[][], int b[][],int n){
        int c[][] = new int[n][n];
        for(int i =0; i<n ;i++){
            for(int j=0; j<n; j++){
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println(" ");
        }
        return c;
    }
}
/*
a   0 1 2 3
  0 1 2 3 4
  1 5 6 7 8

b   0 1 2 3
  0 9 8 7 6
  1 5 4 3 2

c   0   1  2  3
  0 10 10 10 10
  1 10 10 10 10

*/








// i=3,j=3,n=3
/*    0 1 2
/*a 0 1 2 3
    1 4 5 6
    2 7 8 9

    0 1 2
b 0 9 8 7
  1 6 5 4
  2 3 2 1

    0   1  2
c 0 10 10 10
  1 10 10 10
  2 10 10 10
*/