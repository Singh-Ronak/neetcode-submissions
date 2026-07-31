/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */

class Solution {
public:
    int solve(TreeNode* node){
        if(node == NULL) return 0;
        int l = solve(node->left);
        int r = solve(node->right);
        if(l == -1 || r == -1) return -1;
        if(abs(l-r) > 1) return -1;
        return 1+ max(l,r);
    }
    bool isBalanced(TreeNode* root) {
        if(solve(root) != -1) return true;
        return false;
        
    }
};
