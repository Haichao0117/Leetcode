package Problems;

import java.util.HashMap;

/**
 * @Project: leetcode
 * @Package: Problems
 * @Description: Given inorder and postorder traversal of a tree, construct the binary tree.
 * @Author: Wang Haichao
 * @CreateTime: 2020/6/9 23:19
 **/
public class Problem0106 {
    private HashMap<Integer,Integer> hm = new HashMap<>();
    private int[] _postorder;
    private int post_index;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        _postorder = postorder;
        int length = inorder.length;
        for (int i = 0; i < length; i++) {
            hm.put(inorder[i],i);
        }
        post_index = length - 1;
        return helper(0,length-1);
    }

    private TreeNode helper(int in_left,int in_right){
        if(in_left > in_right) return null;
        int val = _postorder[post_index];
        TreeNode newNode = new TreeNode(val);
        int in_index = hm.get(val);

        //下一个节点
        post_index--;

        //先写右子树，因为再后序遍历中，是左->右->中的顺序，倒过来就得先到右子树
        newNode.right = helper(in_index+1,in_right);
        newNode.left = helper(in_left,in_index-1);
        return newNode;
    }
}
