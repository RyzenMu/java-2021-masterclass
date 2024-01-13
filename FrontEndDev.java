public class FrontEndDev implements ItCompany{
    private String name;
    private String surname;
    private String language;
    private int age;

    public FrontEndDev(String name, String surname, String language, int age) {
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

    @Override
    public void writeCode() {
        System.out.println(name + "  " + surname + "is making website");
    }

    @Override
    public void comeEarly() {
        System.out.println(name + " " + surname + "never comes early");
    }

    @Override
    public void testCode() {
        System.out.println(name+" "+ surname+ " will cmplete test in two days");
    }
}
