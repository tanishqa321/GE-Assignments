import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter the number of rows (M): ");
        int M = scanner.nextInt();
        System.out.print("Enter the number of columns (N): ");
        int N = scanner.nextInt();

      
        int[][] array = new int[M][N];

        System.out.println("Enter " + (M * N) + " integers for the 2D array:");
        

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

       
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out), true);
        writer.println("The 2D array is:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                writer.print(array[i][j] + " ");
            }
            writer.println(); 
        }

    
        scanner.close();
    }
}


