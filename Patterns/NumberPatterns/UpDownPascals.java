package Patterns.NumberPatterns;
import java.util.*;
public class UpDownPascals {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=1;i<=2*n;i++){
            int c= i>n?2*n-i:i;
            for(int j=0;j<n-c;j++){
               System.out.print(" ");                 
            }
            for(int k=c;k>=1;k--){
                System.out.print(k+"");
            }
            for(int k=2;k<=c;k++){
                System.out.print(k+"");
            }
            System.out.println();
        }
        scanner.close();
    }
}
