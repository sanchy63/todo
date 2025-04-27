package Main.SystemDesign.LLD.ParkingLotSystem;
import java.util.List;

class ParkingFloor {
    private List<ParkingSpot> spots;
    public ParkingFloor(List<ParkingSpot> spots){
        this.spots=spots;
    }
    public boolean parkVehicle(Vehicle vehicle){
        for(ParkingSpot spot:spots){
            if(spot.isAvailable()){
                spot.Park(vehicle);
                return true;
            }
        }
        return false;
    }
    public void displayAvailableSpots(){
        long count=spots.stream().filter(ParkingSpot::isAvailable).count();
        System.out.println("Available spots: "+count);
    }
    public void showParkedVehicle(){
        for(ParkingSpot spot:spots){
            Vehicle parkedVehicle=spot.getParkVehicle();
           if(parkedVehicle!=null){
            System.out.println("Parked vehicle number is " + parkedVehicle.getNumber());
           }
           else{
            System.out.println("No Vehicle in this spot");
           }
        }
    }
}
//represent one floor of the parking lot
//Holds multiple Parking spot
//Tries to find a free spot and park the vehicle that spot
//show how many vehicle can park