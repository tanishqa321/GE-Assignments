import java.util.Scanner;

public class Coin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of times to flip the coin: ");
        int numFlips = scanner.nextInt();

        if (numFlips <= 0) {
            System.out.println("Please enter a positive integer.");
            scanner.close();
            return; 
        }

        int heads = 0, tails = 0;


        for (int i = 0; i < numFlips; i++) {
            double randomValue = Math.random(); 
            if (randomValue < 0.5) {
                tails++;
            } else {
                heads++;
            }
        }

        double headPercentage = ((double) heads / numFlips) * 100;
        double tailPercentage = ((double) tails / numFlips) * 100;

        System.out.println("Heads: " + heads + " (" + headPercentage + "%)");
        System.out.println("Tails: " + tails + " (" + tailPercentage + "%)");

        scanner.close();
    }
}
