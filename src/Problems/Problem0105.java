package Problems;

import java.util.HashMap;

/**
 * @Project: leetcode
 * @Package: Problems
 * @Description: Given preorder and inorder traversal of a tree, construct the binary tree
 * @Author: Wang Haichao
 * @CreateTime: 2020/6/16 10:20
 **/
public class Problem0105 {
    private HashMap<Integer,Integer> hm = new HashMap<>();
    private int[] _preorder;
    private int pre_index;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        _preorder = preorder;
        int length = inorder.length;
        for(int i = 0; i < length; i++){
            hm.put(inorder[i],i);
        }
        pre_index = 0;

        return helper(0,length-1);
    }

    private TreeNode helper(int in_left, int in_right){
        if(in_left > in_right) return null;
        int val = _preorder[pre_index];
        TreeNode newNode = new TreeNode(val);
        int index = hm.get(val);

        pre_index++;

        newNode.left = helper(in_left,index-1);
        newNode.right = helper(index+1,in_right);
        return newNode;
    }
}
