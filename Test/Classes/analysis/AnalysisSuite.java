/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes.analysis;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Gihan
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({Classes.analysis.QuantityDecoratorTest.class, Classes.analysis.AnalysisDecoratorTest.class, Classes.analysis.CropAnalyserTest.class, Classes.analysis.ProductAnalyserTest.class, Classes.analysis.PriceDecoratorTest.class, Classes.analysis.AnaliserTest.class})
public class AnalysisSuite {

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
