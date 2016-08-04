package Classes.Product;

public interface Products {

    public void registerObserver(productObserver observer);

    public void removeObserver(productObserver observer);

    public void setStatus(String status);

    public String getStatus();
    
    public void setPrice(double price);

    public double getPrice();
    
     public void setQuantity(double quantity);

    public double getQuantity();
    
    public void print();

}
