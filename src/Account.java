import java.util.ArrayList;
import java.util.List;

public class Account implements AccountService{
    private ArrayList<String> date = new ArrayList<>();
    private ArrayList<Integer> amount = new ArrayList<>();
    private int balance = 0;

    public Account() {
    }

    public ArrayList<String> getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date.add(date);
    }

    public ArrayList<Integer> getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount.add(amount);
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(int amount) {
        if (amount == 0 || amount < 0) throw new IllegalArgumentException("You cannot deposit null or negative values");
        this.setAmount(amount);
        this.balance += amount;
    }

    @Override
    public void withdraw(int amount) {
        if (amount == 0 || amount < 0) throw new IllegalArgumentException("You cannot withdraw null or negative values");
        if (amount > this.balance) throw new IllegalArgumentException("You don't have this amount in your account!");
        this.setAmount(-amount);
        this.balance -= amount;
    }

    @Override
    public void printStatement() {
        System.out.println("Date        || Amount     || Balance");
        int bal = 0;
        for (int i = 0; i < this.amount.size(); i++) {
            bal += this.amount.get(i);
            System.out.printf("%s  || %d       || %d\n", this.getDate().get(i), this.getAmount().get(i), bal);
        }
    }
}
