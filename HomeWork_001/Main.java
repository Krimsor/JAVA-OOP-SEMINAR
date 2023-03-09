public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        //по полям
/*      product.name = "Pants";
        product.price = 150;
        product.rating = 8;*/
        //инкапсуляция
        product.setName("Pants");
        product.setPrice(150);
        product.setRating(8);
        System.out.println("Product: " + product.getName() + ", Price: " + product.getPrice() + ", Rating: " + product.getRating());
    }
}