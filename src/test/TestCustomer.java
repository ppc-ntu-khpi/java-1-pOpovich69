package test;

import domain.Customer;

public class TestCustomer {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.displayCustomerInfo();

        customer.setID(6);
        customer.setIsNew(false);
        customer.setTotal(80);

        System.out.println("\nClient ID: " + customer.getID());
        System.out.println("Client is New: " + customer.getIsNew());
        System.out.println("Total number of orders customer: " + customer.getTotal());
    }
}
