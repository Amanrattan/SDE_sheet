package linkedlist;

public class CircularLinkedList {

    private static boolean findCircularLL(Node head) {
        //edge case
        if(head == null){
            return false;
        }

        Node start = head.next;

        while( start != null && start != head){
            start = start.next;
        }
        return (head == start);
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
        Node p4 = new Node(4);
//        Node p5 = new Node(5);

        //Link the Nodes
        p1.next = p2;
        p2.next = p3;
        p3.next = p4;
//        p4.next = p1;
        p4.next = null;


        //displayLinkedList(p1);

        boolean LL = findCircularLL(p1);
        System.out.println(LL);
    }


}
