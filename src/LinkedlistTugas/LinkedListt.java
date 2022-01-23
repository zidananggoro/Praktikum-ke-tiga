package LinkedlistTugas;

    class Node {
        Node next;
        int data;
    }

    class LinkedList
    {
        // mengurutkan daftar array

        public Node mergeSort(Node node){
            if(node == null || node.next==null){
                return node;
            }

            Node tengah = tengahNode(node);
            Node duaTengah = tengah.next;
            tengah.next = null;

            return urut(mergeSort(node),mergeSort(duaTengah));
        }

        //memasukkan simpul tengah dari array

        public Node tengahNode(Node node){
            if(node == null){
                return null;
            }

            Node a = node;
            Node b = node.next;

            while(b != null && b.next != null){
                a = a.next;
                b = b.next;
            }
            return a;
        }

        // menggabungkan kedua daftar tertaut

        public Node urut(Node a, Node b){
            Node temp = new Node();
            Node finalList = temp;

            while (a != null && b != null){
                if(a.data < b.data){
                    temp.next = a;
                    a = a.next;
                }else {
                    temp.next = b;
                    b= b.next;
                }
                temp = temp.next;
            }
            temp.next = (a == null) ? b : a;
            return finalList.next;
        }
        // getDaopatkode() method untuk menghasilkan method baru

        public Node getDapatKode(int key){
            Node a = new Node();
            a.next = null;
            a.data = key;
            return a;
        }
        // metode masuk di gunakan untuk memyisipkan elemet dalam linkedlist

        public Node masuk(int key,Node node){
            if (node == null)
                return getDapatKode(key);
            else
                node.next = masuk(key,node.next);

            return node;
        }

        //di dalam masukkan untuk mengeluarkan output

        public void masukkan(Node node){
            if (node == null){
                return;
            }

            System.out.print(node.data+" ");
            masukkan(node.next);
        }
    }
public class LinkedListt {
    public static void main(String[] args) {
        Node root = null;
        LinkedList a = new LinkedList();

        root = a.masuk(8,root);
        root = a.masuk(7,root);
        root = a.masuk(6,root);
        root = a.masuk(5,root);
        root = a.masuk(4,root);
        root = a.masuk(3,root);
        root = a.masuk(2,root);
        root = a.masuk(1,root);

        a.masukkan(root);
        System.out.println();

        Node sorted = a.mergeSort(root);
        a.masukkan(sorted);
    }
}
