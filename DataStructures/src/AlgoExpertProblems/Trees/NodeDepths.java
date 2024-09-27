package AlgoExpertProblems.Trees;

public class NodeDepths {

    private int findNodeDepths(BinaryTree root) {
        if (root == null)
            return 0;
        return calculateNodeDepths(0, root);
    }

    private int calculateNodeDepths(int depth, BinaryTree root) {
        int currDepth = depth + 1;
//        int leftDepth = depth + 1, rightDepth = depth + 1;
//        int leftSum = 0, rightSum = 0;
        if (root.right == null && root.left == null) {
            return 0;
        }

        return (root.left!=null?(currDepth + calculateNodeDepths(currDepth, root.left)) : 0) + ((root.right != null)? (currDepth + calculateNodeDepths(currDepth, root.right)):0);

//        if (root.left != null)
//            leftSum = leftDepth + calculateNodeDepths(leftDepth, root.left);
//        if (root.right != null)
//            rightSum = rightDepth + calculateNodeDepths(rightDepth, root.right);
//        return (leftSum + rightSum);
    }

    public static void main(String[] args) {
        BinaryTree root = new BinaryTree(1);
        root.left = new BinaryTree(2);
        root.right = new BinaryTree(3);
        root.left.left = new BinaryTree(4);
        root.left.right = new BinaryTree(5);
        root.right.left = new BinaryTree(6);
        root.right.right = new BinaryTree(7);
        root.left.left.left = new BinaryTree(8);
        root.left.left.right = new BinaryTree(9);
        NodeDepths nodeDepths = new NodeDepths();
        System.out.println(nodeDepths.findNodeDepths(root));
    }
}
