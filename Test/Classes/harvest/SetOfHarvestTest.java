/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes.harvest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lakmi
 */
public class SetOfHarvestTest {

    public SetOfHarvestTest() {
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
     * Test of addCrop method, of class SetOfHarvest.
     */
    @Test
    public void testAddCrop() {
        try {
            System.out.println("addCrop");
            HarvestImp aHarvest = null;
            SetOfHarvest instance = new SetOfHarvest();
            boolean expResult = true;
            boolean result = instance.addCrop(aHarvest);
            assertEquals(expResult, result);

            fail("The test case testAddCrop fail.");
        } catch (Throwable expected) {
            assertEquals(AssertionError.class, expected.getClass());
        }

    }

    /**
     * Test of updateCrop method, of class SetOfHarvest.
     */
    @Test
    public void testUpdateCrop() {
        try {
            System.out.println("updateCrop");
            HarvestImp aHarvest = null;
            String Name = "";
            String date = "";
            double qty = 0.0;
            double price = 0.0;
            String feild = "";
            SetOfHarvest instance = new SetOfHarvest();
            String expResult = "";
            String result = instance.updateCrop(aHarvest, Name, date, qty, price, feild);

            assertFalse(expResult.equals(result));

            fail("The test case testUpdateCrop fail.");
        } catch (Throwable expected) {
            assertEquals(AssertionError.class, expected.getClass());
        }
    }

    /**
     * Test of getCropFromID method, of class SetOfHarvest.
     */
    @Test
    public void testGetCropFromID() {
        try {
            System.out.println("getCropFromID");
            int number = 0;
            SetOfHarvest instance = new SetOfHarvest();
            int expResult = 0;
            int result = instance.getCropFromID(number).size();
            assertEquals(expResult, result);

            fail("The test case testGetCropFromID fail.");
        } catch (Throwable expected) {
            assertEquals(AssertionError.class, expected.getClass());
        }
    }

    /**
     * Test of getCropFromName method, of class SetOfHarvest.
     */
    @Test
    public void testGetCropFromName() {
        try {
            System.out.println("getCropFromName");
            String name = "";
            SetOfHarvest instance = new SetOfHarvest();
            int expResult = 0;
            int result = instance.getCropFromName(name).size();
            assertEquals(expResult, result);

            fail("The test case testGetCropFromName fail.");
        } catch (Throwable expected) {
            assertEquals(AssertionError.class, expected.getClass());
        }
    }

    /**
     * Test of removeProduct method, of class SetOfHarvest.
     */
    @Test
    public void testRemoveProduct() {
        try {
            System.out.println("removeProduct");
            HarvestImp crop = null;
            SetOfHarvest instance = new SetOfHarvest();
            boolean expResult = false;
            boolean result = instance.removeProduct(crop);
            assertEquals(expResult, result);

            fail("The test case testRemoveProduct fail.");
        } catch (Throwable expected) {
            assertEquals(AssertionError.class, expected.getClass());
        }
    }

}
