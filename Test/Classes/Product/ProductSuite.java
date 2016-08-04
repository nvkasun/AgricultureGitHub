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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Lakmi
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({Classes.Product.ProductsImpTest.class, Classes.Product.ProductsTest.class, Classes.Product.SetOfProductsTest.class, Classes.Product.productObserverImpTest.class, Classes.Product.productObserverTest.class, Classes.Product.SetOfProductStockTest.class, Classes.Product.ProductStockImpTest.class})
public class ProductSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

}
