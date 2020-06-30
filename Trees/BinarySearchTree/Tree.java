package Trees.BinarySearchTree;

public class Tree {
    private TreeNode root;

    public void insert(int value){
        if (root ==null){
            root = new TreeNode(value);
        }
        else {
            root.insert(value);
        }
    }
    public void traverseInOrder(){
        if (root != null){
            root.traverseInOrder();
        }
    }
    public TreeNode get(int value){
        if (root!=null){
            return root.get(value);
        }
        return null;
    }
    public void delete(int value){
        root = delete(root,value);
    }
    private TreeNode delete(TreeNode subtreeRoot,int value){
        if (subtreeRoot == null){
            return subtreeRoot;
        }
        if (value< subtreeRoot.getData()){
            // we move to subtree left child and at the end we'll replace the subtree left child with the whatever the
            //result of replace is
            subtreeRoot.setLeft(delete(subtreeRoot.getLeft(),value));
        }
        else if (value>subtreeRoot.getData()){
            subtreeRoot.setRight(delete(subtreeRoot.getRight(),value));
        }
        else{
            //Cases 1 and 2 :node to delete has 0 or 1 child(ren)
            if (subtreeRoot.getLeft() == null){
                return subtreeRoot.getRight();
            }
            else if (subtreeRoot.getRight() == null){
                return subtreeRoot.getLeft();
            }
            //Case 3 : node to delete has 2 children
            // Replace the value in the subtree node with the smallest value from the right subtree
            subtreeRoot.setData(subtreeRoot.getRight().min());
            // Delete the node that has the smallest value in the right subtree
            subtreeRoot.setRight(delete(subtreeRoot.getRight(),subtreeRoot.getData()));
        }

        return subtreeRoot;
    }
    public int min(){
        if (root == null){
            return Integer.MIN_VALUE;
        }
        else {
            return root.min();
        }
    }
    public int max(){
        if (root == null){
            return Integer.MAX_VALUE;
        }
        else {
            return root.max();
        }
    }
}
