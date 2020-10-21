class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new LinkedList();
        if(root==null) return res;
        
        Queue<TreeNode> q=new LinkedList();
        q.offer(root);
        
        int size=0;
        while(!q.isEmpty()){
            size=q.size();
            
            List<Integer> tlist=new LinkedList();
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                tlist.add(node.val);
                
                if(node.left!=null) q.add(node.left);  
                if(node.right!=null) q.add(node.right);
            }
            res.add(tlist);
        }
        return res;
    }
}
