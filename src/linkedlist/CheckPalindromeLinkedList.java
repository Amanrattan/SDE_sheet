package linkedlist;

import java.util.Stack;

public class CheckPalindromeLinkedList {

    private static boolean palindromeDetection(Node head) {

        Node slow = head;
        Node fast = head;
        Stack<Integer> stack = new Stack<>();
        while( fast != null && fast.next != null){
            stack.push(slow.value);
            slow = slow.next;
            fast = fast.next.next;
        }
        //check if number of elements are odd
        if(fast != null){
            //skip middle vlaue
            slow = slow.next;
        }
        //now pop and check
        while(slow != null){
            int top = stack.pop();
            if(top != slow.value){
                return false;
            }
            slow = slow.next;
        }
        return true;
    }

    private static void displayLinkedList(Node head) {
        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.value + "->");
            ptr = ptr.next;// like array +1
        }
        System.out.println("\n");
    }


    public static void main(String[] args) {
        Node p1 = new Node(1);
        Node p2 = new Node(2);
        Node p3 = new Node(3);
        Node p6 = new Node(3);
        Node p4 = new Node(2);
        Node p5 = new Node(1);

        //Link the Nodes
        p1.next = p2;
        p2.next = p3;
        p3.next = p6;
        p6.next  = p4;
        p4.next = p5;
        p5.next = null;


        displayLinkedList(p1);

        boolean res = palindromeDetection(p1);
        System.out.println(res);
    }


}