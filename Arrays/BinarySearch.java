package Arrays;
import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n= scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        int target=scanner.nextInt();
        int result = search(arr,target);
        if(result== -1){
           System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index "+result);
        }
        scanner.close();
    }    
    public static int search(int[] arr,int target) {
      int low=0,mid,high=arr.length;
      while(low<=high){
        mid=(high+low)/2;
          if(arr[mid]==target){
            return mid;
          }
          else if(arr[mid]>target){
            high=mid-1;
          }
          else if(arr[mid]<target){
            low=mid+1;
          }
      }   
      return -1;
    }
}
