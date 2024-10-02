package StaticExample;

class Innerclass {
    static class Test {
        String name;
        public Test(String name){
            this.name=name;
        }
       
        @Override
        public String toString(){
            return name;
        }
    }  
    static public void message(){
        System.out.println("static");
    }
    public static void main(String[] args) {
        Test a=new Test("sanchay");
        Test b=new Test("baghel");
        message();
        System.out.println(a);
        System.out.println(b.name);
    }
}

