public class Company1 implements Bank{
    @Override
    public void payTaxes() {
        System.out.println("This company will not pay anything");
    }

    @Override
    public void payCredit() {
        System.out.println("404 not found");
    }

    @Override
    public void verifyYourself() {
        System.out.println("This company verified");
    }

    @Override
    public void putMoney() {
        System.out.println("put money of company1");
    }

    public String transfer(){
        return "i transferred money";
    }
}
