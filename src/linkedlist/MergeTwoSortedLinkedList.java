package linkedlist;

import java.util.LinkedList;

public class MergeTwoSortedLinkedList {

    private static void displayLinkedList(Node head){
        Node ptr = head;
        while(ptr != null){
            System.out.print(ptr.value + "->");
            ptr = ptr.next;
        }
        System.out.println("\n");
    }

    private static void addAtLast(Node head, int value) {

        Node n = new Node(value);
        Node ptr = head;
        while(ptr.next != null){
            ptr = ptr.next;
        }
        ptr.next = n;
    }

    private static Node mergeLinkedList(Node head1, Node head2) {

        Node p = head1;
        Node q = head2;
        Node res = new Node(0);

        while(p != null && q != null){

            if(p.value > q.value){
                addAtLast(res,q.value);
                q = q.next;
            }
            else{
                addAtLast(res,p.value);
                p = p.next;
            }
        }
        while(p != null){
            addAtLast(res,p.value);
            p = p.next;
        }
        while(q != null){
            addAtLast(res,q.value);
            q = q.next;
        }
        return res.next;
    }



//    private static LinkedList mergeTwoSortedLists(LinkedList l1;LinkedList l2){
//        Node one = l1.head;
//        Node two = l2.head;
//
//        LinkedList res = new LinkedList();//we use node
//
//        while(one != null && two != null){
//            if(one.data < two.data){
//                res.addLast(one.data);
//                one = one.next;
//            }else{
//                res.addLast(two.data);
//                two = two.next;
//            }
//        }
//
//        while(one != null ){
//            res.addLast(one.data);
//            one = one.next;
//        }
//
//        while(two != null ){
//            res.addLast(two.data);
//            two = two.next;
//        }
//
//        return res;
//    }

    public static void main(String[] args) {
//        LinkedList<Integer> l1 = new LinkedList<>();
//        l1.push(10);
//        l1.push(20);
//        l1.push(30);
//        l1.push(40);
//        l1.push(50);
//
//
//        LinkedList<Integer> l2 = new LinkedList<>();
//        l2.push(7);
//        l2.push(9);
//        l2.push(12);
//        l2.push(15);
//        l2.push(37);
//        l2.push(43);
//        l2.push(44);
//        l2.push(48);
//        l2.push(52);
//        l2.push(56);

//        System.out.println(l1);
//        System.out.println(l2);

        Node p1 = new Node(1);
        Node p2 = new Node(3);
        Node p3 = new Node(6);
        Node p4 = new Node(9);
        Node p5 = new Node(15);

        p1.next = p2;
        p2.next = p3;
        p3.next = p4;
        p4.next = p5;
        p5.next = null;

        Node q1 = new Node(4);
        Node q2 = new Node(5);
        Node q3 = new Node(7);
        Node q4 = new Node(25);

        q1.next = q2;
        q2.next = q3;
        q3.next = q4;
        q4.next = null;

        displayLinkedList(p1);
        displayLinkedList(q1);

//        mergeTwoSortedLists(l1,l2);
        Node head = mergeLinkedList(p1,q1);
        displayLinkedList(head);
    }


}