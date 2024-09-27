package AlgoExpertProblems.Trees;

import java.util.ArrayList;
import java.util.List;

class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;

    BinaryTree(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

public class BranchSums {

    private List<Integer> findBranchesSum(BinaryTree root) {
        List<Integer> results = new ArrayList<>();

        if (root == null)
            return results;

        findsum(results, 0, root);

        return results;
    }

    private void findsum(List<Integer> results, Integer sum, BinaryTree root) {
        if (root.left == null && root.right == null) {
            results.add(sum + root.value);
            return;
        }
        if (root.left != null)
        findsum(results, sum + root.value, root.left);
        if (root.right != null)
        findsum(results, sum + root.value, root.right);
    }


    public static void main(String[] args) {
        BinaryTree root = new BinaryTree(1);
        root.left = new BinaryTree(2);
        root.right = new BinaryTree(3);
        root.left.left = new BinaryTree(4);
        root.left.right = new BinaryTree(5);
        root.right.left = new BinaryTree(6);
        root.right.right = new BinaryTree(7);
        BranchSums branchSums = new BranchSums();
        List<Integer> results = branchSums.findBranchesSum(root);
        for (Integer num : results) {
            System.out.println(num);
        }
    }
}
