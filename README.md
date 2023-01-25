## Завдання
Клас Customer 
```Java
package domain;

public class Customer {
    private int ID;
    private boolean IsNew;
    private double Total;
    public Customer(){
        ID = 2;
        IsNew = true;
        Total = 3;
    }
    public void displayCustomerInfo(){
        System.out.println("Client ID: " + ID);
        System.out.println("Client is New: " + IsNew);
        System.out.println("Total number of orders customer: " + Total);
    }
 }
```
Клас Test Customer
```Java
package test;

import domain.Customer;

public class TestCustomer {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.displayCustomerInfo();
    }
}
```
![](https://github.com/ppc-ntu-khpi/java-1-pOpovich69/blob/main/Solution/done.png)

## На вищий бал
Клас Customer
```Java
package domain;

public class Customer {
    private int ID;
    private boolean IsNew;
    private double Total;
    public Customer(){
        ID = 2;
        IsNew = true;
        Total = 3;
    }
    public void displayCustomerInfo(){
        System.out.println("Client ID: " + ID);
        System.out.println("Client is New: " + IsNew);
        System.out.println("Total number of orders customer: " + Total);
    }
    public int getID(){
        return ID;
    }
    public boolean getIsNew(){
        return IsNew;
    }
    public double getTotal(){
        return Total;
    }
    public void setID(int id){
        if (id > 0){
            this.ID = id;
        }
    }
    public void setIsNew(boolean isNew){
        this.IsNew = isNew;
    }
    public void setTotal(double total){
        if (total > 0){
            this.Total = total;
        }
    }
}
```
Клас Test Customer
```Java
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
```
![](https://github.com/ppc-ntu-khpi/java-1-pOpovich69/blob/main/Solution/advanced.png)
