package Main.MachineCoding.ThrowAndThrowable;

public class CustomException {
    static class AgeException extends Exception{
        private int erroCode;
        public AgeException(String message,int erroCode){
            super(message);
            this.erroCode=erroCode;
        }
        public int getErrorcode(){
            return erroCode;
        }
    }
    
        static void validateAge(int age) throws AgeException{
            if(age<18){
                throw new AgeException("age must be 18 and above", 1001);
            }
            else System.out.println("granted");
        }

    public static void main(String[] args) {
        
        try{
            validateAge(15);
        } catch(AgeException e){
            System.out.println("caught "+e.getMessage());
            System.out.println("Error code"+e.erroCode);
        }
    }
}
