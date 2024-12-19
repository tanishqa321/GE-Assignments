import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double sum =0;
        for(double i=1;i<=n;i++){
            sum= sum+(1/i);
        }
        System.out.println(sum);
        scanner.close();
    }
}
