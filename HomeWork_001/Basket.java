public class Basket {

    Product[] buyProducts = new Product[1];

    public Basket(Product[] buyProducts) {
        this.buyProducts = buyProducts;
    }

    public Basket() {
    }

    public Product[] getBuyProducts() {
        return buyProducts;
    }

    public void setBuyProducts(Product[] buyProducts) {
        this.buyProducts = buyProducts;
    }
}

