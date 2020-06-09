package Problems;

/**
 * @Project: leetcode
 * @Package: Problems
 * @Description: Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 * @Author: Wang Haichao
 * @CreateTime: 2020/6/9 16:22
 **/
public class Problem0101 {
    public boolean isSymmetric(TreeNode root) {
        return check(root,root);
    }

    public boolean check(TreeNode p,TreeNode q){
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;

        return p.val == q.val && check(p.left,q.right) && check(p.right,q.left);
    }
}
