package Arrays;
import java.util.*;
public class LargestInArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        int max= Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int curr=arr[i];
            max= Math.max(max,curr);
        }
        System.out.println(max);
        scanner.close();
    }
}
