package Tree;



public class BST<E extends Comparable<E>> extends AbstractTree<E>{
    protected TreeNode<E> root;
    protected int size = 0;
    public BST(){

    }
    public BST(E[] object){
        for (int i = 0; i < object.length; i++)
            insert(object[i]);
    }
    @Override
    public boolean insert(E e){
        if (root == null)
            createNewNode(e);
        else {
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null){
                if (e.compareTo(current.element) < 0){
                    parent = current;
                    current = parent.left;
                }else if (e.compareTo(current.element) > 0){
                    parent = current;
                    current = parent.right;
                }else
                    return false;
            }
            if (e.compareTo(parent.element) < 0)
                createNewNode(e);
            else
                createNewNode(e);
        }
        size++;
        return true;
    }

    @Override
    public int getSize() {
        return 0;
    }

    private void createNewNode(E e) {
    }
    @Override
    public void inorder(){
        inorder(root);
    }
    protected void inorder(TreeNode<E> root){
        if (root == null) return;
        inorder(root.left);
        System.out.println(root.element + " ");
        inorder(root.right);
    }
}
