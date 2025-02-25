import java.util.Scanner;

public class Addinput {
    public static void main(String[] args) {
        int a,b;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of a:");
        a = scan.nextInt();
        System.out.print("Enter the value of b:");
        b = scan.nextInt();
        int sum = a*b;
        System.out.println("The sum is "+sum);
        scan.close();
      }
}
