package Assignment1.Area;

import java.util.Scanner;

public class AreaofParallelogram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         System.out.println("Enter the height:");
         double height = scan.nextDouble();
         System.out.println("Enter the baselength:");
         double baselength = scan.nextDouble();
         double area = height*baselength;
         System.out.println("The area of parallelogram is:"+area);
         scan.close();
    }
}
