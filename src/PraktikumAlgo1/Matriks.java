package PraktikumAlgo1;

import java.util.Scanner;

public class Matriks {
    public void Matriks1() {
        int N = 5;
            int ordo;
            Scanner input = new Scanner(System.in);
            System.out.print("Masukan ordo martriks: ");
            ordo = input.nextInt();
            Integer[][] array = new Integer[ordo][ordo];
            System.out.println("Masukkan Elemen Matriks:");
            for (int i = 0; i < ordo; i++) {
                for (int j = 0; j < ordo; j++) {
                    array[i][j] = input.nextInt();
                }
            }

            System.out.println();

            System.out.println("Bentuk matriks:");
            for (int i = N - 1; i >= 0; i--) {
                for (int j = N - 1; j >= 0; j--) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
    }
}
