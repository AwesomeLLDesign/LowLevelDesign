package PlacementPreparationSeries.Trees;

public class RightTreeView {

    int globalLevel = -1;

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

    private void rightViewTreeTraversal(Node root, int currLevel) {
        if (root == null)
            return;
        if (currLevel > globalLevel) {
            System.out.println(root.data);
            globalLevel = currLevel;
        }
        rightViewTreeTraversal(root.rptr, currLevel + 1);
        rightViewTreeTraversal(root.lptr, currLevel + 1);
    }

    public static void main(String[] args) {
        RightTreeView rightTreeView = new RightTreeView();
        Node root = rightTreeView.createTree();
        rightTreeView.rightViewTreeTraversal(root, 0);
    }
}
