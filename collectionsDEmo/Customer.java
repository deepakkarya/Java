package collectionsDEmo;

public class Customer {
    public String getName() {
        return name;
    }

    String name;

    public String getEmail() {
        return email;
    }

    String email;

    public Customer(String name, String email) {
        this.name=name;
        this.email=email;
    }
}
