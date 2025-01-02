// WAP to calculate an angle between hour and minute hand. (Hours and minutes should be 
// taken from user). 
import java.util.Scanner;

public class AngleBetweeHourAndMinitHand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter hours (0-12): ");
        int hours = scanner.nextInt();

        System.out.print("Enter minutes (0-59): ");
        int minutes = scanner.nextInt();

        if (hours < 0 || hours > 12) {
            hours %= 12;
        }

        if (minutes < 0 || minutes > 59) {
            System.out.println("Invalid input: Minutes should be between 0 and 59.");
            return;
        }

        double hourAngle = (hours * 30) + (minutes * 0.5); // Each hour is 30 degrees, each minute adds 0.5 degree
        double minuteAngle = minutes * 6;                 // Each minute is 6 degrees

        double angle = Math.abs(hourAngle - minuteAngle);

        angle = Math.min(angle, 360 - angle);

        System.out.printf("The angle between the hour and minute hand is: %.2f degrees.%n", angle);

        scanner.close();
    }

}