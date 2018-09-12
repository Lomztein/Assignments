/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentframework.module02;

import assignmentframework.IAssignment;
import static assignmentframework.Utility.overcomplicatedRound;
import java.time.DayOfWeek;

/**
 *
 * @author Lomztein
 */
public class AssignmentA3 implements IAssignment {

    @Override
    public String getIdentifier() {
        return "A3";
    }

    @Override
    public void execute() {
        System.out.println ("Assignment A3...");
        
        // The list of given temperatures are saved in an array for easy indexing.
        double[] temperatures = new double [] { 21.5, 23.7, 19.6, 22.5, 25.3, 21.7, 18.9 };
        
        // Each day except the first one is looped over. The first is ignored so as it is being accessed as the "previous" day of the first iteration.
        for (int i = 1; i < temperatures.length; i++) {
            
            // The previous day is declared as being the current day minus the previous day.
            int prev = i - 1;
            
            // The delta is calculated by subtracting the previous days temeperature from the current days temperature.
            double delta = temperatures[i] - temperatures[prev];
            
            // What was that about shortened variable names being a bad idea?
            // The textual representation of the days are extracted from a build-in Enum class. Both for current and previous day.
            DayOfWeek curDay = DayOfWeek.values ()[i];  
            DayOfWeek prevDay = DayOfWeek.values ()[i - 1];

            // The result of our labour is printed out.
            System.out.println ("Delta between " + prevDay + " and " + curDay + ": " + overcomplicatedRound (delta, 2));
            
        }
    }
    
}
