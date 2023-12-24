public class Break {
    public static void main(String[] args) {
        for (int i = 0; i <=10; i++){
            for (int j=0; j <=10; j++){
                System.out.println(j);
                if (i == 5 || j >=5) {
                    break;
                }
            }
            System.out.println("completed " + i);
        }
    }
}
