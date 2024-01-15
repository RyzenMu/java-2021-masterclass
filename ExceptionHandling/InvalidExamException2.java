import java.io.IOException;

public class InvalidExamException2 {
    public static void controlExam(int result) {
        try {
            if(result < 75){
                throw new InvalidExamException();
            }
        } catch (Exception e) {
            System.out.println("You got problem bro");
            e.printStackTrace();
        }
    }
}
