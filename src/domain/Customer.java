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
