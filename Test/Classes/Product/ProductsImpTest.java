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
public class ProductsImpTest {

    public ProductsImpTest() {
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
     * Test of registerObserver method, of class ProductsImp.
     */
    @Test
    public void testRegisterObserver() {
        System.out.println("registerObserver");
        productObserver observer = null;
        ProductsImp instance = new ProductsImp();
        instance.registerObserver(observer);

    }

    /**
     * Test of removeObserver method, of class ProductsImp.
     */
    @Test
    public void testRemoveObserver() {
        System.out.println("removeObserver");
        productObserver observer = null;
        ProductsImp instance = new ProductsImp();
        instance.removeObserver(observer);

    }

    /**
     * Test of setStatus method, of class ProductsImp.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        String status = "";
        ProductsImp instance = new ProductsImp();
        instance.setStatus(status);

    }

    /**
     * Test of getStatus method, of class ProductsImp.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        ProductsImp instance = new ProductsImp();
        String expResult = "";
        String result = instance.getStatus();
        assertFalse(expResult.equals(result));

    }

    /**
     * Test of notifyObservers method, of class ProductsImp.
     */
    @Test
    public void testNotifyObservers() {
        System.out.println("notifyObservers");
        ProductsImp instance = new ProductsImp();
        instance.notifyObservers();

    }

    /**
     * Test of notifyObserversRemove method, of class ProductsImp.
     */
    @Test
    public void testNotifyObserversRemove() {
        System.out.println("notifyObserversRemove");
        ProductsImp instance = new ProductsImp();
        instance.notifyObserversRemove();

    }

    /**
     * Test of getName method, of class ProductsImp.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        ProductsImp instance = new ProductsImp();
        String expResult = "";
        String result = instance.getName();
        assertFalse(expResult.equals(result));

    }

    /**
     * Test of getPrice method, of class ProductsImp.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        ProductsImp instance = new ProductsImp();
        double expResult = 0.0;
        double result = instance.getPrice();
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of getQuantity method, of class ProductsImp.
     */
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        ProductsImp instance = new ProductsImp();
        double expResult = 0.0;
        double result = instance.getQuantity();
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of getAvalability method, of class ProductsImp.
     */
    @Test
    public void testGetAvalability() {
        System.out.println("getAvalability");
        ProductsImp instance = new ProductsImp();
        String expResult = "";
        String result = instance.getAvalability();
        assertFalse(expResult.equals(result));

    }

    /**
     * Test of getdescription method, of class ProductsImp.
     */
    @Test
    public void testGetdescription() {
        System.out.println("getdescription");
        ProductsImp instance = new ProductsImp();
        String expResult = "";
        String result = instance.getdescription();
        assertFalse(expResult.equals(result));

    }

    /**
     * Test of getImage method, of class ProductsImp.
     */
    @Test
    public void testGetImage() {
        System.out.println("getImage");
        ProductsImp instance = new ProductsImp();
        byte[] expResult = null;
        byte[] result = instance.getImage();
        assertArrayEquals(expResult, result);

    }

    /**
     * Test of setName method, of class ProductsImp.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        ProductsImp instance = new ProductsImp();
        instance.setName(name);

    }

    /**
     * Test of setImage method, of class ProductsImp.
     */
    @Test
    public void testSetImage() {
        System.out.println("setImage");
        byte[] image = null;
        ProductsImp instance = new ProductsImp();
        instance.setImage(image);

    }

    /**
     * Test of setDescription method, of class ProductsImp.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String des = "";
        ProductsImp instance = new ProductsImp();
        instance.setDescription(des);

    }

    /**
     * Test of setPrice method, of class ProductsImp.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        double price = 0.0;
        ProductsImp instance = new ProductsImp();
        instance.setPrice(price);

    }

    /**
     * Test of setQuantity method, of class ProductsImp.
     */
    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        double qty = 0.0;
        ProductsImp instance = new ProductsImp();
        instance.setQuantity(qty);

    }

    /**
     * Test of setAvalability method, of class ProductsImp.
     */
    @Test
    public void testSetAvalability() {
        System.out.println("setAvalability");
        String avl = "";
        ProductsImp instance = new ProductsImp();
        instance.setAvalability(avl);

    }

    /**
     * Test of getProductNo method, of class ProductsImp.
     */
    @Test
    public void testGetProductNo() {
        System.out.println("getProductNo");
        ProductsImp instance = new ProductsImp();
        int expResult = 0;
        int result = instance.getProductNo();
        assertEquals(expResult, result);

    }

    /**
     * Test of setProductNo method, of class ProductsImp.
     */
    @Test
    public void testSetProductNo() {
        System.out.println("setProductNo");
        int productNumber = 0;
        ProductsImp instance = new ProductsImp();
        instance.setProductNo(productNumber);

    }

    /**
     * Test of print method, of class ProductsImp.
     */
    @Test
    public void testPrint() {
        System.out.println("print");
        ProductsImp instance = new ProductsImp();
        instance.print();

    }

    /**
     * Test of toString method, of class ProductsImp.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ProductsImp instance = new ProductsImp();
        String expResult = "";
        String result = instance.toString();
        assertFalse(expResult.equals(result));

    }

}
