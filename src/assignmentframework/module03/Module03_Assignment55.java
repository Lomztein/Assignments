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
public class Module03_Assignment55 implements IAssignment {
    
    @Override
    public String getIdentifier() {
        return "03_55";
    }

    @Override
    public void execute() {
        
        String firstHeader = "Celsius - Fahrenheit";
        String secondHeader = "Fahrenheit - Celsius";
        
        String fullHeader = firstHeader + "   |   " + secondHeader;
        System.out.println (fullHeader);
        
        for (int i = 0; i < 50; i++) {
            
            double celsius = i * 2d;
            double fahrenheit = 20 + i * 5d;
            
            double celToFah = roundToPlaces (convertCelsiusToFahrenheit (celsius), 2);
            double fahToCel = roundToPlaces (convertFahrenheitToCelsius (fahrenheit), 2);
            
            String firstPart = uniformStringLength (celsius + "", celToFah + "", firstHeader.length ());
            String secondPart = uniformStringLength (fahrenheit + "", fahToCel + "", secondHeader.length ());
            String fullEntry = uniformStringLength (firstPart, secondPart, "|", fullHeader.length ());
            
            System.out.println (fullEntry);
            
        }
        
    }
    
        private double convertCelsiusToFahrenheit (double celsius) {
        return celsius * (9d / 5d) + 32d;
    }
    
    private double convertFahrenheitToCelsius (double fahrenheit) {
        return (fahrenheit - 32d) / (9d / 5d) ;
    }
    
}
