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
public class HarvestImpTest {

    public HarvestImpTest() {
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
     * Test of getName method, of class HarvestImp.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        HarvestImp instance = new HarvestImp();
        String expResult = null;
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getQuantity method, of class HarvestImp.
     */
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        HarvestImp instance = new HarvestImp();
        double expResult = 0.0;
        double result = instance.getQuantity();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getCropfeild method, of class HarvestImp.
     */
    @Test
    public void testGetCropfeild() {
        System.out.println("getCropfeild");
        HarvestImp instance = new HarvestImp();
        String expResult = null;
        String result = instance.getCropfeild();
        assertEquals(expResult, result);
    }

    /**
     * Test of getBuyingPrice method, of class HarvestImp.
     */
    @Test
    public void testGetBuyingPrice() {
        System.out.println("getBuyingPrice");
        HarvestImp instance = new HarvestImp();
        double expResult = 0.0;
        double result = instance.getBuyingPrice();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getDate method, of class HarvestImp.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        HarvestImp instance = new HarvestImp();
        String expResult = null;
        String result = instance.getDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class HarvestImp.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        HarvestImp instance = new HarvestImp();
        instance.setName(name);
    }

    /**
     * Test of setQuantity method, of class HarvestImp.
     */
    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        double qty = 0.0;
        HarvestImp instance = new HarvestImp();
        instance.setQuantity(qty);
    }

    /**
     * Test of setCropFeild method, of class HarvestImp.
     */
    @Test
    public void testSetCropFeild() {
        System.out.println("setCropFeild");
        String feild = "";
        HarvestImp instance = new HarvestImp();
        instance.setCropFeild(feild);
    }

    /**
     * Test of setBuyingPrice method, of class HarvestImp.
     */
    @Test
    public void testSetBuyingPrice() {
        System.out.println("setBuyingPrice");
        double price = 0.0;
        HarvestImp instance = new HarvestImp();
        instance.setBuyingPrice(price);
    }

    /**
     * Test of setDate method, of class HarvestImp.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        String date = "";
        HarvestImp instance = new HarvestImp();
        instance.setDate(date);
    }

    /**
     * Test of getharvestID method, of class HarvestImp.
     */
    @Test
    public void testGetharvestID() {
        System.out.println("getharvestID");
        HarvestImp instance = new HarvestImp();
        int expResult = 0;
        int result = instance.getharvestID();
        assertEquals(expResult, result);
    }

    /**
     * Test of setHarvestID method, of class HarvestImp.
     */
    @Test
    public void testSetHarvestID() {
        System.out.println("setHarvestID");
        int id = 0;
        HarvestImp instance = new HarvestImp();
        instance.setHarvestID(id);
    }

    /**
     * Test of getStatus method, of class HarvestImp.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        HarvestImp instance = new HarvestImp();
        String expResult = null;
        String result = instance.getStatus();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class HarvestImp.
     */
    @Test
    public void testToString() {
        try {
            System.out.println("toString");
            HarvestImp instance = new HarvestImp();
            String expResult = "0 null";
            String result = instance.toString();

            assertFalse(expResult.equals(result));
        } catch (Throwable expected) {
            assertEquals(AssertionError.class, expected.getClass());
        }
    }

}
