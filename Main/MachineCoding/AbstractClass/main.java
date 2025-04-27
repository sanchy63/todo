package Main.MachineCoding.AbstractClass;

public class main {
    public static void main(String[] args) {
        
        C obj=new C(){
            @Override
            public void show(){
                System.out.println("overriden show method");
            }
        };
        obj.show();
    }

}
