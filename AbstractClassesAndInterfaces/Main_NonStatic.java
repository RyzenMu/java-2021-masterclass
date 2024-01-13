public class Main_NonStatic {
    public static void main(String[] args) {
        InnerClassStatic_Human human = new InnerClassStatic_Human();
        InnerClassStatic_Human.staticMethod();
        human.non_staticMethod();
    }
}
