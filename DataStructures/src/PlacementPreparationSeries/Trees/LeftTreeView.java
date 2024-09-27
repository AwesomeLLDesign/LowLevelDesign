package PlacementPreparationSeries.Trees;

public class LeftTreeView {

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

    private void leftViewTraversal(Node root, int currLevel) {
        if (root == null)
            return;
        if (currLevel > globalLevel) {
            System.out.println(root.data);
            globalLevel = currLevel;
        }
        leftViewTraversal(root.lptr, currLevel + 1);
        leftViewTraversal(root.rptr, currLevel + 1);
    }

    public static void main(String[] args) {
        LeftTreeView leftTreeView = new LeftTreeView();
        Node root = leftTreeView.createTree();
        System.out.println("Recursive Left view traversal is: ");
        leftTreeView.leftViewTraversal(root, 0);
    }
}

/**
 * Left View through Level Order Traversal
 * <p>
 * package PlacementPreparationSeries.Trees;
 * <p>
 * import java.util.LinkedList;
 * import java.util.Queue;
 * <p>
 * public class LevelOrderTraversal {
 * <p>
 * private class Node {
 * <p>
 * int data;
 * Node lptr;
 * Node rptr;
 * <p>
 * Node() {
 * }
 * <p>
 * Node(int val) {
 * data = val;
 * lptr = null;
 * rptr = null;
 * }
 * <p>
 * }
 * <p>
 * private Node createTree() {
 * Node tree = new Node(1);
 * tree.lptr = new Node(2);
 * tree.rptr = new Node(3);
 * tree.lptr.lptr = new Node(4);
 * tree.lptr.rptr = new Node(5);
 * tree.rptr.lptr = new Node(6);
 * tree.rptr.rptr = new Node(7);
 * tree.lptr.lptr.rptr = new Node(9);
 * tree.lptr.lptr.rptr.lptr = new Node(8);
 * return tree;
 * }
 * <p>
 * private void levelOrderTraversal(Node root) {
 * <p>
 * if (root == null)
 * return;
 * <p>
 * Queue<Node> levelQueue = new LinkedList<>();
 * levelQueue.add(root);
 * levelQueue.add(null);
 * boolean levelFlag = true;
 * <p>
 * while (!levelQueue.isEmpty()) {
 * <p>
 * Node current = levelQueue.peek();
 * levelQueue.remove();
 * if (current != null) {
 * if (levelFlag == true){
 * System.out.println(current.data);
 * levelFlag = false;
 * }
 * if (current.lptr != null)
 * levelQueue.add(current.lptr);
 * if (current.rptr != null)
 * levelQueue.add(current.rptr);
 * } else {
 * if (levelQueue.size() == 0)
 * break;
 * levelFlag =true;
 * levelQueue.add(current);
 * }
 * }
 * }
 * <p>
 * public static void main(String[] args) {
 * <p>
 * LevelOrderTraversal levelOrderTraversal = new LevelOrderTraversal();
 * Node root = levelOrderTraversal.createTree();
 * System.out.println("The level order traversal of tree: ");
 * levelOrderTraversal.levelOrderTraversal(root);
 * }
 * <p>
 * }
 **/
