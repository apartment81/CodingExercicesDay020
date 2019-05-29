package ro.mirodone.bankaccountapp;

public class Savings extends Account {

    // list properties specific to a Savings account
  private   int safetyDepositBoxId;
   private int safetyDepositBoxKey;

    //constructor to init settings for the Savings properties
     Savings(String name, String cnp, double initDeposit) {
        super(name, cnp, initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() - .25;
    }

    private void setSafetyDepositBox () {
        safetyDepositBoxId = (int) (Math.random() * Math.pow(10, 3));
        safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Account details: " +
        "\n Safety Deposit Box ID " + safetyDepositBoxId +
        "\n Safety Deposit Box Key " + safetyDepositBoxKey);
    }
}
