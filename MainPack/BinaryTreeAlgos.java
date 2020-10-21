
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
  //IS SYMMETRIC
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        
        return isMirror(root.left,root.right);
    }
    public boolean isMirror(TreeNode t1, TreeNode t2){
        if(t1==null && t2==null) return true;
        if(t1==null || t2==null) return false;
        if(t1.val==t2.val){
            return(isMirror(t1.right,t2.left)  && isMirror(t1.left,t2.right));
        }
        return false;
    }
  //MAX DEPTH
     public int dmax;
     public int maxDepth(TreeNode root) {
            traverse(root,0);
         return dmax;
    }
    
    public void traverse(TreeNode root, int depth){
        if(root!=null){
            depth++;
            dmax=Math.max(depth,dmax);
            traverse(root.right,depth);
            traverse(root.left,depth);
        }
    } 
  //VALIDATE BST
      public boolean isValidBST(TreeNode root) {
        return isValidTree(root,null,null);
    }
    
    public boolean isValidTree(TreeNode root, Integer lower, Integer upper){
        if(root==null) return true;
        
        if(lower!=null && root.val<=lower) return false;
        if(upper!=null && root.val>=upper) return false;
        
        if(!isValidTree(root.right, root.val, upper)) return false;
        if(!isValidTree(root.left, lower, root.val)) return false;
        
        return true;
    }
}
