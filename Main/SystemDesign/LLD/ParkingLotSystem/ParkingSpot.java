package Main.SystemDesign.LLD.ParkingLotSystem;

abstract class ParkingSpot {
    private boolean isOccupied;
    private Vehicle vehicle;
    public boolean isAvailable(){
        return !isOccupied;
    }
    public void Park(Vehicle v){
        isOccupied=true;
        vehicle =v;
    }
    public void unpark(){
        isOccupied=false;
        vehicle=null;
    }
    public Vehicle getParkVehicle(){
        return vehicle;
    }
}
class BikeSpot extends ParkingSpot{

}
class CarSpot extends ParkingSpot{

}
// A ParkingSpot is where vehicle are parked
// isOccupied tells vehilce parked or not
//Park park a vehilce into that spot
// Unpark remove the vehilce from that spot