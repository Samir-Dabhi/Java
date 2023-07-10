//this is not the most optimized code for this patern
//      4 4 4 4 4 4 4
//      4 3 3 3 3 3 4
//      4 3 2 2 2 3 4
//      4 3 2 1 2 3 4
//      4 3 2 2 2 3 4
//      4 3 3 3 3 3 4
//      4 4 4 4 4 4 4

import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int t2=n;
        for (int i=1;i<=n;i++) {
            int t = n;
            int j;
            for (j = 1; j <= i; j++) {

                System.out.print(t+" ");
                t--;
            }
            t = n;

            for (j=1;j<n*2-i*2;j++) {
                System.out.print(t2+" ");

            }
            t2--;

            if (i!=n){
                for (j=n-i+1;j<=n;j++){
                    System.out.print(j+" ");
                }
            }

            if (i==n){
                for (j=2;j<=n;j++){
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
        int t3=2;
        int t4=n;
        for (int i=1;i<n;i++){
            for (int j=n;j>i;j--){
                System.out.print(j+" ");
            }
            for (int j=1;j<=i*2-1;j++){
                System.out.print(t3+" ");
            }

            for (int j=t3;j<=t4;j++){
                System.out.print(j+" ");
            }
            t3++;

            System.out.println();
        }
    }
}
