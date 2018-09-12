/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentframework.module04;

import assignmentframework.IAssignment;
import assignmentframework.Utility;

/**
 *
 * @author Lomztein
 */
public class Module04_AssignmentC6 implements IAssignment {

    @Override
    public String getIdentifier() {
        return "04.C6";
    }

    @Override
    public void execute() {
        
        // Find out how many values we want, and scold the user if they try to be funky.
        int amount = Utility.getIntInput("How many values do you want to input? ");
        if (amount < 0) {
            System.out.println ("Critical error - Amount cannot be negative. The universe will now implode. This is your fault.");
        }
        
        // Declare an array of doubles and assign a value to each of them from user input.
        double[] values = new double[amount];
        for (int i = 0; i < amount; i++) {
            values[i] = Utility.getDoubleInput("Value " + i + ": ");
        }

        // Declare holding variables so we can keep track of the highest number so far.
        double highestValue = Double.MIN_VALUE;
        int highestIndex = 0;
        
        // Loop throuh each number.
        for (int i = 0; i < amount; i++) {
            
            // If the value of the current number is higher than the highest so far, set the highest so far to the new number.
            if (values[i] > highestValue) {
                highestValue = values[i];
                highestIndex = i;
            }
            
        }
        
        // Print that shiznat.
        System.out.printf ("The highest value was %.2f at index %d", highestValue, highestIndex);
        
    }
    
}
