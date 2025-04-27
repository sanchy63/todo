package Main.SystemDesign.LLD.ParkingLotSystem;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<ParkingSpot> floor1Spots=new ArrayList<>();
        floor1Spots.add(new BikeSpot());
        floor1Spots.add(new CarSpot());
        List<ParkingFloor> floors=new ArrayList<>();
        floors.add(new ParkingFloor(floor1Spots));
        ParkingLot parkingLot=new ParkingLot(floors);
        Vehicle bike=new Bike("Bike-123");
        Vehicle car=new Car("Car-123");
        parkingLot.parkVehicle(car);
        parkingLot.parkVehicle(bike);
        parkingLot.showAvailability();
        parkingLot.showParkedVehicle();
    }
}
