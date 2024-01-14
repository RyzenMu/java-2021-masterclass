import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int [] arr ={ 1, 5, 10, 3, 7, 9, 2, 4};
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("*************");
        for (int j : arr){
            System.out.print(j + " ");
        }
    }
}
