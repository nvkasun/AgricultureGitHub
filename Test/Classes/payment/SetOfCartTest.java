/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes.payment;

import Classes.Product.ProductsImp;
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
public class SetOfCartTest {

    public SetOfCartTest() {
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
     * Test of addCart method, of class SetOfCart.
     */
    @Test
    public void testAddCart() {
        try {
            System.out.println("addCart");
            SalesCart item = null;
            SetOfCart instance = new SetOfCart();
            instance.addCart(item);

            fail(" The test case testPay fail.");
        } catch (Throwable expected) {
            assertEquals(AssertionError.class, expected.getClass());
        }
    }

    /**
     * Test of removeCart method, of class SetOfCart.
     */
    @Test
    public void testRemoveCart() {
        try {
            System.out.println("removeCart");
            SalesCart productNo = null;
            SetOfCart instance = new SetOfCart();
            boolean expResult = false;
            boolean result = instance.removeCart(productNo);
            assertEquals(expResult, result);

            fail(" The test case testPay fail.");
        } catch (Throwable expected) {
            assertEquals(AssertionError.class, expected.getClass());
        }
    }

    /**
     * Test of removeAllCart method, of class SetOfCart.
     */
    @Test
    public void testRemoveAllCart() {
        try {
            System.out.println("removeAllCart");
            SalesCart cart = null;
            SetOfCart instance = new SetOfCart();
            boolean expResult = false;
            boolean result = instance.removeAllCart(cart);
            assertEquals(expResult, result);

            fail(" The test case testPay fail.");
        } catch (Throwable expected) {
            assertEquals(AssertionError.class, expected.getClass());
        }
    }

    /**
     * Test of getCartFromID method, of class SetOfCart.
     */
    @Test
    public void testGetCartFromID() {
        try {
            System.out.println("getCartFromID");
            int number = 0;
            SetOfCart instance = new SetOfCart();
            int expResult = 0;
            int result = instance.getCartFromID(number).size();
            assertEquals(expResult, result);

            fail(" The test case testPay fail.");
        } catch (Throwable expected) {
            assertEquals(AssertionError.class, expected.getClass());
        }
    }

    /**
     * Test of getCartFromEmail method, of class SetOfCart.
     */
    @Test
    public void testGetCartFromEmail() {
        try {
            System.out.println("getCartFromEmail");
            String email = "";
            SetOfCart instance = new SetOfCart();
            int expResult = 0;
            int result = instance.getCartFromEmail(email).size();
            assertEquals(expResult, result);

            fail(" The test case testPay fail.");
        } catch (Throwable expected) {
            assertEquals(AssertionError.class, expected.getClass());
        }
    }

    /**
     * Test of getCartFromProductID method, of class SetOfCart.
     */
    @Test
    public void testGetCartFromProductID() {
        try {
            System.out.println("getCartFromProductID");
            int productId = 0;
            SetOfCart instance = new SetOfCart();
            int expResult = 0;
            int result = instance.getCartFromProductID(productId).size();
            assertEquals(expResult, result);

            fail(" The test case testPay fail.");
        } catch (Throwable expected) {
            assertEquals(AssertionError.class, expected.getClass());
        }
    }

    /**
     * Test of calculateTotal method, of class SetOfCart.
     */
    @Test
    public void testCalculateTotal() {
        try {
            System.out.println("calculateTotal");
            SetOfCart cartSet = null;
            SetOfCart instance = new SetOfCart();
            double expResult = 0.0;
            double result = instance.calculateTotal(cartSet);
            assertEquals(expResult, result, 0.0);

            fail(" The test case testPay fail.");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }
    }

    /**
     * Test of shippingCharge method, of class SetOfCart.
     */
    @Test
    public void testShippingCharge() {
        try {
            System.out.println("shippingCharge");
            double sub = 0.0;
            SetOfCart instance = new SetOfCart();
            double expResult = 0.0;
            double result = instance.shippingCharge(sub);
            assertEquals(expResult, result, 0.0);

            fail(" The test case testPay fail.");
        } catch (Throwable expected) {
            assertEquals(AssertionError.class, expected.getClass());
        }
    }

    /**
     * Test of updateProductqty method, of class SetOfCart.
     */
    @Test
    public void testUpdateProductqty() {
        try {
            System.out.println("updateProductqty");
            ProductsImp product = null;
            double qty = 0.0;
            SetOfCart instance = new SetOfCart();
            instance.updateProductqty(product, qty);

            fail(" The test case testPay fail.");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }
    }

    /**
     * Test of pay method, of class SetOfCart.
     */
    @Test
    public void testPay() {
        try {
            System.out.println("pay");
            paymentStrategy method = null;
            double amount = 0.0;
            SetOfCart instance = new SetOfCart();
            instance.pay(method, amount);

            fail(" The test case testPay fail.");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }
    }

}
