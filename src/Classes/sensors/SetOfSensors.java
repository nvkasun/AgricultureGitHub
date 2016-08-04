/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes.sensors;

import java.io.Serializable;
import java.util.Vector;

/**
 *
 * @author Sachi
 */
public class SetOfSensors extends Vector<sensorDetails> implements Serializable {

    private static final long serialVersionUID = 2428035439452881234L;

    SetOfSensors sensorList;

    /**
     *
     */
    public SetOfSensors() {
        super();
    }

    /**
     *
     * @param asensorDetails
     */
    public void addSensorDetails(sensorDetails asensorDetails) {
        super.add(asensorDetails);
    }

    /**
     *
     * @param fieldID
     * @return
     */
    public SetOfSensors getSensorDetailsFromFieldID(int fieldID) {
        sensorList = new SetOfSensors();
        for (sensorDetails asensorDetails : this) {
            if (Integer.parseInt(asensorDetails.getfieldID()) == fieldID) {
                sensorList.addSensorDetails(asensorDetails);
            }
        }

        return sensorList;
    }

}
