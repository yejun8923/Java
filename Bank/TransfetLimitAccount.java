package Bank;

public class TransfetLimitAccount extends BankAccount {
    private int transfetLimit;

    public TransfetLimitAccount(){}

    public TransfetLimitAccount(int balance,int transfetLimit){
        super(balance);
        this.transfetLimit = transfetLimit;
    }

    @Override
    public boolean withdraw(int amount){
        if(amount > transfetLimit) {
            return false;
        }
        return super.withdraw(amount);
    }
}
