public class Freshworks {
    static class Tree{
        int data;
        Tree left;
        Tree right;

        Tree(int value) {
            this.data = value;
            this.left = null;
            this.right = null;
        }
    }
    public static void main(String[] args) {
            Tree root = new Tree(20);

    }

    private static int findLCA(int val1, int val2, Tree root){
        if(root == null){
            return -1;
        }

        if(root.data > val1 && root.data > val2)
        {
           return findLCA(val1,val2,root.left);
        }

        if(root.data < val1 && root.data < val2)
        {
            return findLCA(val1,val2,root.right);
        }

        return root.data;
    }
}
/**
 * Given a binary search tree, find the LCA - Lowest common Ancestor?
 *                        20
 *                 8           22
 *             4       12          24
 *                 10      14
 *
 * Input: LCA of 10 and 14
 * Output: 12
 *
 * Input: LCA of 8 and 14
 * Output: 8
 *
 * Input: LCA of 10 and 22
 * Output: 20
 *
 * LCA(TreeNode root, int a, int b)
 *
 * Given a binary tree, find the LCA - lowest Common Ancestor?
 * */