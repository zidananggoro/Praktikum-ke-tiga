package Modul3Alpro;

public class Rekursi {
    private static void swap(char[] chars, int i, int j)
    {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }


    //Fungsi rekursif untuk menghasilkan semua permutasi string

    private static void permutations(char[] chars, int currentIndex)
    {
        if (currentIndex == chars.length - 1) {
            System.out.println(String.valueOf(chars));
        }

        for (int i = currentIndex; i < chars.length; i++)
        {
            swap(chars, currentIndex, i);
            permutations(chars, currentIndex + 1);
            swap(chars, currentIndex, i);
        }
    }

    public static void cariPermutations(String str) {

        // base case
        if (str == null || str.length() == 0) {
            return;
        }

        permutations(str.toCharArray(), 0);
    }

    // hasilkan semua permutasi string di java
    public static void main(String[] args)
    {
        String str = "xyz";
        cariPermutations(str);
    }
}
