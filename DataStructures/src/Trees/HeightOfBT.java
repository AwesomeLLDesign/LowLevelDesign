package Trees;

public class HeightOfBT {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);
        root.left.left.left = new TreeNode(5);
        System.out.println("The height of the tree : " + findHeight(root));
    }

    public static int findHeight(TreeNode root) {
        if (root == null)
            return 0;
        return 1 + calculateHeight(root.left, root.right);
    }

    public static int calculateHeight(TreeNode left, TreeNode right) {
        if (left == null && right == null)
            return 0;
        int lNode = 0, rNode = 0;
        lNode = left == null ? 0 : 1 + calculateHeight(left.left, left.right);
        rNode = right == null ? 0 : 1 + calculateHeight(right.left, right.right);
        return Math.max(lNode, rNode);
    }

}
