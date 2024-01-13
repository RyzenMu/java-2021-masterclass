public class InnerClassStatic_Human {
    public static void staticMethod(){

    }
    public void non_staticMethod(){

    }
    private static String name;
    private int pounds;
    public static class Brain{
        public String brainName(){
            return name;
        }
    }
    public static class Heart{
        public String heartName(){
            return name;
        }
    }
}
