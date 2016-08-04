/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes.sensors;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Sachi
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({Classes.sensors.SetOfSensorsTest.class, Classes.sensors.sensorDetailsTest.class, Classes.sensors.Soil_MoistureTest.class, Classes.sensors.Air_TemperatureTest.class, Classes.sensors.Lights_SensorTest.class, Classes.sensors.ISensorTest.class, Classes.sensors.Soil_TemperatureTest.class, Classes.sensors.Soil_AcidityTest.class})
public class SensorsSuite {

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
