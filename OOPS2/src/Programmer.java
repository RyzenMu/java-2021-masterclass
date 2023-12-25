public class Programmer extends Employee{
    private String language;

    public Programmer(String name, String surname, int age, String language){
        super(name, surname, age);
        this.language = language;
        
        //super() go and call the constructor of super class
        //super. means go and call the super variable or method
        //override
        //means go and call a method in super class and write something over it
    }

    @Override //annotation
    public void work() {
        super.work();
        System.out.println("I am Programming");
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("language : " + language);
    }
}
