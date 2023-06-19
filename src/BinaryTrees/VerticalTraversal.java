package BinaryTrees;

import java.util.*;

public class VerticalTraversal {

    private static List<Integer> verticalTraversal(Node root) {
        Queue<Pair> queue = new LinkedList<>();
        TreeMap<Integer, List<Integer>> map = new TreeMap<>();
        List<Integer> result = new ArrayList<>();
        Node curr = root;
        if(root == null){
            return result;
        }
        //Pair p = new Pair(curr, 0);
        queue.add(new Pair(curr, 0));
        while(!queue.isEmpty()){
           Pair p = queue.poll();
           int key= p.key;
            if(map.containsKey(key)){
                List<Integer> l = map.get(key);
                l.add(p.node.val);
                map.put(key,l);
            }else{
                List<Integer> l = new ArrayList<>();
                l.add(p.node.val);
                map.put(key,l);
            }
            if(p.node.left != null  ){
                queue.add(new Pair(p.node.left,key - 1));
            }

            if(p.node.right != null  ){
                queue.add(new Pair(p.node.right,key + 1));
            }
        }
        for( int k : map.keySet()){
            result.addAll(map.get(k));
            //result.add(map.get(k).get(0)); ----->top view
            //
        }
        return result;

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


        List<Integer> res = verticalTraversal(root);
        System.out.println(res);
    }



}
