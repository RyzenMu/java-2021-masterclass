public class PhoneConstructor {


    public int size;
    public String name;
    public String color;

    public PhoneConstructor(int size, String name, String color) {
        this.size = size;
        this.name = name;
        this.color = color;
    }

   public void print(){
       System.out.println("I have a "+ this.name +"Phone of  " +this.color +"which have a size of "+this.size);
   }

}
