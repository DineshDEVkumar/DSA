import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        int d;
        Scanner sc = new Scanner(System.in);
        System.out.print("Give the value: ");
        d = sc.nextInt();
        System.out.println("The value is "+d);
        sc.close();
    }
}
