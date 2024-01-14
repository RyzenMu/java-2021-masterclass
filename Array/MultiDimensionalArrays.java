public class MultiDimensionalArrays {
    public static void main(String[] args) {
        int [][] multi = new int[2][2];
        multi[0][0] = 5;
        multi[0][1] = 9;
        multi[1][0] = 2;
        multi[1][1] = 6;
        for (int[] e : multi){
            System.out.println(e);
        }
        //Type 2
        int [][] arr2 = {{7, 2}, {5, 3}};
        for(int i = 0; i<2; i++){
            for(int j = 0; j<2; j++){
                System.out.println(arr2[i][j]);
            }
        }
    }
}
