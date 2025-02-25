package Technical_Training;
import java.util.*;
public class HouseProblem {
    public static int maxStolenValue(int[] val) {
        int n = val.length;
        if (n == 0) return 0;
        if (n == 1) return val[0];
        if (n == 2) return Math.max(val[0], val[1]);
        int prev2 = val[0];
        int prev1 = Math.max(val[0], val[1]);
        int curr = 0;
        for (int i = 2; i < n; i++) {
            curr = Math.max(prev1, prev2 + val[i]);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("0");
            return;
        }
        int[] val = new int[n];
        for (int i = 0; i < n; i++) {
            val[i] = scanner.nextInt();
        }
        int result = maxStolenValue(val);
        System.out.println(result);
        scanner.close();
    }
}
