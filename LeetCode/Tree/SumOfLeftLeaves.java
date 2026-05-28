//Leetcode 404-Sum Of Left Leaves

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
}


public class SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        return sum(root);   
    }

    public int sum(TreeNode node){
        if(node==null){
            return 0;
        }
        int leftSum=0;
        if(node.left!=null  && node.left.left == null && node.left.right == null){
            leftSum+=node.left.val;
        }
        return leftSum+sum(node.left)+sum(node.right);
    }
}