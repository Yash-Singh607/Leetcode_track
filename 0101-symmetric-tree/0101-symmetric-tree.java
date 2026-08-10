class Solution {
    TreeNode invertTree(TreeNode root) {
        if(root==null) return root;
        TreeNode l=root.left;
        TreeNode r=root.right;
        root.left=invertTree(r);
        root.right=invertTree(l);
        return root;
    }
    boolean isSameTree(TreeNode p, TreeNode q) {
        // base conditions
        if(p==null && q==null) return true;
        if(p==null) return false;
        if(q==null) return false;
        if(p.val!=q.val) return false;
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null ) return true;
        root.left=invertTree(root.left);
        return isSameTree(root.left,root.right) ;
    }
}