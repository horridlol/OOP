abstract class Vehicle{
    abstract String fuelType();
    abstract int noOfWheels();
}

class Car extends Vehicle{
    String fuelType(){
        return "Petrol/Diesel";
    }
    int noOfWheels(){
        return 4;
    }
}
class Bike extends Vehicle{
    String fuelType(){
        return "Petrol";
    }
    int noOfWheels(){
        return 2;
    }
}
public class prg18 {
    public static void main(String[] args) {
        Car c=new Car();
        Bike b=new Bike();
        System.out.println("Car :\n\tFuel Type : "+c.fuelType()+"\n\tNo. of Wheels : "+c.noOfWheels());
        System.out.println("=======================================================================");
        System.out.println("Bike :\n\tFuel Type : "+b.fuelType()+"\n\tNo. of Wheels : "+b.noOfWheels());
    }
}
