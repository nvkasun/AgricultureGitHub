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
public class UserTest {

    public UserTest() {
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
     * Test of getInstance method, of class User.
     */
    @Test
    public void testGetInstance() {
        try {
            System.out.println("getInstance");
            User expResult = null;
            User result = User.getInstance();
            assertTrue(expResult.equals(result));

            fail(" The test case testGetInstance fail.");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }
    }

    /**
     * Test of print method, of class User.
     */
    @Test
    public void testPrint() {
        try {
            System.out.println("print");
            User instance = null;
            instance.print();

            fail(" The test case testPrint fail.");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }

    }

    /**
     * Test of getUsername method, of class User.
     */
    @Test
    public void testGetUsername() {
        try {
            System.out.println("getUsername");
            User instance = null;
            String expResult = "";
            String result = instance.getUsername();
            assertEquals(expResult, result);

            fail(" The test case testGetUsername fail.");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }

    }

    /**
     * Test of setUsername method, of class User.
     */
    @Test
    public void testSetUsername() {
        try {
            System.out.println("setUsername");
            String username = "";
            User instance = null;
            instance.setUsername(username);

            fail(" The test case testSetUsername fail.");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }

    }

    /**
     * Test of getPassword method, of class User.
     */
    @Test
    public void testGetPassword() {
        try {
            System.out.println("getPassword");
            User instance = null;
            String expResult = "";
            String result = instance.getPassword();
            assertEquals(expResult, result);

            fail(" The test case testGetPassword fail.");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }

    }

    /**
     * Test of setPassword method, of class User.
     */
    @Test
    public void testSetPassword() {
        try {
            System.out.println("setPassword");
            String password = "";
            User instance = null;
            instance.setPassword(password);

            fail(" The test case testSetPassword fail.");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }

    }

    /**
     * Test of getUserLevel method, of class User.
     */
    @Test
    public void testGetUserLevel() {
        try {
            System.out.println("getUserLevel");
            User instance = null;
            String expResult = "";
            String result = instance.getUserLevel();
            assertEquals(expResult, result);

            fail(" The test case testGetUserLevel fail.");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }

    }

    /**
     * Test of setUserLevel method, of class User.
     */
    @Test
    public void testSetUserLevel() {
        try {
            System.out.println("setUserLevel");
            String userLevel = "";
            User instance = null;
            instance.setUserLevel(userLevel);

            fail(" The test case testSetUserLevel fail.");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }

    }

    /**
     * Test of getMemberNumber method, of class User.
     */
    @Test
    public void testGetMemberNumber() {
        try {
            System.out.println("getMemberNumber");
            User instance = null;
            String expResult = null;
            int result = instance.getMemberNumber();
            assertEquals(expResult, result);

            fail(" The test case testGetMemberNumber fail.");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }

    }

    /**
     * Test of setMemberNumber method, of class User.
     */
    @Test
    public void testSetMemberNumber() {
        try {
            System.out.println("setMemberNumber");
            int memberNumber = 0;
            User instance = null;
            instance.setMemberNumber(memberNumber);

            fail(" The test case testSetMemberNumber fail.");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }

    }

    /**
     * Test of getName method, of class User.
     */
    @Test
    public void testGetName() {
        try {
            System.out.println("getName");
            User instance = null;
            String expResult = "";
            String result = instance.getName();
            assertEquals(expResult, result);

            fail(" The test case testGetName fail.");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }
    }

    /**
     * Test of setName method, of class User.
     */
    @Test
    public void testSetName() {
        try {
            System.out.println("setName");
            String name = "";
            User instance = null;
            instance.setName(name);

            fail(" The test case testSetName fail.");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }

    }

    /**
     * Test of getLastName method, of class User.
     */
    @Test
    public void testGetLastName() {
        try {
            System.out.println("getLastName");
            User instance = null;
            String expResult = "";
            String result = instance.getLastName();
            assertEquals(expResult, result);

            fail(" The test case testGetLastName fail.");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }

    }

    /**
     * Test of setLastName method, of class User.
     */
    @Test
    public void testSetLastName() {
        try {
            System.out.println("setLastName");
            String lastName = "";
            User instance = null;
            instance.setLastName(lastName);

            fail(" The test case testSetLastName fail.");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }

    }

    /**
     * Test of getAddress method, of class User.
     */
    @Test
    public void testGetAddress() {
        try {
            System.out.println("getAddress");
            User instance = null;
            String expResult = "";
            String result = instance.getAddress();
            assertEquals(expResult, result);

            fail(" The test case testGetAddress fail.");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }

    }

    /**
     * Test of setAddress method, of class User.
     */
    @Test
    public void testSetAddress() {
        try {
            System.out.println("setAddress");
            String address = "";
            User instance = null;
            instance.setAddress(address);

            fail(" The test case testSetAddress fail.");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }

    }

    /**
     * Test of getCity method, of class User.
     */
    @Test
    public void testGetCity() {
        try {
            System.out.println("getCity");
            User instance = null;
            String expResult = "";
            String result = instance.getCity();
            assertEquals(expResult, result);

            fail(" The test case testGetCity fail.");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }

    }

    /**
     * Test of setCity method, of class User.
     */
    @Test
    public void testSetCity() {
        try {
            System.out.println("setCity");
            String city = "";
            User instance = null;
            instance.setCity(city);

            fail(" The test case testSetCity fail.");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }

    }

    /**
     * Test of getMobile method, of class User.
     */
    @Test
    public void testGetMobile() {
        try {
            System.out.println("getMobile");
            User instance = null;
            String expResult = "";
            String result = instance.getMobile();
            assertEquals(expResult, result);

            fail(" The test case testGetMobile fail.");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }

    }

    /**
     * Test of setMobile method, of class User.
     */
    @Test
    public void testSetMobile() {
        try {
            System.out.println("setMobile");
            String mobile = "";
            User instance = null;
            instance.setMobile(mobile);

            fail(" The test case testSetMobile fail.");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }

    }

    /**
     * Test of toString method, of class User.
     */
    @Test
    public void testToString() {
        try {
            System.out.println("toString");
            User instance = null;
            String expResult = "";
            String result = instance.toString();
            assertEquals(expResult, result);

            fail(" The test case testToString fail.");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }

    }

}
