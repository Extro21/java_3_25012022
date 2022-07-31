package lesson1;

public class Box implements Comparable<Box> {
    private int size;

    public Box(int size) {
        this.size = size;
    }

    @Override
    public int compareTo(Box o) {
        return size - o.size;
    }

    //    @Override
//    public int compareTo(Object o) {
//        if (o.getClass() != Box.class) {
//            new IllegalArgumentException();
//        }
//
//        Box another = (Box) o;
//
//        return size - another.size;
//    }
}
