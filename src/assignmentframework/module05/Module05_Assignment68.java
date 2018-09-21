/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentframework.module05;

import assignmentframework.IAssignment;
import assignmentframework.Utility;

/**
 *
 * @author Lomztein
 */
public class Module05_Assignment68 implements IAssignment {
    
    private final double KM_TO_MILES_RATIO = 1.6;

    @Override
    public String getIdentifier() {
        return "05.68";
    }

    @Override
    public void execute() {
        double value = Utility.getDoubleInput ("How many units do you need converted, plebian? ");
        System.out.println (String.format("There are %f kilometers in %f miles.", kilometersToMiles (value), value));
        System.out.println (String.format("There are %f kilometers in %f miles.", milesToKilometers (value), value));
    }
    
    private double kilometersToMiles (double km) {
        return km / KM_TO_MILES_RATIO;
    }
    
    private double milesToKilometers (double miles) {
        return miles * KM_TO_MILES_RATIO;
    }
    
}
