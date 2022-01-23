package Latihan2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Konsumsi> listKonsumsi = new  ArrayList<>();
        Konsumsi<Makanan,Minuman> breakfeast = new Konsumsi<>();
        Konsumsi<Makanan, Minuman> lunch = new Konsumsi<>();

        Makanan roti = new Makanan();
        roti.setNamaHidangan("roti tawar");
        Minuman susu = new Minuman();
        susu.setNamaHidangan("susu sapi");
        breakfeast.setKonsumsi(roti,susu);
        listKonsumsi.add(breakfeast);

        Makanan nasi = new Makanan();
        nasi.setNamaHidangan("nasi putih");
        Minuman air = new Minuman();
        air.setNamaHidangan("air putih");
        lunch.setKonsumsi(nasi,air);
        listKonsumsi.add(lunch);

        System.out.println("Menu Konsumsi");
        for (Konsumsi<Makanan,Minuman> konsumsi: listKonsumsi) {
            Makanan makanan = konsumsi.getM();
            Minuman minuman = konsumsi.getI();

            System.out.println(makanan.disantap());
            System.out.println(minuman.disantap());
        }
    }
}
