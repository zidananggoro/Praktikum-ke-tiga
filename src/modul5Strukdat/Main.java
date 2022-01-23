package modul5Strukdat;

import java.util.ArrayList;
import java.util.Scanner;
//10 3 30 2 50 0 60 0 20 1 70 0 40 0

public class Main {
    public static void main(String[] args) {
        GenericTree panggil = new GenericTree();
        panggil.display();
        panggil.preorderrecursive();
        System.out.println(" ");
        panggil.postorderrecursive();
        System.out.println(" ");
        panggil.InOrder();


    }
}
class GenericTree {
    class Node {
        int data;
        ArrayList<Node> children;

        Node(int data) {
            this.data = data;
            children = new ArrayList<>();
        }
    }

    private Node root;

    GenericTree() {
        Scanner input = new Scanner(System.in);
        this.root = construcGT(input, null, 0);
    }

    private Node construcGT(Scanner input, Node parent, int i) {
        if (parent == null) {
            System.out.println("Masukkan data yang akan di masukkan ke Node..");
        } else {
            System.out.println("Masukkan data untuk child");
        }
        int data = input.nextInt();
        Node node = new Node(data);

        System.out.println("Masukkan nomer untuk children "+node.data);
        int n = input.nextInt();

        for (int j=0;j<n;j++){
            Node child = construcGT(input,node,j);
            node.children.add(child);
        }
        return node;
    }
    public void display(){
        display(this.root);
    }
    private void display(Node node){
        String str = node.data+" => ";

        for (Node child: node.children){
            str += child.data+",";
        }
        System.out.println(str);

        for (Node child: node.children){
            display(child);
        }
    }

    public void preorderrecursive(){
        System.out.print("Preorder : ");
        preorderrecursive(this.root);
    }
    private void preorderrecursive(Node node){
        if (node == null)
            return;

        System.out.print(node.data +" ");

        for (Node child : node.children){
            preorderrecursive(child);
        }
    }

    public void postorderrecursive(){
        System.out.print("Postorder: ");
        posorderrecursive(this.root);
    }
    private void posorderrecursive(Node node){
        if (node == null)
            return;

        for (Node child : node.children){
            posorderrecursive(child);
        }
        System.out.print(node.data+ " ");
    }

    public void InOrder(){
        System.out.print("in order : ");
        inorderrecursive(this.root);
    }
    private void inorderrecursive(Node node){
        if (node == null)
            return;

        for (Node child : node.children){
            System.out.print(node.data+" ");
            inorderrecursive(child);
        }

    }
}
