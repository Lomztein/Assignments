/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentframework.module02;

import assignmentframework.IAssignment;
import static assignmentframework.Utility.overcomplicatedRound;
import java.util.Scanner;

/**
 *
 * @author Lomztein
 */
public class Module02_Assignment22 implements IAssignment {

    @Override
    public String getIdentifier() {
        return "02_22";
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Ground line length: ");
        double g = scanner.nextDouble ();
        System.out.println ("");
        System.out.print ("Height: ");
        double h = scanner.nextDouble();
        
        System.out.println ("Area of triangle: " + overcomplicatedRound (calculateArea (g, h), 2));
    }
    
    private double calculateArea (double g, double h) {
        double squareArea = g * h;
        return squareArea / 2d;
    }
    
}
