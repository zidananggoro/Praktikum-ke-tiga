package Kegiatan1Arraylist;

import java.util.ArrayList;

public class Nomer6 {
    public static void main(String[] args) {
        ArrayList<String> masuk = new ArrayList<>();

        masuk.add("Cicak");
        masuk.add("Cicak");
        masuk.add("Cicak");
        masuk.add("Cicak");
        masuk.add("Cicak");
        masuk.add("Cicak");

        masuk.set(0,"ular");
        System.out.println(masuk);
        masuk.add(2,"itik");
        System.out.print(masuk);
        masuk.subList(2,5).clear();
        System.out.println(masuk);

    }
}