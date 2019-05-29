package ro.mirodone.bankaccountapp;

public abstract class Account implements IBaseRate {

    private static int index = 10000;
    // list common properties for savings and checking accounts
    private String name;
    private String cnp;
    private double balance;
     String accountNumber;
     double rate;


    // constructor to  ser base properties ind init the account
     Account(String name, String cnp, double initDeposit) {
        this.name = name;
        this.cnp = cnp;
        balance = initDeposit;

        // set account number
        index++;
        this.accountNumber = setAccountNumber();
        setRate();
    }

    public abstract void setRate();

    private String setAccountNumber() {
        String last2DigitsOfCnp = cnp.substring(cnp.length() - 2, cnp.length());
        int uniqueID = index;
        int randomNumber = (int) (Math.random() * Math.pow(10, 3));
        return last2DigitsOfCnp + uniqueID + randomNumber;
    }

    public void compound () {

        double accruedInterest  = balance * (rate/100);
        balance = balance +accruedInterest;
        System.out.println("Accrued Interest: $ " + accruedInterest);
        printBalance();
    }


     void deposit (double amount){
        balance = balance +amount ;
        printBalance();
    }

     void withdraw (double amount) {
        balance = balance - amount ;
        printBalance();
    }

     void transfer ( String toWhere , double amount) {
        balance = balance -amount;
        printBalance();
    }

     void printBalance() {
        System.out.println("Your balance is now: $" +balance);
    }


    public void showInfo() {
        System.out.println("NAME: " + name +
                "\nAccount Number: " + accountNumber +
                "\nBalance: " + balance +
        "\n Rate: " + rate + "%" );
    }

}
