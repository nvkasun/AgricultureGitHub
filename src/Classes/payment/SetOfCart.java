package Classes.payment;

import Classes.Product.ProductsImp;
import Classes.Product.SetOfProducts;
import Classes.serialization.Serialization;
import java.io.IOException;
import java.io.Serializable;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sachi
 */
public class SetOfCart extends Vector<SalesCart> implements Serializable {

    double total = 0;
    private static final long serialVersionUID = 2428035439452881234L;
    private static final String FILE_NAME_Products = "DataFiles/Products.txt";
    SetOfCart cartSet;

    public SetOfCart() {
        super();

    }

    /**
     * add item to the cart
     *
     * @param item
     */
    public void addCart(SalesCart item) {
        super.add(item);
    }

    /**
     *
     * remove items from the cart
     *
     * @param productNo
     * @return
     */
    public boolean removeCart(SalesCart productNo) {
        return super.remove(productNo);
    }

    /**
     * remove all cart at once
     *
     * @param cart
     * @return
     */
    public boolean removeAllCart(SalesCart cart) {
        return super.remove(cart);
    }

    /**
     *
     * get cart from Cartid
     *
     * @param number
     * @return
     */
    public SetOfCart getCartFromID(int number) {

        cartSet = new SetOfCart();
        for (SalesCart cart : this) {
            if (cart.getCartID() == number) {
                cartSet.addCart(cart);
            }
        }
        return cartSet;
    }

    /**
     * get cart from email
     *
     * @param email
     * @return
     */
    public SetOfCart getCartFromEmail(String email) {

        cartSet = new SetOfCart();
        for (SalesCart cart : this) {
            if (cart.getEmail() == email) {
                cartSet.addCart(cart);
            }
        }
        return cartSet;
    }

    /**
     * get item from productID
     *
     * @param productId
     * @return
     */
    public SetOfCart getCartFromProductID(int productId) {

        cartSet = new SetOfCart();
        for (SalesCart cart : this) {
            if (cart.getProductID() == productId) {
                cartSet.addCart(cart);
            }
        }
        return cartSet;
    }

    /**
     * calculate sub total for product in the cart
     *
     * @param cartSet
     * @return
     */
    public double calculateTotal(SetOfCart cartSet) {
        double tot = 0;
        for (SalesCart item : cartSet) {
            tot += item.getPrice();
        }

        return tot;

    }

    /**
     *
     * calculate shipping charges for product its is 2% from sub total if sub
     * total more than 10000 then 5%
     *
     * @param sub
     * @return
     */
    public double shippingCharge(double sub) {
        double ship = 0;

        if (sub > 10000) {
            ship = sub * 0.05;
        } else {
            ship = sub * 0.02;
        }

        return ship;
    }

    /**
     * update product quantity when remove from cart
     *
     * @param product
     * @param qty
     */
    public void updateProductqty(ProductsImp product, double qty) {
        SetOfProducts productSet = new SetOfProducts();

        try {
            for (ProductsImp productImp : Serialization.deserializeProducts()) {

                productSet.add(productImp);

            }
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(SetOfCart.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (ProductsImp productImp : productSet) {
            if (productImp.getProductNo() == product.getProductNo()) {
                double oldqty = productImp.getQuantity();
                productImp.setQuantity(oldqty + qty);
                productImp.setAvalability("Yes");
                System.out.print(qty);
                try {
                    Serialization.Serialize(productSet, FILE_NAME_Products);
                } catch (IOException ex) {
                    Logger.getLogger(SetOfCart.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            }

        }

    }

    /**
     * call stategy class and do payment
     *
     * @param method
     * @param amount
     */
    public void pay(paymentStrategy method, double amount) {

        method.pay(total);
    }
}
