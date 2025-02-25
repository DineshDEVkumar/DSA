package Arrays;
import java.util.*;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        int[] reversedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedArr[i] = arr[arr.length - i - 1];
        }

        // Print reversed array
        System.out.print("Reversed Array: ");
        for (int i : reversedArr) {
            System.out.print(i + " ");
        }
        scanner.close();
    }
}
