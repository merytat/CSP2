package Unit2;

public class Client {
    //attributes
    String name;
    String address;
    double balance;

    //methods
    public void withdrawMoney(){
        balance = balance - 2000000;
    }

    public void depositMoney(){
        balance = balance + 1000000;
    }
}
