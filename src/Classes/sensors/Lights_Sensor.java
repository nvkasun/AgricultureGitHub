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
public class Lights_Sensor implements ISensor {

    /**
     *
     * @param sensorValue
     * @return
     */
    @Override
    public String distributeNutrition(double sensorValue) {
        String status = "";
        if (sensorValue <= 120) {
            status = "Light level is decreasing....Please supply artificial lighting...";

        } else if (sensorValue > 120 && sensorValue < 200) {
            status = "Light level is good for the crop...";
        } else {
            status = "Light level is increasing....Please control the level of lighting...";
        }

        return status;
    }
}
