package Functions_Methods;
import java.util.*;
public class MaxAndMin {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        System.out.println(Max(a,b,c));
        System.out.println(Min(a,b,c));
        scanner.close();
    }
    public static int Max(int a,int b,int c) {
        if(a>b && a>c){
            return a;
        }
        else if(b>a && b>c){
            return b;
        }
        else {
            return c;
        }
    }
    public static int Min(int a,int b,int c) {
        if(a<b && a<c){
            return a;
        }
        else if(b<a && b<c){
            return b;
        }
        else {
            return c;
        }
    }
}
