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

/**
 *
 * @author Lakmi
 */
public class productObserverTest {

    public productObserverTest() {
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
     * Test of update method, of class productObserver.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Products product = null;
        productObserver instance = new productObserverImpl();
        instance.update(product);

    }

    /**
     * Test of reduceQuntity method, of class productObserver.
     */
    @Test
    public void testReduceQuntity() {
        System.out.println("reduceQuntity");
        Products product = null;
        productObserver instance = new productObserverImpl();
        instance.reduceQuntity(product);

    }

    public class productObserverImpl implements productObserver {

        /**
         *
         * @param product
         */
        @Override
        public void update(Products product) {
        }

        /**
         *
         * @param product
         */
        @Override
        public void reduceQuntity(Products product) {
        }
    }

}
