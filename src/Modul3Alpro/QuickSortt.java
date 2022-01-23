package Modul3Alpro;

public class QuickSortt {
    String nama[];
    int length;

    public static void main(String[] args) {
        QuickSortt sortt = new QuickSortt();
        String words[] = {"Gajah", "Kuda", "ikan", "ayam", "bebek"};
        sortt.sort(words);

        for (String j : words) {
            System.out.println(j);
            System.out.print("");
        }
    }

    void sort(String array[]) {
        if (array == null || array.length == 0) {
            return;
        }
        this.nama = array;
        this.length = array.length;
        quickSort(0, length - 1);
    }

    void quickSort(int Indexbawah, int Indexatas) {
        int i = Indexbawah;
        int j = Indexatas;
        String pivot = this.nama[Indexbawah + (Indexatas - Indexbawah) / 2];

        while (i <= j) {
            while (this.nama[i].compareToIgnoreCase(pivot) < 0) {
                i++;
            }

            while (this.nama[j].compareToIgnoreCase(pivot) > 0) {
                j--;
            }

            if (i <= j) {
                Tukarnama(i, j);
                i++;
                j--;
            }
        }
        //panggil qucikSort
        if (Indexbawah < j) {
            quickSort(Indexbawah, j);
        }
        if (i < Indexatas) {
            quickSort(i, Indexatas);
        }
    }

    void Tukarnama(int i, int j) {
        String temp = this.nama[i];
        this.nama[i] = this.nama[j];
        this.nama[j] = temp;
    }
}
