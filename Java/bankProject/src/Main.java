public class Main {
    public static void main(String[] args) {
        Client Luis = new Client();
        Luis.setName("Luis F B Silva");

        Account ChA = new CheckingAcc(Luis);
        Account SvA = new SavingsAcc(Luis);

        ChA.deposit(5000);
        ChA.transfer(2000, SvA);

        ChA.printStatement();
        SvA.printStatement();

    }
}