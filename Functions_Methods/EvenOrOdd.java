package Functions_Methods;
import java.util.*;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(EO(n)=="Even"){
            System.out.println(n+" "+"Even");
        }
        else{
            System.out.println(n+" "+"Odd");
        }
        sc.close();
    }
    public static String EO(int n){
        if(n%2==0){
            return "Even";
        }
        else{
            return "Odd";
        }
    }
}
