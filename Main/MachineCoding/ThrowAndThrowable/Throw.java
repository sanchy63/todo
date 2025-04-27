package Main.MachineCoding.ThrowAndThrowable;

public class Throw {
    static void validateAge(int age){
        if(age<18){
            throw new IllegalArgumentException("Age must be 18 and above");
        }
        else System.out.println("access granted");
    }
    static void risky() throws Throwable{
        throw new Throwable("Custom throwable");
    }
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        try{
            risky();
        }
        catch(Throwable t){
            System.out.println("Caught "+t);
        }
        try{
            int a=5/0;
        } catch(ArithmeticException e){
            System.out.println("caught Arithmetic exception"+e.getMessage());
        }
    }
}
