package Assignment1.Volume;
import java.util.Scanner;

public class Cone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the cone: ");
        double r=scanner.nextDouble();
        double h=scanner.nextDouble();
        double ConeVolume = (Math.PI*r*r*(h/3));
        System.out.printf("The volume of the cone is: "+ConeVolume);
        scanner.close();
    }
}
