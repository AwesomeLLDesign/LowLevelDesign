package AlgoExpertProblems.Trees;

class Node {

    int data;
    Node lptr = null;
    Node rptr = null;

    Node(int val) {
        this.data = val;
    }

}

public class PreorderTraversal {

    private void printPreOrderTraversal(Node root) {

        if (root == null)
            return;
        System.out.println(root.data);
        printPreOrderTraversal(root.lptr);
        printPreOrderTraversal(root.rptr);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.lptr = new Node(2);
        root.rptr = new Node(3);
        root.lptr.lptr = new Node(4);
        root.lptr.rptr = new Node(5);
        root.rptr.lptr = new Node(6);
        root.rptr.rptr = new Node(7);
        PreorderTraversal preorderTraversal = new PreorderTraversal();
        preorderTraversal.printPreOrderTraversal(root);
    }
}
