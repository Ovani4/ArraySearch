package main.java.com.ovani4.arraysearch;

import java.util.*;

public class ArraySearch {

    private void SearchSum(int[] array)  {
    Set<Integer> set = new TreeSet();
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
        Map<Integer, Integer> map = new TreeMap<>();
        boolean res = false;
        for (int i = 0; i < array.length; i++) {
            int iter = 0;
            map.put(i, array[i]);
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getValue().equals(array[i])){
                    iter++;
                }
            }if (iter > 1){
                res = true;
                System.out.println(res);
                break;
            }
        }
        if (!res){
            System.out.println(res);
        }
    }



    public static void main(String[] args)  {
        ArraySearch as = new ArraySearch();
        int [] array = {15,2,5,8,9,7,17};
        int [] array1 = {15,2,7,15,9,7,17};

        as.SearchSum(array);
        as.SearchSum(array1);
        //as.SearchDouble(array1);
        //as.SearchDouble(array);
    }
}
