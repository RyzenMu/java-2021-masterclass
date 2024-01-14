package control;

public class ControlClassGenerics {
    // E means i can give paramaeter whatever i want
    public static <E> void printArray(E [] arr){
        for (E s : arr){
            System.out.print(s + "  ");
        }
    }
}
