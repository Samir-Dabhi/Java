// WAP to find a factorial of a given integer (iterative and recursive)
import java.util.Scanner;
 

public  class  Factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial*=i;
        }
        System.out.println("(iterative) Factorial = "+factorial);
        System.out.println("(recursive) Factorial = "+factorial(n));
        
    }
    public static int factorial(int n){
        if(n==0||n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
}