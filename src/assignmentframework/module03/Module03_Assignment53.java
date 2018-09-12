/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentframework.module03;

import assignmentframework.IAssignment;
import static assignmentframework.Utility.roundToPlaces;
import static assignmentframework.Utility.uniformStringLength;

/**
 *
 * @author Lomztein
 */
public class Module03_Assignment53 implements IAssignment {
    
    @Override
    public String getIdentifier() {
        return "03_53";
    }

    @Override
    public void execute() {
        
        String header = "Celsius - Fahrenheit";
        int maxLength = header.length ();
        
        System.out.println (header);
        
        for (int i = 0; i < 50; i++) {
            
            int temperature = i * 2;
            
            String cel = temperature + "";
            String fah = roundToPlaces (convertCelsiusToFahrenheit (temperature), 2) + "";
            
            System.out.println (uniformStringLength (cel, fah, maxLength));
        }
        
    }
    
    private double convertCelsiusToFahrenheit (double celsius) {
        return celsius * (9d / 5d) + 32d;
    }
    
}
