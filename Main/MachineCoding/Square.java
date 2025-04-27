package Main.MachineCoding;

public class Square {
    int area;
    int len;
    Square(int len){
        System.out.println("square is xalled");
        this.len=len;
        this.area=len*len;
        System.out.println("len is "+this.len);
    }
}
