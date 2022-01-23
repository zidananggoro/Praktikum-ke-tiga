package Kegiatan1Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Nomer5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> masuk = new ArrayList<>();

        masuk.add("Cicak");
        masuk.add("Domba");
        masuk.add("elang");
        masuk.add("gajah");
        masuk.add("badak");
        masuk.add("bebek");

        masuk.set(0,"ular");
        System.out.println(masuk);
        masuk.add(2,"itik");
        System.out.println(masuk);
    }
}
