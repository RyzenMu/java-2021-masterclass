public class MainInsanceOf {
    public static void main(String[] args) {
        Person p1 = new Person("ravu", 47, "male");
        Student s1 = new Student("riesh", 65, "female");
        
        System.out.println(p1 instanceof Person);
        System.out.println(p1 instanceof Student);
        System.out.println(s1 instanceof Person);
    }
}
