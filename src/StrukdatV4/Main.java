package StrukdatV4;

class LinkedListQueue
{
    private Node depan, belakang;
    private int queueSize; // queue size


    private class Node {
        String data;
        Node next;
    }


    public LinkedListQueue()
    {
        depan = null;
        belakang = null;
        queueSize = 0;
    }


    //check if the queue is empty
    public boolean isEmpty()
    {
        return (queueSize == 0);
    }

    //Remove item from the front of the queue.
    public String dequeue()
    {
        String data = depan.data;
        depan = depan.next;
        if (isEmpty())
        {
            belakang = null;
        }
        queueSize--;
        System.out.println("antrian " + data+ " dihapus dari antrian");
        return data;
    }

    //Add data at the rear of the queue.
    public void enqueue(String data)
    {
        Node oldRear = belakang;
        belakang = new Node();
        belakang.data = data;
        belakang.next = null;
        if (isEmpty())
        {
            depan = belakang;
        }
        else  {
            oldRear.next = belakang;
        }
        queueSize++;
        System.out.println( data+ " Masuk ke dalam antrian");
    }
    //print front and rear of the queue
    public void size() {
        System.out.println("pertama :" + depan.data
                + " kedua " + belakang.data);
    }
    public void peek(){
         System.out.println("pertama "+ depan.data);
    }
}
class Main{
    public static void main(String a[]){

        LinkedListQueue queue = new LinkedListQueue();

        queue.enqueue("mobil 1");
        queue.enqueue("mobil 2");
        queue.size();
        queue.peek();
        queue.dequeue();
        queue.dequeue();
        queue.enqueue("mobil 3");
        queue.enqueue("mobil 4");
        queue.size();
        queue.peek();
        queue.dequeue();
        queue.dequeue();
        queue.size();

    }
}