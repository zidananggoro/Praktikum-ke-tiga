package SelectionSort;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {5,7,2,9,3};
        int indexMin = 0;

        for (int i = 0; i < arr.length; i++){
            indexMin = i;
            for(int j=i+1; j< arr.length; j++){
                if (arr[j] < arr[indexMin]){
                    indexMin = j;
                }
            }
            int temp = arr[i];
            arr [i] = arr[indexMin];
            arr[indexMin]= temp;
        }
        for (int i =0;i <arr.length; i++){
            System.out.println(arr[i]+ "");
        }
    }
}
