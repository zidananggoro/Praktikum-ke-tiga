package BubbleSort;

public class Tugas2 {
    public static void sortStrings(String[] arr, int n)
    {
        String temp;

        // Sorting strings menggunakan bubble sort
        for (int j = 0; j < n - 1; j++)
        {
            for (int i = j + 1; i < n; i++)
            {
                if (arr[j].compareTo(arr[i]) > 0)
                {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static void main(String[] args)
    {
        String[] arr1 = {"lala","zahra","dede","bobo"};
        System.out.println("Penumpang mobil A :"+arr1[0]+" "+arr1[1]+" "+arr1[2]+" "+arr1[3]);

        String[] arr2 = {"jarvis","daniel","qibo","aldo"};
        System.out.println("Penumpang mobil B :"+arr2[0]+" "+arr2[1]+" "+arr2[2]+" "+arr2[3]);

        System.out.println();

        String arr0[] = {"lala","zahra","dede","bobo","jarvis","daniel","qibo","aldo"};
        System.out.println("Daftar Penumpang : "+arr0[0]+" "+arr0[1]+" "+arr0[2]+" "+arr0[3]+" "+arr0[4]+" "+arr0[5]+" "+arr0[6]+" "+arr0[7]);

        String[] arr = { "lala","zahra","dede","bobo","jarvis","daniel","qibo","aldo" };
        int n = arr.length;

        sortStrings(arr, n);
        System.out.println("");

        System.out.print("Setelah di urutkan :");
        for (int i = 0; i < n; i++)
            System.out.print(" "+arr[i]);
    }
}
