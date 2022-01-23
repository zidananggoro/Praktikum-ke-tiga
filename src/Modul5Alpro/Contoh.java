package Modul5Alpro;

import java.util.Scanner;

public class Contoh {


    public static int interpolationSearch(int[] sortedArray, int toFind)
    {

        int low = 0;
        int high = sortedArray.length - 1;
        int mid;

        int temp = 0;
        // kuadratik
        for (int x = 0; x < sortedArray.length; x++)
        {
            for(int y = 0; y < sortedArray.length; y++)
            {
                //if else penulisan big - 0
                if(x == y)
                    continue;

                else
                {
                    if(sortedArray[x] < sortedArray[y])
                    {
                        temp = sortedArray[y];
                        sortedArray[y] = sortedArray[x];
                        sortedArray[x] = temp;
                    }
                }
            }
        }


        while (sortedArray[low] <= toFind && sortedArray[high] >= toFind)
        {

            if (sortedArray[high] - sortedArray[low] == 0)

                return (low + high)/2;
            mid = low + ((toFind - sortedArray[low]) * (high - low)) / (sortedArray[high] - sortedArray[low]);
            // if else
            if (sortedArray[mid] < toFind)
                low = mid + 1;

            else if (sortedArray[mid] > toFind)
                high = mid - 1;
            else
                return mid;
        }
        if (sortedArray[low] == toFind)
            return low;
        else
            return -1;
    }



    public static void main(String[] args)
    {

        Scanner scan = new Scanner( System.in );

        int n, i;
        System.out.println("masukkan jumlah elemnt bilangan bulat");
        n = scan.nextInt();
        int arr[] = new int[ n ];
        System.out.println("\nEnter "+ n +" masukkan data bilangan bulat");



        for (i = 0; i < n; i++)
            arr[i] = scan.nextInt();
        System.out.println("\nEnter element untuk mencari : ");
        int key = scan.nextInt();
        int result = interpolationSearch(arr, key);
        if (result == -1)
            System.out.println("\n"+ key +" data tidak ditemukan");
        else
            System.out.println("\n"+ key +" data berada pada posisi "+ result);
    }
}
