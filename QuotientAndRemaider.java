import java.util.Scanner;

public class QuotientAndRemaider {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dividend=  scanner.nextInt();
        int divisor=  scanner.nextInt();
        System.out.println("Quotient is : " + (dividend / divisor) + " and Remainder is : " + (dividend % divisor));

        scanner.close();
    }
}
