public class StudentConstructor {
    // object cannot be created without a constructor
    // constructors must be public
    public StudentConstructor(String name){
        // constructor should be non-static and without return type
        String name1 = name;
    }
    public StudentConstructor(int rollNo){ // constructor over-loading
        int rollNo1 = rollNo;
    }
    public void print(){
        System.out.println("My name is " + StudentConstructor.name1);
    }
}
