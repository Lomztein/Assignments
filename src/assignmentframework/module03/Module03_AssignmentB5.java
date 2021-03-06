/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentframework.module03;

import assignmentframework.IAssignment;
import assignmentframework.Utility;

/**
 *
 * @author Lomztein
 */
public class Module03_AssignmentB5 implements IAssignment {
    
    public final double ROUND_MARGIN = 1d / 64d;

    @Override
    public String getIdentifier() {
        return "03_B5";
    }

    @Override
    public void execute() {
        
        int max = Utility.getIntInput("Max number?");
        int highest = 0;
        for (int i = 0; i < max; i++) {
            
            if (isPrime (i)) {
                highest = i;
                System.out.println (i);
            }
            
        }
        
        System.out.println (highest + " is the highest prime number before " + max);
        
    }
    
    private boolean isPrime (int number) {
        
        int root = (int)Math.ceil(Math.sqrt (number));
        for (int i = 2; i <= root + 1; i++) {
            
            if (number % i == 0) {
                return false;
            }
            
        }
        
        return true;
    }
    
    // A prime number is called a Mersenne prime if it can be written in the form 2^p - 1 for some positive integer p.
    private boolean isMersenne (int marsenne) {
        
        double p = logN (2d, marsenne - 1d);
        double rounded = Math.round (p);
        
        return Math.abs(p - rounded) < ROUND_MARGIN;
        
    }
    
    private double logN (double base, double number) {
        return Math.log (number) / Math.log (base);
    }
    
}
