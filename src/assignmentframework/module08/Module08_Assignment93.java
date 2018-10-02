/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentframework.module08;

import assignmentframework.IAssignment;
import assignmentframework.Utility;
import java.util.Date;

/**
 *
 * @author Lomztein
 */
public class Module08_Assignment93 implements IAssignment {

    @Override
    public String getIdentifier() {
        return "08.93";
    }

    @Override
    public void execute() {
        int magnitudes = Utility.getIntInput ("Number of magnitudes? ");
        for (int i = 0; i < magnitudes; i++) {
            long milliseconds = (long)Math.pow(10, i);
            Date date = new Date (milliseconds);
            System.out.println (milliseconds + " milliseconds after the first of january 1970 is equal to " + date);
        }
    }
    
}
