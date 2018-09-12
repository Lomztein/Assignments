/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentframework.module04;

import assignmentframework.IAssignment;

/**
 *
 * @author Lomztein
 */
public class Module04_AssignmentC1 implements IAssignment {

    @Override
    public String getIdentifier() {
        return "03.C1";
    }

    @Override
    public void execute() {
     
        double[] radii = { 1d, 2d, 3d, 4d, 5d };
        
        // Use a foreach loop for easy access to each of the individual values.
        for (double radius : radii) {
            double area = Math.PI * radius * radius;
            System.out.printf ("Radius = %.2f", area);
        }
        
        
    }
    
}
