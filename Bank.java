public interface Bank {
    //this is an interface
    // methods body cannot be created inside an interface
    public  void payTaxes(); // method without a body
    public  void payCredit(); // another method without body
    public void verifyYourself();

    private void getMoney(){
        return;
    };// private methods should have a body or private methods are not allowed in the interface

    // by default all methods are public, so no need to declare public.
    void putMoney();


}

