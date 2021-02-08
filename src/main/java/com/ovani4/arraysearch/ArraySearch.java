package main.java.com.ovani4.arraysearch;

import java.util.*;

public class ArraySearch {

    private void SearchSum(int[] array)  {

        Set<Integer> set = new TreeSet<>();
        List<Integer> list = new ArrayList<>();

        for (int i : array) {
            list.add(i);
        }
        //Добавление массива в Set
        boolean isTrue = true;
        for (int i : array) {
            if (!set.add(i)) {
                System.out.println("Значение " + i + " не уникально");
                isTrue = false;
            } else set.add(i);
        }
        int x = list.size();
        int y = array[x-1];
        //Поиск значений
        if (isTrue)
        for (int i : set) {
            int q = y - i;
            for (int j : set) {
                if (j == q && list.indexOf(i) < list.indexOf(j)){
                        System.out.println(list.indexOf(i) + " "
                                + list.indexOf(j));
                }
            }
        }
    }

    private void SearchDouble(int[] array) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < array.length; i++) {
            map.put(i, array[i]);
        }
        boolean res = false;
        for (Map.Entry entry1 : map.entrySet()) {
            int iter = 0;
            for (Map.Entry entry : map.entrySet()) {
                if (entry1.getValue().equals(entry.getValue())) {
                    iter++;
                }
            }
            if (iter > 1) {
                res = true;
            }
        }
        System.out.println(res);
    }



    public static void main(String[] args)  {
        ArraySearch as = new ArraySearch();
        int [] array = {15,2,5,8,9,7,17};
        int [] array1 = {15,2,7,15,9,7,17};

        as.SearchSum(array);
        as.SearchSum(array1);
        as.SearchDouble(array1);
        as.SearchDouble(array);
    }
}
