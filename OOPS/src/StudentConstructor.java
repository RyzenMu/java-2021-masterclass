public class StudentConstructor {
    // object cannot be created without a constructor
    // constructors must be public


    public StudentConstructor(String name){
        // constructor should be non-static and without return type
        String name1 = name;
        System.out.println("My name is " + name1);
    }
    public StudentConstructor(int rollNo){ // constructor over-loading
        int rollNo1 = rollNo;
        System.out.println("My roll no is " + rollNo1);
    }
    public void print(){
        System.out.println("My name is " );
    }
}
