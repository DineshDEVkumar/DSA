import java.util.Scanner;

public class Square {
   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter the area:");
       int a= scan.nextInt();
       int area = a*a;
       System.out.println("The area of the square is "+area);
       scan.close();
   }
}
