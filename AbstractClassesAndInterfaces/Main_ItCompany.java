public class Main_ItCompany {
    public static void main(String[] args) {
        Game_Dev gd = new Game_Dev("Bob", "Shawn", "java", 21);
        FrontEndDev fd = new FrontEndDev("jake", "Peter", "Python", 34);
        gd.comeEarly();
        gd.writeCode();
        gd.testCode();
        System.out.println("*********************************");
        fd.comeEarly();
        fd.writeCode();
        fd.testCode();
    }
}
