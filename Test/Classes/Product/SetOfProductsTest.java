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
public class SetOfProductsTest {

    public SetOfProductsTest() {
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
     * Test of addProducts method, of class SetOfProducts.
     */
    @Test
    public void testAddProducts() {
        System.out.println("addProducts");
        ProductsImp aProduct = null;
        SetOfProducts instance = new SetOfProducts();
        instance.addProducts(aProduct);

    }

    /**
     * Test of updateProducts method, of class SetOfProducts.
     */
    @Test
    public void testUpdateProducts() {
        System.out.println("updateProducts");
        ProductsImp aProduct = null;
        String Name = "";
        String description = "";
        byte[] image = null;
        SetOfProducts instance = new SetOfProducts();
        String expResult = "fail";
        String result = instance.updateProducts(aProduct, Name, description, image);
        assertEquals(expResult, result);

    }

    /**
     * Test of getProductFromID method, of class SetOfProducts.
     */
    @Test
    public void testGetProductFromID() {
        System.out.println("getProductFromID");
        int number = 0;
        SetOfProducts instance = new SetOfProducts();
        int expResult = 0;
        int result = instance.getProductFromID(number).size();
        assertEquals(expResult, result);

    }

    /**
     * Test of getProductFromName method, of class SetOfProducts.
     */
    @Test
    public void testGetProductFromName() {
        System.out.println("getProductFromName");
        String name = "";
        SetOfProducts instance = new SetOfProducts();
        int expResult = 0;
        int result = instance.getProductFromName(name).size();
        assertEquals(expResult, result);
    }

    /**
     * Test of removeProduct method, of class SetOfProducts.
     */
    @Test
    public void testRemoveProduct() {
        System.out.println("removeProduct");
        ProductsImp pro = null;
        SetOfProducts instance = new SetOfProducts();
        boolean expResult = false;
        boolean result = instance.removeProduct(pro);
        assertEquals(expResult, result);

    }

}
