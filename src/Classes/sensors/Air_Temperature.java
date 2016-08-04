package Classes.sensors;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Sachi
 */
public class Air_Temperature implements ISensor {

    /**
     *
     * @param sensorValue
     * @return
     */
    @Override
    public String distributeNutrition(double sensorValue) {
        String status = "";
        if (sensorValue < 23) {
            status = "Air Temperature is decreasing... Please switch on heating pipes to control Air Temperature...";

        } else if (sensorValue >= 23 && sensorValue < 30) {
            status = "Air Temperature is good for the crop...Switch off the heating pipes";
        } else {
            status = "Air Temperature is increasing... Auto Watering on to control Air Temperature...";
        }

        return status;
    }
}
