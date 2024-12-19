import java.util.Scanner;

public class LargestAmongThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        int b=scanner.nextInt();
        int c = scanner.nextInt();
        int d =Math.max(a,b);
        System.out.println("Largest number is : " + Math.max(d, c));
        scanner.close();

    }
}
