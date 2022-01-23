package Kegiatan1Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Nomer2 {
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


        System.out.println("original version : ");
        System.out.println(masuk.get(0));
        System.out.println(masuk.get(1));
        System.out.println(masuk.get(2));
        System.out.println(masuk.get(3));
        System.out.println(masuk.get(4));
        System.out.println(masuk.get(5));
        System.out.println(masuk.get(6));
        System.out.println(masuk.get(7));

        System.out.println("");

        System.out.println(""+masuk);
        int hitung = Collections.frequency(masuk,"bebek");
        System.out.println(""+hitung);
        System.out.println("");
        System.out.println("Posisi Index");
        System.out.println(masuk.indexOf("bebek"));
        System.out.println(masuk.lastIndexOf("bebek"));

    }
}
