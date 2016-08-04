/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes.serialization;

import java.io.FileNotFoundException;
import java.io.IOException;
import junit.framework.AssertionFailedError;
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
public class SerializationTest {

    public SerializationTest() {
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
     * Test of Serialize method, of class Serialization.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testSerialize() throws Exception {
        try {
            System.out.println("Serialize");
            Object object = null;
            String filename = "";
            Serialization.Serialize(object, filename);
            fail(" The test case testSerialize fail.");
        } catch (Throwable expected) {
            assertEquals(FileNotFoundException.class, expected.getClass());
        }
    }

    /**
     * Test of deserializeProducts method, of class Serialization.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testDeserializeProducts() throws Exception {
        try {
            System.out.println("deserializeProducts");
            int expResult = 0;
            int result = Serialization.deserializeProducts().size();
            assertTrue(expResult <= result);

        } catch (IOException | ClassNotFoundException expected) {
            assertEquals(AssertionFailedError.class, expected.getClass());
        }
    }

    /**
     * Test of deserializeFarm method, of class Serialization.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testDeserializeFarm() throws Exception {
        try {
            System.out.println("deserializeFarm");
            int expResult = 0;
            int result = Serialization.deserializeFarm().size();
            assertTrue(expResult <= result);
        } catch (IOException | ClassNotFoundException expected) {
            assertEquals(AssertionFailedError.class, expected.getClass());
        }
    }

    /**
     * Test of deserializeFertilizer method, of class Serialization.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testDeserializeFertilizer() throws Exception {
        try {
            System.out.println("deserializeFertilizer");
            int expResult = 0;
            int result = Serialization.deserializeFertilizer().size();
            assertTrue(expResult <= result);
        } catch (IOException | ClassNotFoundException expected) {
            assertEquals(AssertionFailedError.class, expected.getClass());
        }
    }

    /**
     * Test of deserializeHarvest method, of class Serialization.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testDeserializeHarvest() throws Exception {
        try {
            System.out.println("deserializeHarvest");
            int expResult = 0;
            int result = Serialization.deserializeHarvest().size();
            assertTrue(expResult <= result);
        } catch (IOException | ClassNotFoundException expected) {
            assertEquals(AssertionFailedError.class, expected.getClass());
        }
    }

    /**
     * Test of deserializeSensors method, of class Serialization.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testDeserializeSensors() throws Exception {
        try {
            System.out.println("deserializeSensors");
            int expResult = 0;
            int result = Serialization.deserializeSensors().size();
            assertTrue(expResult <= result);

        } catch (IOException | ClassNotFoundException expected) {
            assertEquals(AssertionFailedError.class, expected.getClass());
        }
    }

    /**
     * Test of deserializeUsers method, of class Serialization.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testDeserializeUsers() throws Exception {
        try {
            System.out.println("deserializeUsers");
            int expResult = 0;
            int result = Serialization.deserializeUsers().size();
            assertTrue(expResult <= result);

        } catch (IOException | ClassNotFoundException expected) {
            assertEquals(AssertionFailedError.class, expected.getClass());
        }
    }

    /**
     * Test of deserializeRandomCode method, of class Serialization.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testDeserializeRandomCode() throws Exception {
        try {
            System.out.println("deserializeRandomCode");
            int expResult = 0;
            int result = Serialization.deserializeRandomCode().size();
            assertTrue(expResult <= result);

        } catch (IOException | ClassNotFoundException expected) {
            assertEquals(AssertionFailedError.class, expected.getClass());
        }
    }

    /**
     * Test of deserializeProductsStock method, of class Serialization.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testDeserializeProductsStock() throws Exception {
        try {
            System.out.println("deserializeProductsStock");
            int expResult = 0;
            int result = Serialization.deserializeProductsStock().size();
            assertTrue(expResult <= result);

        } catch (IOException | ClassNotFoundException expected) {
            assertEquals(AssertionFailedError.class, expected.getClass());
        }
    }

    /**
     * Test of deserializeCart method, of class Serialization.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testDeserializeCart() throws Exception {
        try {
            System.out.println("deserializeCart");
            int expResult = 0;
            int result = Serialization.deserializeCart().size();

            assertTrue(expResult <= result);

        } catch (IOException | ClassNotFoundException expected) {
            assertEquals(AssertionFailedError.class, expected.getClass());
        }
    }

}
