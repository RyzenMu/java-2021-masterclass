import java.io.*;
import java.util.ArrayList;

public class CopyImage1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        FileInputStream stream;
        File fileIn = new File("img.png");
        File fileOut = new File("io2.png");


            try {
                stream = new FileInputStream(fileIn);
                int number;
                while ((number = stream.read()) != -1) {
                    list.add(number);
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        try {
            FileOutputStream outputStream = new FileOutputStream(fileOut);
            for (int a : list){
                outputStream.write(a);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

