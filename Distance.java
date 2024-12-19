import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x= scanner.nextInt();
        double y=scanner.nextInt();
        System.out.println("Euclidean distance from the point (" + x + ","+ y+ ") to the origin (0, 0) is "+ Math.sqrt((x*x) + (y*y)) );
        scanner.close();
    }
}
