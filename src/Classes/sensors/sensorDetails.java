/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes.sensors;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Sachi
 */
public class sensorDetails implements Serializable {

    private ISensor behaviour;

    private static final long serialVersionUID = -47594027994670654L;
    public int sensorNumber;
    private static int sensorCount = 0;
    public double SoilMoisture, SoilTemperature, AirTemperature, SoilAcidity, Lights_Sensor;
    private String dateTime, fieldID;

    /**
     *
     */
    public sensorDetails() {

    }

    /**
     *
     */
    public void print() {
        System.out.println(Integer.toString(sensorNumber) + " Name " + dateTime + ",username " + fieldID);
    }

    /**
     *
     * @param dateTime
     * @param fieldID
     * @param SoilMoisture
     * @param SoilTemperature
     * @param AirTemperature
     * @param SoilAcidity
     * @param Lights_Sensor
     */
    public sensorDetails(String dateTime, String fieldID, double SoilMoisture, double SoilTemperature, double AirTemperature, double SoilAcidity, double Lights_Sensor) {
        this.dateTime = dateTime;
        this.SoilMoisture = SoilMoisture;
        this.SoilTemperature = SoilTemperature;
        this.AirTemperature = AirTemperature;
        this.SoilAcidity = SoilAcidity;
        this.Lights_Sensor = Lights_Sensor;
        this.fieldID = fieldID;
        sensorNumber = ++sensorCount;
    }

     //setting and getting dateTime
    /**
     *
     * @return
     */
    public String getDate() {
        return dateTime;
    }

    /**
     *
     * @param dateTime
     */
    public void setDate(String dateTime) {
        this.dateTime = dateTime;
    }

    //setting and getting password
    /**
     *
     * @return
     */
    public String getfieldID() {
        return fieldID;
    }

    /**
     *
     * @param fieldID
     */
    public void setfieldID(String fieldID) {
        this.fieldID = fieldID;
    }

    /**
     *
     * @param behaviour
     */
    public void setBehaviour(ISensor behaviour) {
        this.behaviour = behaviour;
    }

    /**
     *
     * @return
     */
    public ISensor getBehaviour() {
        return behaviour;
    }

    /**
     *
     * @param sensorValue
     * @return
     */
    public String checkSolution(double sensorValue) {
        String fertilizer = behaviour.distributeNutrition(sensorValue);
        return fertilizer;
    }

    @Override
    public String toString() {
        return Integer.toString(sensorNumber);
    }

    //transient and static fields are write and read
    private void writeObject(ObjectOutputStream oos)
            throws IOException {
        oos.defaultWriteObject();
        oos.writeObject(sensorCount);

    }

    private void readObject(ObjectInputStream ois)
            throws ClassNotFoundException, IOException {
        ois.defaultReadObject();
        sensorCount = (Integer) ois.readObject();

    }
}
