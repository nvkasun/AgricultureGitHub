/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes.farm;

import java.io.Serializable;
import java.util.Vector;

/**
 *
 * @author gihan
 */
public class SetOfFarm extends Vector<farms> implements Serializable {

    private static final long serialVersionUID = 2428035439452881234L;

    SetOfFarm farmList;

    /**
     *
     */
    public SetOfFarm() {
        super();
    }

    /**
     * @param afarm
     */
    public void addfarm(farms afarm) {
        super.add(afarm);
    }

    /**
     * @param farm
     * @return boolean
     */
    public boolean removefarm(farms farm) {
        return super.remove(farm);
    }

    /**
     *
     * @param farm
     * @param farmtype
     * @param farmername
     * @param location
     * @param longitude
     * @param latitude
     * @param image
     * @return String
     */
    public String updatedetails(farms farm, String farmtype, String farmername, String location, String longitude, String latitude, byte[] image) {
        String status = "";
        try {
            this.elementAt(this.indexOf(farm)).setfarmtype(farmtype);
            this.elementAt(this.indexOf(farm)).setfarmername(farmername);
            this.elementAt(this.indexOf(farm)).setlocation(location);
            this.elementAt(this.indexOf(farm)).setimage(image);
            this.elementAt(this.indexOf(farm)).setlongitude(longitude);
            this.elementAt(this.indexOf(farm)).setlatitude(latitude);

            status = "success";
        } catch (Exception ex) {
            status = "fail";
        }
        return status;
    }

    /**
     * @param farmername
     * @return
     */
    public SetOfFarm getfarmFromfarmerName(String farmername) {
        farmList = new SetOfFarm();

        for (farms farm : this) {
            if (farm.getfarmername().toLowerCase().contains(farmername.toLowerCase())) {
                farmList.addfarm(farm);

            }
        }
        return farmList;
    }

    /**
     * @param number
     * @return
     */
    public SetOfFarm getfarmFromNumber(int number) {
        farmList = new SetOfFarm();
        for (farms farm : this) {
            if (farm.getfarmNumber() == number) {
                farmList.addfarm(farm);

            }
        }

        return farmList;
    }

}
