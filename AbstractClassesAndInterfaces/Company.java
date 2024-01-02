public class Company implements Bank{
    @Override
    public void payTaxes() {
        System.out.println("This company will pay 100$");
    }

    @Override
    public void payCredit() {
        System.out.println("This company will pay credits in 2 months");
    }

    @Override
    public void verifyYourself() {
        System.out.println("This company verified itself");
    }
}
