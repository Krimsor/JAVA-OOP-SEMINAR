public class User {
    private String username;
    private String password;
    private Basket basket;
     public User(String username, String password, Basket basket) {
        this.username = username;
        this.password = password;
        this.basket = basket;
    }
     public String getUsername() {
        return username;
    }
     public String getPassword() {
        return password;
    }
     public Basket getBasket() {
        return basket;
    }
}