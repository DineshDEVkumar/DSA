import java.util.Scanner;

public class EvenorOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter value of a:");
        int a = scan.nextInt();
        if(a%2==0){
            System.out.println("Value of a is even "+a);
        }
        else {
            System.out.println("Value of a is odd "+a);
        }
        scan.close();
    }
}
