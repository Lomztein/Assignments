/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentframework.module08;

import assignmentframework.IAssignment;
import java.util.Date;

/**
 *
 * @author Lomztein
 */
public class Module08_Assignment98 implements IAssignment {

    @Override
    public String getIdentifier() {
        return "08.98";
    }

    @Override
    public void execute() {
         
    }
    
    public class Fan {
        
        public Fan () {
            this (SLOW, false, 5d, "blue");
        }
        
        /**
         * @return the speed
         */
        public int getSpeed() {
            return speed;
        }

        /**
         * @param speed the speed to set
         */
        public void setSpeed(int speed) {
            this.speed = speed;
        }

        /**
         * @return the on
         */
        public boolean isOn() {
            return on;
        }

        /**
         * @param on the on to set
         */
        public void setOn(boolean on) {
            this.on = on;
        }

        /**
         * @return the radius
         */
        public double getRadius() {
            return radius;
        }

        /**
         * @param radius the radius to set
         */
        public void setRadius(double radius) {
            this.radius = radius;
        }

        /**
         * @return the color
         */
        public String getColor() {
            return color;
        }

        /**
         * @param color the color to set
         */
        public void setColor(String color) {
            this.color = color;
        }
        
        public static final int SLOW = 1, MEDIUM = 2, FAST = 3;
        
        private int speed;
        private boolean on;
        private double radius;
        private String color;
        
        public Fan (int speed, boolean on, double radius, String color) {
            this.speed = speed;
            this.on = on;
            this.radius = radius;
            this.color = color;
        }
        
        @Override
        public String toString () {
            if (on) {
                return String.format("Speed: %d, radius: %f, color: %s", speed, radius, color);
            }else{
                return String.format("Fan is not on. Radius: %d, color: %s", speed, radius, color);
            }
        }
        
        public String toString (Date date) {
            return date.toString () + toString ();
        }
        
        
    }
    
}
