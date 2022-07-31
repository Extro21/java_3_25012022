package lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3));
//        System.out.println(sumOfList(nums));

        int x = getFirstElement(nums);

        List<String> strings = new ArrayList<>(Arrays.asList("qwe","asd"));
        String s = getFirstElement(strings);

//        Collections.copy();
    }

    public static <T> T getFirstElement(List<T> list){
        return list.get(0);
    }

    public static double sumOfList(List<? extends Number> numbers) {
        double d = 0.0;
        for (int i = 0; i < numbers.size(); i++) {
            d += numbers.get(i).doubleValue();
        }
        return d;
    }

    private static void exBoxWithNumbers() {
        BoxWithNumbers<Float> floatBox1 = new BoxWithNumbers<>(10f, 20f, 30f);
        System.out.println(floatBox1.avg());

        BoxWithNumbers<Float> floatBox2 = new BoxWithNumbers<>(10f, 20f, 30f);
        System.out.println(floatBox2.avg());

        System.out.println(floatBox1.sameAvg(floatBox2));

        BoxWithNumbers<Integer> integerBox = new BoxWithNumbers<>(10, 20, 30);
        System.out.println(integerBox.avg());

        System.out.println(floatBox1.sameAvg(integerBox));
    }

    private static void exBoxGen() {
        BoxGen<Integer> box1 = new BoxGen<>(10);
        BoxGen<Integer> box2 = new BoxGen<>(20);
        BoxGen<String> box3 = new BoxGen<>("werwer");

        box1.setObj(55);

        int sum = box1.getObj() + box2.getObj();
        System.out.println("sum = " + sum);

        System.out.println(box1.getClass());
        System.out.println(box3.getClass());
    }

    private static void exSimpleBox() {
        SimpleBox box1 = new SimpleBox(10);
        SimpleBox box2 = new SimpleBox(20);

        box1.setObj(35);

        if (box1.getObj() instanceof Integer && box2.getObj() instanceof Integer) {
            int sum = (int) box1.getObj() + (int) box2.getObj();
            System.out.println("sum = " + sum);
        }
    }
}
