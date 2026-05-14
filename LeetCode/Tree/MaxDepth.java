//Leetcode 104.Maximum depth of the binary tree

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
}

public class MaxDepth{
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }

        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}