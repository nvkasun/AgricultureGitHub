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
public class AnalysisDecoratorTest {

    public AnalysisDecoratorTest() {
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
     * Test of analiseDetails method, of class AnalysisDecorator.
     */
    @Test
    public void testAnaliseDetails() {
        System.out.println("analiseDetails");
        String type = "";
        int fieldID = 0;
        Date startDate = null;
        Date endDate = null;
        AnalysisDecorator instance = new AnalysisDecoratorImpl();
        String expResult = "";
        String result = instance.analiseDetails(type, fieldID, startDate, endDate);
        assertEquals(expResult, result);

    }

    public class AnalysisDecoratorImpl extends AnalysisDecorator {

        @Override
        public String analiseDetails(String type, int fieldID, Date startDate, Date endDate) {
            return "";
        }
    }

}
