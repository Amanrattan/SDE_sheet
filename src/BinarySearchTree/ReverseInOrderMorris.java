package BinarySearchTree;

public class ReverseInOrderMorris {
    private static void reverseInOrder(Node root) {
        Node curr = root;
        int count = 0;
        while(curr != null){
            if(curr.right == null){
//
                System.out.print(curr.val + " ");
                curr = curr.left;
            }
            else{
                Node pred = findSucc(curr);
                if(pred.left == null){
                    pred.left = curr;
                    curr = curr.right;
                }
                else{
                    pred.left = null;
//
                    System.out.print(curr.val + " ");
                    curr = curr.left;
                }
            }
        }

    }

    private static Node findSucc(Node root) {
        if (root.right != null) {
            Node temp = root.right;
            while (temp.left != null && temp.left != root) {
                temp = temp.left;
            }
            return temp;
        }
        return null;
    }
    public static void main(String[] args) {
        Node root = new Node(30);
        Node p1 = new Node(20);
        Node p2 = new Node(39);
        Node p3 = new Node(10);
        Node p4 = new Node(25);
        Node p5 = new Node(35);
        Node p6 = new Node(42);
        Node p7 = new Node(15);
        Node p8 = new Node(23);

        root.left = p1;
        root.right = p2;

        p1.left = p3;
        p1.right = p4;

        p2.left = p5;
        p2.right = p6;

        p3.right = p7;

        p4.left = p8;

      reverseInOrder(root);


    }
}
