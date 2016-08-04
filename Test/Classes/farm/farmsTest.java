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
public class farmsTest {

    public farmsTest() {
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
     * Test of getInstance method, of class farms.
     */
    @Test
    public void testGetInstance() {
        try {
            System.out.println("getInstance");
            farms expResult = null;
            farms result = farms.getInstance();
            assertTrue(expResult.equals(result));

            fail("The test case testGetInstance fail.");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }

    }

    /**
     * Test of print method, of class farms.
     */
    @Test
    public void testPrint() {
        System.out.println("print");
        farms instance = new farms();
        instance.print();

    }

    /**
     * Test of getfarmtype method, of class farms.
     */
    @Test
    public void testGetfarmtype() {
        System.out.println("getfarmtype");
        farms instance = new farms();
        String expResult = null;
        String result = instance.getfarmtype();
        assertEquals(expResult, result);

    }

    /**
     * Test of setfarmtype method, of class farms.
     */
    @Test
    public void testSetfarmtype() {
        System.out.println("setfarmtype");
        String farmtype = "";
        farms instance = new farms();
        instance.setfarmtype(farmtype);

    }

    /**
     * Test of getfarmername method, of class farms.
     */
    @Test
    public void testGetfarmername() {
        System.out.println("getfarmername");
        farms instance = new farms();
        String expResult = null;
        String result = instance.getfarmername();
        assertEquals(expResult, result);

    }

    /**
     * Test of setfarmername method, of class farms.
     */
    @Test
    public void testSetfarmername() {
        System.out.println("setfarmername");
        String farmername = "";
        farms instance = new farms();
        instance.setfarmername(farmername);

    }

    /**
     * Test of getfarmNumber method, of class farms.
     */
    @Test
    public void testGetfarmNumber() {
        System.out.println("getfarmNumber");
        farms instance = new farms();
        int expResult = 0;
        int result = instance.getfarmNumber();
        assertEquals(expResult, result);

    }

    /**
     * Test of setfarmNumber method, of class farms.
     */
    @Test
    public void testSetfarmNumber() {
        System.out.println("setfarmNumber");
        int farmNumber = 0;
        farms instance = new farms();
        instance.setfarmNumber(farmNumber);

    }

    /**
     * Test of getimage method, of class farms.
     */
    @Test
    public void testGetimage() {
        System.out.println("getimage");
        farms instance = new farms();
        byte[] expResult = null;
        byte[] result = instance.getimage();
        assertArrayEquals(expResult, result);

    }

    /**
     * Test of setimage method, of class farms.
     */
    @Test
    public void testSetimage() {
        System.out.println("setimage");
        byte[] image = null;
        farms instance = new farms();
        instance.setimage(image);

    }

    /**
     * Test of getlocation method, of class farms.
     */
    @Test
    public void testGetlocation() {
        System.out.println("getlocation");
        farms instance = new farms();
        String expResult = null;
        String result = instance.getlocation();
        assertEquals(expResult, result);

    }

    /**
     * Test of setlocation method, of class farms.
     */
    @Test
    public void testSetlocation() {
        System.out.println("setlocation");
        String location = "";
        farms instance = new farms();
        instance.setlocation(location);

    }

    /**
     * Test of getlongitude method, of class farms.
     */
    @Test
    public void testGetlongitude() {
        System.out.println("getlongitude");
        farms instance = new farms();
        String expResult = null;
        String result = instance.getlongitude();
        assertEquals(expResult, result);

    }

    /**
     * Test of setlongitude method, of class farms.
     */
    @Test
    public void testSetlongitude() {
        System.out.println("setlongitude");
        String longitude = "";
        farms instance = new farms();
        instance.setlongitude(longitude);

    }

    /**
     * Test of getlatitude method, of class farms.
     */
    @Test
    public void testGetlatitude() {
        System.out.println("getlatitude");
        farms instance = new farms();
        String expResult = null;
        String result = instance.getlatitude();
        assertEquals(expResult, result);

    }

    /**
     * Test of setlatitude method, of class farms.
     */
    @Test
    public void testSetlatitude() {
        System.out.println("setlatitude");
        String latitude = "";
        farms instance = new farms();
        instance.setlatitude(latitude);

    }

    /**
     * Test of toString method, of class farms.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        farms instance = new farms();
        String expResult = "0";
        String result = instance.toString();
        assertEquals(expResult, result);

    }

    /**
     * Test of getMinTemp method, of class farms.
     */
    @Test
    public void testGetMinTemp() {
        System.out.println("getMinTemp");
        farms instance = new farms();
        double expResult = 0.0;
        double result = instance.getMinTemp();
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of setMinTemp method, of class farms.
     */
    @Test
    public void testSetMinTemp() {
        System.out.println("setMinTemp");
        double minTemp = 0.0;
        farms instance = new farms();
        instance.setMinTemp(minTemp);
    }

    /**
     * Test of setMaxTemp method, of class farms.
     */
    @Test
    public void testSetMaxTemp() {
        System.out.println("setMaxTemp");
        double maxTemp = 0.0;
        farms instance = new farms();
        instance.setMaxTemp(maxTemp);
    }

    /**
     * Test of getMaxTemp method, of class farms.
     */
    @Test
    public void testGetMaxTemp() {
        System.out.println("getMaxTemp");
        farms instance = new farms();
        double expResult = 0.0;
        double result = instance.getMaxTemp();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getSaturationVapourPressure method, of class farms.
     */
    @Test
    public void testGetSaturationVapourPressure() {
        System.out.println("getSaturationVapourPressure");
        farms instance = new farms();
        double expResult = 0.0;
        double result = instance.getSaturationVapourPressure();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setSaturationVapourPressure method, of class farms.
     */
    @Test
    public void testSetSaturationVapourPressure() {
        System.out.println("setSaturationVapourPressure");
        double saturationVapourPressure = 0.0;
        farms instance = new farms();
        instance.setSaturationVapourPressure(saturationVapourPressure);
    }

}
