package Patterns;
import java.util.*;

public class InvertedStarLeftDown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // Input for the number of rows
        
        for (int i = 1; i <= n; i++) {  // Loop for rows
            for(int j = 1; j < i; j++) {  // Loop for spaces
                System.out.print(" ");
            }
            for(int k = i; k <= n; k++) {  // Loop for stars
                System.out.print("*");
            }
            System.out.println();  // Move to the next line after each row
        }
        sc.close();
    }
}
