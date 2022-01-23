package Kegiatan1;

import java.util.Scanner;

public class Segitiga2 {
        public void luasSegitigaDoble(){ Scanner input = new Scanner(System.in);
           System.out.println("Masukkan nilai alas dan tinggi secara berurutan");
           double alas = input.nextDouble();
           double tinggi = input.nextDouble();

           double luas = alas * tinggi /2;
           Segitiga<Double> luasTipeDouble = new Segitiga<>(luas);
           System.out.println("Luas segitiga dalam bentuk Doble adalah :"+luasTipeDouble.getResultAsDoble());

        }
}
