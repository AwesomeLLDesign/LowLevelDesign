package PlacementPreparationSeries.Trees;

public class PreorderTraversal {

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

    private void preorderTraversal(Node root) {
        if (root == null)
            return;
        System.out.println(root.data);
        preorderTraversal(root.lptr);
        preorderTraversal(root.rptr);

    }

    public static void main(String[] args) {
        PreorderTraversal preorderTraversal = new PreorderTraversal();
        Node root = preorderTraversal.createTree();
        System.out.println("The recursive preorder traversal is: ");
        preorderTraversal.preorderTraversal(root);
    }
}
