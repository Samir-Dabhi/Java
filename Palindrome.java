// WAP to find whether string is palindrome or not. 
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        int n=0;
        int temp=num;
        while(num>0){
            int dig = num%10;
            n=n*10+dig;
            num/=10;
        }
        if (temp==n) {
            System.out.println("The number is a palindrome");
        }
        else{
            System.out.println("The number is not a palindrome");
        }
    }
}
