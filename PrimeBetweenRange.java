// WAP to find a prime number between range (range should be entered by user). 
import java.util.Scanner;

public class PrimeBetweenRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = sc.nextInt();
        System.out.println("Enter number 2");
        int b = sc.nextInt();
        boolean isPrime = true;
        for(int n=a;n<=b;n++){
            isPrime=true;
            for (int i = 2; i < n/2 ; i++) {
                if(n%i==0){
                    isPrime=false;
                }
            }
            if(isPrime){
                System.out.println(n);
            }
        }
    }
}
