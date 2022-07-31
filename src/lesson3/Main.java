package lesson3;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        File file = new File("1/a.txt");
//        System.out.println(file.length());
//        System.out.println(file.isFile());
//        System.out.println(file.isDirectory());

//        file.renameTo(new File("1/a.txt"));

//        File file1 = new File("1/2/3/4");
//        System.out.println(file1.mkdir());
//        System.out.println(file1.mkdirs());

//        System.out.println(file.getFreeSpace());
//        System.out.println(file.getTotalSpace());
//        System.out.println(file.getUsableSpace());

//        System.out.println(file.exists());
//        file.createNewFile();

//        System.out.println(file.getAbsoluteFile());
//        System.out.println(file.getAbsoluteFile().compareTo(new File("D:\\java\\java_3_25012022\\1\\c.txt")));
//        System.out.println(file.getCanonicalFile());

//        File file1 = new File("src/lesson1");
//        System.out.println(Arrays.asList(file1.list()));
//        System.out.println(Arrays.asList(file1.list((dir, name) -> name.startsWith("Box"))));
//        System.out.println(Arrays.asList(file1.listFiles()));
//        System.out.println(Arrays.asList(file1.listFiles(f -> f.isFile())));

//        System.out.println(Files.readAllLines(Paths.get("1/a.txt")));

//        FileInputStream in = new FileInputStream("1/a.txt");
//
//        int x;
//        while ((x = in.read()) >-1){
//            System.out.print((char) x);
//        }
//
//        if (in != null){
//            in.close();
//        }


//        FileInputStream in = new FileInputStream("1/a.txt");
//        byte[] arr = new byte[10];
//
//        int x;
//        while ((x = in.read(arr)) > -1) {
//            System.out.print(new String(Arrays.copyOf(arr, x)));
//        }
//
//        if (in != null) {
//            in.close();
//        }


////        FileOutputStream out = new FileOutputStream("1/out.txt");
//        FileOutputStream out = new FileOutputStream("1/out.txt", true);
////        out.write(67);
////        out.write(new byte[]{13, 65, 66, 67, 68});
//        out.write("java core".getBytes());
//
//        out.close();


//        InputStreamReader in = new InputStreamReader(new FileInputStream("1/a.txt")
//                , StandardCharsets.UTF_8);
//
//        int x;
//        while ((x = in.read()) >-1){
//            System.out.print((char) x);
//        }
//
//        if (in != null){
//            in.close();
//        }


//        InputStreamReader in = new InputStreamReader(
//                new BufferedInputStream(
//                new FileInputStream("1/a.txt"))
//                , StandardCharsets.UTF_8);
//
//        int x;
//        while ((x = in.read()) >-1){
//            System.out.print((char) x);
//        }
//
//        if (in != null){
//            in.close();
//        }


//        FileReader in = new FileReader("1/a.txt");
//
//        int x;
//        while ((x = in.read()) >-1){
//            System.out.print((char) x);
//        }
//
//        in.close();


//        RandomAccessFile raf = new RandomAccessFile("1/out.txt", "rw");
//        String s1 = raf.readLine();
//        System.out.println(s1);
//
//        raf.seek(3);
//        byte c2 = raf.readByte();
//        System.out.println((char) c2);
//
//        raf.close();


//        Cat cat = new Cat("Barsik", "red", 5);
//        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("1/cat.txt"));
//        out.writeObject(cat);

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("1/cat.txt"));
        Cat catFromFile = (Cat) in.readObject();

        System.out.println(catFromFile);


    }
}
