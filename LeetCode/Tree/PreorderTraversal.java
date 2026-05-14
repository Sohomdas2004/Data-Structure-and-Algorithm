//Leetcode 145.Binary Tree Post Order Traversal

import java.util.ArrayList;
import java.util.List;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
}


public class PreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        traversal(root,res);
        return res;
    }

    void traversal(TreeNode root,List<Integer> res){
        if(root==null){
            return;
        }
        res.add(root.val);
        traversal(root.left,res);
        traversal(root.right,res);
    }
}
