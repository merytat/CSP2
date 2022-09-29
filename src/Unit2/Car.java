package Unit2;

public class Car {
    //new data type
    //cookie cutter
    // NO MAIN

    //attributes
    String make;
    String model;
    int noOfDoors;
    double topSpeed;
    double price;

    //Constructors

    //default constructor
    //same name as class, no parameters, public
    //default values for all attributes
    public Car(){
        this.make = "default";
        this.model = "default";
        this.noOfDoors = 4;
        this.topSpeed = 120;
        this.price = 0;

    }

    //does not include numberOfdoors
    public Car(String makeFormal, String model, double topSpeed, double price){
        this.make = makeFormal;
        this.model = model;
        this.topSpeed = topSpeed;
        this.price = price;
        this.noOfDoors = 4; //hardcodeed
    }

   public Car(int noOfDoorsFormal, double topSpeedFormal, double priceFormal){
       this.make = "unknown";
       this.model = "unknown";
       this.topSpeed = topSpeedFormal;
       this.price = priceFormal;
       this.noOfDoors = noOfDoorsFormal;
   }

   public Car(int noOfDoorsFormal, String modelFormal, String makeFormal){
       this.make = makeFormal;
       this.model = modelFormal;
       this.topSpeed = 90;
       this.price = 0;
       this.noOfDoors = noOfDoorsFormal;
   }


}
