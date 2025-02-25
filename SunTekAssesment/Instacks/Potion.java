package SunTekAssesment.Instacks;

import java.util.Arrays;
import java.util.Scanner;
public class Potion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArray = scanner.nextLine().split(" ");
        int[] nums = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            nums[i] = Integer.parseInt(inputArray[i]);
        }
        int threshold = scanner.nextInt();
        int swapCount = sortWithAdjacentSwaps(nums);
        int longestSubarrayLength = findLongestSubarrayWithSumLessThanOrEqualTo(nums, threshold);
        System.out.println(Arrays.toString(nums) + ", " + swapCount + " ," + longestSubarrayLength);
        scanner.close();
    }
    private static int sortWithAdjacentSwaps(int[] nums) {
        boolean sorted;
        int swapCount = 0;
        do {
            sorted = true;
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                    sorted = false;
                    swapCount++;
                }
            }
        } while (!sorted);
        return swapCount;
    }
    private static int findLongestSubarrayWithSumLessThanOrEqualTo(int[] nums, int threshold) {
        int maxLength = 0;
        int currentSum = 0;
        int start = 0;
        for (int end = 0; end < nums.length; end++) {
            currentSum += nums[end];
            while (currentSum > threshold && start <= end) {
                currentSum -= nums[start++];
            }
            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }
}
