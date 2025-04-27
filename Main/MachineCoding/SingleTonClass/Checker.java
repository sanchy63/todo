package Main.MachineCoding.SingleTonClass;

public class Checker {
    private static Checker instance;
    private Checker(){
        System.out.println("instance is created");
    }
    public static Checker getInstace(){
        if(instance==null){
            instance=new Checker();
        }
        return instance;
    }
    public void log(String message){
        System.out.println("log "+message);
    }
}
