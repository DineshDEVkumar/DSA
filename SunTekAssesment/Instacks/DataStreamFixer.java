package SunTekAssesment.Instacks;

import java.util.Scanner;
public class DataStreamFixer {
  static class ListNode {
    int packetID;
    ListNode next;
    ListNode(int packetID) {
      this.packetID = packetID;
      this.next = null;
    }
  }
  public ListNode cyclicDelete(ListNode head, int k, int p) {
    if (head == null || k < 1)
      return head;
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode prev = dummy;
    ListNode curr = head;
    int count = 1;
    while (curr != null) {
      if (count % k == 0) {
        for (int i = 0; i <= p && curr != null; i++) {
          curr = curr.next;
        }
        prev.next = curr;
      } else {
        prev = curr;
        curr = curr.next;
      }
      count++;
    }
    return dummy.next;
  }
  public ListNode rotateRight(ListNode head, int r) {
    if (head == null || r == 0)
      return head;
    ListNode tail = head;
    int length = 1;
    while (tail.next != null) {
      tail = tail.next;
      length++;
    }
    tail.next = head;
    r = r % length;
    int stepsToNewHead = length - r;
    ListNode newTail = tail;
    while (stepsToNewHead-- > 0) {
      newTail = newTail.next;
    }
    ListNode newHead = newTail.next;
    newTail.next = null;
    return newHead;
  }
  public void printList(ListNode head) {
    ListNode current = head;
    while (current != null) {
      System.out.print(current.packetID + " ");
      current = current.next;
    }
    System.out.println();
  }
  public ListNode createLinkedList(int[] data) {
    if (data.length == 0)
      return null;
    ListNode head = new ListNode(data[0]);
    ListNode curr = head;
    for (int i = 1; i < data.length; i++) {
      curr.next = new ListNode(data[i]);
      curr = curr.next;
    }
    return head;
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    DataStreamFixer fixer = new DataStreamFixer();
    String[] nodeValuesStr = scanner.nextLine().split(" ");
    int[] nodesData = new int[nodeValuesStr.length];
    for (int i = 0; i < nodeValuesStr.length; i++) {
      nodesData[i] = Integer.parseInt(nodeValuesStr[i]);
    }
    ListNode head = fixer.createLinkedList(nodesData);
    int k = scanner.nextInt();
    int p = scanner.nextInt();
    int r = scanner.nextInt();
    head = fixer.cyclicDelete(head, k, p);
    head = fixer.rotateRight(head, r);
    fixer.printList(head);
  }
}
