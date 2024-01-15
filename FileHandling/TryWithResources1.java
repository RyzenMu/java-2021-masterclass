import java.io.FileWriter;
import java.io.IOException;

public class TryWithResources1 {
    public static void main(String[] args) {

        try(FileWriter writer = new FileWriter("example2.txt", true)) {
            writer.write("This is a test\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


