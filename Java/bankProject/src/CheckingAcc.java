public class CheckingAcc extends Account{
    public CheckingAcc(Client client) {
        super(client);
    }

    @Override
    public void printStatement() {
        System.out.println("--- Checking Account Statement ---");
        super.printCommonInfo();
    }

}