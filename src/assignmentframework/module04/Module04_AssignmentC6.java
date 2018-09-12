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
        
        int amount = Utility.getIntInput("How many values do you want to input? ");
        if (amount < 0) {
            System.out.println ("Critical error - Amount cannot be negative. The universe will now implode. This is your fault.");
        }
        
        double[] values = new double[amount];
        for (int i = 0; i < amount; i++) {
            values[i] = Utility.getDoubleInput("Value " + i + ": ");
        }
        
        double highestValue = Double.MIN_VALUE;
        int highestIndex = 0;
        
        for (int i = 0; i < amount; i++) {
            
            if (values[i] > highestValue) {
                highestValue = values[i];
                highestIndex = i;
            }
            
        }
        
        System.out.printf ("The highest value was %.2f at index %d", highestValue, highestIndex);
        
    }
    
}
