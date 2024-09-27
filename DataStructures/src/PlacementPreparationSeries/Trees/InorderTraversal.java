package PlacementPreparationSeries.Trees;

public class InorderTraversal {

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
        return tree;
    }

    // recursie method
    private void inorderTraversal(Node root) {
        if (root == null)
            return;
        inorderTraversal(root.lptr);
        System.out.println(root.data);
        inorderTraversal(root.rptr);
    }

    public static void main(String[] args) {
        InorderTraversal inorderTraversal = new InorderTraversal();
        Node root = inorderTraversal.createTree();
        inorderTraversal.inorderTraversal(root);
    }
}
