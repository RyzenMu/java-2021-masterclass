import java.io.IOException;

public class CheckedAndUncheckedException1 {
    //runtime exception is unchecked exception like nullpointerexception, indexoutofboundexception, arithmeticexception, numberFormatException, classCastException, etc
    //compileTime exception is checked exception like IOException, SQLException, malformedURLException etc..
    public static void controlExam(int result) throws Exception{
        if (result < 75){
            throw new IOException();
        }
    }
}
