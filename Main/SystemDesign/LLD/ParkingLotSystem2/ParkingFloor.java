
package Main.SystemDesign.LLD.ParkingLotSystem2;

import java.util.List;

public class ParkingFloor {
    List<ParkingSpot> spots;
    public ParkingFloor(List<ParkingSpot> spots){
        this.spots=spots;
    }
    public boolean parkVehicle(Vehicle vehicle){
        for(ParkingSpot spot:spots){
            if(spot instanceof BikeSpot && vehicle instanceof Bike){
                if(spot.isAvailable()){
                    spot.park(vehicle);
                    return true;
                }
            }
            else if(spot instanceof CarSpot && vehicle instanceof Car){
                if(spot.isAvailable()){
                    spot.park(vehicle);
                    return true;
                }
            }
            
        }
        return false;
    }
    public boolean unparkVehicle(Vehicle vehicle){
        for(ParkingSpot spot : spots){
            if(spot.getVehicle()==vehicle){
                spot.unpark();
                System.out.println(vehicle.getnumber()+" unparked successfully");
                return true;
            }
        }
        System.out.println("Vehicle " + vehicle.getnumber() + " not found on this floor");
        return false;
    }
    public void displayAvailableSpots(){
        long bikeCount=spots.stream().filter(spot->spot instanceof BikeSpot && spot.isAvailable()).count();
        long CarCount=spots.stream().filter(spot->spot instanceof CarSpot && spot.isAvailable()).count();
        long count=spots.stream().filter(ParkingSpot::isAvailable).count();
        System.out.println(" total available spots is "+count);
        System.out.println("total bike spot available is "+bikeCount);
        System.out.println("total Car spot available is "+CarCount);
    }
}