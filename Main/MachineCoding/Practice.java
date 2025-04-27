package Main.MachineCoding;

import Main.Leetcode.substring;

public class Practice {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Square sqarea=new Square(5);
        System.out.println("square area is "+sqarea.area);
    }
}
class Animal {
    int soundspeed;
    Animal(){
        System.out.println("animal sound");
    }
   Animal(int soundspeed){
    this.soundspeed=soundspeed;
   }
   public void sound(){
    System.out.println("sound is "+ this.soundspeed);
   }
}
class Dog extends Animal{
    Dog(){
        super(12333);
    }

    @Override
    public void sound(){
        super.sound();
        System.out.println("dog barks");
    }
}