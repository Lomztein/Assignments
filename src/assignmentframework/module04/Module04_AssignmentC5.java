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
public class Module04_AssignmentC5 implements IAssignment {

    @Override
    public String getIdentifier() {
        return "04.C5";
    }

    @Override
    public void execute() {

        // Declare a maximum value to search, in this case one million.
        int max = 1000000;
        
        // Create a massive array of booleans with a length equal to the max value.
        boolean[] markedNumbers = new boolean[max];

        // Starting at two, loop through each number.
        for (int i = 2; i < max; i++) {

            // If it is already marked, ignore it. This makes sure we only go forward if the number has not already been found to be non-prime.
            if (markedNumbers[i]) {
                continue;
            }

            // For each of the numbers starting at i, going up one i each time.
            for (int j = i; j < max; j += i) {

                // If it hasn't been marked and is not our starting number, then mark it as non-prime.
                if (!markedNumbers[j] && i != j) {

                    markedNumbers[j] = true;
                    System.out.println("Marking " + j + " as a multiple of " + i);

                }
            }

        }
        
        // Loop through every single number and print out the non-marked ones. These are our primes.
        for (int i = 0; i < max; i++) {
            if (!markedNumbers[i]) {
                System.out.println (i + " is a prime number.");
            }
        }

    }

}
