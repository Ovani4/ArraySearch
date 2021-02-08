package main.java.com.ovani4.arraysearch;

import java.util.*;

public class ArraySearch {
    private static boolean IsUnic (int[] array){
        int iter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]){
                    iter++;
                }
            }
        }
        System.out.println(iter);
        if (iter > 0){
            return false;
        } else return true;
    }

    private void SearchSum(int[] array){
        Set<Integer> set = new TreeSet<>();
        List<Integer> list = new ArrayList<Integer>();
        for (int i : array) {
            list.add(i);
        }
        //Добавление массива в Set
        for (int i : array) {
            if (!set.add(i)) {
                System.out.println("Значение " + i + " не уникально"); //Вместо метода IsUnic
            } else set.add(i);
        }
        int x = list.size();
        int y = array[x-1];
        //Поиск значений
        for (int i : set) {
            for (int j : set) {
                if (y == (i + j)){
                    if (list.indexOf(i) < list.indexOf(j))
                    System.out.println(list.indexOf(i) + " "
                            + list.indexOf(j));
                }
            }
        }
    }

    public static void main(String[] args) {
        ArraySearch as = new ArraySearch();
        int [] array = {15,2,5,8,9,7,17};
        int [] array1 = {15,2,7,15,9,7,17};
        as.SearchSum(array);
    }
}
