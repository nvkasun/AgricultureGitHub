/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes.serialization;

import Classes.Product.SetOfProductStock;
import Classes.Product.SetOfProducts;

import Classes.farm.SetOfFarm;
import Classes.fertilizer.SetOfFertilizer;
import Classes.harvest.SetOfHarvest;
import Classes.payment.SetOfCart;
import Classes.sensors.SetOfSensors;
import Classes.user.SetOfRandomCode;
import Classes.user.SetOfUsers;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Sachi
 */
public class Serialization {

    /**
     * Serialize
     *
     * @param object
     * @param filename
     * @throws java.io.IOException
     */
    public static void Serialize(Object object, String filename) throws IOException {

        try (FileOutputStream out = new FileOutputStream(filename)) {
            ObjectOutputStream oos = new ObjectOutputStream(out);
            oos.writeObject(object);
            oos.flush();
        }
        System.out.println(filename + " Serialized !");
    }

    /**
     * deserializeProducts
     *
     * @return SetOfProducts
     * @throws java.io.IOException
     * @throws java.lang.ClassNotFoundException
     */
    public static SetOfProducts deserializeProducts() throws IOException, ClassNotFoundException {

        SetOfProducts products;
        try (FileInputStream in = new FileInputStream("DataFiles/Products.txt")) {
            ObjectInputStream ois = new ObjectInputStream(in);
            products = (SetOfProducts) ois
                    .readObject();
        }

        return products;
    }

    /**
     * deserializeFarm
     *
     * @return SetOfFarm
     * @throws java.io.IOException
     * @throws java.lang.ClassNotFoundException
     */
    public static SetOfFarm deserializeFarm() throws IOException, ClassNotFoundException {

        SetOfFarm farm;
        try (FileInputStream in = new FileInputStream("DataFiles/farms.txt")) {
            ObjectInputStream ois = new ObjectInputStream(in);
            farm = (SetOfFarm) ois
                    .readObject();
        }

        return farm;
    }

    /**
     * deserializeFertilizer
     *
     * @return SetOfFertilizer
     * @throws java.io.IOException
     * @throws java.lang.ClassNotFoundException
     */
    public static SetOfFertilizer deserializeFertilizer() throws IOException, ClassNotFoundException {

        SetOfFertilizer fertilizer;
        try (FileInputStream in = new FileInputStream("DataFiles/fertilizer.txt")) {
            ObjectInputStream ois = new ObjectInputStream(in);
            fertilizer = (SetOfFertilizer) ois
                    .readObject();
        }

        return fertilizer;
    }

    /**
     * deserializeHarvest
     *
     * @return SetOfHarvest
     * @throws java.io.IOException
     * @throws java.lang.ClassNotFoundException
     */
    public static SetOfHarvest deserializeHarvest() throws IOException, ClassNotFoundException {

        SetOfHarvest harvest;
        try (FileInputStream in = new FileInputStream("DataFiles/harvest.txt")) {
            ObjectInputStream ois = new ObjectInputStream(in);
            harvest = (SetOfHarvest) ois
                    .readObject();
        }

        return harvest;
    }

    /**
     * deserializeSensors
     *
     * @return SetOfSensors
     * @throws java.io.IOException
     * @throws java.lang.ClassNotFoundException
     */
    public static SetOfSensors deserializeSensors() throws IOException, ClassNotFoundException {

        SetOfSensors sensors;
        try (FileInputStream in = new FileInputStream("DataFiles/Sensors.txt")) {
            ObjectInputStream ois = new ObjectInputStream(in);
            sensors = (SetOfSensors) ois
                    .readObject();
        }

        return sensors;
    }

    /**
     * deserializeUsers
     *
     * @return SetOfUsers
     * @throws java.io.IOException
     * @throws java.lang.ClassNotFoundException
     */
    public static SetOfUsers deserializeUsers() throws IOException, ClassNotFoundException {

        SetOfUsers users;
        try (FileInputStream in = new FileInputStream("DataFiles/Users.txt")) {
            ObjectInputStream ois = new ObjectInputStream(in);
            users = (SetOfUsers) ois
                    .readObject();
        }

        return users;
    }

    /**
     * deserializeRandomCode
     *
     * @return SetOfRandomCode
     * @throws java.io.IOException
     * @throws java.lang.ClassNotFoundException
     */
    public static SetOfRandomCode deserializeRandomCode() throws IOException, ClassNotFoundException {

        SetOfRandomCode codes;
        try (FileInputStream in = new FileInputStream("DataFiles/RandomCodes.txt")) {
            ObjectInputStream ois = new ObjectInputStream(in);
            codes = (SetOfRandomCode) ois
                    .readObject();
        }

        return codes;
    }

    /**
     * deserializeProductsStock
     *
     * @return SetOfProductStock
     * @throws java.io.IOException
     * @throws java.lang.ClassNotFoundException
     */
    public static SetOfProductStock deserializeProductsStock() throws IOException, ClassNotFoundException {

        SetOfProductStock products;
        try (FileInputStream in = new FileInputStream("DataFiles/ProductsStock.txt")) {
            ObjectInputStream ois = new ObjectInputStream(in);
            products = (SetOfProductStock) ois
                    .readObject();
        }

        return products;
    }

    /**
     *
     * @return SetOfCart
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static SetOfCart deserializeCart() throws IOException, ClassNotFoundException {

        SetOfCart cart;
        try (FileInputStream in = new FileInputStream("DataFiles/Cart.txt")) {
            ObjectInputStream ois = new ObjectInputStream(in);
            cart = (SetOfCart) ois
                    .readObject();
        }

        return cart;
    }
}
