package main.java.com.ovani4.arraysearch;

import java.util.*;

public class ArraySearch {

    private boolean SearchDuplicates(int[] array) {
        Set<Integer> set = new TreeSet<>();
        for (int i : array) {
            if (!set.add(i)) {
                return true;
            }
        }return false;
    }
    private void SearchSum(int[] array, int x) {
        Map<Integer,Integer> map = new TreeMap<>();
             for (int i = 0; i<array.length;i++) {
                 map.put(i, array[i]);
             }
        for (Map.Entry entry : map.entrySet()) {
            for (Map.Entry entry1 : map.entrySet()) {
                if (entry1.getValue().equals(x - (int) entry.getValue())
                && (int)entry.getKey() < (int)entry1.getKey()){
                    System.out.println(entry.getKey() + " " + entry1.getKey());
                }
            }
        }
    }



    public static void main(String[] args)  {
        ArraySearch as = new ArraySearch();
        int [] array = {15,2,5,8,9,7,17};
        int [] array1 = {15,2,7,15,9,7,17};


        as.SearchSum(array1, array[array.length-1]);
        as.SearchDuplicates(array);

    }
}
