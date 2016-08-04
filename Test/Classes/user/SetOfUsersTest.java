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
public class SetOfUsersTest {

    public SetOfUsersTest() {
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
     * Test of addUser method, of class SetOfUsers.
     */
    @Test
    public void testAddUser() {
        System.out.println("addUser");
        User aUser = null;
        SetOfUsers instance = new SetOfUsers();
        instance.addUser(aUser);
    }

    /**
     * Test of removeUser method, of class SetOfUsers.
     */
    @Test
    public void testRemoveUser() {
        System.out.println("removeUser");
        User user = null;
        SetOfUsers instance = new SetOfUsers();
        boolean expResult = false;
        boolean result = instance.removeUser(user);
        assertTrue(expResult == result);
    }

    /**
     * Test of Updatedetails method, of class SetOfUsers.
     */
    @Test
    public void testUpdatedetails() {
        System.out.println("updatedetails");
        User user = null;
        String firstName = "";
        String lastName = "";
        String address = "";
        String city = "";
        String email = "";
        String mobile = "";
        String password = "";
        String userLevels = "";
        SetOfUsers instance = new SetOfUsers();
        String expResult = "fail";
        String result = instance.updatedetails(user, firstName, lastName, address, city, email, mobile, password, userLevels);
        assertTrue(expResult.equals(result));
    }

    /**
     * Test of userAuthontication method, of class SetOfUsers.
     */
    @Test
    public void testUserAuthontication() {
        System.out.println("userAuthontication");
        String username = "";
        String Password = "";
        SetOfUsers instance = new SetOfUsers();
        String expResult = "";
        String result = instance.userAuthontication(username, Password);
        assertEquals(expResult, result);
    }

    /**
     * Test of getMemberFromName method, of class SetOfUsers.
     */
    @Test
    public void testGetMemberFromName() {
        try {
            System.out.println("getMemberFromName");
            String name = "";
            SetOfUsers instance = new SetOfUsers();
            SetOfUsers expResult = null;
            SetOfUsers result = instance.getMemberFromName(name);
            assertTrue(expResult.equals(result));

            fail(" The test case testGetMemberFromName fail.");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }
    }

    /**
     * Test of getMemberFromNumber method, of class SetOfUsers.
     */
    @Test
    public void testGetMemberFromNumber() {
        try {
            System.out.println("getMemberFromNumber");
            int number = 0;
            SetOfUsers instance = new SetOfUsers();
            SetOfUsers expResult = null;
            SetOfUsers result = instance.getMemberFromNumber(number);
            assertTrue(expResult.equals(result));

            fail(" The test case testGetMemberFromNumber fail.");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }
    }

    /**
     * Test of getMemberFromEmail method, of class SetOfUsers.
     */
    @Test
    public void testGetMemberFromEmail() {
        try {
            System.out.println("getMemberFromEmail");
            String email = "";
            SetOfUsers instance = new SetOfUsers();
            SetOfUsers expResult = null;
            SetOfUsers result = instance.getMemberFromEmail(email);
            assertTrue(expResult.equals(result));

            fail(" The test case testGetMemberFromEmail fail.");
        } catch (Throwable expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }
    }

}
