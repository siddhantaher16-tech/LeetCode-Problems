/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        StringBuilder str = new StringBuilder();

        if(root == null) return list;

        str.append(root.val);
        backTrack(root, str, list);

        return list;
    }

    private void backTrack(TreeNode root, StringBuilder str,
                           List<String> list){
        if(root.left == null && root.right == null){
            list.add(str.toString());
        }

        int size = str.length();

        if(root.left != null){
            str.append("->").append(root.left.val);
            backTrack(root.left, str, list);
            str.setLength(size);
        }

        if(root.right != null){
            str.append("->").append(root.right.val);
            backTrack(root.right, str, list);
            str.setLength(size);
        }

    }
}