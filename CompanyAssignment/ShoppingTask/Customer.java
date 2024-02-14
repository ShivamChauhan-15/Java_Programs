package CompanyAssignment.ShoppingTask;

class Customer {
    private String name;
    private String id;
    private ShoppingCart cart;
    private String address;
    public Customer(String id,String name,String address) {
        this.name = name;
        this.id=id;
        this.address=address;
        this.cart = new ShoppingCart();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ShoppingCart getCart() {
        return cart;
    }
    public String getAddress(){
        return address;
    }
    public void addToCart(String id,Product product) {
        cart.addProduct(product);
    }
}
