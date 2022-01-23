package Kegiatan1Arraylist;

import java.util.ArrayList;


public class Nomer3 {
    public static void main(String[] args) {

        ArrayList<String> masuk = new ArrayList<>();

        masuk.add("angsa");
        masuk.add("bebek");
        masuk.add("Cicak");
        masuk.add("Domba");
        masuk.add("elang");
        masuk.add("gajah");
        masuk.add("badak");
        masuk.add("bebek");

        masuk.remove(1);
        System.out.println(""+masuk);

    }
}
