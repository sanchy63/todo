package Main.SystemDesign.LLD.ParkingLotSystem;
abstract class Vehicle{
    private String number;
    public Vehicle(String number){
        this.number=number;
    }
    public String getNumber(){
        return number;
    }
}
class Bike extends Vehicle{
    public Bike(String number){
        super(number);
    }
}
class Car extends Vehicle{
    public Car(String number){
        super(number);
    }
}
// this will represent we are parking a bike or a car
// each vehicle have the number plate(license)