package Main.MachineCoding.Interface;

class Main {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Dog dog=new Dog();
        dog.makesound();
    }
}