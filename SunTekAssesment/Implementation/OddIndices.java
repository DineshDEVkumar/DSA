package SunTekAssesment.Implementation;
import java.util.*;
public class OddIndices {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 1; i < array.length; i += 2) {
            sum += array[i];
        }
        System.out.println("Sum of elements at odd indices: " + sum);
        scanner.close();
    }
}
