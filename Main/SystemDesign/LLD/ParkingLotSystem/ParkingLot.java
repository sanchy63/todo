package Main.SystemDesign.LLD.ParkingLotSystem;
import java.util.List;

class ParkingLot {
    private List<ParkingFloor> floors;
    public ParkingLot(List<ParkingFloor> floors){
        this.floors=floors;
    }
    public void parkVehicle(Vehicle vehicle){
        for(ParkingFloor floor:floors){
            if(floor.parkVehicle(vehicle)){
            System.out.println(vehicle.getNumber()+" parked successfully!! ");
            return;
            }
        }
        System.out.println("No Space is available for "+vehicle.getNumber());
    }
    public void showAvailability(){
        for(int i=0;i<floors.size();i++){
            System.out.print("Floors "+(i+1)+": ");
            floors.get(i).displayAvailableSpots();
        }
    }
    public void showParkedVehicle(){
        for(int i=0;i<floors.size();i++){
            System.out.println("parkedVehicles in floor "+i+" are below ");
            floors.get(i).showParkedVehicle();
        }
    }
}
//this is the manager 
//It contains multiple floors
//when you try to park a vehicle it goes floor by floor to find the space
//it can also available space
