package feature_3_2_26;

import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    TreeNode root;

    BinaryTree(){root=null;}

    public void insert(int data){

        TreeNode newNode= new TreeNode(data);
        if(root==null){
            root=newNode;
            return;
        }
        Queue<TreeNode> q= new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()){
            TreeNode curr= q.poll();

            if(curr.left==null){
                curr.left=newNode;
                return;
            } else {
                q.offer(curr.left);
            }

            if(curr.right==null){
                curr.right=newNode;
                return;
            } else{
                q.offer(curr.right);
            }
        }
    }
}
class TreeNode{

    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data){
        this.data=data;
        left=null;
        right=null;
    }

}
