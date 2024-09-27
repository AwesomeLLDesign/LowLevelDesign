package PlacementPreparationSeries.Trees;

public class PostorderTraversal {

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

    private void postOrderTraversal(Node root) {
        if (root == null)
            return;
        postOrderTraversal(root.lptr);
        postOrderTraversal(root.rptr);
        System.out.println(root.data);
    }

    public static void main(String[] args) {
        PostorderTraversal postorderTraversal = new PostorderTraversal();
        Node root = postorderTraversal.createTree();
        System.out.println("The recursive postorder traversal is : ");
        postorderTraversal.postOrderTraversal(root);
    }
}
