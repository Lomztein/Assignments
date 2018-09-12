/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentframework;
/**
 *
 * @author Lomztein
 */
public class AssignmentManager {
    
    public IAssignment[] assignments = null;
    
    public AssignmentManager (IAssignment[] _assignments) {
        assignments = _assignments;
    }
    
    public IAssignment findAssignment (String identifier) {
        
        for (int i = 0; i < assignments.length; i++) {
            
            IAssignment assignment = assignments[i];
            
            if (assignment.getIdentifier().equals(identifier))
                return assignment;
        }
        
        return null;
    }
    
    public void executeAssignment (IAssignment assignment) {
        assignment.execute();
    }
    
    public void findAndExecute (String identifier) {
        IAssignment assignment = findAssignment (identifier);
        if (assignment == null) {
            String all = "";
            for (int i = 0; i < assignments.length; i++) {
                all += assignments[i].getIdentifier ();
                if (i != assignments.length - 1)
                     all += ", ";
            }
            
            System.out.println ( "No assignment named " + identifier + " was found. Available assignments are: " + all);
            return;
        }
                        
        executeAssignment (assignment);
    }
}
