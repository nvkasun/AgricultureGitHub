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
public class sensorDetailsTest {

    public sensorDetailsTest() {
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
     * Test of print method, of class sensorDetails.
     */
    @Test
    public void testPrint() {
        System.out.println("print");
        sensorDetails instance = new sensorDetails();
        instance.print();

    }

    /**
     * Test of getDate method, of class sensorDetails.
     */
    @Test
    public void testGetDate() {
        try {
            System.out.println("getDate");
            sensorDetails instance = new sensorDetails();
            String expResult = null;
            String result = instance.getDate();
            assertTrue(expResult.equals(result));

            fail("The test case testGetDate fail");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }

    }

    /**
     * Test of setDate method, of class sensorDetails.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        String dateTime = "";
        sensorDetails instance = new sensorDetails();
        instance.setDate(dateTime);

    }

    /**
     * Test of getfieldID method, of class sensorDetails.
     */
    @Test
    public void testGetfieldID() {
        try {
            System.out.println("getfieldID");
            sensorDetails instance = new sensorDetails();
            String expResult = null;
            String result = instance.getfieldID();
            assertTrue(expResult.equals(result));

            fail("The test case testGetfieldID fail");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }

    }

    /**
     * Test of setfieldID method, of class sensorDetails.
     */
    @Test
    public void testSetfieldID() {
        System.out.println("setfieldID");
        String fieldID = "";
        sensorDetails instance = new sensorDetails();
        instance.setfieldID(fieldID);

    }

    /**
     * Test of setBehaviour method, of class sensorDetails.
     */
    @Test
    public void testSetBehaviour() {
        System.out.println("setBehaviour");
        ISensor behaviour = null;
        sensorDetails instance = new sensorDetails();
        instance.setBehaviour(behaviour);

    }

    /**
     * Test of getBehaviour method, of class sensorDetails.
     */
    @Test
    public void testGetBehaviour() {
        try {
            System.out.println("getBehaviour");
            sensorDetails instance = new sensorDetails();
            ISensor expResult = null;
            ISensor result = instance.getBehaviour();
            assertTrue(expResult.equals(result));

            fail("The test case testGetBehaviour fail");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }

    }

    /**
     * Test of checkSolution method, of class sensorDetails.
     */
    @Test
    public void testCheckSolution() {
        try {
            System.out.println("checkSolution");
            double sensorValue = 0.0;
            sensorDetails instance = new sensorDetails();
            String expResult = "";
            String result = instance.checkSolution(sensorValue);
            assertTrue(expResult.equals(result));

            fail("The test case testCheckSolution fail");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }

    }

    /**
     * Test of toString method, of class sensorDetails.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        sensorDetails instance = new sensorDetails();
        String expResult = "";
        String result = instance.toString();
        assertFalse(expResult.equals(result));

    }

}
