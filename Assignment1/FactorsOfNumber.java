package Assignment1;
import java.util.*;
public class FactorsOfNumber {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    for(int i=1;i<=n;i++){
        if(n%i==0){
            System.out.println(" "+i);
        }
    }
    scanner.close();
    }    
}
