public class Main {
    public static void main(String[] args){
        Account acc = new Account();


//      deposit of 1000 on 10-01-2012
        acc.deposit(1000);
        acc.setDate("10-01-2012");

//      deposit of 2000 on 13-01-2012
        acc.deposit(2000);
        acc.setDate("13-01-2012");

//      withdrawal of 500 on 14-01-2012
        acc.withdraw(500);
        acc.setDate("14-01-2012");

        acc.printStatement();
    }
}
