/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes.fertilizer;

import java.io.Serializable;
import java.util.Vector;

/**
 *
 * @author Kasun
 */
public class SetOfFertilizer extends Vector<Fertilizer> implements Serializable {

    private static final long serialVersionUID = 2428035439452881234L;

    SetOfFertilizer fertilizerList;

    /**
     *
     */
    public SetOfFertilizer() {
        super();
    }

    /**
     *
     * @param aFertilizer
     */
    public void addFertilizer(Fertilizer aFertilizer) {
        super.add(aFertilizer);
    }

    /**
     *
     * @param aFertilizer
     * @return
     */
    public boolean removeFertilizer(Fertilizer aFertilizer) {
        return super.remove(aFertilizer);
    }

    //update details
    /**
     *
     * @param fertilizer
     * @param Name
     * @param SensorType
     * @param crops
     * @param description
     * @param minValue
     * @param maxValue
     * @param quantity
     * @return
     */
    public String updatedetails(Fertilizer fertilizer, String Name, String SensorType, String crops, String description, double minValue, double maxValue, int quantity) {
        String status = "";
        try {
            this.elementAt(this.indexOf(fertilizer)).setName(Name);
            this.elementAt(this.indexOf(fertilizer)).setSensorType(SensorType);
            this.elementAt(this.indexOf(fertilizer)).setCrops(crops);
            this.elementAt(this.indexOf(fertilizer)).setDescription(description);
            this.elementAt(this.indexOf(fertilizer)).setMinValue(minValue);
            this.elementAt(this.indexOf(fertilizer)).setMaxValue(maxValue);
            this.elementAt(this.indexOf(fertilizer)).setQuntity(quantity);

            status = "success";
        } catch (Exception ex) {
            status = "fail";
        }
        return status;
    }

    /**
     *
     * @param name
     * @return
     */
    public SetOfFertilizer getFertilizerFromName(String name) {
        fertilizerList = new SetOfFertilizer();

        for (Fertilizer fertilizer : this) {
            if (fertilizer.getName().toLowerCase().contains(name.toLowerCase())) {
                fertilizerList.addFertilizer(fertilizer);

            }
        }
        return fertilizerList;
    }

    /**
     *
     * @param number
     * @return
     */
    public SetOfFertilizer getFertilizerFromNumber(int number) {
        fertilizerList = new SetOfFertilizer();
        for (Fertilizer fertilizer : this) {
            if (fertilizer.getFertilizerNumber() == number) {
                fertilizerList.addFertilizer(fertilizer);

            }
        }

        return fertilizerList;
    }

}
