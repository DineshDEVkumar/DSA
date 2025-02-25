package Patterns.Star_Patterns;

import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 1; i  <= n; i++) {
            // Print left half of the row
            for (int j = 1; j  <= i; j++) {
                System.out.print("*");
            }
            // Print spaces in the middle
            for (int j = 1; j  <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // Print right half of the row
            for (int j = 1; j  <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half of the diamond
        for (int i = n; i  >= 1; i--) {
            // Print left half of the row
            for (int j = 1; j  <= i; j++) {
                System.out.print("*");
            }
            // Print spaces in the middle
            for (int j = 1; j  <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // Print right half of the row
            for (int j = 1; j  <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
