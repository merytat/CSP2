package Unit2;

public class AddressRunner {
    public static void main(String[] args) {

        Address work = new Address("Jakarta", "Teragong 33");
        Address home = new Address("Jakarta", "Cipete 45");

        //call to a void method
        //object.methodName
        System.out.println("Work info");
        work.showAddress();

        System.out.println("Changing work city");

        work.changeCity("Jakarta Selatan");

        work.showAddress();

        home.changeAddress("dfsgf");




    }
}
