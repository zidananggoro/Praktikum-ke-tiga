package Modul3Strukdat;

import java.util.HashMap;
import java.util.Scanner;

public class Mahasiswa {
    String nama,kelas,matkulPraktikum;
    int nim;

    public Mahasiswa(String nm,String kl,String mat,int ni){
        nama = nm;
        kelas = kl;
        matkulPraktikum = mat;
        nim = ni;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<String, Mahasiswa> mhs = new HashMap<>();
        String inp;
        Mahasiswa data;

        mhs.put("1",new Mahasiswa("putri","3h","Struktur data ",202000));
        mhs.put("2",new Mahasiswa("agus","3a","Matematika",202012));
        mhs.put("3",new Mahasiswa("arro","3D","Pemograman",202017));

        System.out.println("Masukkan Id : ");
        inp = input.nextLine();
        data = mhs.get(inp);
        if(data != null){
            System.out.println("data mahasiswa : "+ data.nama+", kelas : "+data.kelas
            + ", mata kuliah praktikum : "+ data.matkulPraktikum+", nim : "+data.nim);
        }
    }
}
