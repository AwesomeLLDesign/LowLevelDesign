public class Freshworks2 {
    static class Tree{
        int data;
        Tree left;
        Tree right;

        Tree(int value){
            this.data = value;
            this.left = null;
            this.right = null;
        }
    }
    static int maxDiameter = 0;
    public static void main(String[] args) {

    }

    private static int calculateDiameter(Tree root){
        if(root == null){
            return 0;
        }
        int lh = calculateDiameter(root.left,0);
        int rh = calculateDiameter(root.right,0);
        int tld = lh + rh;
        int ld = Math.max(lh,rh);
        int localDiameter = 1+ Math.max(tld,ld);
        if(localDiameter > maxDiameter){
            maxDiameter = localDiameter;
        }
        return maxDiameter;
    }

    private static int calculateDiameter(Tree root,int height){
        if(root == null)
            return height;

        int lHeight =  calculateDiameter(root.left,height);
        int rHeight = calculateDiameter(root.right,height);

        int localD =  1 + Math.max(lHeight,rHeight);
        if(localD > maxDiameter){
            maxDiameter = localD;
        }
        return localD;
    }
}

/**
 * Diameter of Binary Tree
 *
 * Given the root of a binary tree, return the length of the diameter of the tree.
 *
 * The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.
 *
 * The length of a path between two nodes is represented by the number of edges between them.
 *
 * Input: root = [1,2,3,4,5]
 * Output: 3
 * Explanation: 3 is the length of the path [4,2,1,3] or [5,2,1,3].
 *
 *         1
 *     2       3
 * 4       5  4     5
 * 7                    8
 * */
