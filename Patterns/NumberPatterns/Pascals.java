package Patterns.NumberPatterns;
import java.util.*;
public class Pascals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=0;j<n-i;j++){
               System.out.print(" ");                 
            }
            for(int k=i;k>=1;k--){
                System.out.print(k+"");
            }
            for(int k=2;k<=i;k++){
                System.out.print(k+"");
            }
            System.out.println();
        }
        scanner.close();
    }
}
