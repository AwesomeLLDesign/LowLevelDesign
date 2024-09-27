package AlgoExpertProblems.Trees.BinarySearchTree;

import java.util.ArrayList;
import java.util.List;

public class ValidBST {

    private boolean validateBst(BST tree) {
        return isBSTUtil(tree, Integer.MIN_VALUE,
                Integer.MAX_VALUE);
    }

    private boolean isBSTUtil(BST node, int min, int max)
    {
        /* an empty tree is BST */
        if (node == null)
            return true;

        /* false if this node violates the min/max constraints */
        if (node.value < min || node.value > max)
            return false;

        /* otherwise check the subtrees recursively
        tightening the min/max constraints */
        // Allow only distinct values
        return (isBSTUtil(node.left, min, node.value-1) &&
                isBSTUtil(node.right, node.value+1, max));
    }

    public static void main(String[] args) {
        BST root = new BST(10);
        root.left = new BST(5);
        root.right = new BST(15);
        root.left.right = new BST(10);
//        root.left.right = new BST(5);
//        root.right.left = new BST(13);
//        root.right.right = new BST(22);
//        root.left.left.left = new BST(1);
//        root.right.left.right = new BST(14);
        ValidBST validBST = new ValidBST();
        System.out.println(validBST.validateBst(root));
    }
}
