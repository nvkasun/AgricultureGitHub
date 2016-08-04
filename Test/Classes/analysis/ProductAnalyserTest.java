/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes.analysis;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gihan
 */
public class ProductAnalyserTest {

    public ProductAnalyserTest() {
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
     * Test of analiseDetails method, of class ProductAnalyser.
     */
    @Test
    public void testAnaliseDetails() {
        try {
            System.out.println("analiseDetails");
            String type = "";
            int productID = 0;
            Date startDate = null;
            Date endDate = null;
            ProductAnalyser instance = new ProductAnalyser();
            String expResult = "";
            String result = instance.analiseDetails(type, productID, startDate, endDate);
            assertEquals(expResult, result);

            fail("The test case testAnaliseDetails fail.");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }

    }

}
