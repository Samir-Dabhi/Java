// WAP to find a total odd and total even digit of a given number
import java.util.Scanner;

public class TotalOddAndEven {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter number");
      int n = sc.nextInt();
        int odd = 0,even=0;
        while(n>0){
            int dig=n%10;
            if(dig%2==0){
                even++;
            }
            else{
                odd++;
            }
            n/=10;
        }
        System.out.println("number of even dig = "+even);
        System.out.println("number of odd dig = "+odd);
  }  
}
