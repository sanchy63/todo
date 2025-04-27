package Main.MachineCoding.SingleTonClass;

public class Logger {
    private static Logger instance;
    private Logger(){
        System.out.println("Logger instance is created");
    }
    public static Logger getInstace(){
        if(instance==null){
            instance= new Logger();
        }
        return instance;
    }
    public void log(String message){
        System.out.println("log:" + message);
    }
}
