import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = scanner.next().charAt(0);
        if (!Character.isLetter(ch)) {
            System.out.println("Invalid input. Please enter an alphabet.");
        }
        else {
            if(ch == 'A' || ch =='E' || ch =='I' || ch == 'O' || ch=='U' ||ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
                System.out.println(ch + " is a Vowel.");
            } else {
                System.out.println(ch + " is a Consonant.");
            }
        }
            
        

        scanner.close();
    }
}
