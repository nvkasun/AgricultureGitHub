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
public class SetOfProductStockTest {

    public SetOfProductStockTest() {
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
     * Test of addProductStock method, of class SetOfProductStock.
     */
    @Test
    public void testAddProductStock() {
        System.out.println("addProductStock");
        ProductStockImp aProduct = null;
        SetOfProductStock instance = new SetOfProductStock();
        instance.addProductStock(aProduct);

    }

    /**
     * Test of updateProductStock method, of class SetOfProductStock.
     */
    @Test
    public void testUpdateProductStock() {
        System.out.println("updateProductStock");
        ProductStockImp aProduct = null;
        int id = 0;
        double qty = 0.0;
        double price = 0.0;
        String date = "";
        SetOfProductStock instance = new SetOfProductStock();
        String expResult = "fail";
        String result = instance.updateProductStock(aProduct, id, qty, price, date);
        assertEquals(expResult, result);

    }

    /**
     * Test of getProductStockFromID method, of class SetOfProductStock.
     */
    @Test
    public void testGetProductStockFromID() {
        try {
            System.out.println("getProductStockFromID");
            int number = 0;
            SetOfProductStock instance = new SetOfProductStock();
            SetOfProductStock expResult = null;
            SetOfProductStock result = instance.getProductStockFromID(number);
            assertTrue(expResult.equals(result));

            fail("The test case testGetProductStockFromID fail.");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }

    }

    /**
     * Test of getProductStockFromStockID method, of class SetOfProductStock.
     */
    @Test
    public void testGetProductStockFromStockID() {
        try {
            System.out.println("getProductStockFromStockID");
            int number = 0;
            SetOfProductStock instance = new SetOfProductStock();
            SetOfProductStock expResult = null;
            SetOfProductStock result = instance.getProductStockFromStockID(number);
            assertFalse(expResult.equals(result));

            fail("The test case testGetProductStockFromStockID fail.");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }

    }

    /**
     * Test of removeProductStock method, of class SetOfProductStock.
     */
    @Test
    public void testRemoveProductStock() {
        System.out.println("removeProductStock");
        ProductStockImp pro = null;
        SetOfProductStock instance = new SetOfProductStock();
        boolean expResult = false;
        boolean result = instance.removeProductStock(pro);
        assertEquals(expResult, result);

    }

}
