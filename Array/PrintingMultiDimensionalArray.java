public class PrintingMultiDimensionalArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        arr[0][0] = 5;
        arr[0][1] = 6;
        arr[0][2] = 7;

        arr[1][0] = 10;
        arr[1][1] = 11;
        arr[1][2] = 12;

        arr[2][0] = 20;
        arr[2][1] = 21;
        arr[2][2] = 22;
        for(int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

    }
}
