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
public class Module05_Assignment63 implements IAssignment {

    @Override
    public String getIdentifier() {
        return "05.63";
    }

    @Override
    public void execute() {
        int input = Utility.getIntInput("Give number plox.");
        System.out.printf ("Is %d a palindrome? %b", input, isPalindrome (input));
    }
    
    private Boolean isPalindrome (int number) {
        return reverse (number) == number;
    }
    
    private int reverse (int number) {
        
        String toString = Integer.toString (number);
        String reversed = "";
        
        for (int i = toString.length() - 1; i >= 0; i--) {
            reversed += toString.charAt (i) + "";
        }
        
        return Integer.parseInt(reversed);
    }
    
}
