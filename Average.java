import java.util.*;

public class Average {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of a:");
        int a = scan.nextInt();
        System.out.print("Enter the value of b:");
        int b = scan.nextInt();
        System.out.print("Enter the value of c:");
        int c = scan.nextInt();
        int average = (a+b+c)/3;
        System.out.println("The average is "+average);
        scan.close();
    }
}
