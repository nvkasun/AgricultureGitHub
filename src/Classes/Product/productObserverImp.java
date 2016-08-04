package Classes.Product;

import Classes.serialization.Serialization;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lakmi
 */
public class productObserverImp implements productObserver {

    private int productID;
    private String state;
    private double quantity, price;

    private static final String FILE_NAME_Products = "DataFiles/Products.txt";
    private SetOfProducts productSet = new SetOfProducts();

    public productObserverImp(int productID) {
        this.productID = productID;
    }

    /**
     *
     * when add product to stock update the product quantity and price
     * @param product
     */
    @Override
    public void update(Products product) {
        this.state = product.getStatus();
        this.quantity = product.getQuantity();
        this.price = product.getPrice();

        try {
            for (ProductsImp productImp : Serialization.deserializeProducts()) {

                productSet.add(productImp);

            }

        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(productObserverImp.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (ProductsImp productImp : productSet) {
            if (productImp.getProductNo() == productID) {
                productImp.setAvalability("Yes");
                productImp.setPrice(price);
                double oldQuantity = productImp.getQuantity();
                productImp.setQuantity((oldQuantity + quantity));

                try {
                    Serialization.Serialize(productSet, FILE_NAME_Products);
                    for (ProductsImp productUp : Serialization.deserializeProducts()) {
                        System.out
                                .println("Observer recieved state change of subject ID is = "
                                        + productUp.getProductNo() + " Availability = " + productUp.getStatus() + " Price = " + productUp.getPrice() + " Quantity = " + productUp.getQuantity());

                    }
                } catch (IOException | ClassNotFoundException ex) {
                    Logger.getLogger(productObserverImp.class.getName()).log(Level.SEVERE, null, ex);
                }

                break;
            }

        }

    }

    @Override
    public void reduceQuntity(Products product) {
       this.state = product.getStatus();
        this.quantity = product.getQuantity();
        

        try {
            for (ProductsImp productImp : Serialization.deserializeProducts()) {

                productSet.add(productImp);

            }

        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(productObserverImp.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (ProductsImp productImp : productSet) {
            if (productImp.getProductNo() == productID) {
                System.out.println(productImp.getProductNo() == productID);
                String availability;
                double oldQuantity = productImp.getQuantity();
                double newQuantity=oldQuantity - quantity;
                System.out.println(oldQuantity+"New : "+newQuantity);
                if(newQuantity<=0)
                {
                    availability="No";
                    newQuantity=0;
                }
                else
                {
                    availability="Yes";
                }
                
                productImp.setAvalability(availability);
                productImp.setQuantity(newQuantity);

                try {
                    Serialization.Serialize(productSet, FILE_NAME_Products);
                    for (ProductsImp productUp : Serialization.deserializeProducts()) {
                        System.out
                                .println("Observer recieved state change of subject ID is = "
                                        + productUp.getProductNo() + " Availability = " + productUp.getAvalability()+ " Price = " + productUp.getPrice() + " Quantity = " + productUp.getQuantity());

                    }
                } catch (IOException | ClassNotFoundException ex) {
                    Logger.getLogger(productObserverImp.class.getName()).log(Level.SEVERE, null, ex);
                }

                break;
            }

        }

    }

}
