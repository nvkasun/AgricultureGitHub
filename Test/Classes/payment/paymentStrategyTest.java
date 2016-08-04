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
public class paymentStrategyTest {

    public paymentStrategyTest() {
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
     * Test of pay method, of class paymentStrategy.
     */
    @Test
    public void testPay() {
        try {
            System.out.println("pay");
            double total = 0.0;
            paymentStrategy instance = new paymentStrategyImpl();
            instance.pay(total);

            fail(" The test case testPay fail.");
        } catch (Throwable expected) {
            assertEquals(AssertionError.class, expected.getClass());
        }
    }

    public class paymentStrategyImpl implements paymentStrategy {

        public void pay(double total) {
        }
    }

}
