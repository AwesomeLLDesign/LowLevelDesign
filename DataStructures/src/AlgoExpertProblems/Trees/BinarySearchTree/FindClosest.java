package AlgoExpertProblems.Trees.BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

class BST {
    int value;
    BST left;
    BST right;

    BST(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

public class FindClosest {

    private int findClosestValueInBst(BST tree, int target) {

        int globalDiff = Integer.MAX_VALUE, localDiff;
        int closestValue = 0;
        if (tree == null)
            return -1;
        Queue<BST> traversal = new LinkedList<>();
        traversal.add(tree);
        while (!traversal.isEmpty()) {
            BST temp = traversal.poll();
            localDiff = Math.abs(target - temp.value);
            if (localDiff < globalDiff){
                globalDiff =  localDiff;
                closestValue = temp.value;
            }
            if (temp.left != null){
                traversal.add(temp.left);
            }
            if (temp.right != null){
                traversal.add(temp.right);
            }
        }
        return closestValue;
    }

    public static void main(String[] args) {
        BST root = new BST(10);
        root.left = new BST(5);
        root.right = new BST(15);
        root.left.left = new BST(2);
        root.left.right = new BST(5);
        root.right.left = new BST(13);
        root.right.right = new BST(22);
        root.left.left.left = new BST(1);
        root.right.left.right = new BST(14);
        FindClosest findClosest = new FindClosest();
        System.out.println(findClosest.findClosestValueInBst(root, 12));
    }
}
