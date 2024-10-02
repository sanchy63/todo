package StaticExample;

public class Main {
    public static void main(String[] args) {
        Human sanchay=new Human(20, 20000, "sanchay", false);
        System.out.println(sanchay.name);
        Main main=new Main();
        main.fun();
        main.greeting();
    }
    public void greeting(){
        System.out.println("greeting without greeting");
    }
    static void fun(){
        System.out.println("greeitn static");
    }
    
}
