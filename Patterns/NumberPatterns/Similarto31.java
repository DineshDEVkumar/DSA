package Patterns.NumberPatterns;

import java.util.Scanner;

public class Similarto31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        n=2*n;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                int AtEveryIndex= Math.min(Math.min(i, j), Math.min(n-i, n-j));
                System.out.print(AtEveryIndex+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
