package Patterns.Creational.Adapter;

//The Adapter Pattern is a structural design pattern that allows objects with incompatible
//interfaces to collaborate. It works as a bridge between two interfaces, enabling classes that couldn’t otherwise
//work together to communicate by converting the interface of a class into another interface that clients expect.



interface BankAPI{
    void pay(double amount);
    double getBalance();
}

class HDFCBank implements BankAPI{
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " to HDFC");
    }
    @Override
    public double getBalance() {
        return 10.0;
    }
}

class SBIBank implements BankAPI{
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " to SBI");
    }
    @Override
    public double getBalance() {
        return 30.0;
    }
}

class ICICIBank{

    public void deposit(double amount) {
        System.out.println("Deposited "+amount +" to ICICI BANK");
    }

    public double checkBalance() {
        return 29.0;

    }
}

class ICICIBankAdapter implements BankAPI{

    ICICIBank iciciBank ;
    public ICICIBankAdapter(ICICIBank iciciBank){
        this.iciciBank = iciciBank;
    }

    @Override
    public void pay(double amount) {
        iciciBank.deposit(amount);

    }
    @Override
    public double getBalance() {
        return iciciBank.checkBalance();
    }
}

class PhonePay2{
    public void pay(double amount, BankAPI bankAPI){
        bankAPI.pay(amount);
        System.out.println("payment " + amount + " to phone" +" using phone pay");
    }
}




public class Sol2 {
    public static void main(String[] args) {
        ICICIBank iciciBank = new ICICIBank();
        ICICIBankAdapter iciciBankAdapter = new ICICIBankAdapter(iciciBank);
        PhonePay2 phonePayICICI = new PhonePay2();
        phonePayICICI.pay(500.0,iciciBankAdapter);

        HDFCBank hdfcBank = new HDFCBank();
        PhonePay2 phonePayHDFC = new PhonePay2();
        phonePayHDFC.pay(500.0,hdfcBank);
    }

}


// Components of adapter pattern:
// 1. Target Interface: BankAPI3
// 2. Adaptee: ICICBank3
// 3. Adapter: ICICBankAdapter
// 4. Client: PhonePe3



//Participants:
//1. Target: The domain-specific interface that the client uses.
//2. Adapter: A class that implements the Target interface and adapts the Adaptee to it.
//3. Adaptee: An existing class with an incompatible interface that needs adapting.
//4. Client: The class that interacts with the Target interface.


// When to use it?
// When two classes have similar functionality but incompatible interfaces,and you want to enable them to work together.

//Examples:
// Payment Gateway Integration: Adapting different payment processor APIs to a unified interface.
// Media Players: Adapting various media formats to be playable by a single media player interface.
// Data Converters: Converting data from one format to another for interoperability between systems.


