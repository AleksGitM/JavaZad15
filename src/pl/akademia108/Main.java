package pl.akademia108;

import pl.akademia108.customer.Customer;
import pl.akademia108.customer.RegularCustomer;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer("blabla");
        customer.setValueOfPurchase(1000);

        customer.printPurchaseInfo();

        RegularCustomer regularCustomer = new RegularCustomer("zdzisław", 100);
        regularCustomer.setValueOfPurchase(1500);

        regularCustomer.printPurchaseInfo();
    }
}
