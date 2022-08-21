package exam;

import Bank.BankAccount;

public class MinimumBalanceAccount2 extends BankAccount {
    private int minimum;

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public MinimumBalanceAccount2(int balance, int minimum){
        super(balance);
        this.minimum = minimum;
    }

    @Override
    public boolean withdraw(int amount){
        if(balance - amount < minimum){
            System.out.println("적어도"+ minimum + "원은 남겨야 합니다");
            return false;
        }

        balance -= amount;
        return true;
    }
}
