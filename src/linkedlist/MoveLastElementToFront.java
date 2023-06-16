package linkedlist;

public class MoveLastElementToFront {


    private static Node moveElement(Node head) {
        //edge case
        if(head.next == null){
            return head;
        }

        Node curr = head;
        Node prev = null;

        while(curr.next != null){//true nu false form ch likna
            prev = curr;
            curr = curr.next;
        }
        curr.next = head;
        prev.next = null;
        head = curr;
        return head;
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
        p4.next = null;

        System.out.println("input Linked List:");
        displayLinkedList(p1);

        System.out.println("Moved last element to front:");
        Node head = moveElement(p1);
        displayLinkedList(head);
    }


}
