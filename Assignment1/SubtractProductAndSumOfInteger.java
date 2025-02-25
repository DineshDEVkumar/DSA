package Assignment1;
import java.util.*;
public class SubtractProductAndSumOfInteger {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n=scanner.nextInt();
        int sum=0;
        int product=1;
        while(n!=0){
            int digit=n%10;
            sum=sum+digit;
            product=product*digit;
            n=n/10;
        }
        int subtract=product-sum;
        System.out.println(subtract+" ");
        scanner.close();
        }
    }
