import java.util.Scanner;

public class Power_of_two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a power value N (0 <= N < 31): ");
        int N = scanner.nextInt();

       
        if (N < 0 || N >= 31) {
            System.out.println("Please enter a value of N such that 0 <= N < 31.");
            scanner.close();
            return;
        }

       
        System.out.println("Table of powers of 2:");
        for (int i = 0; i <= N; i++) {
            System.out.println("2^" + i + " = " + (int) Math.pow(2, i));
        }

        scanner.close();
    }
}


