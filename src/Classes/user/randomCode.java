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
public class randomCode implements Serializable {

    private static final long serialVersionUID = -47594027994670654L;

    private static volatile randomCode instance;

    private int recodeNumber;
    private String email;
    private String randomNumber;

    private static int recodeCount = 0;

    private void build(SingletonBuilder builder) {
        this.email = builder.email;
        this.randomNumber = builder.randomNumber;
        recodeNumber = ++recodeCount;
    }

    //creating singleton object with Double checked locking 
    /**
     *
     * @return
     */
    public static randomCode getInstance() {
        if (instance == null) {
            synchronized (User.class) {
                if (instance == null) {
                    instance = new randomCode();
                }
            }
        }
        return instance;
    }

    /**
     *
     */
    public void print() {
        System.out.println(Integer.toString(recodeNumber) + " Email " + email + "Code " + randomNumber);
    }

    /**
     *
     */
    public static class SingletonBuilder {

        private final String email;
        private final String randomNumber;

        private SingletonBuilder() {
            email = null;
            randomNumber = null;

        }

        /**
         *
         * @param email
         * @param randomNumber
         */
        public SingletonBuilder(String email, String randomNumber) {

            this.email = email;
            this.randomNumber = randomNumber;

        }

        /**
         *
         */
        public void build() {
            randomCode.getInstance().build(this);
        }

    }

    private randomCode() {

    }

    //setting and getting email
    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    //get code
    /**
     *
     * @return
     */
    public String getRandomCode() {
        return randomNumber;
    }

    /**
     *
     * @param randomNumber
     */
    public void setRandomCode(String randomNumber) {
        this.randomNumber = randomNumber;
    }

    //setting and getting number
    /**
     *
     * @return
     */
    public int getRandomNumber() {
        return recodeNumber;
    }

    /**
     *
     * @param memberNumber
     */
    public void setRandomNumber(int memberNumber) {
        this.recodeNumber = memberNumber;
    }

    @Override
    public String toString() {
        return Integer.toString(recodeNumber) + " " + email;
    }

    //transient and static fields are write and read
    private void writeObject(ObjectOutputStream oos)
            throws IOException {
        oos.defaultWriteObject();
        oos.writeObject(recodeCount);

    }

    private void readObject(ObjectInputStream ois)
            throws ClassNotFoundException, IOException {
        ois.defaultReadObject();
        recodeCount = (Integer) ois.readObject();

    }
}
