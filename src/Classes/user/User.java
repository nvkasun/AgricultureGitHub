/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes.user;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Kasun
 */
public class User implements Serializable {

    private static final long serialVersionUID = -47594027994670654L;

    private static volatile User instance;

    private int memberNumber;
    private String name, lastName, address, city, username, mobile, password, userLevel;

    private static int memberCount = 0;

    private void build(SingletonBuilder builder) {
        this.name = builder.name;
        this.address = builder.address;
        this.city = builder.city;
        this.lastName = builder.lastName;
        this.mobile = builder.mobile;
        this.username = builder.username;
        this.password = builder.password;
        this.userLevel = builder.userLevel;
        memberNumber = ++memberCount;
    }

    //creating singleton object with Double checked locking 
    /**
     *
     * @return
     */
    public static User getInstance() {
        if (instance == null) {
            synchronized (User.class) {
                if (instance == null) {
                    instance = new User();
                }
            }
        }
        return instance;
    }

    /**
     *
     */
    public void print() {
        System.out.println(Integer.toString(memberNumber) + " Name " + name + ",username " + username + ",password " + password + ",userLevel " + userLevel);
    }

    /**
     *
     */
    public static class SingletonBuilder {

        private final String name; // Mandatory
        private final String username;
        private final String lastName;
        private final String userLevel;
        private final String address;
        private final String mobile;
        private final String password;

        private String city = "";// Not Mandatory

        private SingletonBuilder() {
            name = null;
            username = null;
            password = null;
            lastName = null;
            address = null;
            mobile = null;
            userLevel = null;
        }

        /**
         *
         * @param firstName
         * @param lastName
         * @param address
         * @param userLevel
         * @param email
         * @param mobile
         * @param password
         */
        public SingletonBuilder(String firstName, String lastName, String address, String userLevel, String email, String mobile, String password) {
            this.name = firstName;
            this.lastName = lastName;
            this.address = address;
            this.mobile = mobile;
            this.userLevel = userLevel;
            this.username = email;
            this.password = password;

        }

        /**
         *
         * @param city
         * @return
         */
        public SingletonBuilder city(String city) {
            this.city = city;
            return this;
        }

        /**
         *
         */
        public void build() {
            User.getInstance().build(this);
        }

    }

    private User() {

    }

    //setting and getting username
    /**
     *
     * @return
     */
    public String getUsername() {
        return username;
    }

    /**
     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    //setting and getting password
    /**
     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    //setting and getting username
    /**
     *
     * @return
     */
    public String getUserLevel() {
        return userLevel;
    }

    /**
     *
     * @param userLevel
     */
    public void setUserLevel(String userLevel) {
        this.userLevel = userLevel;
    }

    //setting and getting user details
    /**
     *
     * @return
     */
    public int getMemberNumber() {
        return memberNumber;
    }

    /**
     *
     * @param memberNumber
     */
    public void setMemberNumber(int memberNumber) {
        this.memberNumber = memberNumber;
    }

    //setting getting firsstname
    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    //setting getting firsstname
    /**
     *
     * @return
     */
    public String getLastName() {
        return lastName;
    }

    /**
     *
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //setting getting address
    /**
     *
     * @return
     */
    public String getAddress() {
        return address;
    }

    /**
     *
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    //setting getting city
    /**
     *
     * @return
     */
    public String getCity() {
        return city;
    }

    /**
     *
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    //setting getting mobile
    /**
     *
     * @return
     */
    public String getMobile() {
        return mobile;
    }

    /**
     *
     * @param mobile
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return Integer.toString(memberNumber) + " " + name;
    }

    //transient and static fields are write and read
    private void writeObject(ObjectOutputStream oos)
            throws IOException {
        oos.defaultWriteObject();
        oos.writeObject(memberCount);

    }

    private void readObject(ObjectInputStream ois)
            throws ClassNotFoundException, IOException {
        ois.defaultReadObject();
        memberCount = (Integer) ois.readObject();

    }
}
