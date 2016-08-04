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
public class ProductsTest {

    public ProductsTest() {
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
     * Test of registerObserver method, of class Products.
     */
    @Test
    public void testRegisterObserver() {
        System.out.println("registerObserver");
        productObserver observer = null;
        Products instance = new ProductsImpl();
        instance.registerObserver(observer);

    }

    /**
     * Test of removeObserver method, of class Products.
     */
    @Test
    public void testRemoveObserver() {
        System.out.println("removeObserver");
        productObserver observer = null;
        Products instance = new ProductsImpl();
        instance.removeObserver(observer);

    }

    /**
     * Test of setStatus method, of class Products.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        String status = "";
        Products instance = new ProductsImpl();
        instance.setStatus(status);

    }

    /**
     * Test of getStatus method, of class Products.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        Products instance = new ProductsImpl();
        String expResult = "";
        String result = instance.getStatus();
        assertEquals(expResult, result);

    }

    /**
     * Test of setPrice method, of class Products.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        double price = 0.0;
        Products instance = new ProductsImpl();
        instance.setPrice(price);

    }

    /**
     * Test of getPrice method, of class Products.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        Products instance = new ProductsImpl();
        double expResult = 0.0;
        double result = instance.getPrice();
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of setQuantity method, of class Products.
     */
    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        double quantity = 0.0;
        Products instance = new ProductsImpl();
        instance.setQuantity(quantity);

    }

    /**
     * Test of getQuantity method, of class Products.
     */
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        Products instance = new ProductsImpl();
        double expResult = 0.0;
        double result = instance.getQuantity();
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of print method, of class Products.
     */
    @Test
    public void testPrint() {
        System.out.println("print");
        Products instance = new ProductsImpl();
        instance.print();

    }

    public class ProductsImpl implements Products {

        @Override
        public void registerObserver(productObserver observer) {
        }

        @Override
        public void removeObserver(productObserver observer) {
        }

        @Override
        public void setStatus(String status) {
        }

        @Override
        public String getStatus() {
            return "";
        }

        /**
         *
         * @param price
         */
        @Override
        public void setPrice(double price) {
        }

        /**
         *
         * @return
         */
        @Override
        public double getPrice() {
            return 0.0;
        }

        @Override
        public void setQuantity(double quantity) {
        }

        @Override
        public double getQuantity() {
            return 0.0;
        }

        @Override
        public void print() {
        }
    }

}
