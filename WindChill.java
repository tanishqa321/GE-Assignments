import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter tempertaure ( in Fahrenheit)");
        double temperature = scanner.nextInt();
        System.out.println("Enter wind speed (in miles per hour)");
        double windSpeed = scanner.nextInt();
        System.out.println("WindChill is :"+ (( 35.74 + (0.6215*temperature) + ((0.4275 *temperature) - 35.75) * Math.pow(windSpeed, 0.16))) );

        scanner.close();
    }
}
