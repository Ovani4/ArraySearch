package main.java.com.ovani4.arraysearch;

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
    public static void main(String[] args) {
        ArraySearch as = new ArraySearch();
        int [] array = {15,2,5,8,9,7,17};
        int [] array1 = {15,2,7,15,9,7,17};

    }
}
