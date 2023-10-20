//LeetCode 938 : https://leetcode.com/problems/range-sum-of-bst/


 class TreeNode {
       int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

class RangeSumofBST {
    int sum=0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        //if root is null then return 0
        if(root==null)return 0;

        //go left
        if(low<root.val && high<root.val){
            rangeSumBST(root.left, low, high);
        }
        //go right
        else if(low>root.val && high>root.val){
            rangeSumBST(root.right, low, high);
        }
        //if curr is within the range then add and explore more
        else{
            sum+=root.val;
            rangeSumBST(root.left, low, high);
            rangeSumBST(root.right, low, high);
        }

        return sum;

    }
}
