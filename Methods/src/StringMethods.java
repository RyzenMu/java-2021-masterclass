import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {
        String s = "Honey";
        String s1 = "Candle";
        if (s.equals(s1)){ // equals checks the equality in strings . Do not use == in Strings
            System.out.println("Both are Same");
        }
        else {
            System.out.println("Both are not same");
        }
        String s2 = "    Hello     ";
        System.out.println(s2);
        String s3 = s2.trim(); // trim method is used to trim spaces
        System.out.println(s3);
        System.out.println(s2.length());// length() gives the length of the string
        System.out.println(s3.length());
        System.out.println(s3.isEmpty()); // isEmpty()
        System.out.println(s3.isBlank()); //isBlank() - blank may contain white spaces
        System.out.println(s3.toUpperCase(Locale.ROOT)); // - toUpperCase()

    }
}
