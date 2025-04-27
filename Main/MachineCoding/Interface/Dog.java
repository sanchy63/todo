package Main.MachineCoding.Interface;

public class Dog implements Animal2,Animal1{
    @Override
    public void makesound() {
        System.out.println("dog is barking");
    }
}
