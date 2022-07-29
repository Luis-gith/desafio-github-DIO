public class SavingsAcc extends Account {
    public SavingsAcc(Client client) {
        super(client);
    }

    @Override
    public void printStatement() {
        System.out.println("--- Savings Account Statement ---");
        super.printCommonInfo();
    }
}