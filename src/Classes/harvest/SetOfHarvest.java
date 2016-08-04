/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes.harvest;

import java.io.Serializable;
import java.util.Date;
import java.util.Vector;

/**
 *
 * @author Sachi
 */
public class SetOfHarvest extends Vector<HarvestImp> implements Serializable {
   private static final long serialVersionUID = 2428035439452881234L;
   SetOfHarvest cropSet ;
    
   public SetOfHarvest(){
  super();
   }
   
   public boolean addCrop(HarvestImp aHarvest) {
        return super.add(aHarvest);
    }
   
   public String updateCrop(HarvestImp aHarvest, String Name, String date,double qty, double price,String feild ) {
        String status = "";
        try {

            this.elementAt(this.indexOf(aHarvest)).setName(Name);
            this.elementAt(this.indexOf(aHarvest)).setDate(date);
            this.elementAt(this.indexOf(aHarvest)).setBuyingPrice(price);
            this.elementAt(this.indexOf(aHarvest)).setCropFeild(feild);
            this.elementAt(this.indexOf(aHarvest)).setQuantity(qty);

            status = "success";
        } catch (Exception ex) {
            status = "fail";
        }
        return status;
    }
public SetOfHarvest getCropFromID(int number) {

        cropSet = new SetOfHarvest();
        for (HarvestImp crop : this) {
            if (crop.getharvestID() == number) {
                cropSet.addCrop(crop);

            }
        }
        return cropSet;
    }

public SetOfHarvest getCropFromName(String name) {
        
        
        cropSet = new SetOfHarvest();
        for (HarvestImp crop : this) {
            if (crop.getName().toLowerCase().contains(name.toLowerCase())) {
                cropSet.addCrop(crop);

            }
        }
        return cropSet;
    }

public boolean removeProduct(HarvestImp crop) {
        return super.remove(crop);
    }
}

