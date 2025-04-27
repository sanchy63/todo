
package Main.SystemDesign.LLD.ParkingLotSystem2;

public class ParkingSpot {
    private boolean isOccupied;
    private Vehicle vehicle;
    public boolean isAvailable(){
        return !isOccupied;
    }
    public void park(Vehicle v){
        isOccupied=true;
        vehicle=v;
    }
    public void unpark(){
        isOccupied=false;
        vehicle=null;
    }
    public Vehicle getVehicle(){
        return vehicle;
    }
}
class BikeSpot extends ParkingSpot{

}
class CarSpot extends ParkingSpot{
    
}