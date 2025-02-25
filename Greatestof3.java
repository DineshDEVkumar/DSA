import java.util.Scanner;

public class Greatestof3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the values:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if (a>b && a>c){
            System.out.println("The greatest value is a "+a);
        }
        else if(b>a && b>c){
            System.out.println("The greatest value is b "+b);
        }
        else{
            System.out.println("The greatest value is c "+c);
        }
        scan.close();
    }
}
