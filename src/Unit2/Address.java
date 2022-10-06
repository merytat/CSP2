package Unit2;

public class Address {

    private String city;
    private String address;

    public Address(String city, String address){
        this.city = city;
        this.address = address;
    }

    //Void methods

    //definition of method showAddress
    public void showAddress(){
        this.addFormat(); //calling a private method
        System.out.println(address + ", " + city);
    }

    public void changeCity(String newCity){
        this.city = newCity;
    }

    public void changeAddress(String newAddress){
        this.address = newAddress;
    }

    //helper
    private void addFormat(){
        city = city + " city";
    }

}
