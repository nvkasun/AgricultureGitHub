/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes.analysis;

import Classes.sensors.SetOfSensors;
import Classes.sensors.sensorDetails;
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
public class CropAnalyser implements Analiser {

    public static SetOfSensors theSensors = new SetOfSensors();

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
        try {
            theSensors.removeAll(theSensors);
            SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");
            Date date;
            for (sensorDetails asensorDetails : Serialization.deserializeSensors()) {

                if (Integer.parseInt(asensorDetails.getfieldID()) == fieldID) {
                    date = sdf.parse(asensorDetails.getDate());
                    System.out.print(date);
                    if (date.before(endDate) && date.after(startDate)) {
                        theSensors.addSensorDetails(asensorDetails);
                    }
                }
            }
        } catch (IOException | ClassNotFoundException | ParseException ex) {
            Logger.getLogger(CropAnalyser.class.getName()).log(Level.SEVERE, null, ex);
        }

        double avgAirTemperature = 0.00, avgLights_Sensor = 0.00, avgSoilAcidity = 0.00, avgSoilMoisture = 0.00, avgSoilTemperature = 0.00;
        double totAirTemperature = 0.00, totLights_Sensor = 0.00, totSoilAcidity = 0.00, totSoilMoisture = 0.00, totSoilTemperature = 0.00;
        String value = "";
        for (sensorDetails asensorDetails : theSensors) {
            value = value + asensorDetails.AirTemperature + " " + asensorDetails.Lights_Sensor + " " + asensorDetails.SoilAcidity + " " + asensorDetails.SoilMoisture + " " + asensorDetails.SoilTemperature + "-";

        }

        if (value.isEmpty()) {
            avgAirTemperature = 0.00;
            avgLights_Sensor = 0.00;
            avgSoilAcidity = 0.00;
            avgSoilMoisture = 0.00;
            avgSoilTemperature = 0.00;
        } else {
            String[] parts = value.split("-");
            double[] AirTemperature = new double[parts.length];
            double[] Lights_Sensor = new double[parts.length];
            double[] SoilAcidity = new double[parts.length];
            double[] SoilMoisture = new double[parts.length];
            double[] SoilTemperature = new double[parts.length];

            for (int j = 0; j < parts.length; j++) {
                String[] count = parts[j].split(" ");
                AirTemperature[j] = Double.parseDouble(count[0]);
                Lights_Sensor[j] = Double.parseDouble(count[1]);
                SoilAcidity[j] = Double.parseDouble(count[2]);
                SoilMoisture[j] = Double.parseDouble(count[3]);
                SoilTemperature[j] = Double.parseDouble(count[4]);
            }

            for (int i = 0; i < (parts.length); i++) {
                totAirTemperature = totAirTemperature + AirTemperature[i];
                totLights_Sensor = totLights_Sensor + Lights_Sensor[i];
                totSoilAcidity = totSoilAcidity + SoilAcidity[i];
                totSoilMoisture = totSoilMoisture + SoilMoisture[i];
                totSoilTemperature = totSoilTemperature + SoilTemperature[i];
            }
            avgAirTemperature = (totAirTemperature / (parts.length));
            avgLights_Sensor = (totLights_Sensor / (parts.length));
            avgSoilAcidity = (totSoilAcidity / (parts.length));
            avgSoilMoisture = (totSoilMoisture / (parts.length));
            avgSoilTemperature = (totSoilTemperature / (parts.length));

        }
        return avgAirTemperature + " " + avgLights_Sensor + " " + avgSoilAcidity + " " + avgSoilMoisture + " " + avgSoilTemperature;
    }

}
