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
public class Module05_Assignment622 implements IAssignment {
    
    private final double MARGIN = 1 / 64;

    @Override
    public String getIdentifier() {
        return "05.622";
    }

    @Override
    public void execute() {
        
        double number = Utility.getDoubleInput("Input thine desired number to be rooted, peasent! ");
        double actualRoot = Math.sqrt(number);
        double babylonian = recursiveApproximateRoot (number);
        
        System.out.println (String.format ("Using the Babylonian Method approximates the root to %f.", babylonian));
        System.out.println (String.format ("Using the build-in Math.sqrt method calculates the root to %f.", actualRoot));
        System.out.println (String.format ("This is a difference of %f.", Math.abs (babylonian - actualRoot)));
    }
    
    private double recursiveApproximateRoot (double number) {
        return babylonianMethod (number, number, 0);
    }
    
    private double babylonianMethod (double original, double lastGuess, int step) {
        step++;
        double nextGuess = (lastGuess + original / lastGuess) / 2d;
        if (Math.abs(nextGuess - lastGuess) < MARGIN) {
            return nextGuess;
        }else {
            return babylonianMethod (original, nextGuess, step);
        }
    }
    
}
