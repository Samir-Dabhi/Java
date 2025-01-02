//WAP to find Max, Min, Average of n numbers, n should be taken from user and all n value 
// should be taken from user (Note that you are not allowed to use an array for this)
import java.lang.classfile.constantpool.FloatEntry;
import java.util.Scanner;

class MinMaxAvrageOfNNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of elements");
        int n = sc.nextInt();
        System.out.println("Enter element no 1");
        int num = sc.nextInt();
        int min=num,max=num,sum=num;
        for (int i = 2; i <= n; i++) {
            System.out.println("Enter element no "+i);
            num = sc.nextInt();
            if (num<min) {
                min = num;
            }
            if (num>max) {
                max = num;
            }
            sum+=num;
        }
        float average = sum/(float)n; 
        System.out.println("min = "+min+" max = "+max+" Avrage = "+average);
    }
}