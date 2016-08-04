/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes.user;

import java.io.Serializable;
import java.util.Vector;

/**
 *
 * @author Kasun
 */
public class SetOfUsers extends Vector<User> implements Serializable {

    private static final long serialVersionUID = 2428035439452881234L;

    SetOfUsers userList;

    /**
     *
     */
    public SetOfUsers() {
        super();
    }

    /**
     *
     * @param aUser
     */
    public void addUser(User aUser) {
        super.add(aUser);
    }

    /**
     *
     * @param user
     * @return
     */
    public boolean removeUser(User user) {
        return super.remove(user);
    }

    //update details
    /**
     *
     * @param user
     * @param firstName
     * @param lastName
     * @param address
     * @param city
     * @param email
     * @param mobile
     * @param password
     * @param userLevels
     * @return
     */
    public String updatedetails(User user, String firstName, String lastName, String address, String city, String email, String mobile, String password, String userLevels) {
        String status = "";
        try {
            this.elementAt(this.indexOf(user)).setName(firstName);
            this.elementAt(this.indexOf(user)).setLastName(lastName);
            this.elementAt(this.indexOf(user)).setAddress(address);
            this.elementAt(this.indexOf(user)).setCity(city);
            this.elementAt(this.indexOf(user)).setUsername(email);
            this.elementAt(this.indexOf(user)).setMobile(mobile);
            this.elementAt(this.indexOf(user)).setPassword(password);
            this.elementAt(this.indexOf(user)).setUserLevel(userLevels);

            status = "success";
        } catch (Exception ex) {
            status = "fail";
        }
        return status;
    }

    //validate login
    /**
     *
     * @param username
     * @param Password
     * @return
     */
    public String userAuthontication(String username, String Password) {
        userList = new SetOfUsers();
        String userLevel = "";

        for (User user : this) {

            if (user.getUsername().toLowerCase().equals(username.toLowerCase())) {
                if (user.getPassword().toLowerCase().equals(Password.toLowerCase())) {
                    userLevel = user.getUserLevel() + " " + user.getMemberNumber() + " " + user.getUsername();
                    break;
                } else {
                    userLevel = "PasswordIncorrect 0 no";
                }
            } else {
                userLevel = "UsernameIncorrect 0 no";
            }
        }

        return userLevel;
    }

    /**
     *
     * @param name
     * @return
     */
    public SetOfUsers getMemberFromName(String name) {
        userList = new SetOfUsers();

        for (User user : this) {
            if (user.getName().toLowerCase().contains(name.toLowerCase())) {
                userList.addUser(user);

            }
        }
        return userList;
    }

    /**
     *
     * @param number
     * @return
     */
    public SetOfUsers getMemberFromNumber(int number) {
        userList = new SetOfUsers();
        for (User user : this) {
            if (user.getMemberNumber() == number) {
                userList.addUser(user);

            }
        }

        return userList;
    }

    /**
     *
     * @param email
     * @return
     */
    public SetOfUsers getMemberFromEmail(String email) {
        userList = new SetOfUsers();
        for (User user : this) {
            if (user.getUsername() == email) {
                userList.addUser(user);

            }
        }

        return userList;
    }
}
