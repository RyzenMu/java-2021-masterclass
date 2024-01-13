public class Game_Dev implements ItCompany{
    private String name;
    private String surname;
    private String language;

    public Game_Dev(String name, String surname, String language, int age) {
        this.name = name;
        this.surname = surname;
        this.language = language;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;

    @Override
    public void writeCode() {
        System.out.println(name + " " + surname + " is a game developer using" + language+ "language");
    }

    @Override
    public void comeEarly() {
        System.out.println(name + "always comees eaarly");
    }

    @Override
    public void testCode() {
        System.out.println(name + " " + surname + "never tests code because he has confident");
    }
}
