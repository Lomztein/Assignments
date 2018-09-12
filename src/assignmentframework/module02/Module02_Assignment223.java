/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentframework.module02;

import assignmentframework.IAssignment;
import static assignmentframework.Utility.getDoubleInput;
import static assignmentframework.Utility.overcomplicatedRound;

/**
 *
 * @author Lomztein
 */
public class Module02_Assignment223 implements IAssignment {

    @Override
    public String getIdentifier() {
        return "02_223";
    }

    @Override
    public void execute() {
        double distance = getDoubleInput("Driving distance: ");        
        double milesPerGallon = getDoubleInput("Miles per gallon: ");
        double pricePerGallon = getDoubleInput("Price per gallon: ");

        System.out.println ("Total driving cost is " + overcomplicatedRound (calculateDrivingPrice (distance, milesPerGallon, pricePerGallon), 2));
    }
    
    private double calculateDrivingPrice (double dist, double milesPerGal, double pricePerGal) {
        double pricePerMile = pricePerGal / milesPerGal;
        return dist * pricePerMile;
    }
    
}
