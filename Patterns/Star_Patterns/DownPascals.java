package Patterns.Star_Patterns;
import java.util.Scanner;
public class DownPascals {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        sc.close();
    }
}
