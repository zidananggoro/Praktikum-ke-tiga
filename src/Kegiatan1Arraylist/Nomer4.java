package Kegiatan1Arraylist;

import java.util.ArrayList;


public class Nomer4 {
    public static void main(String[] args) {
        ArrayList<String> masuk = new ArrayList<>();

        masuk.add("angsa");
        masuk.add("Cicak");
        masuk.add("Domba");
        masuk.add("elang");
        masuk.add("gajah");
        masuk.add("badak");
        masuk.add("bebek");



        System.out.println("Index ke 0 adalah :"+masuk.get(0));
        System.out.println("Index ke 2 adalah :"+masuk.get(2));

        masuk.remove(0);
        System.out.print(""+masuk);
    }
}
