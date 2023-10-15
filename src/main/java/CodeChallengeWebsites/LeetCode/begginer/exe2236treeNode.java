package CodeChallengeWebsites.LeetCode.begginer;

/**
 * Resolvido em 19/07/2023
 **/
//https://leetcode.com/problems/root-equals-sum-of-children/
public class exe2236treeNode {

    public static void main(String[] args) {

    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        class Solution {

        }

        public boolean checkTree(TreeNode root) {

            if ( root.val == root.left.val + root.right.val ) {
                return true;
            }
            return false;
        }
    }
}
