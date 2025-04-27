package Main.MachineCoding.SystemClass;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class printStream{
   public static void main(String[] args) throws FileNotFoundException{
    System.out.println("\033[H\033[2J");
    System.out.flush();

    PrintStream file = new PrintStream("output.txt");
    
    
   }
}
