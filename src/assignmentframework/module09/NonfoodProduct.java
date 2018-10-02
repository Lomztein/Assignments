/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentframework.module09;

/**
 *
 * @author Lomztein
 */
public class NonfoodProduct extends Product {

    public NonfoodProduct(int id, String name, double cost, String[] materials) {
        super(id, name, cost);
        this.materials = materials;
    }

    private final String[] materials;

    @Override
    public String toString() {
        // Udvid super.toString () ved at retunere dens resultatet med data der representere NonfoodProducts materialer tilføjet til det.
        // Ligesom i Stores toString () samles alle elementer i til et sæt linjer.
        String result = super.toString () + "\n";
        for (String material : materials) {
            result += material + "\n";
        }
        return result;

    }
}
