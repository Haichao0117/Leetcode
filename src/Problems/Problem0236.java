package Problems;

/**
 * @Project: leetcode
 * @Package: Problems
 * @Description:
 * @Author: Wang Haichao
 * @CreateTime: 2020/6/16 11:39
 **/
public class Problem0236 {
    private TreeNode ans;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root,p,q);
        return ans;
    }

    private boolean dfs(TreeNode root, TreeNode p, TreeNode q){
        if(root == null) return false;
        boolean lson = dfs(root.left,p,q);
        boolean rson = dfs(root.right,p,q);
        if((lson && rson) || ((root.val == p.val)||(root.val == q.val)) && (lson || rson)){
            ans = root;
        }
        return lson || rson || root.val == p.val || root.val == q.val;
    }
}
