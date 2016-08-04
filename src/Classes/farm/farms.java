/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes.farm;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author gihan
 */
public class farms implements Serializable {

    private static final long serialVersionUID = -47594027994670654L;

    private static volatile farms instance;

    private int farmNumber;
    private String cmb_farmtype, txt_farmername, txt_fieldid, txt_location, txt_longitude, txt_latitude;
    private byte[] image;
    private double minTemp, maxTemp, saturationVapourPressure;

    private static int farmCount = 0;

    private void build(SingletonBuilder builder) {
        this.cmb_farmtype = builder.cmb_farmtype;
        this.txt_farmername = builder.txt_farmername;
        this.txt_location = builder.txt_location;
        this.txt_longitude = builder.txt_longitude;
        this.txt_latitude = builder.txt_latitude;
        this.image = builder.image;
        this.minTemp = builder.minTemp;
        this.maxTemp = builder.maxTemp;
        this.saturationVapourPressure = builder.saturationVapourPressure;
        farmNumber = ++farmCount;
    }

    /**
     * @return
     */
    public static farms getInstance() {
        if (instance == null) {
            synchronized (farms.class) {
                if (instance == null) {
                    instance = new farms();
                }
            }
        }
        return instance;
    }

    /**
     *
     */
    public void print() {
        System.out.println(Integer.toString(farmNumber) + " Farm Type " + cmb_farmtype + " Farmer Name " + txt_farmername + ",Location " + txt_location + ",Longitude " + txt_longitude + ",Latitude " + txt_latitude + ", Image " + image+", Pressure"+saturationVapourPressure);
    }

    /**
     *
     */
    public static class SingletonBuilder {

        private final String cmb_farmtype; // Mandatory
        private final String txt_farmername;
        private final String txt_location;
        private final String txt_longitude;
        private final String txt_latitude;
        private final double minTemp;
        private final double maxTemp;
        private final double saturationVapourPressure;

        private byte[] image;

        private SingletonBuilder() {
            cmb_farmtype = null;
            txt_farmername = null;
            txt_location = null;
            txt_longitude = null;
            txt_latitude = null;
            minTemp = 0.0;
            maxTemp = 0.0;
            saturationVapourPressure = 0.0;

        }

        /**
         *
         * @param farmtype
         * @param farmername
         * @param location
         * @param longitude
         * @param latitude
         */
        public SingletonBuilder(String farmtype, String farmername, String location, String longitude, String latitude) {
            this.cmb_farmtype = farmtype;
            this.txt_farmername = farmername;
            this.txt_location = location;
            this.txt_longitude = longitude;
            this.txt_latitude = latitude;
            minTemp = 0.0;
            maxTemp = 0.0;
            saturationVapourPressure = 0.0;
        }

        /**
         *
         * @param image
         * @return
         */
        public farms.SingletonBuilder image(byte[] image) {
            this.image = image;
            return this;
        }

        /**
         *
         */
        public void build() {
            farms.getInstance().build(this);
        }

    }

    farms() {

    }

    /**
     *
     * @return
     */
    public String getfarmtype() {
        return cmb_farmtype;
    }

    /**
     *
     * @param farmtype
     */
    public void setfarmtype(String farmtype) {
        this.cmb_farmtype = farmtype;
    }

    /**
     *
     * getting farmername
     *
     * @return
     */
    public String getfarmername() {
        return txt_farmername;
    }

    /**
     *
     * setting farmername
     *
     * @param farmername
     */
    public void setfarmername(String farmername) {
        this.txt_farmername = farmername;
    }

    //setting and getting farm farmNumber
    /**
     *
     * @return
     */
    public int getfarmNumber() {
        return farmNumber;
    }

    /**
     *
     * @param farmNumber
     */
    public void setfarmNumber(int farmNumber) {
        this.farmNumber = farmNumber;
    }

    /**
     *
     * @return
     */
    public byte[] getimage() {
        return image;
    }

    /**
     *
     * @param image
     */
    public void setimage(byte[] image) {
        this.image = image;
    }

    //setting getting location
    /**
     *
     * @return
     */
    public String getlocation() {
        return txt_location;
    }

    /**
     *
     * @param location
     */
    public void setlocation(String location) {
        this.txt_location = location;
    }

    //setting getting firsstname
    /**
     *
     * @return
     */
    public String getlongitude() {
        return txt_longitude;
    }

    /**
     *
     * @param longitude
     */
    public void setlongitude(String longitude) {
        this.txt_longitude = longitude;
    }

    //setting getting latitude
    /**
     *
     * @return
     */
    public String getlatitude() {
        return txt_latitude;
    }
    
    /**
     *
     * @return
     */
    public double getSaturationVapourPressure()
    {
        return saturationVapourPressure;
    }
    
    /**
     *
     * @param saturationVapourPressure
     */
    public void setSaturationVapourPressure(double saturationVapourPressure)
    {
        this.saturationVapourPressure=saturationVapourPressure;
    }

    /**
     *
     * @param minTemp
     */
    public void setMinTemp(double minTemp) {
        this.minTemp = minTemp;
    }

    /**
     *
     * @return
     */
    public double getMinTemp() {
        return minTemp;
    }

    /**
     *
     * @param maxTemp
     */
    public void setMaxTemp(double maxTemp) {
        this.maxTemp = maxTemp;
    }

    /**
     *
     * @return
     */
    public double getMaxTemp() {
        return maxTemp;
    }

    /**
     *
     * @param latitude
     */
    public void setlatitude(String latitude) {
        this.txt_latitude = latitude;
    }

    @Override
    public String toString() {
        return Integer.toString(farmNumber);
    }

    //transient and static fields are write and read
    private void writeObject(ObjectOutputStream oos)
            throws IOException {
        oos.defaultWriteObject();
        oos.writeObject(farmCount);

    }

    private void readObject(ObjectInputStream ois)
            throws ClassNotFoundException, IOException {
        ois.defaultReadObject();
        farmCount = (Integer) ois.readObject();

    }

}
