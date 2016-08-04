/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes.fertilizer;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Kasun
 */
public class Fertilizer implements Serializable {

    private static final long serialVersionUID = -47594027994670654L;

    private static volatile Fertilizer instance;

    private int fertilizerNumber;
    private String name, sensorType, crops, description;
    private int quntity;
    private double minValue, maxValue;

    private static int fertilizerCount = 0;

    private void build(SingletonBuilder builder) {
        this.name = builder.name;
        this.sensorType = builder.sensorType;
        this.crops = builder.crops;
        this.description = builder.description;
        this.quntity = builder.quntity;
        this.minValue = builder.minValue;
        this.maxValue = builder.maxValue;
        fertilizerNumber = ++fertilizerCount;
    }

    //creating singleton object with Double checked locking 
    /**
     *
     * @return
     */
    public static Fertilizer getInstance() {
        if (instance == null) {
            synchronized (Fertilizer.class) {
                if (instance == null) {
                    instance = new Fertilizer();
                }
            }
        }
        return instance;
    }

    /**
     *
     */
    public void print() {
        System.out.println(Integer.toString(fertilizerNumber) + " Name " + name + ",sensorType " + sensorType + ",crops" + crops + ",quntity " + quntity);
    }

    /**
     *
     */
    public static class SingletonBuilder {

        private final String name; // Mandatory
        private final String sensorType;
        private final String crops;
        private final int quntity;
        private final double minValue;
        private final double maxValue;

        private String description = "";// Not Mandatory

        private SingletonBuilder() {
            name = null;
            sensorType = null;
            crops = null;
            quntity = 0;
            minValue = 0.00;
            maxValue = 0.00;
        }

        /**
         *
         * @param Name
         * @param sensorType
         * @param crops
         * @param quntity
         * @param minValue
         * @param maxValue
         */
        public SingletonBuilder(String Name, String sensorType, String crops, int quntity, double minValue, double maxValue) {
            this.name = Name;
            this.sensorType = sensorType;
            this.crops = crops;
            this.quntity = quntity;
            this.minValue = minValue;
            this.maxValue = maxValue;

        }

        /**
         *
         * @param description
         * @return
         */
        public SingletonBuilder description(String description) {
            this.description = description;
            return this;
        }

        /**
         *
         */
        public void build() {
            Fertilizer.getInstance().build(this);
        }

    }

    private Fertilizer() {

    }

    //setting and getting Crops
    /**
     *
     * @return
     */
    public String getCrops() {
        return crops;
    }

    /**
     *
     * @param crops
     */
    public void setCrops(String crops) {
        this.crops = crops;
    }

    //setting and getting quntity
    /**
     *
     * @return
     */
    public int getQuntity() {
        return quntity;
    }

    /**
     *
     * @param quntity
     */
    public void setQuntity(int quntity) {
        this.quntity = quntity;
    }

    //setting and getting minValue
    /**
     *
     * @return
     */
    public double getMinValue() {
        return minValue;
    }

    /**
     *
     * @param minValue
     */
    public void setMinValue(double minValue) {
        this.minValue = minValue;
    }

    //setting getting maxValue
    /**
     *
     * @return
     */
    public double getMaxValue() {
        return maxValue;
    }

    /**
     *
     * @param maxValue
     */
    public void setMaxValue(double maxValue) {
        this.maxValue = maxValue;
    }

    //setting and getting fertilizer
    /**
     *
     * @return
     */
    public int getFertilizerNumber() {
        return fertilizerNumber;
    }

    /**
     *
     * @param fertilizerNumber
     */
    public void setFertilizerNumber(int fertilizerNumber) {
        this.fertilizerNumber = fertilizerNumber;
    }

    //setting getting name
    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    //setting getting sensorType
    /**
     *
     * @return
     */
    public String getSensorType() {
        return sensorType;
    }

    /**
     *
     * @param sensorType
     */
    public void setSensorType(String sensorType) {
        this.sensorType = sensorType;
    }

    //setting getting description
    /**
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return Integer.toString(fertilizerNumber) + " " + name;
    }

    //transient and static fields are write and read
    private void writeObject(ObjectOutputStream oos)
            throws IOException {
        oos.defaultWriteObject();
        oos.writeObject(fertilizerCount);

    }

    private void readObject(ObjectInputStream ois)
            throws ClassNotFoundException, IOException {
        ois.defaultReadObject();
        fertilizerCount = (Integer) ois.readObject();

    }
}
