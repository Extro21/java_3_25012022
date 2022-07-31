package lesson1.hw;

import lesson1.hw.fruits.Apple;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"trt","ty","qw"};

        ArrayList<String> al = arrayToList(arr);
        System.out.println(al);

        BoxWithFruits<Apple> box1 = new BoxWithFruits<>();
        box1.add(new Apple());

    }

    public static <T> ArrayList<T> arrayToList(T[] arr) {
        return new ArrayList<>(Arrays.asList(arr));
    }

    public static void swap(Object[] arr, int index1, int index2 ){
        Object obj = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = obj;
    }

    public static <T> void swap1(T[] arr, int index1, int index2 ){
        T obj = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = obj;
    }

}
