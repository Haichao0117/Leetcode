package Problems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Project: leetcode
 * @Package: Problems
 * @Description: zhongxu bianli
 * @Author: Wang Haichao
 * @CreateTime: 2020/6/4 19:04
 **/
public class Problem0094 {
    public List<Integer> inorderTraversal(TreeNode root) {
        //return IterateVersion1(root);
        List<Integer> res = new ArrayList<>();
        inorderTraversalHelper(root,res);
        return res;
    }

    private void inorderTraversalHelper(TreeNode root, List<Integer> list){
        if(root == null) return;
        inorderTraversalHelper(root.left,list);
        list.add(root.val);
        inorderTraversalHelper(root.right,list);
    }

    private List<Integer> IterateVersion1(TreeNode root) {
        LinkedList<Integer> res = new LinkedList<>();
        LinkedList<TreeNode> stack = new LinkedList<>();

        TreeNode cur = root;
        stack.push(cur);

        while (!stack.isEmpty() || cur != null){
            while (cur != null){
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            res.add(cur.val);
            cur = cur.right;
        }
        return res;
    }
}
