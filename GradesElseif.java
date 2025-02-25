import java.util.Scanner;

public class GradesElseif {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the marks:");
        int marks = scan.nextInt();
        if(marks>=90){
            System.out.println("Grade is O for marks: "+marks);
        }
        else if(marks>=80){
            System.out.println("Grade is A+ for marks: "+marks);
        }
        else if(marks>=70){
            System.out.println("Grade is A for marks: "+marks);
        }
        else {
            System.out.println("Grade is low for marks: "+marks);
        }
        scan.close();
    }
}
