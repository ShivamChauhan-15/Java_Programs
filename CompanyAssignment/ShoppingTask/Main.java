package CompanyAssignment.ShoppingTask;

import java.util.*;
import java.util.List;

// Functional interface for product operations
@FunctionalInterface
interface CartOperation {
    void perform(Customer customer, ShoppingCart cart);
     static void printInvoice(Map<Product,Integer>products) {
        double total = 0.0;
        for (Map.Entry<Product,Integer> prod : products.entrySet()) {
            System.out.println(prod.getKey().getName()+ "Quantity: "+prod.getValue());
            int quantity= prod.getValue();
            total += quantity*prod.getKey().getPrice();
        }
        System.out.println("Total: " + total);
    }

}
@FunctionalInterface
interface DispatchOperation{
    void dispatchDetails(Customer customer,Dispatch d);

}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Product> availableProducts=new ArrayList<>();
        // Adding some sample products
        availableProducts.add(new Product("Phone", 15000.0));
        availableProducts.add(new Product("Laptop", 40000.0));
        availableProducts.add(new Product("Headphones", 2500.0));
        availableProducts.add(new Product("Shoes", 1500.0));

        // Creating a new customer
        List<Customer> customers=new ArrayList<>();
        Customer c1=new Customer("1A","Rohan", "G-48 Sector 58,Noida");
        Customer c2=new Customer("2A","Shweta","C-23 Kalkaji New Delhi");
        customers.add(c1);
        customers.add(c2);

        //Add Products
        c1.addToCart(c1.getId(),availableProducts.get(0));
        c1.addToCart(c1.getId(),availableProducts.get(0));
        c2.addToCart(c2.getId(),availableProducts.get(1));
        c2.addToCart(c2.getId(),availableProducts.get(2));
        c2.addToCart(c2.getId(),availableProducts.get(3));

        //Dispatch object
        Dispatch d = new Dispatch();

        // Perform operations
        //(1)For Product Details in cart
        CartOperation printProductDetails = (cust, shoppingCart) -> {
            System.out.println("\nProduct Details in Cart for " + cust.getName() + ":");
            for (Map.Entry<Product,Integer> p: shoppingCart.getProducts().entrySet()) {
                System.out.println(p.getKey()+" "+p.getValue());
            }
        };

        //For Invoice Details
       CartOperation generateInvoice = (cust, shoppingCart) -> {
            //check for customer want to buy products or not
           System.out.println("Do you want to buy these products(yes or no): ");
            if(!sc.nextLine().equalsIgnoreCase("no")) {
                System.out.println("** Invoice Details **");
                CartOperation.printInvoice(shoppingCart.getProducts());
            }
            else {
                System.out.println("Thanks for adding the products");
                System.exit(0);
            }
        };

       //Dispatch
        DispatchOperation dispatch=(cust,disp)->{
            System.out.println("\nHii! "+cust.getName()+" Your product : ");
            for(Map.Entry<Product,Integer> prod:cust.getCart().getProducts().entrySet()){
                System.out.println(prod.getValue()+","+prod.getKey().getName()+" dispatched ");
            }
            System.out.println("Shipping Address: " +cust.getAddress()+
                    "\nDispatch Date: " + disp.getDispatchDate() +
                    "\nEstimated Delivery Date: " + disp.getEstimatedDeliveryDate());
        };

        //Deliver
        CartOperation deliver=(cust,shoppingCart)->{
            System.out.println("\nHii! "+cust.getName()+" Your product: ");
            for(Map.Entry<Product,Integer> prod:shoppingCart.getProducts().entrySet()){
                System.out.print(prod.getValue()+","+prod.getKey().getName()+" ");
            }
            System.out.println("Delivered Successfully");
        };

        // Perform operations with the customer and their cart
        for(Customer c:customers){
            printProductDetails.perform(c, c.getCart());
            generateInvoice.perform(c,c.getCart());
            dispatch.dispatchDetails(c,d);
            deliver.perform(c,c.getCart());
        }
    }
}