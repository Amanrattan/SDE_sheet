package linkedlist;

public class MiddleElementInLinkedList {

    private static Node middleofLinkedList(Node head) {

        Node slow = head;
        Node fast = head;

        while( fast != null && fast.next != null ){//for odd ll and even ll

            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
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
//        p4.next = p5;
//        p5.next = null;
        p4.next = null;

//        displayLinkedList(head);
        System.out.println("Middle element :");
       Node middle = middleofLinkedList(p1);
        System.out.println(middle.value);
    }


}
