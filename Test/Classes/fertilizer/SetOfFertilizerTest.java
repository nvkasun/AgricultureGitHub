/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes.fertilizer;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kasun
 */
public class SetOfFertilizerTest {

    public SetOfFertilizerTest() {
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
     * Test of addFertilizer method, of class SetOfFertilizer.
     */
    @Test
    public void testAddFertilizer() {
        System.out.println("addFertilizer");
        Fertilizer aFertilizer = null;
        SetOfFertilizer instance = new SetOfFertilizer();
        instance.addFertilizer(aFertilizer);

    }

    /**
     * Test of removeFertilizer method, of class SetOfFertilizer.
     */
    @Test
    public void testRemoveFertilizer() {
        System.out.println("removeFertilizer");
        Fertilizer aFertilizer = null;
        SetOfFertilizer instance = new SetOfFertilizer();
        boolean expResult = false;
        boolean result = instance.removeFertilizer(aFertilizer);
        assertEquals(expResult, result);

    }

    /**
     * Test of updatedetails method, of class SetOfFertilizer.
     */
    @Test
    public void testUpdatedetails() {
        System.out.println("updatedetails");
        Fertilizer fertilizer = null;
        String Name = "";
        String SensorType = "";
        String crops = "";
        String description = "";
        double minValue = 0.0;
        double maxValue = 0.0;
        int quantity = 0;
        SetOfFertilizer instance = new SetOfFertilizer();
        String expResult = "fail";
        String result = instance.updatedetails(fertilizer, Name, SensorType, crops, description, minValue, maxValue, quantity);
        assertEquals(expResult, result);

    }

    /**
     * Test of getFertilizerFromName method, of class SetOfFertilizer.
     */
    @Test
    public void testGetFertilizerFromName() {
        System.out.println("getFertilizerFromName");
        String name = "";
        SetOfFertilizer instance = new SetOfFertilizer();
        int expResult = 0;
        int result = instance.getFertilizerFromName(name).size();
        assertEquals(expResult, result);

    }

    /**
     * Test of getFertilizerFromNumber method, of class SetOfFertilizer.
     */
    @Test
    public void testGetFertilizerFromNumber() {
        System.out.println("getFertilizerFromNumber");
        int number = 0;
        SetOfFertilizer instance = new SetOfFertilizer();
        int expResult = 0;
        int result = instance.getFertilizerFromNumber(number).size();
        assertEquals(expResult, result);

    }

}
