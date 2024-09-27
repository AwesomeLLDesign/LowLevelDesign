package Trees.classes.class1;

import Trees.classes.TreeNode;

public class TreeTraversals {

    public static void main(String[] args) {
        TreeTraversals traversals = new TreeTraversals();
        CreateTree createTree = new CreateTree();
        TreeNode root = createTree.createTree();
        System.out.println("Preorder: ");
        traversals.preOrderTraversal(root);
        System.out.println("Inorder: ");
        traversals.inOrder(root);
        System.out.println("PostOrder: ");
        traversals.postOrder(root);
    }

    private void preOrderTraversal(TreeNode root){
        if (root == null){
            return;
        }
        //NLR : Node Left Right
        System.out.println(root.data);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    private void inOrder(TreeNode root){
        if (root == null)return;
        //LNR :  Left Node Right
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }

    private void postOrder(TreeNode root){
        if (root == null)return;
        //LRN: Left Right Node
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }

}
