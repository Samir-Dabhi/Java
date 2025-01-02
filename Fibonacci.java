// WAP to find a Fibonacci series up to n terms (n is entered by user) (iterative and recursive)
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter Number");
        int n = sc.nextInt();
        int a=0,b=1,sum=0;
        for(int i=0;i<n;i++){
            sum=a+b;
            a=b;
            b=sum;
            System.err.println(sum);
        }
    }
}
