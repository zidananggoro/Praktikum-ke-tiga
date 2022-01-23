package Kegiatan1Arraylist;

import java.util.ArrayList;


public class Nomer7 {
    public static void main(String[] args) {
        ArrayList<String> masuk = new ArrayList<>();


        masuk.add("ular");
        masuk.add("elang");
        masuk.add("gajah");
        masuk.add("badak");
        masuk.add("bebek");

        System.out.println("Elemet pertama :"+masuk.get(0));
        System.out.println("Elemet Kedua :"+masuk.get(masuk.size()-1));
    }
}
