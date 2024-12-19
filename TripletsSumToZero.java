import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TripletsSumToZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of  array");
        int sizeOfArray= scanner.nextInt();
        int[] array;
        array = new int[sizeOfArray];
         for(int i=0;i<sizeOfArray;i++){
            array[i] = scanner.nextInt();
         }
         List<List<Integer>> TripletsWithSumZero = new ArrayList<>();
         for(int  i=0;i<sizeOfArray;i++){
           
            for(int j=i+1;j<sizeOfArray;j++){
                
                for(int k=j+1;k<sizeOfArray;k++){
                    if(array[i]+array[j]+array[k] == 0){
                        List<Integer>CurrentSum= new ArrayList<>(Arrays.asList(array[i], array[j], array[k]));
                        Collections.sort(CurrentSum);
                        if (!TripletsWithSumZero.contains(CurrentSum)) {
                            TripletsWithSumZero.add(CurrentSum);
                        }
                    }
                   
                }
            }
         }
         for(List<Integer>li: TripletsWithSumZero){
            System.out.println(li);
         }

        scanner.close();

    }
}
