package PlacementPreparationSeries.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

    private class Node {

        int data;
        Node lptr;
        Node rptr;

        Node() {
        }

        Node(int val) {
            data = val;
            lptr = null;
            rptr = null;
        }

    }

    private Node createTree() {
        Node tree = new Node(1);
        tree.lptr = new Node(2);
        tree.rptr = new Node(3);
        tree.lptr.lptr = new Node(4);
        tree.lptr.rptr = new Node(5);
        tree.rptr.lptr = new Node(6);
        tree.rptr.rptr = new Node(7);
        tree.lptr.lptr.rptr = new Node(9);
        tree.lptr.lptr.rptr.lptr = new Node(8);
        return tree;
    }

    private void levelOrderTraversal(Node root) {

        if (root == null)
            return;

        Queue<Node> levelQueue = new LinkedList<>();
        levelQueue.add(root);
        levelQueue.add(null);

        while (!levelQueue.isEmpty()) {

            Node current = levelQueue.peek();
            levelQueue.remove();
            if (current != null) {
                System.out.println(current.data);
                if (current.lptr != null)
                    levelQueue.add(current.lptr);
                if (current.rptr != null)
                    levelQueue.add(current.rptr);
            } else {
                if (levelQueue.size() == 0)
                    break;
                levelQueue.add(current);
            }
        }
    }

    public static void main(String[] args) {

        LevelOrderTraversal levelOrderTraversal = new LevelOrderTraversal();
        Node root = levelOrderTraversal.createTree();
        System.out.println("The level order traversal of tree: ");
        levelOrderTraversal.levelOrderTraversal(root);
    }

}
