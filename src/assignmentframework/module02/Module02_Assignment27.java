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
public class Module02_Assignment27 implements IAssignment {

    private final int MINUTES_PER_HOUR = 60;
    private final int HOURS_PER_DAY = 24;
    private final int DAYS_PER_YEAR = 356;
    
    @Override
    public String getIdentifier() {
        return "02_27";
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Total minutes: ");
        double minutes = scanner.nextDouble();
        System.out.println ("");
        
        double years = minutesToYears (minutes);
        double remainingDays = minutesToDays (minutes) % DAYS_PER_YEAR;
        
        System.out.println ("There are " + Math.floor (years) + " years and " + Math.round (remainingDays) + " days in the given amount of minutes.");
    }
    
    private double minutesToYears (double minutes) {
        return minutesToDays (minutes) / (double)DAYS_PER_YEAR;
    }
    
    private double minutesToDays (double minutes) {
        return minutes / (double)MINUTES_PER_HOUR / (double)HOURS_PER_DAY;
    }
    
}
