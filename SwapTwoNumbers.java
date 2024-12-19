import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int FirstNum = scanner.nextInt();
        System.out.println("Enter First Number");
        System.out.println("Enter Second Number");
        int SecondNum = scanner.nextInt();
        int temp=FirstNum;
        FirstNum = SecondNum;
        SecondNum = temp;
        System.out.println("After Swapping first number is " +(FirstNum) + "Second number is " +(SecondNum));
        scanner.close();

    }
}
