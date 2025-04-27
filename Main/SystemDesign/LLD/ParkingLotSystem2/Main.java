package Main.SystemDesign.LLD.ParkingLotSystem2;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<ParkingSpot> floor1spot=new ArrayList<>();
        //floor1spot.add(new BikeSpot());
       for(int i=1;i<4;i++) {
        floor1spot.add(new CarSpot());
        floor1spot.add(new BikeSpot());
       } 
        List<ParkingFloor> floors=new ArrayList<>();
        floors.add(new ParkingFloor(floor1spot));
        ParkingLot parkingLot=new ParkingLot(floors);
        parkingLot.parkVehicle(new Vehicle("car-123"));
        parkingLot.showAvailability();
    }
}
