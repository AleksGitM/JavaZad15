package pl.akademia108.customer;

public class Customer {

    private String name;
    private Integer valueOfPurchase;

    public Customer(String name) {
        this.name = name;
        this.valueOfPurchase = (int) 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getValueOfPurchase() {
        return valueOfPurchase;
    }

    public void setValueOfPurchase(Integer valueOfPurchase) {
        this.valueOfPurchase = valueOfPurchase;
    }

    public void printPurchaseInfo() {
        System.out.println("Wartość zakupów klienta " + name + " wynosi " + valueOfPurchase);
    }
}
