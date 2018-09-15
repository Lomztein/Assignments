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
public class Module04_Assignment73 implements IAssignment {

    @Override
    public String getIdentifier() {
        return "04.73";
    }

    @Override
    public void execute() {
        int[] input = { 2, 1, 42, 12, 40, 9, 0, 21, 5, 45, 23, 12, 23, 14, 43, 21, 54, 12, 2, 3, 5, 12 };
        int[] amountPer = new int[50];
        
        System.out.print ("Input numbers: ");
        for (int i = 0; i < input.length; i++) {
            amountPer[input[i]]++;
            System.out.print (i + ", ");
        }
        
        System.out.println ("");
        for (int i = 0 ; i < amountPer.length; i++) {
            if (amountPer[i] > 0)
                System.out.println ("There are " + amountPer[i] + " instances of " + i);
        }
    }
    
    
    
}
