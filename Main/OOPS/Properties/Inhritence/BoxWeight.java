package Properties.Inhritence;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight(){
        this.weight=-1;
    }

    public BoxWeight(double l,double w,double h,double weight){
        super(l,w,h);
        // System.out.println(super.weight);
        this.weight=weight;
    }
    BoxWeight(BoxWeight other) {
        this.weight = other.weight;
    }
    BoxWeight(double side,double weight){
        super(side);
        this.weight=weight;
    }
}
