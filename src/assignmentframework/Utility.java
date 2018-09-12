/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentframework;

import java.util.Scanner;

/**
 *
 * @author Lomztein
 */
public class Utility {
    
    private static final Scanner SCANNER = new Scanner (System.in);
    
    public static double overcomplicatedRound (double number, int places) {
        
        // This is arguably one of the more stupid things I've done. Not the most stupid, mind you, but certainly one of the most.
        // The nunmber is turned into a string using Double.toString.
        String toString = Double.toString (number);
        
        // The index of the comma is found, this will be used to find out how much text must be cut off.
        int commaIndex = toString.indexOf ('.');
        
        // If the string exceeds the maximum amount of decimal places, then grap a substring of it that only contains the places requested.
        if (toString.length() > commaIndex + places + 1)
            toString = toString.substring (0, commaIndex + places + 1);
        
        // Parse the string back into a double and return it.
        return Double.parseDouble(toString);
        
        // I am progrmer.
    }
    
    public static double roundToPlaces (double number, int places) {
        
        double divider = Math.pow (10,(double)places);
        double rounded = (int)Math.round (number * divider) / divider;
        return rounded;
        
    }
    
    public static double getDoubleInput (String prefix) {
        System.out.print (prefix);
        double input = SCANNER.nextDouble ();
        return input;
    }
    
    public static int getIntInput (String prefix) {
        System.out.print (prefix);
        int input = SCANNER.nextInt ();
        return input;
    }
    
    public static String getInput (String prefix) {
        System.out.print (prefix);
        return SCANNER.next();
    }
    
    
    public static String uniformStringLength (String str1, String str2, int desiredLength) {
        return uniformStringLength (str1, str2, " ", desiredLength);
    }
    
    public static String uniformStringLength (String str1, String str2, String middle, int desiredLength) {
        
            String result = String.format("%-" + (desiredLength / 2) + "s%" + (desiredLength / 2) + "s", str1, str2);
            return result;
        
            /*
            int length1 = str1.length ();
            int length2 = str2.length ();
                        
            int spaces = desiredLength - (length1 + length2);
            
            String result = str1 + "";
            for (int j = 0; j < spaces; j++) {
                result += (j == spaces / 2) ? middle : " ";
            }
            result += str2;
            
            return result;
*/
    }
}
