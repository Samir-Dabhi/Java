// WAP to find a sum of even number into 1D array.

import  java.util.Scanner;

public class SumOfEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter number of elements in array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.err.println("Enter Element of array");
            arr[i] = sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            if (arr[i]%2==0) {
                sum+=arr[i];
            }
        }
        System.err.println("Sum of even number form this array is "+sum);
    }
}
