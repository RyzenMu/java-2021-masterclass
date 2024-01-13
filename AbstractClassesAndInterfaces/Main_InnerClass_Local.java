public class Main_InnerClass_Local {
    // define it without public
    // define it without non-static
    // local inner classes pretend like variable.

    public static void main(String[] args) {

        class A{
            // this is local inner class
            public void shutDown(){
                System.out.println(" Class A Shutted Down");
            }
        }

        A a = new A();
        a.shutDown();

    }
}
