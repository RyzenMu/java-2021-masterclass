import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream1 {
    public static void main(String[] args) {
        FileOutputStream fileOutputStream = null;
        File file = new File("first.txt");
        try {
            fileOutputStream = new FileOutputStream(file, true);
            fileOutputStream.write(65);
            byte[] bytes = {65, 66, 67, 68, 69, 70};
            fileOutputStream.write(bytes);
            // writing a string requires to convert to bytes then write to fileStream
            String s = "SS Academy";
            byte [] bytes1 = s.getBytes();
            fileOutputStream.write(bytes1);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
