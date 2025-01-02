// WAP to find weather given number is Armstrong number is not. 
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        String inp = sc.next();
        int len = inp.length();
        int n = Integer.parseInt(inp);
        int temp = n;
        int sum=0;
        while(n>0){
            int dig = n%10;
            sum=sum+(int)Math.pow(dig, len);
            n/=10;
        }
        if (sum==temp) {
            System.out.println("Number is armstrong");
        }
        else{
            System.out.println("Number is not armstrong");
        }
    }
}
