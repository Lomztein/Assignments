/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentframework.module02;

import assignmentframework.IAssignment;
import static assignmentframework.Utility.overcomplicatedRound;

/**
 *
 * @author Lomztein
 */
public class AssignmentA2 implements IAssignment {

    @Override
    public String getIdentifier() {
        return "A2";
    }

    @Override
    public void execute() {
        // The circumferencec for each of the required radii are calculated using a helper function.
    double n1 = calculateCircleCircumference (3.0);
    double n2 = calculateCircleCircumference (7.0);
       
    // The returned values are printed out.
    System.out.println ("Circumference of circles with radius 3 and 7 are respectively " + overcomplicatedRound (n1, 2) + " and " + overcomplicatedRound (n2, 2));
        
    // The returned values are summed and printed out.
    System.out.println ("The combined sum is " + overcomplicatedRound (n1 + n2, 2));
    }
    
public static double calculateCircleCircumference (double radius) {
    // The circumference is calculated with the single algorithm that exploits the constant ratio between radius and circumference, that being PI.
    return radius * 2.0 * Math.PI;
}
}
