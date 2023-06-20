package BinarySearchTree;

public class InOrderSuccessorAndPredecessor {

    static Node pre = null;
    static Node suc = null;
    private static void findPreSuc(Node root,int key) {
        //Base Case
        if (root == null) {
            return;
        }

       if( root.val == key) {

           if (root.left != null) {
               Node temp = root.left;
               while(temp.right != null){
                   temp = temp.right;
               }
               pre = temp;
           }
           if (root.right != null) {
               Node temp = root.right;
               while(temp.left != null){
                   temp = temp.left;
               }
               suc = temp;
           }
           return;
       }
       if( root.val > key){
           suc = root;
           findPreSuc(root.left,key);
       }
       else{
           pre = root;
           findPreSuc(root.right,key);
       }
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

        findPreSuc(root,35 );
        System.out.println("Predecessor is :");
        System.out.println(pre.val);
        System.out.println("Successor is :");
        System.out.println(suc.val);
    }
}

