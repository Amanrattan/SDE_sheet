package BinaryTrees;

public class MirrorOfATree {
    private static Node mirror(Node root) {
        if(root == null){
            return root;
        }
         Node leftMirror = mirror(root.left);
         Node rightMirror = mirror(root.right);

         root.right = leftMirror;
         root.left = rightMirror;

         return root;
    }

    //using preorder for printing
    private static void preOrderTraversal(Node root) {
        if(root == null){
            return;
        }
        System.out.print(root.val + " ");

        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node p1 = new Node(2);
        Node p2 = new Node(3);
        Node p3 = new Node(4);
        Node p4 = new Node(5);
        Node p5 = new Node(6);
        Node p6 = new Node(7);

        root.left = p1;
        root.right = p2;
        p1.left = p3;
        p1.right = p4;
        p4.left = p5;
        p4.right = p6;

        //using pre order for traversal
        preOrderTraversal(root);
        System.out.println(" ");
        Node tree = mirror(root);
        preOrderTraversal(tree);
    }
}


