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
public class Soil_MoistureTest {

    public Soil_MoistureTest() {
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
     * Test of distributeNutrition method, of class Soil_Moisture.
     */
    @Test
    public void testDistributeNutrition() {
        try {
            System.out.println("distributeNutrition");
            double sensorValue = 0.0;
            Soil_Moisture instance = null;
            String expResult = "";
            String result = instance.distributeNutrition(sensorValue);
            assertEquals(expResult, result);

            fail("The test case testDistributeNutrition fail");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }

    }

    /**
     * Test of selectFertilizer method, of class Soil_Moisture.
     */
    @Test
    public void testSelectFertilizer() {
        try {
            System.out.println("selectFertilizer");
            String Crop = "";
            double sensorValue = 0.0;
            Soil_Moisture instance = null;
            String expResult = "";
            String result = instance.selectFertilizer(Crop, sensorValue);
            assertEquals(expResult, result);

            fail("The test case testSelectFertilizer fail");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }

    }

}
