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
public class ProductStockImpTest {

    public ProductStockImpTest() {
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
     * Test of registerObserver method, of class ProductStockImp.
     */
    @Test
    public void testRegisterObserver() {
        System.out.println("registerObserver");
        productObserver observer = null;
        ProductStockImp instance = new ProductStockImp();
        instance.registerObserver(observer);

    }

    /**
     * Test of removeObserver method, of class ProductStockImp.
     */
    @Test
    public void testRemoveObserver() {
        System.out.println("removeObserver");
        productObserver observer = null;
        ProductStockImp instance = new ProductStockImp();
        instance.removeObserver(observer);

    }

    /**
     * Test of setStatus method, of class ProductStockImp.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        String status = "";
        ProductStockImp instance = new ProductStockImp();
        instance.setStatus(status);

    }

    /**
     * Test of print method, of class ProductStockImp.
     */
    @Test
    public void testPrint() {
        System.out.println("print");
        ProductStockImp instance = new ProductStockImp();
        instance.print();

    }

    /**
     * Test of toString method, of class ProductStockImp.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ProductStockImp instance = new ProductStockImp();
        String expResult = "0 0";
        String result = instance.toString();
        assertEquals(expResult, result);

    }

    /**
     * Test of getStatus method, of class ProductStockImp.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        ProductStockImp instance = new ProductStockImp();
        String expResult = null;
        String result = instance.getStatus();
        assertEquals(expResult, result);

    }

    /**
     * Test of notifyObservers method, of class ProductStockImp.
     */
    @Test
    public void testNotifyObservers() {
        System.out.println("notifyObservers");
        ProductStockImp instance = new ProductStockImp();
        instance.notifyObservers();

    }

    /**
     * Test of notifyObserversRemove method, of class ProductStockImp.
     */
    @Test
    public void testNotifyObserversRemove() {
        System.out.println("notifyObserversRemove");
        ProductStockImp instance = new ProductStockImp();
        instance.notifyObserversRemove();

    }

    /**
     * Test of getPrice method, of class ProductStockImp.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        ProductStockImp instance = new ProductStockImp();
        double expResult = 0.0;
        double result = instance.getPrice();
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of getQuantity method, of class ProductStockImp.
     */
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        ProductStockImp instance = new ProductStockImp();
        double expResult = 0.0;
        double result = instance.getQuantity();
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of getDate method, of class ProductStockImp.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        ProductStockImp instance = new ProductStockImp();
        String expResult = null;
        String result = instance.getDate();
        assertEquals(expResult, result);

    }

    /**
     * Test of setPrice method, of class ProductStockImp.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        double price = 0.0;
        ProductStockImp instance = new ProductStockImp();
        instance.setPrice(price);

    }

    /**
     * Test of setQuantity method, of class ProductStockImp.
     */
    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        double qty = 0.0;
        ProductStockImp instance = new ProductStockImp();
        instance.setQuantity(qty);

    }

    /**
     * Test of setDate method, of class ProductStockImp.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        String date = "";
        ProductStockImp instance = new ProductStockImp();
        instance.setDate(date);

    }

    /**
     * Test of getStockNo method, of class ProductStockImp.
     */
    @Test
    public void testGetStockNo() {
        System.out.println("getStockNo");
        ProductStockImp instance = new ProductStockImp();
        int expResult = 0;
        int result = instance.getStockNo();
        assertEquals(expResult, result);

    }

    /**
     * Test of setStockNo method, of class ProductStockImp.
     */
    @Test
    public void testSetStockNo() {
        System.out.println("setStockNo");
        int stockNumber = 0;
        ProductStockImp instance = new ProductStockImp();
        instance.setStockNo(stockNumber);

    }

    /**
     * Test of getProductID method, of class ProductStockImp.
     */
    @Test
    public void testGetProductID() {
        System.out.println("getProductID");
        ProductStockImp instance = new ProductStockImp();
        int expResult = 0;
        int result = instance.getProductID();
        assertEquals(expResult, result);

    }

    /**
     * Test of setProductID method, of class ProductStockImp.
     */
    @Test
    public void testSetProductID() {
        System.out.println("setProductID");
        int id = 0;
        ProductStockImp instance = new ProductStockImp();
        instance.setProductID(id);

    }

}
