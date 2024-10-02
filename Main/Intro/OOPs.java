public class OOPs {
    static class Students{
        int rno;
        String name;
        float marks;
        Students(int rno,String name,float marks){
            this.rno=3;
            this.name=name;
            this.marks=marks;

        }
    }
    static class A {
        final int num=10;
        String name;
        public A(String name){
            this.name=name;
        }
        @Override
        protected void finalize() throws Throwable{
            System.out.println("object is destroyed");
        }
    }
    public static void main(String[] args) {

        // Students stuent1=new Students(3,"sanchay",4.4f);
        // stuent1.rno=1;
        // System.out.println(stuent1.rno);
        // for(int i=0;i<100000000;i++){
        //     A sanchay=new A("sanchay");
        // }
        A obj=new A("random");
        System.out.println(obj);
    }
}
