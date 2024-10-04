package Properties.Inhritence;

public class Box {
    double h;
    double l;
    double w=5.0;
    // double weight;
    Box(){
        this.h=-1;
        this.w=-1;
        this.l=-1;
    }
    //cube
    Box(double side){
        this.l=side;
        this.w=side;
        this.h=side;

    }
    Box(double l,double w,double h){
        this.l=l;
        this.w=w;
        this.h=h;
    }
    Box(Box other){
        this.h=other.h;
        this.l=other.l;
        this.w=other.w;
    }
    public void information(){
        System.out.println("running the box");
    }
}
