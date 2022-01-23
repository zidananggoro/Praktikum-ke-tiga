package binarySearch;


import java.util.Scanner;


public class Main {

    private static int[] search(String[][] nama, String target) {
        if (nama.length == 0) {  // jika isi array kosong
            return new int[]{-1, -1};
        }


        int Nomer_Baris = nama.length;
        int Nomer_Colom = nama[0].length;

        int i = 0;
        int j = 0;

        for (i = 0; i < Nomer_Baris; i++) {
            for (j = 0; j < Nomer_Colom; j++) {
                if (target.equalsIgnoreCase(nama[i][j])) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
    public static void printMatrix(String matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        String nama[][] = {
                {"Alex", "Aqin", "Ariel", "Bella"},
                {"Caca", "Dinda", "Dwi", "Egi"},
                {"Farli", "Farkhan", "Gilly", "Ichsan"},
                {"Lidya", "Syahfei", "Syifa", "Wahyu"}
        };
        printMatrix(nama);

        System.out.print("Input Nama Yang ingin Dicari : ");
        Scanner scanner = new Scanner(System.in);
        String target = scanner.nextLine();

        int[] result= search(nama, target);

        if(result[0] != -1 && result[1] != -1) {
            System.out.println(target + " ( " + (result[0]) + ", " + (result[1])+" )");
        } else {
            System.out.println(target + " isi matrix tidak ditemukan");
        }
    }
}
