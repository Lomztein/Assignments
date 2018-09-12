/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentframework.module02;

import assignmentframework.IAssignment;
import java.util.Scanner;

/**
 *
 * @author Lomztein
 */
public class Module02_Assignment26 implements IAssignment {

    @Override
    public String getIdentifier() {
        return "02_26";
    }

    @Override
    public void execute() {
        // Create a scanner for the input stream and get the number to "multiply" through that.
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Integer number: ");
        int number = scanner.nextInt ();
        System.out.println ("");
        
        System.out.println ("Multiplied digits = " + multiplyDigets (number));
    }
    
    private long multiplyDigets (int number) {
        
        // Figure out how many digits are in the number. This could possibly be done differently.
        int length = Integer.toString(number).length();
        int[] digets = new int[length];
        
        // For each digit in the number..
        for (int i = 0; i < length; i++) {
            
            // Find the value of the character at first magnitude (tens).
            int remainder = number % 10;
            
            // Divide with 10 to remove first magnitude. Second magnitude is now first magnitude.
            number /= 10d;
            
            
            
            // Assign the found value to the array for easy iteration.
            digets[i] = remainder;
        }
        
        // Multiply each 
        int multiplied = digets[0];
        for (int i = 1; i < digets.length; i++) {
            multiplied *= digets[i];
        }
        
        return multiplied;
    }
    
}
