package Unit4;

public class Car {
    private String color;
    private String licencePlate;

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", licencePlate='" + licencePlate + '\'' +
                '}';
    }
    public Car(String color, String licencePlate) {
        this.color = color;
        this.licencePlate = licencePlate;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getLicencePlate() {
        return licencePlate;
    }
    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }
}

class CarPark{
    private Car[] cars;
    private int occupied;

    public CarPark(){
        cars = new Car[50];
        occupied = 0;  //indicates the index of next space available on the array
    }

    /* @return the number of free spaces on the parking lot */
    public int freeSpaces(){
        //return cars.length - occupied;
        int counter = 0;
        for(int i = 0; i < cars.length; i++){
            if(cars[i] == null){
                counter++;
            }
        }
        return counter;

    }

    /* @prints the licencePlate of each car currently in the parking lot */
    public void printLicense(){
        //option 1
        for(int i = 0; i < cars.length; i++){
            if(cars[i]!= null){
                System.out.println(cars[i].getLicencePlate());
            }
        }

        //option 2
        for(int i = 0; i < occupied; i++){
            System.out.println(cars[i].getLicencePlate());

        }

    }

}