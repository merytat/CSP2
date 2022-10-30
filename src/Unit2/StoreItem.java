package Unit2;

public class StoreItem {
    //attributes
    private String name;
    private double price;
    private String unit;
    private int quantity;

    //accessor and mutator
    //getters and setter

    //accessor: return, no parameters
    public String getName(){
        return name;
    }

    //Mutator: void, parameter
    public void setName(String newName){
        //verify if newName is ok
        name = newName;
    }



    //constructors
    public StoreItem(String n, double p, String u, int q){
        name = n;
        price = p;
        unit = u;
        quantity = q;
    }

    public StoreItem(String n, double p, String u){
        name = n;
        price = p;
        unit = u;
        quantity = 1;
    }

    //getTotalPrice
    public double getTotalPrice(){
        return price*quantity;
    }

    //increasePrice
    public void increasePrice(double percentage){
        this.price = ((100+percentage)/100)*price;
         //price 100
        //percentage 10%
    }

    //toString
    @Override
    public String toString(){
        //heading is non negotiable must be exactly the same ALWAYS
        String output = "Name: " + name +
                "\nPrice: " + price +
                "\nUnit: " + unit +
                "\nQuantity: " + quantity;
        return output;
    }




}
