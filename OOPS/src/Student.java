public class Student {
    public String name; // public is an identifier
    public String surname; // public is an indentifier
    public String email; // public is an identifier
    public int age; // public is an identifier

    private int rollNo;
    public static void create(){
        System.out.println("I am a static Method, I am here, i belong to class");
    }
    public void create2(){
        System.out.println("this is static method -2 , and i am here, i belong to object");
    }



}
