/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Kasun
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({Classes.user.UserSuite.class, Classes.fertilizer.FertilizerSuite.class, Classes.payment.PaymentSuite.class, Classes.analysis.AnalysisSuite.class, Classes.farm.FarmSuite.class, Classes.sensors.SensorsSuite.class, Classes.harvest.HarvestSuite.class, Classes.serialization.SerializationSuite.class, Classes.Product.ProductSuite.class})
public class ClassesSuite {

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
