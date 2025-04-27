package Main.MachineCoding;

public class Test {

   int x=10;

 public void method1(){
    System.out.println("x is "+x);
    System.out.println("print method 1");

 }

 public static void method2(){
    System.out.println("pritn method 2");
 }

  public static void main(String[] args) {
     //method2();
     //Test obj=new Test();
    // System.out.println(obj.x);
     Test.method1();

  }
    
}