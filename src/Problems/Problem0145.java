package Problems;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @Project: leetcode
 * @Package: Problems
 * @Description: houxu bianli
 * @Author: Wang Haichao
 * @CreateTime: 2020/6/4 19:12
 **/
public class Problem0145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        //return version1(root);
        LinkedList<Integer> res = new LinkedList<>();
        LinkedList<TreeNode> stack = new LinkedList<>();
        TreeNode cur = root;
        TreeNode last = null;
        while (!stack.isEmpty() || cur != null){
            if(cur != null){
                stack.push(cur);
                cur = cur.left;
            }else {
                TreeNode temp = stack.peek();
                //判断是否从右节点返回的
                if(temp.right != null && temp.right != last){
                    cur = temp.right;
                }else {
                    res.add(temp.val);
                    last = temp;
                    stack.pop();
                }
            }
        }
        return res;
    }

    /**
    * @Description: 根据前序遍历，改为 根-右-左，然后倒过来就是后序遍历左-右-根
    * @Param: [root]
    * @return: java.util.List<java.lang.Integer>
    * @Author: Wang Haichao
    * @CreateTime: 2020/6/4 23:34
    * @Version: version1.0
    **/
    private List<Integer> version1(TreeNode root) {
        LinkedList<Integer> res = new LinkedList<>();
        LinkedList<TreeNode> stack = new LinkedList<>();
        TreeNode cur = root;
        while (!stack.isEmpty() || cur != null){
            while (cur != null){
                res.add(cur.val);
                stack.push(cur);
                cur = cur.right;
            }
            cur = stack.pop();
            cur = cur.left;
        }
        Collections.reverse(res);
        return res;
    }
}
