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
public class Soil_Temperature implements ISensor {

    /**
     *
     * @param sensorValue
     * @return
     */
    @Override
    public String distributeNutrition(double sensorValue) {
        String status = "";
        if (sensorValue < 21) {
            status = "Soil Temperature is decreasing... Please switch on heating pipes to control Soil Temperature...";

        } else if (sensorValue >= 21 && sensorValue < 25) {
            status = "Soil Temperature is good for the crop...Switch off the heating pipes";
        } else {
            status = "Soil Temperature is increasing... Auto Watering on to control Soil Temperature...";
        }

        return status;
    }
}
