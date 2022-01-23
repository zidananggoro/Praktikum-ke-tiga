package modul5Strukdat;

public class BinaryTree {
    public Node root;

    public void NewNode(int data){
        root = NewNode(root, new Node(data));
    }

    private Node NewNode(Node root,Node newdata){
        if (root == null){
            root = newdata;
            return root;
        }
        if (newdata.data < root.data){
            root.left = NewNode(root.left,newdata);
        }else {
            root.right = NewNode(root.right,newdata);
        }
        return root;
    }
    public void inOrder(Node node){
        if (node != null){
            inOrder(node.left);
            System.out.print(node.data + " ");
            inOrder(node.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree panggil = new BinaryTree();

        panggil.NewNode(20);
        panggil.NewNode(2);
        panggil.NewNode(25);
        panggil.NewNode(37);
        panggil.NewNode(16);

        System.out.println("in order : ");
        panggil.inOrder(panggil.root);
    }
}
