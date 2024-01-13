public class Main_InnerClaass {
    // non-static inner class
    public static void main(String[] args) {
        InnerClass_Human human = new InnerClass_Human();
        InnerClass_Brain brain = new InnerClass_Brain();
        InnerClass_Human.Heart heart = new InnerClass_Human().new Heart();
        InnerClass_Human.Kidney kidney = new InnerClass_Human().new Kidney();
        String hName = heart.heartName();
        System.out.println(hName);
        String kName = kidney.kidneyname();
        System.out.println(kName);
    }


}
