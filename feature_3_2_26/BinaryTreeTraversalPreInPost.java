package feature_3_2_26;

public class BinaryTreeTraversalPreInPost {

    static void preOrder(TreeNode Node){

        if(Node==null) return;
        System.out.print(Node.data+" ");
        preOrder(Node.left);
        preOrder(Node.right);
    }
    static void inOrder(TreeNode Node){

        if(Node==null) return;
        inOrder(Node.left);
        System.out.print(Node.data+" ");
        inOrder(Node.right);
    }
    static void postOrder(TreeNode Node){

        if(Node==null) return;
        postOrder(Node.left);
        postOrder(Node.right);
        System.out.print(Node.data+" ");
    }

    public static void main(String[] args) {

        BinaryTree bt= new BinaryTree();

        bt.insert(0);
        bt.insert(1);
        bt.insert(2);
        bt.insert(3);
        bt.insert(4);

        preOrder(bt.root);
        System.out.println();
        inOrder(bt.root);
        System.out.println();
        postOrder(bt.root);
    }
}
