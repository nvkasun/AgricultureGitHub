package Classes.Product;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Lakmi
 */
public class ProductStockImp implements Products,Serializable {

    private static final long serialVersionUID = -47594027994670654L;

    private static int stockCount = 0;
    private int stockNo, productID;
    private String date;
    private String state;
    private double qty, price;


    List<productObserver> observerList = new ArrayList<productObserver>();

    public ProductStockImp() {
    }

    public ProductStockImp(int Productid, double qty, double price, String date) {
        this.productID = Productid;
        this.qty = qty;
        this.date = date;
        this.price = price;
        this.state="Yes";
        this.stockNo = ++stockCount;
    }

    @Override
    public void registerObserver(productObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(productObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void setStatus(String status) {
        if(status.equals("Yes"))
        {
        this.state = status;
            notifyObservers();
        }
        else
        {
            notifyObserversRemove();
            System.out.print("edgeg");
    
        }
    }

    @Override
    public void print() {
        System.out.println();
    }

    @Override
    public String toString() {
        return Integer.toString(stockNo) + " " + productID;
    }

    public String getStatus() {
        return this.state;
    }

    public void notifyObservers() {
        Iterator<productObserver> iterator = observerList.iterator();
        while (iterator.hasNext()) {
            productObserver observer = (productObserver) iterator.next();
            observer.update(this);
        }
    }

     public void notifyObserversRemove() {
        Iterator<productObserver> iterator = observerList.iterator();
        while (iterator.hasNext()) {
            productObserver observer = (productObserver) iterator.next();
            observer.reduceQuntity(this);
        }
    }
     
    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public double getQuantity() {
        return qty;
    }

    public String getDate() {
        return date;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void setQuantity(double qty) {
        this.qty = qty;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getStockNo() {
        return stockNo;
    }

    public void setStockNo(int stockNumber) {
        this.stockNo = stockNumber;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int id) {
        this.productID = id;
    }

    private void writeObject(ObjectOutputStream oos)
            throws IOException {
        oos.defaultWriteObject();
        oos.writeObject(stockCount);

    }

    private void readObject(ObjectInputStream ois)
            throws ClassNotFoundException, IOException {
        ois.defaultReadObject();
        stockCount = (Integer) ois.readObject();

    }

}
