//package linkedlist;
//
//import java.util.LinkedList;
//
//public class MergeSortLinkedList {
//
//
//    private static Node midNode(Node head){
//        Node fast = head;
//        Node slow = head;
//
//        while( fast != null && fast.next != null){
//            fast = fast.next.next;
//            slow = slow.next;
//        }
//        return slow;
//    }
//    private static LinkedList mergeTwoSortedLists(LinkedList l1;LinkedList l2){
//        Node one = l1.head;
//        Node two = l2.head;
//
//        LinkedList res = new LinkedList();
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
//    private static Node mergeSort(Node p1) {
//
//        if(head == tail){
//            LinkedList br = new LinkedList();//base result->br
//            br.addLast(head.data);
//            return br;
//        }
//        Node mid = midNode(p1);
//        fsh = mergeSort(head,mid);
//        ssh = mergeSort(mid.next, null);
//        LinkedList c1 = LinkedList.mergeTwoSortedLists(fsh,ssh);
//        return c1;
//    }
//    private static void displayLinkedList(Node head) {
//        Node ptr = head;
//        while (ptr != null) {
//            System.out.print(ptr.value + "->");
//            ptr = ptr.next;// like array +1
//        }
//        System.out.println("\n");
//    }
//
//    public static void main(String[] args) {
//        Node p1 = new Node(2);
//        Node p2 = new Node(1);
//        Node p3 = new Node(4);
//        Node p4 = new Node(5);
//        Node p5 = new Node(3);
//
//        //Link the Nodes
//        p1.next = p2;
//        p2.next = p3;
//        p3.next = p4;
//        p4.next = p5;
//        p5.next = null;
//
//        displayLinkedList(p1);
//
//        mergeSort(p1);
//    }
//
//
//}
