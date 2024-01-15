import java.io.FileWriter;
import java.io.IOException;

public class FileWriterClass1 {
    public static void main(String[] args) {
        FileWriter writer = null;
        try {
            writer = new FileWriter("example.txt", true);
            writer.write("SS Academy \n");
            writer.write(" is so cool academy");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if (writer != null){
                try {
                    writer.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }
}
