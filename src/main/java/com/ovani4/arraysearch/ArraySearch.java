package main.java.com.ovani4.arraysearch;

import java.util.*;

public class ArraySearch {

    private void SearchSum(int[] array)  {
    Set<Integer> set = new TreeSet<>();
    boolean bo = false;
        for (int i : array) {
            if (!set.add(i)){
                bo = true;
                System.out.println(bo);
                break;
            }
        }if (!bo)
        System.out.println(bo);
    }

    private void SearchDouble(int[] array) {
        Map<Integer,Integer> map = new TreeMap<>();
             for (int i = 0; i<array.length;i++) {
                 map.put(i, array[i]);
             }
             int x = array[array.length-1];
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

        as.SearchSum(array);
        as.SearchSum(array1);
        as.SearchDouble(array);
        as.SearchDouble(array1);
    }
}
