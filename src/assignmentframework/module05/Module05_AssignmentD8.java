/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentframework.module05;

import assignmentframework.IAssignment;

/**
 *
 * @author Lomztein
 */
public class Module05_AssignmentD8 implements IAssignment {
    
    private final int WIDTH = 9;
    private final int HEIGHT = 9;

    @Override
    public String getIdentifier() {
        return "05.D8";
    }

    @Override
    public void execute() {
        
        int[][] soduko = {
            { 8, 2, 5, 4, 7, 1, 3, 9, 6 },
            { 1, 9, 4, 3, 2, 6, 5, 7, 8 },
            { 3, 7, 6, 9, 8, 5, 2, 4, 1 },
            { 5, 1, 9, 7, 4, 3, 8, 6, 2 },
            { 6, 3, 2, 5, 9, 8, 4, 1, 7 },
            { 4, 8, 7, 6, 1, 2, 9, 3, 5 },
            { 2, 6, 3, 1, 5, 9, 7, 8, 4 },
            { 9, 4, 8, 2, 3, 7, 1, 5, 3 },
            { 7, 5, 1, 8, 3, 4, 6, 2, 9 },
        };
       
        boolean isValid = true;
        
        for (int y = 0; y < HEIGHT; y += 3) {
            for (int x = 0; x < WIDTH; x += 3) {
                if (!check3x3 (x, y, soduko)) {
                    isValid = false;
                }
            }
        }
        
        for (int y = 0; y < HEIGHT; y ++) {
            for (int x = 0; x < WIDTH; x ++) {
                if (!checkCross (x, y, soduko)) {
                    isValid = false;
                }
            }
        }
        
        System.out.println (String.format ("The given soduko is valid? %b", isValid));
    }
    
    private boolean check3x3 (int x, int y, int[][] array) {
        
        int xx = x / 3;
        int yy = y / 3;
        
        xx *= 3;
        yy *= 3;
        
        OneForAll numbers = new OneForAll (9);
        
        for (int xl = 0; xl < 3; xl++) {
            for (int yl = 0; yl < 3; yl++) {
                
                numbers.count (array[xl + xx][yl + yy]);
                
            }
        }
        
        return numbers.oneForAll();
    }
    
    private boolean checkCross (int x, int y, int[][] array) {
        
        OneForAll xNumbers = new OneForAll (9);
        OneForAll yNumbers = new OneForAll (9);
        
        for (int xx = 0; xx < WIDTH; xx++) {
            xNumbers.count(array[xx][y]);
        }
        
        for (int yy = 0; yy < HEIGHT; yy++) {
            yNumbers.count(array[x][yy]);
        }
        
        return xNumbers.oneForAll() && yNumbers.oneForAll();
        
    }
    
    public class OneForAll { // This name doesn't make sense but fuck you cute goth music girl is best waifu.
        
        public int[] counter;
        
        public OneForAll (int length) {
            counter = new int[length];
        }
        
        private int convertIndex (int input) {
            return input - 1;
        }
        
        public void count (int number) {
            counter[convertIndex (number)]++;
        }
        
        public int getNumber (int number) {
            return counter[convertIndex(number)];
        }
        
        public boolean oneForAll () {
            for (int i = 0; i < counter.length; i++) {
                if (counter[i] != 1)
                    return false;
            }
            return true;
        }
        
    }
    
}
