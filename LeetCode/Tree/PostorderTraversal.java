import java.util.ArrayList;
import java.util.List;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
}

public class PostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> res=new ArrayList<>();
        traversal(root,res);
        return res;
    }

    void traversal(TreeNode node,ArrayList<Integer> res){
        if(node==null){
            return;
        }
        traversal(node.left,res);
        traversal(node.right,res);
        res.add(node.val);
    }
}
