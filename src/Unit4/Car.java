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
        occupied = 0;
    }

    /* @return the number of free spaces on the parking lot */
    public int freeSpaces(){

    }

    /* @prints the licencePlate of each car currently in the parking lot */
    public void printLicense(){

    }

}