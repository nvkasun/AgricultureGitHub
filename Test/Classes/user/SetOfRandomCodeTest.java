/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes.user;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kasun
 */
public class SetOfRandomCodeTest {

    public SetOfRandomCodeTest() {
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
     * Test of addCode method, of class SetOfRandomCode.
     */
    @Test
    public void testAddCode() {
        System.out.println("addCode");
        randomCode aCode = null;
        SetOfRandomCode instance = new SetOfRandomCode();
        instance.addCode(aCode);
    }

    /**
     * Test of removeCode method, of class SetOfRandomCode.
     */
    @Test
    public void testRemoveCode() {
        System.out.println("removeCode");
        randomCode aCode = null;
        SetOfRandomCode instance = new SetOfRandomCode();
        boolean expResult = false;
        boolean result = instance.removeCode(aCode);
        assertTrue(expResult == result);
    }

    /**
     * Test of verifyRandomCode method, of class SetOfRandomCode.
     */
    @Test
    public void testVerifyRandomCode() {
        System.out.println("verifyRandomCode");
        String email = "";
        String code = "";
        SetOfRandomCode instance = new SetOfRandomCode();
        String expResult = "";
        String result = instance.verifyRandomCode(email, code);
        assertEquals(expResult, result);
    }

}
