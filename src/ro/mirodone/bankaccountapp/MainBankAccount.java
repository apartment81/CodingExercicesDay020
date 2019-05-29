package ro.mirodone.bankaccountapp;

public class MainBankAccount {

    public static void main(String[] args) {

        Checking checking = new Checking("Jon Woo", "1780512123123", 2500.0);
        Savings savings = new Savings("Guy Rich", "1831104098098", 1535.50);

        savings.compound();

        savings.showInfo();
        System.out.println("***********************");
        checking.showInfo();

        //savings.deposit(5000);
       // savings.withdraw(250);
       // savings.transfer("Vault", 500);

    }
}
