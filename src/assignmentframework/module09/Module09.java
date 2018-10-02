/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentframework.module09;

import assignmentframework.IAssignment;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Lomztein
 */
public class Module09 implements IAssignment {

    @Override
    public String getIdentifier() {
        return "09";
    }

    @Override
    public void execute() {

        // Opret et nyt Store objekt hvori alle produkterne opbevares.
        Store store = new Store();
        
        // Placér to "base" produkt objekter i storens' database.
        store.getProductDatabase().addProduct(new Product(0, "Lewds", 4d));
        store.getProductDatabase().addProduct(new Product(1, "Anime", 10d));

        // Placér 3 FoodProduct objekter i storens' database.
        store.getProductDatabase().addProduct(new FoodProduct(2, "Dat Ass", 2d, new Date (2099, 12, 12), 69d));
        store.getProductDatabase().addProduct(new FoodProduct(3, "Satania", 666d, new Date (9999, 1, 1), 666d));
        store.getProductDatabase().addProduct(new FoodProduct(4, "Long Pig", 100d, new Date (2018, 4, 9), 20d));

        // Placér 2 NonfoodProduct objekter i storens' database.
        store.getProductDatabase().addProduct(new NonfoodProduct (5, "Hentai", 69d, new String[] { "Loli", "FBI", "Lonely Men" }));
        store.getProductDatabase().addProduct(new NonfoodProduct (5, "McDonalds", 10d, new String[] { "Sawdust", "Carceogens", "Americans" }));
        
        // Fordi de alle sammen er af typen "Product" eftersom de enten er, eller arver fra den, kan de alle opbevares i storens' ProductDatabase objekt.
        // Print det hele ud ved brug af den overskrevne toString () af ProductDatabase.
        System.out.println(store.getProductDatabase().toString());
    }

}
