/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentframework.module02;

import assignmentframework.IAssignment;
import static assignmentframework.Utility.overcomplicatedRound;

/**
 *
 * @author Lomztein
 */

    public class AssignmentA1 implements IAssignment {

        @Override
        public String getIdentifier() {
            return "A1";
        }

        @Override
        public void execute() {

            System.out.println ("Assignment A1...");

            // A prefix is declared becasue prefixes are fun.
            String prefix = "Area of circle with radius [RADIUS]: ";
            String text = "";
            for (int i = 1; i <= 5; i++) {
                // The placeholder [RADIUS] piece of text is replaced with the actual radius, it is concatenated with the calculated number.
                text += prefix.replace("[RADIUS]", Integer.toString(i)) +
                        Double.toString (overcomplicatedRound (calculateCircleArea (i), 2)) + 
                        "\n";

                // The concatenated string is printed out.
            }
            
            System.out.println (text);
        }
    
        public double calculateCircleArea (double radius) {
            // Calculates the area of a circle using the common algorithm for it.
            return radius * radius * Math.PI;
        }
        
    }
