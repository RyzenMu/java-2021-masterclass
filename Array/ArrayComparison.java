import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayComparison {
    public static void main(String[] args) {
        int [] s1 = {1, 2, 3, 4, 5};
        int [] s2 = {1, 2, 3, 5, 4};
        System.out.println(s1 == s2);
        int [] s3 = {1, 2, 3, 4, 5};
        System.out.println(s1 == s3);
        boolean arr = Arrays.equals(s1, s3); // compares refrence address
        System.out.println(arr);
    }
}
