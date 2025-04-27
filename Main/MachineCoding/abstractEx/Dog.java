package Main.MachineCoding.abstractEx;

public class Dog extends Animal{
    Dog(int soundspeed){
        super(soundspeed);
    }
    @Override
    public void makesound(){
        System.out.println("dog is barking at speed of "+soundspeed);
    }
}
