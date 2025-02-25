import java.util.Scanner;

public class Cost {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the cost of pencil:");
        float pencil = scan.nextFloat();
        System.out.print("Enter the cost of pen:");
        float pen = scan.nextFloat();
        System.out.print("Enter the cost of eraser:");
        float eraser = scan.nextFloat();
        float bill = pencil+pen+eraser;
        System.out.println("The bill is "+bill);
        float gst = 0.18f*bill;
        float gstbill = bill+gst;
        System.out.println("The total bill including gst is "+gstbill);
        scan.close();
    }
}
