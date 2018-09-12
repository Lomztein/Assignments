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
public class Module02_Assignment21 implements IAssignment {
    
    public final double CONVERT_RATIO = 1.6;

    @Override
    public String getIdentifier() {
        return "02_21";
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter miles: ");
        double miles = scanner.nextDouble();
        System.out.println ("");
        
        System.out.println (overcomplicatedRound (miles, 2) + " miles = " + overcomplicatedRound (convertToKilometers (miles), 2) + " kilometers.");
    }
    
    private double convertToKilometers (double miles) {
        return miles * CONVERT_RATIO;
    }
    
}
