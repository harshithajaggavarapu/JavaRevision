public class Car {
    String name;
    int noOfWheels;
    int noOfDoors;
    int seats;
    String color;

    public Car(String name, int noOfDoors,int noOfWheels, int seats, String color){
        this.name = name;
        this.noOfDoors = noOfDoors;
        this.noOfWheels = noOfWheels;
        this.seats = seats;
        this.color = color;
    }

    @Override
    public String toString(){
        return "Car name: "+ name;
    }
    public static void main(String[] args){
        Car swift = new Car("Swift",4,4, 5,"black");
        System.out.println(swift.toString());

    }
}
