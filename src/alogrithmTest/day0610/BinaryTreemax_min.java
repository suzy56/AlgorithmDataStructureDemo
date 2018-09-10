package alogrithmTest.day0610;

public class BinaryTreemax_min {
    private int min;
    private int prevValue;

    public int getMinimumDifference(TreeNode root) {
        if (root == null) {
            return 0;
        }
        min = Integer.MAX_VALUE;
        prevValue = Integer.MAX_VALUE;
        getMinimumDifferenceCore(root);
        return min;
    }

    private void getMinimumDifferenceCore(TreeNode root) {
        if (root == null) {
            return;
        }
        getMinimumDifferenceCore(root.left);
        min = Math.min(min, Math.abs(prevValue - root.val));
        prevValue = root.val;
        getMinimumDifferenceCore(root.right);
    }

}


class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
     TreeNode(int x) { val = x; }
  }