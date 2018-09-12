/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentframework.module03;

import assignmentframework.IAssignment;
import static assignmentframework.Utility.getDoubleInput;
import static assignmentframework.Utility.roundToPlaces;

/**
 *
 * @author Lomztein
 */
public class Module03_Assignment32 implements IAssignment {

    @Override
    public String getIdentifier() {
        return "03_32";
    }

    @Override
    public void execute() {
        double a = getDoubleInput ("Value for A: ");
        double b = getDoubleInput ("Value for B: ");
        double c = getDoubleInput ("Value for C: ");
        
        double descriminator = calcDescriminator (a, b, c);
        
        int roots = 1;
        if (descriminator > 0) {
            roots = 2;
        }else if (descriminator < 0) {
            roots = 0;
        }
        
        switch (roots) {
            case 0:
                System.out.println ("The quadratic formula \"" + toFormula (a, b, c) + "\" has no roots."); break;
                case 1:
                System.out.println ("The quadratic formula \"" + toFormula (a, b, c) + "\" has one root: " + roundToPlaces (calcRootOne (a, b, c), 2)); break;
                case 2:
                System.out.println ("The quadratic formula \"" + toFormula (a, b, c) + "\" has two roots: " + roundToPlaces (calcRootOne (a,b,c), 2) + " and " + roundToPlaces (calcRootTwo (a, b, c), 2)); break;
        }
            
    }
    
    private double calcDescriminator (double a, double b, double c) {
        return Math.pow (b, 2d) - (4d * a * c);
    }
    
    private double calcRootOne (double a, double b, double c) {
        return calcRootGeneric (a, b, c, 1d);
    }
    
    private double calcRootTwo (double a, double b, double c) {
        return calcRootGeneric (a, b, c, -1d);
    }
    
    private double calcRootGeneric (double a, double b, double c, double sign) {
        double descriminator = calcDescriminator (a, b, c) * sign;
        return (-b + Math.sqrt (descriminator)) / (2 * a);
    }
    
    private String toFormula (double a, double b, double c) {
        return a + " * x^2 + " + b + " * y + " + c;
    }
    
    
    
}
