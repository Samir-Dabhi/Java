
// WAP to find a Factor of a given number (iterative and recursive)
import java.util.Scanner;


public class Factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println("(Iterative)Factors of " + n + " are:");
        for (int i = 1; i <= n; i++) {
            if(n%i==0){
                System.out.println(i);
            }
        }
        System.out.println("(Recursive)Factors of " + n + " are:");
        findFactor(n,1);
    }
    public static void findFactor(int n,int i) {
        if(n>=i){
            if (n%i==0) {
                System.out.println(i);
                findFactor(n,i+1);
            }
            else{
                findFactor(n,i+1);
            }
        }
        else{
            return;
        }
    }
}
