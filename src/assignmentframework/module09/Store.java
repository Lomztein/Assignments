/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentframework.module09;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Lomztein
 */
public class Store {

    // Generér automatisk getters og setters (mutators) ved at markere det man ville lave dem for, og trykke Ctrl+Alt+Shift+E.
    // Man kan også højre-klikke på det markerede og gå ind under Refactor/Encapsulate for samme resultat.
    /**
     * @return the productDatabase
     */
    public ProductDatabase getProductDatabase() {
        return productDatabase;
    }

    private final ProductDatabase productDatabase;

    public Store() {
        productDatabase = new ProductDatabase();
    }

    public class ProductDatabase {

        // Brug en ArrayList i stedet for et Array, da de er nemmere at dynamisk tilføje og fjerne objekter fra.
        // ArrayLists fungerer grundlæggende på samme måde som et Array, pånær det med dynamisk størrelse.
        private final ArrayList<Product> products;

        public ProductDatabase() {
            products = new ArrayList<>();
        }

        @Override
        public String toString() {
            String result = "";

            // Gå over hver enkelte Product i databasen og udskriv dens toString () til en variabel.
            for (Product product : products) {
                // \n betyder "newline", og fortæller teksten at den skal gå ned på næste linje.
                result += product.toString() + "\n";
            }

            // Returnér de samlede linjer der tilsammen representerer hele databasen.
            return result;
        }

        public double totalPrice() {
            double result = 0d;

            // Gå over alle Product objekter i databasen og sum deres priser.
            for (Product product : products) {
                result += product.getCost();
            }
            return result;
        }

        public void addProduct(Product product) {
            // Test først for at sørge for at ingen Product med samme ID'er bliver tilføjet ved fejl.
            if (!products.contains(product)) {

                // Tilføj produktet til databasens interne liste.
                products.add(product);
            } else {

                // Hvis der allerede eksisterede et produkt med det her ID, så giv fejlbesked.
                System.out.println("Error - A product with ID " + product.getId() + " already exists.");
            }

        }

        public void removeProduct(int productId) {

            // Gå over alle produkter og fjern den hvis ID passer til det givne ID.
            for (int i = 0; i < products.size(); i++) {
                if (products.get(i).getId() == productId) {
                    products.remove(i);
                }
            }
        }

        public void removeProduct(Product product) {

            if (products.contains(product)) {
                products.remove(product);
            } else {
                System.out.println("Product does not exist within the database.");
            }
        }

    }

}
