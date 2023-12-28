public class StatesAndBehaviour {
    //states are also called  as variable
    private String name;
    private  String surname;
    private int age;
    //behavior also called as methods or function 
    public void walk(){
        System.out.println("person is walking" +
                "gf");
    }

    public StatesAndBehaviour(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public StatesAndBehaviour() {
    }
}
