package Main.MachineCoding.abstractEx;

public class Main {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Dog dog=new Dog(50);
        dog.makesound();
        dog.sleep();
    }
}
