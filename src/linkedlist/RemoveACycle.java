package linkedlist;

public class RemoveACycle {
    private static boolean detectcycle(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    private static Node CycleDeletion(Node head) {
        Node slow = head;
        Node fast = head;

        while( fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (fast.next.next == slow.next) {
                slow.next = null;
                System.out.println("Cycle is removed.");
                return head;
            }
        }
        System.out.println("No cycle detected!");
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


    public static void main(String[] args){
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


        boolean res = detectcycle(p1);
        System.out.println(res);

        Node head = CycleDeletion(p1);
        displayLinkedList(head);
    }
}
