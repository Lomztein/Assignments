/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentframework.module07;

import assignmentframework.IAssignment;

/**
 *
 * @author Lomztein
 */
public class Module07 implements IAssignment {

    @Override
    public String getIdentifier() {
        return "07";
    }

    @Override
    public void execute() {
        Customer aCustomer = new Customer ("John Doe", 0, 666d);
        
        aCustomer.deposit (100d);
        aCustomer.withdraw (50d);
        System.out.println (String.format ("Customer %s has %f.2 credits remaining.", aCustomer.name, aCustomer.getBalance()));
        
        Customer bCustomer = new Customer ("Jane Doe", 1, 10d);
        
        CustomerDatabase database = new CustomerDatabase ();
        database.addCustomer(aCustomer);
        database.addCustomer(bCustomer);
        database.addCustomer(new Customer ("The Devil", 2, 324d));
        database.addCustomer(new Customer ("My Cock", 3, 6534d));
        database.printNames();
        
        database.removeCustomer(1);
        
        System.out.println ("----------------------");
        database.printNames ();
    }
    
    public class CustomerDatabase {
        
        private Customer[] customers = new Customer[0];
        
        public CustomerDatabase () {
            customers = new Customer[0];
        }
        
        public void addCustomer (Customer customer) {
            Customer[] old = customers;
            customers = new Customer[old.length + 1];
            System.arraycopy(old, 0, customers, 0, old.length);
            customers[old.length] = customer;
        }
        
        public void removeCustomer (int id) {
            
            for (int i = 0; i < customers.length; i++) {
                if (customers[i].id == id) {
                    customers[i] = null;
                    break;
                }
            }
            
            Customer[] newCustomers = new Customer[customers.length - 1];
            
            int offset = 0;
            for (int i = 0; i < customers.length; i++) {
                if (customers[i] == null) {
                    offset++;
                    continue;
                }
                newCustomers[i - offset] = customers[i];
            }
            
            customers = newCustomers;
        }
        
        public Customer getCustomer (int id) {
            for (Customer cust : customers) {
                if (cust.id == id)
                    return cust;
            }
            return null;
        }
        
        public Customer[] getAllCustomers () {
            return customers;
        }
        
        public void printNames () {
            for (Customer cust : customers) {
                System.out.println (String.format ("Customer %s - %d has a balance of %f.2.", cust.name, cust.id, cust.getBalance ()));
            }
        }
        
    }
    
    public class Customer {
        
        private String name;
        public int id;
        public double balance;
        
        public Customer (String name, int id) {
            this.name = name;
            this.id = id;
            this.balance = 0d;
        }
        
        public Customer (String name, int id, double balance) {
            this.name = name;
            this.id = id;
            this.balance = balance;
        }
        
        public double getBalance () {
            return balance;
        }
        
        private void changeBalance (double change) {
            balance += change;
        }
        
        public void deposit (double amount) {
            changeBalance (amount);
        }
        
        public void withdraw (double amount) {
            changeBalance (-amount);
        }
        
    }
    
}
