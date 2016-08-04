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
public class FertilizerTest {

    public FertilizerTest() {
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
     * Test of getInstance method, of class Fertilizer.
     */
    @Test
    public void testGetInstance() {
        try {
            System.out.println("getInstance");
            Fertilizer expResult = null;
            Fertilizer result = Fertilizer.getInstance();
            assertTrue(expResult.equals(result));

            fail("The test case testGetInstance fail.");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }

    }

    /**
     * Test of print method, of class Fertilizer.
     */
    @Test
    public void testPrint() {
        try {
            System.out.println("print");
            Fertilizer instance = null;
            instance.print();

            fail("The test case testPrint fail.");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }

    }

    /**
     * Test of getCrops method, of class Fertilizer.
     */
    @Test
    public void testGetCrops() {
        try {
            System.out.println("getCrops");
            Fertilizer instance = null;
            String expResult = "";
            String result = instance.getCrops();
            assertEquals(expResult, result);

            fail("The test case testGetCrops fail.");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }

    }

    /**
     * Test of setCrops method, of class Fertilizer.
     */
    @Test
    public void testSetCrops() {
        try {
            System.out.println("setCrops");
            String crops = "";
            Fertilizer instance = null;
            instance.setCrops(crops);

            fail("The test case testSetCrops fail.");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }

    }

    /**
     * Test of getQuntity method, of class Fertilizer.
     */
    @Test
    public void testGetQuntity() {
        try {
            System.out.println("getQuntity");
            Fertilizer instance = null;
            int expResult = 0;
            int result = instance.getQuntity();
            assertEquals(expResult, result);

            fail("The test case testGetQuntity fail.");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }

    }

    /**
     * Test of setQuntity method, of class Fertilizer.
     */
    @Test
    public void testSetQuntity() {
        try {
            System.out.println("setQuntity");
            int quntity = 0;
            Fertilizer instance = null;
            instance.setQuntity(quntity);

            fail("The test case testSetQuntity fail.");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }

    }

    /**
     * Test of getMinValue method, of class Fertilizer.
     */
    @Test
    public void testGetMinValue() {
        try {
            System.out.println("getMinValue");
            Fertilizer instance = null;
            double expResult = 0.0;
            double result = instance.getMinValue();
            assertEquals(expResult, result, 0.0);

            fail("The test case testGetMinValue fail.");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }

    }

    /**
     * Test of setMinValue method, of class Fertilizer.
     */
    @Test
    public void testSetMinValue() {
        try {
            System.out.println("setMinValue");
            double minValue = 0.0;
            Fertilizer instance = null;
            instance.setMinValue(minValue);

            fail("The test case testSetMinValue fail.");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }

    }

    /**
     * Test of getMaxValue method, of class Fertilizer.
     */
    @Test
    public void testGetMaxValue() {
        try {
            System.out.println("getMaxValue");
            Fertilizer instance = null;
            double expResult = 0.0;
            double result = instance.getMaxValue();
            assertEquals(expResult, result, 0.0);

            fail("The test case testGetMaxValue fail.");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }

    }

    /**
     * Test of setMaxValue method, of class Fertilizer.
     */
    @Test
    public void testSetMaxValue() {
        try {
            System.out.println("setMaxValue");
            double maxValue = 0.0;
            Fertilizer instance = null;
            instance.setMaxValue(maxValue);

            fail("The test case testSetMaxValue fail.");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }

    }

    /**
     * Test of getFertilizerNumber method, of class Fertilizer.
     */
    @Test
    public void testGetFertilizerNumber() {
        try {
            System.out.println("getFertilizerNumber");
            Fertilizer instance = null;
            int expResult = 0;
            int result = instance.getFertilizerNumber();
            assertEquals(expResult, result);

            fail("The test case testGetFertilizerNumber fail.");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }

    }

    /**
     * Test of setFertilizerNumber method, of class Fertilizer.
     */
    @Test
    public void testSetFertilizerNumber() {
        try {
            System.out.println("setFertilizerNumber");
            int fertilizerNumber = 0;
            Fertilizer instance = null;
            instance.setFertilizerNumber(fertilizerNumber);

            fail("The test case testSetFertilizerNumber fail.");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }

    }

    /**
     * Test of getName method, of class Fertilizer.
     */
    @Test
    public void testGetName() {
        try {
            System.out.println("getName");
            Fertilizer instance = null;
            String expResult = "";
            String result = instance.getName();
            assertEquals(expResult, result);

            fail("The test case testGetName fail.");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }

    }

    /**
     * Test of setName method, of class Fertilizer.
     */
    @Test
    public void testSetName() {
        try {
            System.out.println("setName");
            String name = "";
            Fertilizer instance = null;
            instance.setName(name);

            fail("The test case testSetName fail.");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }

    }

    /**
     * Test of getSensorType method, of class Fertilizer.
     */
    @Test
    public void testGetSensorType() {
        try {
            System.out.println("getSensorType");
            Fertilizer instance = null;
            String expResult = "";
            String result = instance.getSensorType();
            assertEquals(expResult, result);

            fail("The test case testGetSensorType fail.");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }

    }

    /**
     * Test of setSensorType method, of class Fertilizer.
     */
    @Test
    public void testSetSensorType() {
        try {
            System.out.println("setSensorType");
            String sensorType = "";
            Fertilizer instance = null;
            instance.setSensorType(sensorType);

            fail("The test case testSetSensorType fail.");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }

    }

    /**
     * Test of getDescription method, of class Fertilizer.
     */
    @Test
    public void testGetDescription() {
        try {
            System.out.println("getDescription");
            Fertilizer instance = null;
            String expResult = "";
            String result = instance.getDescription();
            assertEquals(expResult, result);

            fail("The test case testGetDescription fail.");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }

    }

    /**
     * Test of setDescription method, of class Fertilizer.
     */
    @Test
    public void testSetDescription() {
        try {
            System.out.println("setDescription");
            String description = "";
            Fertilizer instance = null;
            instance.setDescription(description);

            fail("The test case testSetDescription fail.");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }

    }

    /**
     * Test of toString method, of class Fertilizer.
     */
    @Test
    public void testToString() {
        try {
            System.out.println("toString");
            Fertilizer instance = null;
            String expResult = "";
            String result = instance.toString();
            assertEquals(expResult, result);

            fail("The test case testToString fail.");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }

    }

}
