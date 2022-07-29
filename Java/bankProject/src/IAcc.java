public interface IAcc {
    void withdraw(double cashValue);

    void deposit(double cashValue);

    void transfer(double cashValue, IAcc destinationAcc);

    void printStatement();
}