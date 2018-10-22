/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentframework.module13;

import assignmentframework.IAssignment;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lomztein
 */
public class Module13_Assignment implements IAssignment {

    @Override
    public String getIdentifier() {
        return "13";
    }

    @Override
    public void execute() {
        Scanner inputScanner = new Scanner (System.in); // Create a scanner for reading raw input, because delimiters with System.in doesn't seem to work amazingly.
        Scanner scanner = new Scanner(inputScanner.next ()).useDelimiter(","); // Create a new input scanner with a custom delimiter, in this case a comma. This scanner reads the first scanners input. 
        File file = new File("C:\\Users\\Lomztein\\Documents\\NetBeansProjects\\Assignments\\src\\assignmentframework\\module13\\junk.csv"); // Hardcode the file path because we are highly skilled software engineers. Replace this with a new file if you aren't the mighty Lomz.
        
         // Save every single input entry in an ArrayList for later use.
        ArrayList<String> input = new ArrayList<>();
        while (scanner.hasNext ()) {
            String next = scanner.next();
            System.out.println ("Reading: \"" + next + "\"");
            input.add(next);
        }

        try {
            System.out.println ("Attempting to write file...");
            // Make sure the file exists. If it does not, create a new one.
            if (!file.exists()) {
                file.createNewFile();
            }
            // Use fancy Java trickery to not have to worry about closing the stream.
            // When this try-block ends, the "Close" method is automatically called.
            // More info here: https://www.infoq.com/news/2010/08/arm-blocks
            // Hint: Hold CTRL to click the link.
            try (PrintWriter writer = new PrintWriter(file)) {
                writer.write(""); // Empty the file for any previous content.

                for (int i = 0; i < input.size(); i++) { // Loop through the ArrayList.
                    String entry = input.get (i); // Grap the current entry and store it for easy access.
                    writer.append(entry); // Append the entry string to the FileStream.
                    if (i != input.size () - 1) { // If it isn't the last entry in the array...
                        writer.append (","); // Append a command to seperate the data in the .csv file (Comma Seperated Values)
                    }
                }
                
                System.out.println ("Succesfully wrote the file.");
            }
        } catch (FileNotFoundException notFound) { // Less critical error, just try again by restarting the program.
            System.out.println("The file you requested doesn't exits. You're a failure, give up on life.");
        } catch (IOException ioExc) { // More critical error, could be caused my hardware failure.
            System.out.println("Something went terribly wrong. Congratulations, you've dooomed us all.");
        }
    }
}
