package Strukdatmateri;


import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Uts {
    public static void main(String[] args) {

        Queue<String> str_queue = new LinkedList<>();

        str_queue.add("keep");
        str_queue.add("Calm");
        str_queue.add("and");
        str_queue.add("work");
        str_queue.add("Smart");

        System.out.println("isi nya :" + str_queue);

        Deque<String> str_dueue = new LinkedList<>();
        str_dueue.add("Keep");
        str_dueue.add("clam");
        str_dueue.add("and");
        str_dueue.add("word");
        str_dueue.add("smart");

        System.out.println("isi nya :" + str_dueue);
    }
}
