package Trees.classes.class2;

import Trees.classes.TreeNode;
import Trees.classes.class1.CreateTree;
import java.util.*;

public class ZigZagTraversal {

    public static void main(String[] args) {
        CreateTree createTree = new CreateTree();
        TreeNode root = createTree.createTree();
    }

    public List<List<Integer>> zigZagTraversal(TreeNode root){
        List<List<Integer>> output = new ArrayList<>();
        if (root == null) return output;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        queue.offer(null);
        boolean leftToRight = false;



    }

}
