import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        int b=scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println("Quadratic Equation is " + a + "x^2 + " + b + "x + " + c);
        double delta = (b*b) - (4*a*c);
        if(delta>=0){
        System.out.println("Root 1 of x = " +  (-b + Math.sqrt(delta))/(2*a) + "Root 2 of x = "+ (-b - Math.sqrt(delta))/(2*a));
        }
        else if (delta == 0) {
           
            double root = -b / (2 * a);
            System.out.println("The roots are real and equal:");
            System.out.println("Root = " + root);
        } else {
            
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-delta) / (2 * a);
            System.out.println("The roots are complex and imaginary:");
            System.out.println("Root 1 = " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2 = " + realPart + " - " + imaginaryPart + "i");
        }
        scanner.close();

    }
}


