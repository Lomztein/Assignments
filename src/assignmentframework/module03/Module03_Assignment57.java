/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentframework.module03;

import assignmentframework.IAssignment;
import static assignmentframework.Utility.roundToPlaces;

/**
 *
 * @author Lomztein
 */
public class Module03_Assignment57 implements IAssignment {

    @Override
    public String getIdentifier() {
        return "03_57";
    }

    @Override
    public void execute() {
        
        int totalYears = 14;
        int lastYears = 4;
        int firstYears = totalYears - lastYears;
        
        double startingTuition = 10000;
        double currentTuition = startingTuition;
        double coeffecient = 1.06;
        
        double firstYearsTotalTuition = 0.0;
        double finalYearsTotalTuition = 0.0;
                
        for (int i = 1; i <= totalYears; i++) {
            
            currentTuition *= coeffecient;
            System.out.println ("Year " + i + " tuition = " + roundToPlaces (currentTuition, 2));
            
            if (i > firstYears) {
                finalYearsTotalTuition += currentTuition;
            }else {
                firstYearsTotalTuition += currentTuition;
            }
        }
        
        System.out.println ("Total tuition from first years = " + roundToPlaces (firstYearsTotalTuition, 2));
        System.out.println ("Total tuition from last years = " + roundToPlaces (finalYearsTotalTuition, 2));
        
    }
}
