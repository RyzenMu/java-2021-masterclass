import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputStream1 {
    public static void main(String[] args) {
        FileOutputStream fileOutputStream = null;
        File file = new File("first.txt");
        try {
            fileOutputStream = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
