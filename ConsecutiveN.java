import java.util.*;
public class ConsecutiveN{
    public static int countConsecutive(int n) {
        int c = 0;
        int k = 1; 
        while (k * (k + 1) / 2 <= n) {
            if ((n - k * (k + 1) / 2) % k == 0) {
                c++;
            }
            k++;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        System.out.println(countConsecutive(n));
        scan.close();
    }
}