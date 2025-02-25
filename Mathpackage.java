import java.util.Scanner;

public class Mathpackage {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        System.out.println("Enter the values:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int max = Math.max(c,Math.max(a,b));
        System.out.println(max);
        scan.close();
    }
}
