/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentframework.module09;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Lomztein
 */
public class FoodProduct extends Product {

    /**
     * @return the spoilDate
     */
    public Date getSpoilDate() {
        return spoilDate;
    }

    /**
     * @return the storeTemperature
     */
    public double getStoreTemperature() {
        return storeTemperature;
    }

    public FoodProduct(int id, String name, double cost, Date spoilDate, double storeTemperature) {
        super(id, name, cost);
        this.spoilDate = spoilDate;
        this.storeTemperature = storeTemperature;
    }

    private final Date spoilDate;
    private final double storeTemperature;

    @Override
    public String toString() {
        // Udvid super.toString () ved at retunere dens resultatet med data der representere FoodProduct tilføjet til det.
        return super.toString() + " Spoil Date: " + getSpoilDate().toString() + " - Store Temperature: " + getStoreTemperature();
    }

    @Override
    public boolean equals(Object o) {

        if (!(o instanceof FoodProduct)) {
            return false;
        }
        FoodProduct other = (FoodProduct) o;

        return (super.equals(o)
                && this.getSpoilDate() == other.getSpoilDate()
                && this.getStoreTemperature() == other.getStoreTemperature());
    }

}
