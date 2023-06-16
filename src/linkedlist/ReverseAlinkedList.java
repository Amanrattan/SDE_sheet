package linkedlist;

import java.util.Scanner;

class Node{
    int value;
    Node next;

    public Node(int val){
        value = val;
        //this.value = value; same datamember of class variable and method variable
    }
}


//main class
public class ReverseAlinkedList {

    private static Node reverseLinkedList(Node p1){
        //ietrative method:
           Node prev = null;
           Node curr = p1;
           Node next = null;

           while( curr != null){
               next = curr.next;
               curr.next = prev;
               prev = curr;
               curr = next;
           }
           return prev;
    }

    private static void displayLinkedList(Node head){
        Node ptr = head;
        while(ptr != null){
            System.out.print(ptr.value + "->");
            ptr = ptr.next;// like array +1
        }
        System.out.println("\n");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter size of ll: ");
//        int n = sc.nextInt();

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

        Node head = reverseLinkedList(p1);
        displayLinkedList(head);


    }
}
