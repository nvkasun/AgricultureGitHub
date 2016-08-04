/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes.sensors;

import Classes.fertilizer.Fertilizer;
import Classes.fertilizer.SetOfFertilizer;
import Classes.serialization.Serialization;
import static UI.fertilizerManagement.theFertilizer;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Sachi
 */
public class Soil_Moisture implements ISensor {

    String Crop;
    public static SetOfFertilizer theFertilizer = new SetOfFertilizer();
    public static SetOfFertilizer searchList = new SetOfFertilizer();

    /**
     *
     * @param Crop
     */
    public Soil_Moisture(String Crop) {
        this.Crop = Crop;
    }

    /**
     *
     * @param sensorValue
     * @return
     */
    @Override
    public String distributeNutrition(double sensorValue) {
        String status = "";

        status = selectFertilizer(Crop, sensorValue);

        if (status == "Use ") {
            status = "Soil Moisture is good for the crop...";
        } else {
            status = status + " to maintain the Soil Moisture...";
        }
        return status;
    }

    /**
     *
     * @param Crop
     * @param sensorValue
     * @return
     */
    public String selectFertilizer(String Crop, double sensorValue) {
        String fertilizers = "Use ";
        try {
            for (Fertilizer fertilizer : Serialization.deserializeFertilizer()) {
                if ((fertilizer.getCrops().toLowerCase().contains(Crop.toLowerCase())) && (fertilizer.getMinValue() < sensorValue)
                        && (fertilizer.getMaxValue() > sensorValue) && (fertilizer.getSensorType().equals("Soil Moisture Sensor"))) {
                    fertilizers = fertilizers + fertilizer.getName() + " or ";
                    System.out.print(fertilizers);
                    //&& 
                    //  
                }
            }

        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        return fertilizers;
    }
}
