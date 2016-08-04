/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes.sensors;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sachi
 */
public class SetOfSensorsTest {

    public SetOfSensorsTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of addSensorDetails method, of class SetOfSensors.
     */
    @Test
    public void testAddSensorDetails() {
        System.out.println("addSensorDetails");
        sensorDetails asensorDetails = null;
        SetOfSensors instance = new SetOfSensors();
        instance.addSensorDetails(asensorDetails);

    }

    /**
     * Test of getSensorDetailsFromFieldID method, of class SetOfSensors.
     */
    @Test
    public void testGetSensorDetailsFromFieldID() {
        System.out.println("getSensorDetailsFromFieldID");
        int fieldID = 0;
        SetOfSensors instance = new SetOfSensors();
        int expResult = 0;
        int result = instance.getSensorDetailsFromFieldID(fieldID).size();
        assertEquals(expResult, result);

    }

}
