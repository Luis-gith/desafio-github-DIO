public abstract class Account implements IAcc {
    private static final int DEFAULT_AGENCY_CODE = 1;
    private static int SAFETY_NUMBER = 1;

    protected int agency;
    protected int number;
    protected double balance;
    protected Client client;

    public Account(Client client) {
        this.agency = Account.DEFAULT_AGENCY_CODE;
        this.number = SAFETY_NUMBER++;
        this.client = client;
    }

    @Override
    public void withdraw(double cashValue) {
        balance -= cashValue;
    }

    @Override
    public void deposit(double cashValue) {
        balance += cashValue;
    }

    @Override
    public void transfer(double cashValue, IAcc destinationAcc) {
        this.withdraw(cashValue);
        destinationAcc.deposit(cashValue);
    }

    public int getAgency() {
        return  agency;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    protected void printCommonInfo() {
        System.out.println(String.format("Owner: %s", this.client.getName()));
        System.out.println(String.format("Agency: %d", this.agency));
        System.out.println(String.format("Safety Number: %d", this.number));
        System.out.println(String.format("Balance: %.2f", this.balance));
    }



}