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
public class Module03_AssignmentB1 implements IAssignment {

    @Override
    public String getIdentifier() {
        return "03_B1";
    }

    @Override
    public void execute() {
        
        for (int i = 1; i <= 5; i++) {
            double area = calcCircleArea ((double)i);
            System.out.println ("Area of circle with radius " + i + ": " + roundToPlaces (area, 2));
        }
        
    }
    
    private double calcCircleArea (double radius) {
        return Math.PI * Math.pow(radius, 2d);
    }
    
}
