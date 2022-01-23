package Strukdatmateri;

import java.util.LinkedList;
import java.util.Queue;

public class Aplikasi {
    public static void main(String[] args) {
        Queue<String> isi = new LinkedList<>();

        isi.add("kardi");
        isi.add("slamet");
        isi.add("muklas");
        isi.add("baper");
        isi.add("muslihat");

        System.out.println("Antrian Pendaftaram peserta ");

        String nama = isi.remove();

        System.out.println("Menghapus dari antrian : "+ nama +"| daftar abtrian baru "+isi);

        nama = isi.poll();
        System.out.println("Menghapus dari antrian pendaftaran :  "+ nama+ "daftar abtrian baru"+ isi);
    }
}
