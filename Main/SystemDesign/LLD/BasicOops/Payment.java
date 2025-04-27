package Main.SystemDesign.LLD.BasicOops;

abstract class Payment {
    abstract void pay(int amount);
}

class CreditCardPayment extends Payment {
    @Override
    void pay(int amount) {
        System.out.println("Paid payment of " + amount + " using Credit Card");
    }
}

class UpiPayment extends Payment {
    @Override
    void pay(int amount) {
        System.out.println("Paid amount of " + amount + " using UPI");
    }
}

class A{
    void run(){
        System.out.println("A is running");
    }
    void walk(){
        System.out.println("A is walking");
    }
}
class B extends A{
    void walk(){
        System.out.println("B is walking");
    }
    void run(){
        System.out.println("B is runnig");
    }
}
 class Main {
    public static void main(String[] args) {
        // Payment payment = new UpiPayment();
        // payment.pay(500);
        // A a=new B();
        // a.walk();
        B b=new B();
        b.run();
        B a=new A();
        a.run();
    }
}
