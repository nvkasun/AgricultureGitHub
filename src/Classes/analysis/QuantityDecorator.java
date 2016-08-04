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

/**
 *
 * @author gihan
 */
public class QuantityDecorator extends AnalysisDecorator {

    private final Analiser specialAnaliser;
    public static SetOfHarvest theHarvest = new SetOfHarvest();
    private SetOfCart cartSet = new SetOfCart();

    /**
     *
     * @param specialAnaliser
     */
    public QuantityDecorator(Analiser specialAnaliser) {
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

            double total = 0.0, totalByField = 0.0, perscentage = 0.0;

            for (HarvestImp aHarvest : theHarvest) {
                if (Integer.parseInt(aHarvest.getCropfeild()) == fieldID) {
                    totalByField = totalByField + aHarvest.getQuantity();
                }

                total = total + aHarvest.getQuantity();
            }

            if (!(total == 0)) {
                perscentage = (totalByField / total) * 100;
            } else {
                perscentage = 0;
            }

            return specialAnaliser.analiseDetails(type, fieldID, startDate, endDate) + "Quntity" + total + " " + totalByField + " " + perscentage + "%";
        } else {

            double total = 0.0, totalByProduct = 0.0, perscentage = 0.0;

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

            for (SalesCart cart : cartSet) {
                if (cart.getProductID() == fieldID) {
                    totalByProduct = totalByProduct + cart.getQuantity();
                }
                total = total + cart.getQuantity();
            }
            if (total == 0) {
                perscentage = 0;
            } else {
                perscentage = totalByProduct / total;
            }
            return specialAnaliser.analiseDetails(type, fieldID, startDate, endDate) + "Quntity" + total + " " + totalByProduct + " " + perscentage + "%";
        }
    }
}
