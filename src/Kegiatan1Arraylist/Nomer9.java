package Kegiatan1Arraylist;

import java.util.ArrayList;


public class Nomer9 {
    public static void main(String[] args) {
        ArrayList<String> masuk = new ArrayList<>();

        masuk.add("Cicak");
        masuk.add("ular");
        masuk.add("elang");
        masuk.add("gajah");
        masuk.add("badak");
        masuk.add("bebek");

        System.out.println("index dari badak di dalam array list adalah : "+masuk.indexOf("badak"));
    }
}
