package Main.MachineCoding.SystemClass;

public interface MyThreadInterface {
    default void run(){
        System.out.println("thread is running");
    }
}
