package linkedlist;

import java.util.Scanner;


public class ReverseKelements {

    private static void displayLinkedList(Node p1) {

        Node ptr = p1;
        while(ptr != null){
            System.out.print(ptr.value + "->");
            ptr = ptr.next;// like array +1
        }
        System.out.println("\n");
    }

    private static Node reverseKelements(Node head, int k) {

        Node p = head;
        int count = 1;
        while(count != k+1 ){
            p = p.next;
            count++;
        }
        Node prev = p;//change it into the p
        Node curr = head;
        Node next = null;

        while( curr != p){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        Node p1 = new Node(1);
        Node p2 = new Node(2);
        Node p3 = new Node(3);
        Node p4 = new Node(4);
        Node p5 = new Node(5);

        //Link the Nodes
        p1.next = p2;
        p2.next = p3;
        p3.next = p4;
        p4.next = p5;


        displayLinkedList(p1);

        Node head = reverseKelements(p1, 3);
        System.out.println("\n");

        displayLinkedList(head);

    }


}




