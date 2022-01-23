package StrukdatV4;

import java.util.Scanner;

public class Tulisankebalik {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Tulisan :");
        String tulisan = input.nextLine();


        byte[] strAsByteArray = tulisan.getBytes();

        byte[] result = new byte[strAsByteArray.length];


        for (int i = 0; i < strAsByteArray.length; i++)
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];

        System.out.println("Hasilnya :"+new String(result));
    }
}
