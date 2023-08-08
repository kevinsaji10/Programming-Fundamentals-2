import java.io.*;
import java.util.*;
public class TextFileReader {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String fileNameAndPath = "/Users/kevinsaji/Desktop/students.txt";
        try {
            Scanner sc = new Scanner(new File(fileNameAndPath));
            System.out.println("Yes, " + fileNameAndPath + " exists");
        } catch (FileNotFoundException e) {
            System.out.println("No, " + fileNameAndPath + " does not exist");
        }
        long end  = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
