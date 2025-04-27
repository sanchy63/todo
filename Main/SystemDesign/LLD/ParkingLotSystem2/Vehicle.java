package Main.SystemDesign.LLD.ParkingLotSystem2;

public class Vehicle {
    private String number;
    public Vehicle(String number){
        this.number=number;
    }
    public String getnumber(){
        return number;
    }
}
class Car extends Vehicle{
    public Car(String number){
        super(number);
    }
}
class Bike extends Vehicle{
    public Bike(String number){
        super(number);
    }
}