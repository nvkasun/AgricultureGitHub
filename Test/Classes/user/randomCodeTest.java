/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes.user;

import java.lang.reflect.Field;
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
public class randomCodeTest {

    public randomCodeTest() {
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

    @Before
    public void resetSingleton() throws SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        Field instance = randomCode.class.getDeclaredField("instance");
        instance.setAccessible(true);
        instance.set(null, null);
    }

    /**
     * Test of getInstance method, of class randomCode.
     */
    @Test
    public void testGetInstance() {
        try {
            System.out.println("getInstance");
            randomCode expResult = null;
            randomCode result = randomCode.getInstance();
            assertTrue(expResult.equals(result));

            fail(" The test case testGetInstance fail.");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }
    }

    /**
     * Test of print method, of class randomCode.
     */
    @Test
    public void testPrint() {
        try {
            System.out.println("print");
            randomCode instance = null;
            instance.print();

            fail(" The test case testPrint fail.");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }
    }

    /**
     * Test of getEmail method, of class randomCode.
     */
    @Test
    public void testGetEmail() {
        try {
            System.out.println("getEmail");
            randomCode instance = null;
            String expResult = "";
            String result = instance.getEmail();
            assertTrue(expResult.equals(result));

            fail(" The test case testGetEmail fail.");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }
    }

    /**
     * Test of setEmail method, of class randomCode.
     */
    @Test
    public void testSetEmail() {
        try {
            System.out.println("setEmail");
            String email = "";
            randomCode instance = null;
            instance.setEmail(email);

            fail(" The test case testSetEmail fail.");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }

    }

    /**
     * Test of getRandomCode method, of class randomCode.
     */
    @Test
    public void testGetRandomCode() {
        try {
            System.out.println("getRandomCode");
            randomCode instance = null;
            String expResult = "";
            String result = instance.getRandomCode();
            assertEquals(expResult, result);

            fail(" The test case testGetRandomCode fail.");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }
    }

    /**
     * Test of setRandomCode method, of class randomCode.
     */
    @Test
    public void testSetRandomCode() {
        try {
            System.out.println("setRandomCode");
            String randomNumber = "";
            randomCode instance = null;
            instance.setRandomCode(randomNumber);

            fail(" The test case testSetRandomCode fail.");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }
    }

    /**
     * Test of getRandomNumber method, of class randomCode.
     */
    @Test
    public void testGetRandomNumber() {
        try {
            System.out.println("getRandomNumber");
            randomCode instance = null;
            int expResult = 0;
            int result = instance.getRandomNumber();
            assertEquals(expResult, result);

            fail(" The test case testGetRandomNumber fail.");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }
    }

    /**
     * Test of setRandomNumber method, of class randomCode.
     */
    @Test
    public void testSetRandomNumber() {
        try {
            System.out.println("setRandomNumber");
            int memberNumber = 0;
            randomCode instance = null;
            instance.setRandomNumber(memberNumber);

            fail(" The test case testSetRandomNumber fail.");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }
    }

    /**
     * Test of toString method, of class randomCode.
     */
    @Test
    public void testToString() {
        try {
            System.out.println("toString");
            randomCode instance = null;
            String expResult = "";
            String result = instance.toString();
            assertEquals(expResult, result);

            fail(" The test case testAddCrop fail.");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }
    }

}
