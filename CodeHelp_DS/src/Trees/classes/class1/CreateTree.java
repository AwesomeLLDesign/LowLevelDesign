package Trees.classes.class1;

import Trees.classes.TreeNode;

import java.util.Scanner;

public class CreateTree {

    public static void main(String[] args) {
        CreateTree createTree = new CreateTree();
        TreeNode root = createTree.createTree();
        createTree.printTree(root);
    }

    public TreeNode createTree(){

        System.out.println("Enter the data for node");
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        TreeNode newNode = null;
        if(val == -1){
            return null;
        }else{
            newNode = new TreeNode(val);
            System.out.println("Proceeding for left child of " + val);
            newNode.left = createTree();
            System.out.println("Proceeding for right child of " +  val);
            newNode.right = createTree();
        }
        return newNode;
    }

    private void printTree(TreeNode root){
        if (root == null)return;
        System.out.println(root.data);
        printTree(root.left);
        printTree(root.right);
    }

}
