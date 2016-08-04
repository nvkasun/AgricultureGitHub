/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes.Product;

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
public class productObserverImpTest {

    public productObserverImpTest() {
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
     * Test of update method, of class productObserverImp.
     */
    @Test
    public void testUpdate() {
        try {
            System.out.println("update");
            Products product = null;
            productObserverImp instance = null;
            instance.update(product);

            fail("The test case testUpdate fail.");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }

    }

    /**
     * Test of reduceQuntity method, of class productObserverImp.
     */
    @Test
    public void testReduceQuntity() {
        try {
            System.out.println("reduceQuntity");
            Products product = null;
            productObserverImp instance = null;
            instance.reduceQuntity(product);

            fail("The test case testReduceQuntity fail.");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }

    }

}
