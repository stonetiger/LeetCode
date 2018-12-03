package leetcode.answer.inprocess;

public class MinDepth_111 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        int i = Integer.MAX_VALUE;
        if (root.left != null) {
            i = Math.min(minDepth(root.left), i);
        }
        if (root.right != null) {
            i = Math.min(minDepth(root.right), i);
        }
        return i + 1;
    }
}
