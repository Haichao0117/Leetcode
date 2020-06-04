package Problems;

import java.util.LinkedList;
import java.util.List;

/**
 * @Project: leetcode
 * @Package: Problems
 * @Description: qianxu bianli
 * @Author: Wang Haichao
 * @CreateTime: 2020/6/4 18:27
 **/
public class Problem0144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        //return version1(root);
        LinkedList<Integer> res = new LinkedList<>();
        LinkedList<TreeNode> stack = new LinkedList<>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()){
            while (cur != null){
                res.add(cur.val);
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            cur = cur.right;
        }
        return res;
    }

    private List<Integer> version1(TreeNode root) {
        LinkedList<Integer> res = new LinkedList<>();
        LinkedList<TreeNode> stack = new LinkedList<>();
        if(root == null) return res;

        TreeNode cur = root;
        stack.push(cur);

//        while (!stack.isEmpty() || cur != null){
//            while (cur != null){
//                stack.push(cur);
//                cur = cur.left;
//            }
//            cur = stack.pop();
//            res.add(cur.val);
//            cur = cur.right;
//        }

        while (!stack.isEmpty()){
            cur = stack.pop();
            res.add(cur.val);
            if(cur.right != null){
                stack.push(cur.right);
            }
            if (cur.left != null){
                stack.push(cur.left);
            }
        }
        return res;
    }
}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
