/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes.payment;

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
public class SalesCartTest {

    public SalesCartTest() {
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
     * Test of getDate method, of class SalesCart.
     */
    @Test
    public void testGetDate() {
        try {
            System.out.println("getDate");
            SalesCart instance = new SalesCart();
            String expResult = null;
            String result = instance.getDate();
            assertEquals(expResult, result);

            fail(" The test case testPay fail.");
        } catch (Throwable expected) {
            assertEquals(AssertionError.class, expected.getClass());
        }
    }

    /**
     * Test of getEmail method, of class SalesCart.
     */
    @Test
    public void testGetEmail() {
        try {
            System.out.println("getEmail");
            SalesCart instance = new SalesCart();
            String expResult = null;
            String result = instance.getEmail();
            assertEquals(expResult, result);

            fail(" The test case testPay fail.");
        } catch (Throwable expected) {
            assertEquals(AssertionError.class, expected.getClass());
        }
    }

    /**
     * Test of getName method, of class SalesCart.
     */
    @Test
    public void testGetName() {
        try {
            System.out.println("getName");
            SalesCart instance = new SalesCart();
            String expResult = null;
            String result = instance.getName();
            assertEquals(expResult, result);

            fail(" The test case testPay fail.");
        } catch (Throwable expected) {
            assertEquals(AssertionError.class, expected.getClass());
        }
    }

    /**
     * Test of getProductID method, of class SalesCart.
     */
    @Test
    public void testGetProductID() {
        try {
            System.out.println("getProductID");
            SalesCart instance = new SalesCart();
            int expResult = 0;
            int result = instance.getProductID();
            assertEquals(expResult, result);

            fail(" The test case testPay fail.");
        } catch (Throwable expected) {
            assertEquals(AssertionError.class, expected.getClass());
        }
    }

    /**
     * Test of getuPrice method, of class SalesCart.
     */
    @Test
    public void testGetuPrice() {
        try {
            System.out.println("getuPrice");
            SalesCart instance = new SalesCart();
            double expResult = 0.0;
            double result = instance.getuPrice();
            assertEquals(expResult, result, 0.0);

            fail(" The test case testPay fail.");
        } catch (Throwable expected) {
            assertEquals(AssertionError.class, expected.getClass());
        }
    }

    /**
     * Test of getPrice method, of class SalesCart.
     */
    @Test
    public void testGetPrice() {
        try {
            System.out.println("getPrice");
            SalesCart instance = new SalesCart();
            double expResult = 0.0;
            double result = instance.getPrice();
            assertEquals(expResult, result, 0.0);

            fail(" The test case testPay fail.");
        } catch (Throwable expected) {
            assertEquals(AssertionError.class, expected.getClass());
        }
    }

    /**
     * Test of getCartID method, of class SalesCart.
     */
    @Test
    public void testGetCartID() {
        try {
            System.out.println("getCartID");
            SalesCart instance = new SalesCart();
            double expResult = 0.0;
            double result = instance.getCartID();
            assertEquals(expResult, result, 0.0);

            fail(" The test case testPay fail.");
        } catch (Throwable expected) {
            assertEquals(AssertionError.class, expected.getClass());
        }
    }

    /**
     * Test of getQuantity method, of class SalesCart.
     */
    @Test
    public void testGetQuantity() {
        try {
            System.out.println("getQuantity");
            SalesCart instance = new SalesCart();
            double expResult = 0.0;
            double result = instance.getQuantity();
            assertEquals(expResult, result, 0.0);

            fail(" The test case testPay fail.");
        } catch (Throwable expected) {
            assertEquals(AssertionError.class, expected.getClass());
        }
    }

    /**
     * Test of setDate method, of class SalesCart.
     */
    @Test
    public void testSetDate() {
        try {
            System.out.println("setDate");
            String date = "";
            SalesCart instance = new SalesCart();
            instance.setDate(date);

            fail(" The test case testPay fail.");
        } catch (Throwable expected) {
            assertEquals(AssertionError.class, expected.getClass());
        }
    }

    /**
     * Test of setEmail method, of class SalesCart.
     */
    @Test
    public void testSetEmail() {
        try {
            System.out.println("setEmail");
            String email = "";
            SalesCart instance = new SalesCart();
            instance.setEmail(email);

            fail(" The test case testPay fail.");
        } catch (Throwable expected) {
            assertEquals(AssertionError.class, expected.getClass());
        }
    }

    /**
     * Test of setName method, of class SalesCart.
     */
    @Test
    public void testSetName() {
        try {
            System.out.println("setName");
            String name = "";
            SalesCart instance = new SalesCart();
            instance.setName(name);

            fail(" The test case testPay fail.");
        } catch (Throwable expected) {
            assertEquals(AssertionError.class, expected.getClass());
        }
    }

    /**
     * Test of setProductID method, of class SalesCart.
     */
    @Test
    public void testSetProductID() {
        try {
            System.out.println("setProductID");
            int productID = 0;
            SalesCart instance = new SalesCart();
            instance.setProductID(productID);

            fail(" The test case testPay fail.");
        } catch (Throwable expected) {
            assertEquals(AssertionError.class, expected.getClass());
        }
    }

    /**
     * Test of setuPrice method, of class SalesCart.
     */
    @Test
    public void testSetuPrice() {
        try {
            System.out.println("setuPrice");
            double uprice = 0.0;
            SalesCart instance = new SalesCart();
            instance.setuPrice(uprice);

            fail(" The test case testPay fail.");
        } catch (Throwable expected) {
            assertEquals(AssertionError.class, expected.getClass());
        }
    }

    /**
     * Test of setPrice method, of class SalesCart.
     */
    @Test
    public void testSetPrice() {
        try {
            System.out.println("setPrice");
            double price = 0.0;
            SalesCart instance = new SalesCart();
            instance.setPrice(price);

            fail(" The test case testPay fail.");
        } catch (Throwable expected) {
            assertEquals(AssertionError.class, expected.getClass());
        }
    }

    /**
     * Test of setCartID method, of class SalesCart.
     */
    @Test
    public void testSetCartID() {
        try {
            System.out.println("setCartID");
            int cartID = 0;
            SalesCart instance = new SalesCart();
            instance.setCartID(cartID);

            fail(" The test case testPay fail.");
        } catch (Throwable expected) {
            assertEquals(AssertionError.class, expected.getClass());
        }
    }

    /**
     * Test of setQuantity method, of class SalesCart.
     */
    @Test
    public void testSetQuantity() {
        try {
            System.out.println("setQuantity");
            double qty = 0.0;
            SalesCart instance = new SalesCart();
            instance.setQuantity(qty);

            fail(" The test case testPay fail.");
        } catch (Throwable expected) {
            assertEquals(AssertionError.class, expected.getClass());
        }
    }

}
