package Trees.sheet;

import java.util.*;

class Node{
    int data;
    Node left;
    Node right;

    Node(int val){
        this.data = val;
        this.left = null;
        this.right = null;
    }


}

public class TopView {

    public static void main(String args[]){

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        List<Integer> output = printTopView(root);
        for(int i : output){
            System.out.println(i);
        }

    }

    private static ArrayList<Integer> printTopView(Node root){

        class QueueObj{

            Node node;
            int hd;

            QueueObj(int horizontalDist, Node currNode){
                this.hd = horizontalDist;
                this.node = currNode;
            }

        }

        if (root == null){
            return new ArrayList<>();
        }

        Map<Integer,Integer> topView = new TreeMap<>();
        Queue<QueueObj> queue = new LinkedList<>();

        queue.add(new QueueObj(0,root));
        while(!queue.isEmpty()){

            QueueObj temp  = queue.poll();
            if (!topView.containsKey(temp.hd)) {
                topView.put(temp.hd, temp.node.data);
            }
                if (temp.node.left != null){
                    queue.add(new QueueObj((temp.hd - 1),temp.node.left));
                }
                if(temp.node.right != null){
                    queue.add(new QueueObj((temp.hd + 1),temp.node.right));
                }
            
        }

        return new ArrayList<>(topView.values());



    }

}
