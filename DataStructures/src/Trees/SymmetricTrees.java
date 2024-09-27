package Trees;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class SymmetricTrees {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);
        System.out.println("Tree is Symmetric : " + isSymmetric(root));
    }

    public static boolean isSymmetric(TreeNode root) {
        return checkSymmetric(root, root);
    }

    public static boolean checkSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null)
            return true;
        if (left != null && right != null && left.val == right.val) {
            return checkSymmetric(left.left, right.right) && checkSymmetric(left.right, right.left);
        }
        return false;
    }
}
