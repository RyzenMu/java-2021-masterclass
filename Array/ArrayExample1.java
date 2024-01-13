public class ArrayExample1 {
    public static void main(String[] args) {
        int [] arr = {1, 100, 5, 6, 7};
        for (int i = 0; i <=arr.length-1; i++){
            System.out.println(arr[i]);
        }
        // type 2 array
        int [] arr2 = new int[4];
        arr2[0] = 5;
        arr2[1] = 7;
        arr2[2] = 3;
        arr2[3] = 8;
        // type3 array
        String [] s = {"Hey", "Hello", "come", "go"};
        System.out.println("The length of string array is " +s.length);
        System.out.println(s[0]);
        // type3 array
        Double [] d = {1.4, 5.76, 3.75, 7.35};



    }
}
