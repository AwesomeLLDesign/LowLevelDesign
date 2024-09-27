package AlgoExpertProblems.Trees.BinarySearchTree;

import java.util.ArrayList;
import java.util.List;

public class BSTTraversal {

    private List<Integer> inOrderTraverse(BST tree, List<Integer> array) {

        if (tree == null)
            return array;

        inOrderTraverse(tree.left, array);
        array.add(tree.value);
        inOrderTraverse(tree.right, array);

        return array;
    }

    private List<Integer> preOrderTraverse(BST tree, List<Integer> array) {
        if (tree == null)
            return array;

        array.add(tree.value);
        preOrderTraverse(tree.left, array);
        preOrderTraverse(tree.right, array);

        return array;
    }

    private List<Integer> postOrderTraverse(BST tree, List<Integer> array) {
        if (tree == null)
            return array;

        postOrderTraverse(tree.left, array);
        postOrderTraverse(tree.right, array);
        array.add(tree.value);

        return array;
    }

    public static void main(String[] args) {
        BST root = new BST(10);
        root.left = new BST(5);
        root.right = new BST(15);
        root.left.left = new BST(2);
        root.left.right = new BST(5);
        root.right.right = new BST(22);
        root.left.left.left = new BST(1);
        BSTTraversal bstTraversal = new BSTTraversal();

        System.out.println("Inorder Traversal");

        List<Integer> array = new ArrayList<>();
        bstTraversal.inOrderTraverse(root, array);
        for (Integer num : array) {
            System.out.println(num);
        }

        System.out.println("Preorder Traversal");

        array = new ArrayList<>();
        bstTraversal.preOrderTraverse(root, array);
        for (Integer num : array) {
            System.out.println(num);
        }

        System.out.println("Postorder Traversal");

        array = new ArrayList<>();
        bstTraversal.postOrderTraverse(root, array);
        for (Integer num : array) {
            System.out.println(num);
        }
    }
}
