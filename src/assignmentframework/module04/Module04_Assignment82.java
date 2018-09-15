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
public class Module04_Assignment82 implements IAssignment {

    @Override
    public String getIdentifier() {
        return "04.82";
    }

    @Override
    public void execute() {
        
        double[][] matrix = {
            { 1d, 2d, 3d, 4.0 },
            { 5d, 6.5, 7d, 8d },
            { 9d, 10d, 11d, 12d}, 
            { 13d, 14d, 15d, 16d }
        };
        
        int min = matrix[0].length < matrix[1].length ? matrix[0].length : matrix[1].length;
        
        double amount = 0d;
        for (int i = 0; i < min; i++) {
            amount += matrix[i][i];
        }
        
        amount /= min;
        
        System.out.println ("Avarage of matrix major diagonal is " + amount);
        
    }
    
}
