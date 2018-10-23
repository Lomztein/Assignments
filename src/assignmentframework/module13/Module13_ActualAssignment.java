/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentframework.module13;

import assignmentframework.IAssignment;
import assignmentframework.Utility;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lomztein
 */
public class Module13_ActualAssignment implements IAssignment {

    @Override
    public String getIdentifier() {
        return "13.2";
    }

    @Override
    public void execute() {

        String path = "C:\\Users\\Lomztein\\Documents\\NetBeansProjects\\Assignments\\src\\assignmentframework\\module13\\junk.csv";
        File file = new File(path);
        ArrayList<String> entries = new ArrayList<>();

        try {
            
            try (Scanner fileScanner = new Scanner(file).useDelimiter(",")) {

                while (fileScanner.hasNext()) {
                    String next = fileScanner.next();
                    entries.add(next);
                }
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Module13_ActualAssignment.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (int i = 0; i < entries.size(); i++) {
            System.out.println(i + " - " + entries.get(i));
        }

        String input = Utility.getInput("rem/add <index> ?");
        int spaceIndex = input.indexOf(" ");
        
        String command = input.substring(0, spaceIndex);
        int number = Integer.parseInt(input.substring(spaceIndex + 1));
        
        switch (command) {
            case "rem":
                remove(number, entries);
                break;
            case "add":
                add(number, entries);
                break;
            default:
                System.out.println (command + " is not a valid command.");
        }
        
        try {
            save (entries, file);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Module13_ActualAssignment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void remove(int index, ArrayList<String> list) {
        list.remove(index);
    }

    private void add(int index, ArrayList<String> list) {
        String newElement = Utility.getInput("Input what now? ");
        list.add(index, newElement);
    }

    private void save(ArrayList<String> data, File file) throws FileNotFoundException {
        try (PrintWriter writer = new PrintWriter(file)) {
            
            writer.write("");
            for (int i = 0; i < data.size(); i++) {
                String toPrint = data.get(i);
                if (i != data.size() - 1) {
                    toPrint += ",";
                }
                writer.print(toPrint);
            }
        }
    }

}
