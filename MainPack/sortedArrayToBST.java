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
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length==0) return null;
        
        int mid=nums.length/2;
        
        TreeNode root=new TreeNode(nums[mid]);
        if(mid>0)
        root.left=sortedArrayToBST(Arrays.copyOfRange(nums,0,mid));
        if(mid+1<nums.length)
        root.right=sortedArrayToBST(Arrays.copyOfRange(nums,mid+1,nums.length));
        
        return root;
    }
}
/*Given an array where elements are sorted in ascending order, convert it to a height balanced BST.

*For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.*/
