package test;

import domain.Customer;

public class CustomerTest {
    public static void main(String[] args) {
        Customer myCustomer = new Customer();

        System.out.println("Default customer data:");
        myCustomer.displayCustomerInfo();

        myCustomer.setID(101);
        myCustomer.setStatus(false);
        myCustomer.setTotal(5500.75);

        System.out.println("Updated customer data:");
        myCustomer.displayCustomerInfo();
    }
}