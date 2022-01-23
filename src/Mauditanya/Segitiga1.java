package Mauditanya;

public class Segitiga1 {
    public void luassegitigaInt() {

        Segitiga<Integer,Integer> hitung = new Segitiga<>(4,5);
        System.out.print("Luas segitiga dalam Integer :"+hitung.samadengan());
        System.out.println(hitung.samadengan());
    }
}
