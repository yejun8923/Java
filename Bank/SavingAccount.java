package Bank;

public class SavingAccount extends BankAccount {
    private double interest;

    public SavingAccount(int balance, double interest){
        super(balance);
        this.interest = interest;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public void addInterest(){
        setBalance((int)(getBalance() * (1 + interest)));

    }
}
