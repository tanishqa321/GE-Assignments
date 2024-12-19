import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if (year / 1000 ==0) {
            System.out.println("year is not valid");
            scanner.close();
            return;
        }
        if (year % 4 ==0) {
            System.out.println("It is a Leap Year");
        }
        else {
            System.out.println("It is not a Leap Year");
        }
        scanner.close();
    }
}
