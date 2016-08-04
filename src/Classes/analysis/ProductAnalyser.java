/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes.analysis;

import Classes.Product.ProductStockImp;
import Classes.Product.ProductsImp;
import Classes.Product.SetOfProductStock;
import Classes.serialization.Serialization;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gihan
 */
public class ProductAnalyser implements Analiser {

    public static SetOfProductStock theProductStrock = new SetOfProductStock();

    /**
     *
     * @param type
     * @param productID
     * @param startDate
     * @param endDate
     * @return
     */
    @Override
    public String analiseDetails(String type, int productID, Date startDate, Date endDate) {
        Calendar calS = Calendar.getInstance();
        calS.setTime(startDate);
        calS.add(Calendar.DATE, -1);
        Calendar calSE = Calendar.getInstance();
        calSE.setTime(endDate);
        calSE.add(Calendar.DATE, 1);
        startDate = calS.getTime();
        endDate = calSE.getTime();
        theProductStrock.removeAll(theProductStrock);
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");
            Date date;

            for (ProductStockImp stockImp : Serialization.deserializeProductsStock()) {

                date = sdf.parse(stockImp.getDate());
                System.out.println(productID + " " + date + " " + date.before(endDate));

                if ((date.before(endDate) && date.after(startDate))) {
                    if (stockImp.getProductID() == productID) {
                        System.out.println(stockImp.getPrice());
                        theProductStrock.addProductStock(stockImp);
                    }
                }

            }
        } catch (IOException | ClassNotFoundException | ParseException ex) {
            Logger.getLogger(ProductAnalyser.class.getName()).log(Level.SEVERE, null, ex);
        }

        double avgBuyingPrice = 0.00, totBuyingPrice = 0.00;
        String productName = "";
        try {
            for (ProductsImp product : Serialization.deserializeProducts()) {
                if (product.getProductNo() == productID) {
                    productName = product.getName();
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(ProductAnalyser.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (ProductStockImp stockImp : theProductStrock) {
            totBuyingPrice = totBuyingPrice + stockImp.getPrice();
        }
        if (theProductStrock.size() == 0) {
            avgBuyingPrice = 0;
        } else {
            avgBuyingPrice = (totBuyingPrice / theProductStrock.size());
        }

        String details = productID + " " + avgBuyingPrice;

        return details;
    }

}
