package CompanyAssignment.ShoppingTask;

import java.util.ArrayList;
import java.util.*;
import java.util.List;

class ShoppingCart {
   private Map<Product,Integer> products=new HashMap<>();
    public void addProduct(Product p) {
        products.put(p,products.getOrDefault(p,0)+1);
    }

    public Map<Product,Integer> getProducts() {
        return products;
    }

}
