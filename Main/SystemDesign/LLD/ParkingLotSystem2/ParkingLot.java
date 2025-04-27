
package Main.SystemDesign.LLD.ParkingLotSystem2;

import java.util.List;

public class ParkingLot {
    List<ParkingFloor> floors;
    public ParkingLot(List<ParkingFloor> floors){
        this.floors=floors;
    }
    public void parkVehicle(Vehicle vehicle){
        for(ParkingFloor floor:floors){
            if(floor.parkVehicle(vehicle)){
                System.out.println(vehicle.getnumber()+" parked Successfully !!");
                return;
            }
        }
        System.out.println("no space available for parking for vehicle "+vehicle.getnumber());
    }
    public void unparkVehicle(Vehicle v){
        for(ParkingFloor floor:floors){
           floor.unparkVehicle(v);
        }
    }
    public void showAvailability(){
        for(int i=0;i<floors.size();i++){
            System.out.print("available slots for floor "+(i+1)+" :");
            floors.get(i).displayAvailableSpots();
        }
    }
}