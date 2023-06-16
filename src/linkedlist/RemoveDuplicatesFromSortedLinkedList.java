package linkedlist;

public class RemoveDuplicatesFromSortedLinkedList {

    private static Node duplicatesdetection(Node head) {
        if(head == null){
            return null;
        }

        Node ptr = head;


        while( ptr.next != null){

            if( ptr.value == ptr.next.value){
                ptr.next = ptr.next.next;
            }
            else{
                ptr = ptr.next;
            }
        }
        return head;
    }


    private static void displayLinkedList(Node p1) {
        Node ptr = p1;
        while (ptr != null) {
            System.out.print(ptr.value + "->");
            ptr = ptr.next;// like array +1
        }
        System.out.println("\n");
    }

    public static void main(String[] args){
        Node p1 = new Node(1);
        Node p2 = new Node(2);
        Node p3 = new Node(3);
        Node p4 = new Node(3);
        Node p5 = new Node(3);
        Node p6 = new Node(4);
        Node p7 = new Node(4);

        p1.next = p2;
        p2.next = p3;
        p3.next = p4;
        p4.next = p5;
        p5.next = p6;
        p6.next = p7;
        p7.next = null;

       // displayLinkedList(p1);
        System.out.println("Duplicated Linked List:");
        displayLinkedList(p1);

        System.out.println("No Duplicate elements Linked List:");
        Node head = duplicatesdetection(p1);

        displayLinkedList(head);
    }



}
