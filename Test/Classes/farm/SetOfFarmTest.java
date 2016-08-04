/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes.farm;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gihan
 */
public class SetOfFarmTest {

    public SetOfFarmTest() {
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
     * Test of addfarm method, of class SetOfFarm.
     */
    @Test
    public void testAddfarm() {
        System.out.println("addfarm");
        farms afarm = null;
        SetOfFarm instance = new SetOfFarm();
        instance.addfarm(afarm);

    }

    /**
     * Test of removefarm method, of class SetOfFarm.
     */
    @Test
    public void testRemovefarm() {
        System.out.println("removefarm");
        farms farm = null;
        SetOfFarm instance = new SetOfFarm();
        boolean expResult = false;
        boolean result = instance.removefarm(farm);
        assertEquals(expResult, result);

    }

    /**
     * Test of updatedetails method, of class SetOfFarm.
     */
    @Test
    public void testUpdatedetails() {
        System.out.println("updatedetails");
        farms farm = null;
        String farmtype = "";
        String farmername = "";
        String location = "";
        String longitude = "";
        String latitude = "";
        byte[] image = null;
        SetOfFarm instance = new SetOfFarm();
        String expResult = "";
        String result = instance.updatedetails(farm, farmtype, farmername, location, longitude, latitude, image);
        assertFalse(expResult.equals(result));

    }

    /**
     * Test of getfarmFromfarmerName method, of class SetOfFarm.
     */
    @Test
    public void testGetfarmFromfarmerName() {
        System.out.println("getfarmFromfarmerName");
        String farmername = "";
        SetOfFarm instance = new SetOfFarm();
        int expResult = 0;
        int result = instance.getfarmFromfarmerName(farmername).size();
        assertEquals(expResult, result);

    }

    /**
     * Test of getfarmFromNumber method, of class SetOfFarm.
     */
    @Test
    public void testGetfarmFromNumber() {
        System.out.println("getfarmFromNumber");
        int number = 0;
        SetOfFarm instance = new SetOfFarm();
        int expResult = 0;
        int result = instance.getfarmFromNumber(number).size();
        assertEquals(expResult, result);

    }

}
