import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream1 {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        File file = new File("second.txt");
        try {
            fileInputStream = new FileInputStream(file);
            // using skip method.
            fileInputStream.skip(8);
            System.out.println((char)fileInputStream.read());
            System.out.println((char)fileInputStream.read());
            System.out.println((char)fileInputStream.read());
            System.out.println((char)fileInputStream.read());
            // read entire file
            int num ;
            String str = "";
            while ((num = (fileInputStream.read())) != -1){
                str += (char) num;
            }
            System.out.println(str);
        }catch (FileNotFoundException e){
            System.out.println("your file cannot find");
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
