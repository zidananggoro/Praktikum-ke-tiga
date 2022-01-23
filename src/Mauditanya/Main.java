package Mauditanya;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("==== Hitung Luas Segitiga ===");

        System.out.println("Mau menampilkan luas dalam bentuk ? :");
        System.out.println("1. Hasil to Integer");
        System.out.println("2. Hasil to double");
        System.out.println("Masukkan pilihan 1/2");
        int pilih = input.nextInt();
        switch (pilih){
            case 1:{
                Segitiga1 r= new Segitiga1();
                r.luassegitigaInt();
                break;
            }
            case 2:{
                Segitiga2 n = new Segitiga2();
                n.luassegitigaInt();
                break;
            }
        }
    }
}
