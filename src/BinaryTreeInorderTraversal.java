import java.util.ArrayList;
import java.util.List;

// Definition for a binary tree node
class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        data = x;
        left = null;
        right = null;
    }
}

public class BinaryTreeInorderTraversal {

    // Method to perform inorder traversal
    public static void inorder(TreeNode root, List<Integer> arr) {
        if (root == null) {
            return;
        }
        // Recursively traverse the left subtree
        inorder(root.left, arr);
        // Visit the root node
        arr.add(root.data);
        // Recursively traverse the right subtree
        inorder(root.right, arr);
    }

    public static void main(String[] args) {
        // Create a sample binary tree:
        //       1
        //      / \
        //     2   3
        //    /
        //   4

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);

        List<Integer> inorderList = new ArrayList<>();
        inorder(root, inorderList);

        System.out.println("Inorder traversal: " + inorderList);
    }
}
