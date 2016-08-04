package Classes.payment;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Lakmi
 */
public class SalesCart implements Serializable {

    private static final long serialVersionUID = -47594027994670654L;
    private static int cartCount = 0;
    private int cartID, productID;
    private double qty, uprice, price;
    private String email, name, date;

    public SalesCart() {
    }

    public SalesCart(String email, int productID, String name, double qty, double uprice, double price, String date) {
        this.email = email;
        this.name = name;
        this.productID = productID;
        this.price = price;
        this.qty = qty;
        this.uprice = uprice;
        this.date = date;
        this.cartID = cartCount++;
    }

    public String getDate() {
        return date;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public int getProductID() {
        return productID;
    }

    public double getuPrice() {
        return uprice;
    }

    public double getPrice() {
        return price;
    }

    public double getCartID() {
        return cartID;
    }

    public double getQuantity() {
        return qty;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public void setuPrice(double uprice) {
        this.uprice = uprice;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCartID(int cartID) {
        this.cartID = cartID;
    }

    public void setQuantity(double qty) {
        this.qty = qty;
    }

    private void writeObject(ObjectOutputStream oos)
            throws IOException {
        oos.defaultWriteObject();
        oos.writeObject(cartCount);

    }

    private void readObject(ObjectInputStream ois)
            throws ClassNotFoundException, IOException {
        ois.defaultReadObject();
        cartCount = (Integer) ois.readObject();

    }
}
