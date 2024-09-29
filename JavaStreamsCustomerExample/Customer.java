package JavaStreamsCustomerExample;

import java.util.List;

public class Customer {

    private String name;

    private String email;
    private List<String> purchaseHistory;
    public String name() {
        return name;
    }
    public Customer(String name, String email, List<String> purchaseHistory) {
        this.name = name;
        this.email = email;
        this.purchaseHistory = purchaseHistory;
    }
    public String email() {
        return email;
    }
    public List<String> purchaseHistory() {
        return purchaseHistory;
    }
}
