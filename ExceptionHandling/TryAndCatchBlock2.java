public class TryAndCatchBlock2 {
    public static void main(String[] args) {
        try{
            int a = 5/0; // Arithmetic exception
            String s = null;
            s.toUpperCase();//Null Pointer Exception
            int [] ss = {1, 2, 3};
            System.out.println(ss[5]);// Array index out of bound exception
        }
        catch (ArithmeticException e){
            System.out.println("You got arithmetic exception");
            e.printStackTrace();
        }catch (NullPointerException e){
            System.out.println("You got null pointer exception");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("You got array index exception");
        }
        System.out.println("New line of code");
    }
}
