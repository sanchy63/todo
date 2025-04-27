package Main.MachineCoding.abstractEx;

public abstract class Animal {
    int soundspeed;
    Animal(int soundspeed){
        this.soundspeed=soundspeed;
    }
    abstract void makesound();

    public void sleep(){
        System.out.println("animal is sleeping");
    }
}
