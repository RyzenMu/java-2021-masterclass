public class ExamController_Throw {
    public static void controlExam(int result) {
        if (result < 75){
            throw new ArithmeticException();
        }
    }
    public static void testString(String s){
        if(s==null){
            throw new NullPointerException();
        }
    }
}
