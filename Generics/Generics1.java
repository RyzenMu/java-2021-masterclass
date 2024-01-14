public class Generics1 <E>{
    // <>
    // E, T


    public static void main(String[] args) {
        Integer [] arr = {45, 63, 64, 46, 92};
        control.ControlClassGenerics.printArray(arr);
        System.out.println();
        System.out.println("************************************");
        Double [] arr1 = {5.3, 2.6, 6.2, 4.3, 3.5};
        control.ControlClassGenerics.printArray(arr1);
        System.out.println();
        System.out.println("************************************");
        String [] arr2 = {"hey", "hello", "come", "go"};
        control.ControlClassGenerics.printArray(arr2);

    }
}
