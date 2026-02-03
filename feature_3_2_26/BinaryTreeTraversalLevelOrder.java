package feature_3_2_26;

import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeTraversalLevelOrder {

    static void levelOrder(TreeNode root){

        if(root==null) return;

        Queue<TreeNode> q= new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){

            TreeNode curr= q.poll();
            System.out.print(curr.data+" ");

            if(curr.left!=null){
                q.offer(curr.left);
            }
            if(curr.right!=null){
                q.offer(curr.right);
            }
        }
    }

    public static void main(String[] args) {

        BinaryTree bt= new BinaryTree();

        bt.insert(0);
        bt.insert(1);
        bt.insert(2);
        bt.insert(3);
        bt.insert(4);

        levelOrder(bt.root);
    }
}
