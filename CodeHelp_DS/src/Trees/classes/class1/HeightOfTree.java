package Trees.classes.class1;

import Trees.classes.TreeNode;

public class HeightOfTree {

    public static void main(String[] args) {
        CreateTree createTree = new CreateTree();
        TreeNode root = createTree.createTree();
        HeightOfTree heightOfTree = new HeightOfTree();
        System.out.println("Height of tree: " + heightOfTree.findHeight(root));
    }

    private int findHeight(TreeNode root){
        if (root == null){
            return 0;
        }

        return 1+ Math.max(findHeight(root.left),findHeight(root.right));

//        int leftHeight = findHeight(root.left);
//        int rightHeight = findHeight(root.right);
//        int totalHeight = 1 + Math.max(leftHeight,rightHeight);
        // currnode height + max of lower nodes height
//        return totalHeight;
    }

}
