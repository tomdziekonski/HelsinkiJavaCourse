public class Customer {

    private String name;
    private String address;
    private String email;

    public Customer(String name, String email, String address) {
        this.address = address;
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "This is your customer " + name + " ," + email + " ," + address;
    }

}
