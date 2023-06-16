package linkedlist;

import java.util.Scanner;

public class StartingPointofALoop {

    private static Node firstpoint(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return slow;
            }
        }
        return null;
    }


    private static void displayLinkedList(Node p1) {

        Node ptr = p1;
        while (ptr != null) {
            System.out.print(ptr.value + "->");
            ptr = ptr.next;// like array +1
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Node p1 = new Node(1);
        Node p2 = new Node(2);
        Node p3 = new Node(3);
        Node p4 = new Node(4);
//        Node p5 = new Node(5);

        //Link the Nodes
        p1.next = p2;
        p2.next = p3;
        p3.next = p4;
        p4.next = p1;


        //displayLinkedList(p1);

        Node n =  firstpoint(p1);
        System.out.println(n.value);
    }
}
