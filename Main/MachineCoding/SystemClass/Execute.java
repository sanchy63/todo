package Main.MachineCoding.SystemClass;

public class Execute {
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");
        System.out.flush();
        // MyThread t1=new MyThread();
        // t1.start();
        MyThreadInterface t2=new MyThread();
        t2.run();
      }
}
