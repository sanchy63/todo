package Properties.Polymorphism;

public class Numbers {
    double sum(double a,double b){
        return a+b;
    }
    double sum(int a,int b){
        return a+b;
    }
    double sum(double a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        Numbers obj=new Numbers();
        obj.sum(2, 3);
        obj.sum(2.00, 3.45);
        obj.sum(3.3,5,89);
    }
}
