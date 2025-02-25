package Assignment1.Intermediateprograms;
import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int factorial=1;
        if(n==0){
            System.out.println("Factorial of 0 is 1");
        }
        for(int i=1;i<=n;i++){
            factorial*=i;
        }
        System.out.println(factorial);
        scanner.close();
    }
}
