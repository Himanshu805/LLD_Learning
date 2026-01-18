package Patterns.Creational.Adapter;


interface BankAPI1{
    void pay(double amount);
    double getBalance();
}

class SBIBank1 implements  BankAPI{
    @Override
    public void pay(double amount) {
        System.out.println("Paying "+amount +" " + "to SBI BANK");
    }
    @Override
    public double getBalance() {
        return 29.0;
    }
}

class HDFCBank1 implements  BankAPI{
    @Override
    public void pay(double amount) {
        System.out.println("Paying "+amount +" " + "to HDFC BANK");
    }
    @Override
    public double getBalance() {
        return 23.0;
    }
}

class ICICIBank1{

    public void deposit(double amount) {
        System.out.println("Deposited "+amount +" to ICICI BANK");
    }

    public double checkBalance() {
        return 29.0;

    }
}

class PhonePay{
    public void pay(double amount, Object bankAPI){
        if(bankAPI instanceof ICICIBank){
            ICICIBank iciciBank = (ICICIBank) bankAPI;
            iciciBank.deposit(amount);
        }
        else if(bankAPI instanceof HDFCBank){
            HDFCBank hdfcBank = (HDFCBank) bankAPI;
            hdfcBank.pay(amount);
        }
        else if(bankAPI instanceof SBIBank){
            SBIBank sbibank = (SBIBank) bankAPI;
            sbibank.pay(amount);
        }
        else{
            System.out.println("Invalid bank API");
        }
    }
}

public class Sol1 {
    public static void main(String[] args) {
        PhonePay phonePay = new PhonePay();
        ICICIBank1 iciciBank = new ICICIBank1();
        phonePay.pay(23.0, iciciBank);

        SBIBank1 sbibank = new SBIBank1();
        phonePay.pay(23.0, sbibank);
    }


}

//pros:
// simple to implement

// cons:
// many if else statement, so violet Open/Closed principle
