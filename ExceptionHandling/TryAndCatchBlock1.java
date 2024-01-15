public class TryAndCatchBlock1 {
    public static void main(String[] args) {

        try{
            int [] arr = {1, 2, 3};
            System.out.println(arr[1]);
            int a = arr[4];
        }catch (Exception e){
            System.out.println("You got error");
            e.printStackTrace();
        }
    }
}
