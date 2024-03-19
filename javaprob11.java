class Vehicle{
    String identificationNumber;
    double maxSpeed;

}
class Car1 extends Vehicle{
    int numberOfPassengers;
    public Car1(int numberOfPassengers, String iden,double max){
        this.numberOfPassengers=numberOfPassengers;
        identificationNumber=iden;
        maxSpeed=max;
    }
    public String get_identificationNumber(){
        return identificationNumber;
    }
    public int get_numberOfPassengers(){
        return numberOfPassengers;
    }
    public double get_speed(){
        return maxSpeed;
    }
    public void display(){
        System.out.println("Vehicle: Car\nIdentification Number: "+identificationNumber+"\nNumber of Passengers: "+numberOfPassengers+"\nMax Speed: "+maxSpeed);
    }
}
class Truck extends Vehicle{
    int maxWeight;
    public Truck(int maxWeight, String iden,double max){
        this.maxWeight=maxWeight;
        identificationNumber=iden;
        maxSpeed=max;
    }
    public String get_identificationNumber(){
        return identificationNumber;
    }
    public int get_maxWeight(){
        return maxWeight;
    }
    public double get_speed(){
        return maxSpeed;
    }
    public void display(){
        System.out.println("Vehicle: Truck\nIdentification Number: "+identificationNumber+"\nMax Weight: "+maxWeight+"\nMax Speed: "+maxSpeed);
    }
}
class Bicycle extends Vehicle{
    public Bicycle(String iden,double max){
        identificationNumber=iden;
        maxSpeed=max;
    }
    public String get_identificationNumber(){
        return identificationNumber;
    }
    public double get_speed(){
        return maxSpeed;
    }
    public void display(){
        System.out.println("Vehicle: Bicycle\nIdentification Number: "+"\nMax Speed: "+maxSpeed);
    }
}

public class javaprob11 {
    public static void main(String[] args) {
        Car1 c1=new Car1(6, "12334", 150);
        Truck t1=new Truck(100, "56789", 100);
        Bicycle b1=new Bicycle("23456", 50);
        c1.display();
        System.err.println();
        t1.display();
        System.out.println();
        b1.display();

    }
}
// Create a program to manage different types of vehicles in a transportation system. Each vehicle has a unique identification number and a maximum speed. Vehicles can be of different types such as cars, trucks, and bicycles.

// Cars have an additional attribute: the number of passengers it can carry.
// Trucks have an additional attribute: the maximum weight they can carry.
// Bicycles do not have any additional attributes.
// Implement the following functionalities:

// Create a superclass named "Vehicle" with attributes:
// identificationNumber (String)
// maxSpeed (double)
// Create subclasses named "Car", "Truck", and "Bicycle" inheriting from the "Vehicle" superclass.
// For each subclass, implement a constructor that initializes the attributes along with appropriate getters and setters.
// Implement a method in each subclass to display the details of the vehicle.
// In the main class, create instances of each type of vehicle and demonstrate inheritance by calling methods from the superclass and subclasses.