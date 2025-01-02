// WAP to find a Multiplication of 2 Matrix (dimension and value should be entered by user)

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter m1");
        int m1 = sc.nextInt();
        System.err.println("Enter n1");
        int n1 = sc.nextInt();
        System.out.println("Enter m2");
        int m2 = sc.nextInt();
        System.err.println("Enter n2");
        int n2 = sc.nextInt();
        int matrix1[][] = new int[m1][n1];        
        int matrix2[][] = new int[m2][n2];
        for (int i = 0; i < m1 ; i++) {
            for (int j = 0; j < n1; j++) {
                System.err.println("Enter matrix1 element "+i+","+j);
                matrix1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m2 ; i++) {
            for (int j = 0; j < n2; j++) {
                System.err.println("Enter matrix2 element "+i+","+j);
                matrix2[i][j] = sc.nextInt();
            }
        }
        int mul[][] = new int[m1][n2];
        for (int i = 0; i < m1 ; i++) {
            for (int j = 0; j <n2 ; j++) {
                for (int k = 0; k < m2; k++) {
                    mul[i][j]+=matrix1[i][k]*matrix2[k][j];
                }
            }
        }
        for (int i = 0; i < m1 ; i++) {
            for (int j = 0; j <n2 ; j++) {
                System.out.print(mul[i][j]+" ");
            }
            System.out.println("");
        }
    }   
}
