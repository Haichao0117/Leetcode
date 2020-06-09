package Problems;

/**
 * @Project: leetcode
 * @Package: Problems
 * @Description: Given a binary tree, find its maximum depth.
 *
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 *
 * Note: A leaf is a node with no children.
 * @Author: Wang Haichao
 * @CreateTime: 2020/6/9 16:02
 **/
public class Problem0104 {
    public int answer = 0;
    public int maxDepth(TreeNode root) {
        //return bottom_top(root);
        top_bottom(root,1);
        return answer;
    }

    public int bottom_top(TreeNode root){
        if(root == null) return 0;
        int left_ans = bottom_top(root.left);
        int right_ans = bottom_top(root.right);
        return Math.max(left_ans,right_ans)+1;
    }

    public void top_bottom(TreeNode root,int depth){
        if(root == null) return;
        if(root.left == null && root.right == null){
            answer = Math.max(answer,depth);
        }
        top_bottom(root.left,depth+1);
        top_bottom(root.right,depth+1);
    }
}
