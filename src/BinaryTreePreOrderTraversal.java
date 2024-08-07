import java.util.ArrayList;
import java.util.List;

// Definition for a binary tree node
class TreeNodes {
    int data;
    TreeNodes left;
    TreeNodes right;

    TreeNodes(int x) {
        data = x;
        left = null;
        right = null;
    }
}

public class BinaryTreePreOrderTraversal{

    // Method to perform inorder traversal
    public static void inorders(TreeNodes root, List<Integer> arr) {
        if (root == null) {
            return;
        }


        // Visit the root node
        arr.add(root.data);
        // Recursively traverse the left subtree
        inorders(root.left, arr);
        // Recursively traverse the right subtree
        inorders(root.right, arr);
        //arr.add(root.data);
    }

    public static void main(String[] args) {
        // Create a sample binary tree:
        //       1
        //      / \
        //     2   3
        //    /
        //   4

        TreeNodes root = new TreeNodes(1);
        root.left = new TreeNodes(2);
        root.right = new TreeNodes(3);
        root.left.left = new TreeNodes(4);

        List<Integer> inorderList = new ArrayList<>();
        inorders(root, inorderList);

        System.out.println("Inorder traversal: " + inorderList);
    }
}




