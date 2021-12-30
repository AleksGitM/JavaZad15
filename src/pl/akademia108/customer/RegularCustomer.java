package pl.akademia108.customer;

public class RegularCustomer extends Customer {

    private Integer discount;

    public RegularCustomer(String name, Integer discount) {
        super(name);
        this.discount = discount;
    }

    public void printPurchaseInfo() {
        System.out.println("Wartość zakupów klienta " + this.getName() + " wynosi " + (this.getValueOfPurchase() - this.discount));

    }
}