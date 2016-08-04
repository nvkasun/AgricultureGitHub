/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes.sensors;

/**
 *
 * @author Sachi
 */
public class Soil_Acidity implements ISensor {

    /**
     *
     * @param sensorValue
     * @return
     */
    @Override
    public String distributeNutrition(double sensorValue) {
        String status = "";
        if (sensorValue <= 5) {
            status = "Soil acidity is increasing... Control acidity using pulverized limestone to the soil...";

        } else if (sensorValue > 5 && sensorValue < 7) {
            status = "Soil Acidity is good for the crop...";
        } else {
            status = "Soil acidity is decreasing... Auto Watering on with 85% phosphoric and 67% nitric acid...";
        }

        return status;
    }
}
