import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=  scanner.nextInt();
        for(int i= 1;i*i<= n; i++){
            if(n%i == 0){
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
