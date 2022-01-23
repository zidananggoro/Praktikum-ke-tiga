package LinkedList;

public class Link {
    Node head;

    public void add(int data){
        if (head == null){
            head = new Node(data);
        }
        Node curret = head;
        while (curret.next != null){
            curret = curret.next;
        }
        curret.next = new Node(data);
    }

    public void showdata(){
        if (head == null){
            System.out.println("linked is empety");
            return;
        }
        Node current = head;
        while (current.next != null){
            current = current.next;
            int data = current.data;
            System.out.println(data);
        }
    }
}
