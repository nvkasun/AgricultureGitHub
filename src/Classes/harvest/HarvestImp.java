/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes.harvest;

import Classes.Product.productObserver;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lakmi
 */
public class HarvestImp implements Serializable {

    private static final long serialVersionUID = -47594027994670654L;
        private static int harvestCount = 0;
    private String state, name,feild;
    private double qty, price;
    private int CropID ;
    private String date;

    public HarvestImp() {

    }

    public HarvestImp(String name, double qty, String feild, String date, double price) {
        this.name = name;
        this.qty = qty;
        this.feild = feild;
        this.date = date;
        this.price = price;
        this.CropID =++harvestCount;

    }


    private void readObject(ObjectInputStream ois) 
    throws ClassNotFoundException, IOException {
            ois.defaultReadObject();
            harvestCount = (Integer) ois.readObject();
     
    }

    
    private void writeObject(ObjectOutputStream oos) 
    throws IOException{
        
            oos.defaultWriteObject();
            oos.writeObject(harvestCount);
        
    }

    

    public String getName() {
        return name;
    }

    public double getQuantity() {
        return qty;
    }

    public String getCropfeild() {
        return feild;
    }

  
    public double getBuyingPrice() {
        return price;
    }

 
    public String getDate() {
        return date;
    }

    
    public void setName(String name) {
        this.name = name;
    }

   
    public void setQuantity(double qty) {
        this.qty = qty;
    }

    
    public void setCropFeild(String feild) {
        this.feild = feild;
    }

  
    public void setBuyingPrice(double price) {
        this.price = price;
    }

    
    public void setDate(String date) {
        this.date = date;
    }

    
    public int getharvestID() {
        return CropID;
    }

   
    public void setHarvestID(int id) {
        this.CropID = id;
    }

    
    public String getStatus() {
        return this.state;
    }
    
    
     public String toString() {
        return Integer.toString(harvestCount) + " " + name;
    }
}
