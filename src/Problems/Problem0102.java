package Problems;

import java.util.*;

/**
 * @Project: leetcode
 * @Package: Problems
 * @Description:
 * @Author: Wang Haichao
 * @CreateTime: 2020/6/5 21:27
 **/
public class Problem0102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        TreeNode cur = root;
        queue.add(cur);
        int level = 0;
        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                cur = queue.remove();
                if(cur == null) continue;
                list.add(cur.val);
                queue.add(cur.left);
                queue.add(cur.right);
            }
            if(!list.isEmpty()){
                res.add(list);
            }
        }
        return res;
    }
}
