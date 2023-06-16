package linkedlist;

public class AddTwoNumbersInLL {

    private static Node addNumbers(Node head1,Node head2){
        Node p = head1;
        Node q = head2;
        Node dummyList = new Node(0);
        Node res = dummyList;
        int carry = 0;
        while(p != null || q != null){
            int x = (p != null) ? p.value : 0;
//            int x;
//            if(p!=null){
//                x = p.value;
//            }else {
//                x = 0;
//            }
            int y = ( q != null) ? q.value : 0;
            int sum = carry + x + y;

            carry = sum/10;
//            this is for storage
            res.next = new Node( sum % 10);
            res = res.next;


            //move ahead:
            if(p != null){
                p = p.next;
            }if(q != null){
                q = q.next;
            }
        }

        //if carry is left
        if(carry > 0){
            res.next = new Node(carry);
        }
        return dummyList.next;
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
        Node p1 = new Node(2);
        Node p2 = new Node(4);
        Node p3 = new Node(3);
//        Node p4 = new Node(9);
//        Node p5 = new Node(15);

        p1.next = p2;
        p2.next = p3;
        p3.next = null;
//        p3.next = p4;
//        p4.next = p5;
//        p5.next = null;

        Node q1 = new Node(5);
        Node q2 = new Node(6);
        Node q3 = new Node(4);
//        Node q4 = new Node(25);

        q1.next = q2;
        q2.next = q3;
        q3.next = null;
//        q3.next = q4;
//        q4.next = null;

        displayLinkedList(p1);
        displayLinkedList(q1);

        Node ll = addNumbers(p1,q1);
        displayLinkedList(ll);
    }
}
