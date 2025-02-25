import java.util.Scanner;

public class AreaofCircle {
    public static void main(String[] args) {
        double r;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of r:");
        r=scan.nextDouble();
        double area = 3.14*r*r;
        System.out.println("The area of circle is "+area);
        scan.close();
    }
}
