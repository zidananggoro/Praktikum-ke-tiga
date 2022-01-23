package Wildcard;

import java.util.Arrays;
import java.util.List;

public class Wildcardd {
    public static void printlist(List<?> list){
        for(Object elm : list){
            System.out.print(elm+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> dataInt = Arrays.asList(7,9,10);
        List<String> dataString = Arrays.asList("tujuh","sembilan","sepuluh");
        printlist(dataInt);
        printlist(dataString);
    }
}
