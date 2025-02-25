package SunTekAssesment.Instacks;

import java.util.InputMismatchException;
import java.util.Scanner;
public class BubbleSortWithStepTracking {
  public static int bubbleSort(int[] arr) {
    int n = arr.length;
    boolean swapped;
    int stepSorted = 0;
    for (int i = 0; i < n - 1; i++) {
      swapped = false;
      for (int j = 0; j < n - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
          swapped = true;
        }
      }
      if (!swapped) {
        stepSorted = i + 1;
        break;
      }
    }
    if (stepSorted == 0) {
      stepSorted = n;
    }
    return stepSorted;
  }
  public static void printArray(int[] arr) {
    for (int value : arr) {
      System.out.print(value + " ");
    }
    System.out.println();
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    try {
      int n = scanner.nextInt();
      if (n <= 0) {
        return;
      }
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = scanner.nextInt();
      }
      int stepSorted = bubbleSort(arr);
      printArray(arr);
      System.out.println(stepSorted);
    } catch (InputMismatchException e) {
      System.out.println("Invalid input");
    } finally {
      scanner.close();
    }
  }
}
