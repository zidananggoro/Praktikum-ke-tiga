package Modul3Alpro;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test {
    static Set<String> permutations;
    static Set<String> result = new HashSet<String>();

    public static Set<String> permutation(String string) {
        permutations = new HashSet<String>();

        int n = string.length();
        for (int i = n - 1; i >= 0; i--)
        {
            permutasi(string.charAt(i));
        }
        return permutations;
    }

    private static void permutasi(char c) {
        if (permutations.size() == 0) {
            permutations.add(String.valueOf(c));
        } else {
            Iterator<String> it = permutations.iterator();
            for (int i = 0; i < permutations.size(); i++) {

                String temp1;
                for (;it.hasNext();) {
                    temp1 = it.next();
                    for (int k = 0; k < temp1.length() + 1; k += 1) {
                        StringBuilder sb = new StringBuilder(temp1);

                        sb.insert(k, c);

                        result.add(sb.toString());
                    }
                }
            }
            permutations = result;
            result = new HashSet<String>();
        }
    }

    public static void main(String[] args) {
        Set<String> result = permutation("xyz");

        System.out.println("\n Total semua" + result.size() + " permutations:");
        Iterator<String> it = result.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
