package Kegiatan1;

import java.util.Scanner;

public class Segitiga1 {
    public void luassegitigaInt() {
        Scanner input = new Scanner(System.in);
       System.out.println("Masukkan nilai alas dan tinggi secara berurutan");
       int alas = input.nextInt();
       int tinggi = input.nextInt();

       int luas = alas * tinggi /2;

        Segitiga<Integer> luasTipeInt = new Segitiga<>(luas);
        System.out.println("Luas segitiga dalam Integer : "+luasTipeInt.getResultAsInt());
    }
}
