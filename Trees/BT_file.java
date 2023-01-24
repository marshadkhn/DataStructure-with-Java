package Trees;

public class BT_file {
    public static void main(String[] args) {
        treeCreation tree = new treeCreation();
        Node root = treeCreation.creation();
        tree.printInorder(root);
       
    }
}
