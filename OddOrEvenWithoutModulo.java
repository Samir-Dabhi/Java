// WAP to find whether a number is Odd or Even without using a % operator. 

import java.util.Scanner;

public class OddOrEvenWithoutModulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int n = sc.nextInt();
        while (n>=0) { 
            n-=2;
            if(n==0){
                System.out.println("Number is even");
            }
            if (n==1) {
                System.err.println("Number is odd");
            }
        }
    }
}
