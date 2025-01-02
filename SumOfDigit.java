// WAP to find a summation of a digit of a given number. (Iterative and recursive)
import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int sum=0;
        System.err.println("(rec)Sum fo digit"+sumOfDigit(n, sum));
        while(n>0){
            int dig = n%10;
            n/=10;
            sum+=dig;
        }
        System.err.println("(itr)Sum fo digit"+sum);
    }
    public static int sumOfDigit(int n,int sum){
        if(n==0){
            return sum;
        }
        else{
            int dig=n%10;
            sum+=dig;
            return sumOfDigit(n/10,sum);
        }
    }
}
