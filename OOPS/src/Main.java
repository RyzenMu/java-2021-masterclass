public class Main {
    public static void main(String[] args) {
        Account account1 = new Account("Tester", "Yellow",
                "Tester_Yellow@gmail.com", 100, 1000,
                "0987654321");
        account1.putMoney(1000);
        System.out.println(account1.getBalance());
        account1.takeMoney(500);
        System.out.println(account1.getBalance());
        System.out.println(account1.getName());

    }
}
