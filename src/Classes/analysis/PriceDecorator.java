/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes.analysis;

import Classes.harvest.HarvestImp;
import Classes.harvest.SetOfHarvest;
import Classes.payment.SalesCart;
import Classes.payment.SetOfCart;
import Classes.serialization.Serialization;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdesktop.swingx.calendar.DateUtils;

/**
 *
 * @author gihan
 */
public class PriceDecorator extends AnalysisDecorator {

    private final Analiser specialAnaliser;
    private static SetOfHarvest theHarvest = new SetOfHarvest();
    private SetOfCart cartSet = new SetOfCart();

    /**
     *
     * @param specialAnaliser
     */
    public PriceDecorator(Analiser specialAnaliser) {
        this.specialAnaliser = specialAnaliser;
    }

    /**
     *
     * @param type
     * @param fieldID
     * @param startDate
     * @param endDate
     * @return
     */
    @Override
    public String analiseDetails(String type, int fieldID, Date startDate, Date endDate) {
        Calendar calS = Calendar.getInstance();
        calS.setTime(startDate);
        calS.add(Calendar.DATE, -1);
        Calendar calSE = Calendar.getInstance();
        calSE.setTime(endDate);
        calSE.add(Calendar.DATE, 1);
        startDate = calS.getTime();
        endDate = calSE.getTime();
        if (type.equals("crop")) {
            try {
                theHarvest.removeAll(theHarvest);
                SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");
                Date date;
                for (HarvestImp aHarvest : Serialization.deserializeHarvest()) {

                    date = sdf.parse(aHarvest.getDate());
                    if (date.before(endDate) && date.after(startDate)) {
                        theHarvest.addCrop(aHarvest);
                    }

                }
            } catch (IOException | ClassNotFoundException | ParseException ex) {
                Logger.getLogger(CropAnalyser.class.getName()).log(Level.SEVERE, null, ex);
            }

            double totalByField = 0.0, avgTotal = 0.0, avgField = 0.0, profit = 0.0, perscentage = 0.0;
            int fullCount = 0, initial = 0;
            for (HarvestImp aHarvest : theHarvest) {
                ++fullCount;
                if (Integer.parseInt(aHarvest.getCropfeild()) == fieldID) {
                    ++initial;
                    totalByField = totalByField + aHarvest.getBuyingPrice();
                }

                profit = profit + aHarvest.getBuyingPrice();
            }

            if (!(fullCount == 0)) {
                avgTotal = (profit / fullCount);
            } else {
                avgTotal = 0;
            }

            if (!(initial == 0)) {
                avgField = (totalByField / initial);
            } else {
                avgField = 0;
            }

            if (!(avgTotal == 0)) {
                perscentage = (avgField / avgTotal) * 100;
            } else {
                perscentage = 0;
            }

            return specialAnaliser.analiseDetails(type, fieldID, startDate, endDate) + "price" + avgTotal + " " + avgField + " " + perscentage + "%";
        } else {
            double avgSellinPrice = 0.0, totalSellingPrice = 0.0;

            try {
                cartSet.removeAll(cartSet);
                SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");
                Date date;
                for (SalesCart cart : Serialization.deserializeCart()) {

                    date = sdf.parse(cart.getDate());

                    if ((date.after(startDate)) && (date.before(endDate))) {
                        cartSet.addCart(cart);
                    }
                }
            } catch (IOException | ClassNotFoundException | ParseException ex) {
                Logger.getLogger(CropAnalyser.class.getName()).log(Level.SEVERE, null, ex);
            }

            int count = 0;
            for (SalesCart cart : cartSet) {
                if (cart.getProductID() == fieldID) {
                    ++count;
                    totalSellingPrice = totalSellingPrice + cart.getuPrice();
                }
            }
            if (count == 0) {
                avgSellinPrice = 0;
            } else {
                avgSellinPrice = totalSellingPrice / count;
            }

            return specialAnaliser.analiseDetails(type, fieldID, startDate, endDate) + "price" + avgSellinPrice;
        }
    }
}
