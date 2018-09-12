/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentframework.module03;

import assignmentframework.IAssignment;
import assignmentframework.Utility;
import java.time.LocalDate;

/**
 *
 * @author Lomztein
 */
public class Module03_AssignmentB4 implements IAssignment {

    @Override
    public String getIdentifier() {
        return "03_B4";
    }

    @Override
    public void execute() {
        
        String input = Utility.getInput("Month name or number: ");
        String[] monthNames = new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "Septemper", "October", "November", "December" };

        int number = -1;
        String name = input;
        
        try {
             number = Integer.parseInt(input);
             if (number < 0 || number > 12) {
                 number = -1;
             }
        } catch (NumberFormatException exception) { // What was input was a string, perhaps the name of a month.
            
            String toUpper = name.toUpperCase();
            for (int i = 0; i < monthNames.length; i++) {
                if (monthNames[i].toUpperCase ().equals(toUpper)) {
                    number = i;
                }
            }
            
        }
        
        if (number < 0 || number > 12) {
            System.out.println ("The month you gave does not exist.");
            return;
        }
        
        LocalDate date = LocalDate.of(0, number, 0);
        String monthName = date.getMonth().name();
        int days = date.lengthOfMonth();
        
        System.out.println ("There are " + days + " in " + monthName);
        
    }
    
    
    
}
