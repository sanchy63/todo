package Main.MachineCoding.SystemClass;

public class MyThread implements MyThreadInterface{
    @Override
    public void run(){
        System.out.println("thread is running from MyThread Class");
    }
}
