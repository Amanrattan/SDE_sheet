package linkedlist;

public class SplitCircularLinkedListInto2halves {

    private static void halvesCircularLinkedList(Node head){
        Node slow = head;
        Node fast = head;

        while(fast.next != head && fast.next.next != head){
            slow = slow.next;
            fast = fast.next.next;
        }
        //check if there is Even No of Elements
        if(fast.next.next == head){
            fast = fast.next;

        }
        //now set the heads for both circular ll
        Node head1 = head;
        Node head2 = slow.next;
        fast.next = head2;
        slow.next = head1;
        displayCircularLinkedList(head1);
        displayCircularLinkedList(head2);
    }

    private static void displayCircularLinkedList(Node head){
        Node ptr = head;

        while(ptr.next != head){
            System.out.print(ptr.value + " -> ");
            ptr = ptr.next;
        }
        System.out.println(ptr.value);
        System.out.println(" ");
    }
    private static void displayLinkedList(Node head){
        Node ptr = head;
        while(ptr != null){
            System.out.print(ptr.value + "->");
            ptr = ptr.next;
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Node p1 = new Node(1);
        Node p2 = new Node(3);
        Node p3 = new Node(6);
        Node p4 = new Node(9);
        Node p5 = new Node(15);

        p1.next = p2;
        p2.next = p3;
        p3.next = p4;
        p4.next = p5;
        p5.next = p1;

//        displayLinkedList(p1);
        displayCircularLinkedList(p1);
        halvesCircularLinkedList(p1);
    }
}
