class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
}

public class SymmetricTree{
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        return sameTree(root.left,root.right);
    }

    public boolean sameTree(TreeNode l,TreeNode r){
        if(l==null && r==null){
            return true;
        }
        if(l==null || r==null){
            return false;
        }
        if(l.val!=r.val){
            return false;
        }
        return sameTree(l.left,r.right) && sameTree(l.right,r.left);
    }
}