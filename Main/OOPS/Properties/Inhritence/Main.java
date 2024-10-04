package Properties.Inhritence;

public class Main {
    public static void main(String[] args) {
        BoxWeight box1=new BoxWeight();
        System.out.println(box1.l+" "+box1.w+" "+box1.h+" "+box1.weight);
        // BoxWeight box2=new Box(2,3,4);
        BoxPrice box2=new BoxPrice(5,6,7);
    }
}
