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
public class Soil_AcidityTest {

    public Soil_AcidityTest() {
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
     * Test of distributeNutrition method, of class Soil_Acidity.
     */
    @Test
    public void testDistributeNutrition() {
        System.out.println("distributeNutrition");
        double sensorValue = 0.0;
        Soil_Acidity instance = new Soil_Acidity();
        String expResult = "";
        String result = instance.distributeNutrition(sensorValue);
        assertFalse(expResult.equals(result));

    }

}
