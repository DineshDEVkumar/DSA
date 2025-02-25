import java.util.Arrays;
import java.util.Scanner;
public class EmptyPackets {
    public static void Zeros(int[] arr){
        int index=0;
        for(int num: arr){
            if(num!=0){
                arr[index++]=num;
            }
        }
        while(index<arr.length){
            arr[index++]=0;
        }
    }
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=scan.nextInt();
    }
    Zeros(arr);
    System.out.println(Arrays.toString(arr));
   }
}
