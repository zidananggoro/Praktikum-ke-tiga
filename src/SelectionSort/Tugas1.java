package SelectionSort;

public class Tugas1 {
    static void selectionSort(String arr[],int n)
    {
        // Satu per satu batas gerakan dari subarray yang tidak disortir
        for(int i = 0; i < n - 1; i++)
        {

            // Menemukan  elemen minimum dalam array yang tidak disortir
            int min_index = i;
            String minStr = arr[i];
            for(int j = i + 1; j < n; j++)
            {

            /*compareTo() membanding kan isi array nanti  */

                if(arr[j].compareTo(minStr) < 0)
                {
                    // Jadikan arr[j] sebagai minStr dan perbarui min_idx
                    minStr = arr[j];
                    min_index = j;
                }
            }

            // Mengganti element minimum
            // Ditemukan dengan elemet pertama
            if(min_index != i)
            {
                String temp = arr[min_index];
                arr[min_index] = arr[i];
                arr[i] = temp;
            }
        }
    }


    public static void main(String args[])
    {
        String[] arr1 = {"lala","zahra","dede","bobo"};

        System.out.println("Penumpang mobil A :"+arr1[0]+" "+arr1[1]+" "+arr1[2]+" "+arr1[3]);
        String[] arr2 = {"jarvis","daniel","qibo","aldo"};

        System.out.println("Penumpang mobil B :"+arr2[0]+" "+arr2[1]+" "+arr2[2]+" "+arr2[3]);
        System.out.println();

        String arr[] = {"lala","zahra","dede","bobo","jarvis","daniel","qibo","aldo"};
        System.out.println("Daftar Penumpang : "+arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]);

        int n = arr.length;
        selectionSort(arr, n);
        System.out.println("");

        System.out.print("Setelah di urutkan :");
        for(int i = 0; i < n; i++)
        {
            System.out.print(" "+arr[i]);
        }
    }
}
