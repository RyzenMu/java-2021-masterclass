public class Main_ExamController_Throw1 {
    public static void main(String[] args) {
        try {
            ExamController_Throw.controlExam(71);
        }catch(Exception exception){
            System.out.println("Your result is not bigger than 75");
        }
    }
}
