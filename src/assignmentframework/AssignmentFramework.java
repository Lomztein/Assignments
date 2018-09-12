/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentframework;
import assignmentframework.module04.Module04_AssignmentC4;
import assignmentframework.module04.Module04_AssignmentC5;
import assignmentframework.module04.Module04_AssignmentC6;
import assignmentframework.module04.Module04_AssignmentC1;
import assignmentframework.module03.Module03_AssignmentB1;
import assignmentframework.module03.Module03_Assignment57;
import assignmentframework.module03.Module03_Assignment32;
import assignmentframework.module03.Module03_Assignment53;
import assignmentframework.module03.Module03_Assignment55;
import assignmentframework.module03.Module03_AssignmentB4;
import assignmentframework.module03.Module03_AssignmentB5;
import assignmentframework.module02.Module02_Assignment26;
import assignmentframework.module02.Module02_Assignment223;
import assignmentframework.module02.Module02_Assignment27;
import assignmentframework.module02.Module02_Assignment22;
import assignmentframework.module02.Module02_Assignment21;
import assignmentframework.module02.AssignmentA2;
import assignmentframework.module02.AssignmentA1;
import assignmentframework.module02.AssignmentA3;
import java.util.Scanner;

/**
 *
 * @author Lomztein
 */
public class AssignmentFramework {

    public static final AssignmentManager MANAGER = new AssignmentManager (
            new IAssignment[] {
                // Insert assignments here..
                new Module02_Assignment21 (),
                new Module02_Assignment22 (),
                new Module02_Assignment26 (),
                new Module02_Assignment27 (),
                new Module02_Assignment223 (),
                
                new AssignmentA1 (),
                new AssignmentA2 (),
                new AssignmentA3 (),
                
                new Module03_Assignment32 (),
                new Module03_Assignment53 (),
                new Module03_Assignment55 (),
                new Module03_Assignment57 (),   
                
                new Module03_AssignmentB1 (),                
                new Module03_AssignmentB4 (),
                new Module03_AssignmentB5 (),
                
                new Module04_AssignmentC1 (),
                new Module04_AssignmentC4 (),
                new Module04_AssignmentC5 (),
                new Module04_AssignmentC6 (),

            }
    );
    
    public static final Scanner SCANNER = new Scanner (System.in);
    
    public static boolean isRunning = false;
    
    public static void main(String[] args) {
        
        isRunning = true;
        while (isRunning) {
            String input = SCANNER.next();
            MANAGER.findAndExecute(input);  
            // TODO code application logic here
        }
    }
}
