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
public class Module04_AssignmentC4 implements IAssignment {

    @Override
    public String getIdentifier() {
        return "04.C4";
    }

    @Override
    public void execute() {
        
        int[] numberOfDays = { 31 /*Jan*/, 28 /*Feb*/, 31 /*Mar*/, 30 /*Apr*/, 31 /*May*/, 30 /*Jun*/, 31 /*Jul*/, 31 /*Aug*/, 30 /*Sep*/, 31 /*Oct*/, 30 /*Nov*/, 31 /*Dec*/  };
       
        // Find out exactly which month we want.
        int number = Utility.getIntInput("Month number: ");
        
        // Make sure we are within acceptable limits. We don't want extradimensional months here.
        if (number < 1 || number > 12) {
            System.out.println ("Your number must be between 1 and 12.");
            return;
        }
        // Offset it by negative-one to fit the indexing rules of arrays.
        number--;
        System.out.printf ("There are %d days in the given month.", numberOfDays[number]);
        
    }
    
    
    
}
