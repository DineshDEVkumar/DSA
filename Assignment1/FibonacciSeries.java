package Assignment1;
import java.util.Scanner;
public class FibonacciSeries {
     public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
       int n=scanner.nextInt();
       int first=0,second=1;
       if(n==0){
        System.out.println(" "+n);
       }
       for (int i = 0; i < n; i++) {
        System.out.print(first + " ");
        int temp = second + first;
        first = second;
        second = temp;
    }
       scanner.close();
    }
}
