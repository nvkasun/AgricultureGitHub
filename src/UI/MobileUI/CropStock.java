/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.MobileUI;

import Classes.farm.SetOfFarm;
import Classes.farm.farms;
import Classes.harvest.HarvestImp;
import Classes.harvest.SetOfHarvest;
import Classes.serialization.Serialization;
import Validations.validations;
import java.awt.geom.RoundRectangle2D;
import java.io.IOException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Lakmi
 */
public class CropStock extends javax.swing.JFrame {

    public static HarvestImp crop = new HarvestImp();
    public static final String FILE_NAME_Crops = "DataFiles/harvest.txt";
    private final SetOfHarvest cropSet = new SetOfHarvest();
    public static SetOfFarm farmSet = new SetOfFarm();
    private Serialization serialize = new Serialization();
    String userName, userLevel, email, CropID;

    /**
     * Creates new form AddCrop
     */
    public CropStock() {
        initComponents();
        txtacCropID.setEditable(false);
        this.setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 95, 95));
        try {
            for (HarvestImp crop : Serialization.deserializeHarvest()) {
                cropSet.addCrop(crop);

            }
        } catch (IOException ex) {
            Logger.getLogger(CropStock.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CropStock.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            for (farms farm : Serialization.deserializeFarm()) {
                farmSet.addfarm(farm);
                farm.print();
            }
        } catch (IOException ex) {
            Logger.getLogger(CropStock.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CropStock.class.getName()).log(Level.SEVERE, null, ex);
        }

        loadCombo(farmSet);
    }

    public CropStock(String userName, String userLevel, String email) {
        initComponents();
        txtacCropID.setEditable(false);

        this.userName = userName;
        this.userLevel = userLevel;
        this.email = email;
        this.setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 95, 95));

        try {
            for (HarvestImp crop : Serialization.deserializeHarvest()) {
                cropSet.addCrop(crop);

            }
        } catch (IOException ex) {
            Logger.getLogger(CropStock.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CropStock.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            for (farms farm : Serialization.deserializeFarm()) {
                farmSet.addfarm(farm);
                farm.print();
            }
        } catch (IOException ex) {
            Logger.getLogger(CropStock.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CropStock.class.getName()).log(Level.SEVERE, null, ex);
        }

        loadCombo(farmSet);
    }

    public CropStock(String userName, String userLevel, String email, String CropID) {
        initComponents();

        this.userName = userName;
        this.userLevel = userLevel;
        this.email = email;
        this.CropID = CropID;

        txtacCropID.setEditable(false);
        txtacCropID.setText(CropID);
        this.setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 95, 95));

        try {
            for (HarvestImp crop : Serialization.deserializeHarvest()) {
                cropSet.addCrop(crop);

            }
        } catch (IOException ex) {
            Logger.getLogger(CropStock.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CropStock.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            for (farms farm : Serialization.deserializeFarm()) {
                farmSet.addfarm(farm);
                farm.print();
            }
        } catch (IOException ex) {
            Logger.getLogger(CropStock.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CropStock.class.getName()).log(Level.SEVERE, null, ex);
        }

        loadCombo(farmSet);

        for (HarvestImp crop : cropSet) {
            if (crop.getharvestID() == Integer.parseInt(CropID)) {
                txtacName.setText(crop.getName());
                txtacQty.setText(Double.toString(crop.getQuantity()));
                cmbProductID.addItem(crop.getCropfeild());
                txtacBuyingPrice.setText(Double.toString(crop.getBuyingPrice()));

                break;
            }
        }
    }

    // combo box load
    private void loadCombo(SetOfFarm farms) {
        DefaultComboBoxModel jc = new DefaultComboBoxModel();
        System.out.print(farms);
        int i = 0;
        if (farms.size() != 0) {
            for (farms farm : farms) {

                jc.addElement(farm.getfarmNumber());
                i++;

            }
        }
        cmbProductID.setModel(jc);
    }

    /**
     * clear all
     */
    public void clear() {
        txtacName.setText("");
        txtacQty.setText("");
        txtacBuyingPrice.setText("");
        txtacCropID.setText("");
        cropSet.removeAll(cropSet);

        try {
            for (HarvestImp crop : Serialization.deserializeHarvest()) {
                cropSet.addCrop(crop);

            }
        } catch (IOException ex) {
            Logger.getLogger(CropStock.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CropStock.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtacBuyingPrice = new javax.swing.JTextField();
        txtacQty = new javax.swing.JTextField();
        txtacCropID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtacName = new javax.swing.JTextField();
        cmbProductID = new javax.swing.JComboBox();
        lblBack = new javax.swing.JLabel();
        btnnacCancel = new javax.swing.JButton();
        btnacSave = new javax.swing.JButton();
        txtacDescription = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Crop Stock");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        txtacBuyingPrice.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtacBuyingPrice.setForeground(new java.awt.Color(153, 153, 153));
        txtacBuyingPrice.setText("Buying Price");
        txtacBuyingPrice.setToolTipText("Buying Price");
        txtacBuyingPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtacBuyingPriceKeyTyped(evt);
            }
        });
        getContentPane().add(txtacBuyingPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 200, 28));

        txtacQty.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtacQty.setForeground(new java.awt.Color(153, 153, 153));
        txtacQty.setText("Quantity");
        txtacQty.setToolTipText("Quantity");
        txtacQty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtacQtyKeyTyped(evt);
            }
        });
        getContentPane().add(txtacQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 200, 28));

        txtacCropID.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtacCropID.setForeground(new java.awt.Color(153, 153, 153));
        txtacCropID.setToolTipText("Crop ID");
        getContentPane().add(txtacCropID, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 200, 28));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Crop field :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 90, -1));

        txtacName.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtacName.setForeground(new java.awt.Color(153, 153, 153));
        txtacName.setText("Crop Name");
        txtacName.setToolTipText("Crop Name");
        getContentPane().add(txtacName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 200, 28));

        cmbProductID.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbProductID.setToolTipText("FarmID");
        cmbProductID.setName("FarmID"); // NOI18N
        getContentPane().add(cmbProductID, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 120, 30));

        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });
        getContentPane().add(lblBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 530, 20, 20));

        btnnacCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IM/MobileImages/cancel.png"))); // NOI18N
        btnnacCancel.setContentAreaFilled(false);
        btnnacCancel.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IM/MobileImages/cancel1.png"))); // NOI18N
        btnnacCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnnacCancelMouseClicked(evt);
            }
        });
        btnnacCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnacCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnnacCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 100, 40));

        btnacSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IM/MobileImages/OK.png"))); // NOI18N
        btnacSave.setContentAreaFilled(false);
        btnacSave.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IM/MobileImages/OK1.png"))); // NOI18N
        btnacSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnacSaveMouseClicked(evt);
            }
        });
        btnacSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnacSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnacSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 100, 40));

        txtacDescription.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IM/MobileImages/androback.png"))); // NOI18N
        getContentPane().add(txtacDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 600));

        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 530, 40, 30));

        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, 40, 30));

        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 530, 20, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnnacCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnacCancelMouseClicked
        clear();
    }//GEN-LAST:event_btnnacCancelMouseClicked

    private void btnnacCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnacCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnnacCancelActionPerformed

    private void btnacSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnacSaveMouseClicked
        String name, feild;
        double price, qty;

        if (txtacName.getText().isEmpty() || txtacQty.getText().isEmpty() || txtacBuyingPrice.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please provide the name...", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
            if (txtacCropID.getText().isEmpty()) {
                name = txtacName.getText();
                qty = Double.parseDouble(txtacQty.getText());
                feild = cmbProductID.getSelectedItem().toString();
                price = Double.parseDouble(txtacBuyingPrice.getText());
                String date = Calendar.getInstance().getTime().toString();

                if (cropSet.addCrop(new HarvestImp(name, qty, feild, date, price))) {

                    try {
                        Serialization.Serialize(cropSet, FILE_NAME_Crops);
                        clear();
                    } catch (IOException ex) {
                        Logger.getLogger(CropStock.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    JOptionPane.showMessageDialog(this, "Add Sucsessfully", "Message", JOptionPane.PLAIN_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Unsuccessful...", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                name = txtacName.getText();
                qty = Double.parseDouble(txtacQty.getText());
                feild = cmbProductID.getSelectedItem().toString();
                price = Double.parseDouble(txtacBuyingPrice.getText());
                String date = Calendar.getInstance().getTime().toString();

                HarvestImp crop = cropSet.getCropFromID(Integer.parseInt(CropID)).firstElement();

                String status = cropSet.updateCrop(crop, name, date, qty, price, feild);
                if (status.equals("success")) {

                    try {
                        Serialization.Serialize(cropSet, FILE_NAME_Crops);
                    } catch (IOException ex) {
                        Logger.getLogger(CropStock.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    JOptionPane.showMessageDialog(this, "You have updated successful", "Congradulations", JOptionPane.INFORMATION_MESSAGE);
                    clear();

                } else {
                    JOptionPane.showMessageDialog(this, "Update unsuccessful...", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnacSaveMouseClicked

    private void btnacSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnacSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnacSaveActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked

    }//GEN-LAST:event_jLabel9MouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        if (userLevel.equals("user")) {
            Usermainandro u = new Usermainandro(userName, userLevel, email);
            u.setVisible(true);
            this.hide();
        } else if (userLevel.equals("admin")) {
            Adminandroid a = new Adminandroid(userName, userLevel, email);
            a.setVisible(true);
            this.hide();
        }
    }//GEN-LAST:event_backMouseClicked

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        CropList cl = new CropList(userName, userLevel, email);
        cl.show();
        this.hide();

    }//GEN-LAST:event_lblBackMouseClicked

    private void txtacQtyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtacQtyKeyTyped
        validations.validateNumber(txtacQty, evt);
    }//GEN-LAST:event_txtacQtyKeyTyped

    private void txtacBuyingPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtacBuyingPriceKeyTyped
        validations.validateNumber(txtacBuyingPrice, evt);
    }//GEN-LAST:event_txtacBuyingPriceKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CropStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CropStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CropStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CropStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CropStock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JButton btnacSave;
    private javax.swing.JButton btnnacCancel;
    private javax.swing.JComboBox cmbProductID;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblBack;
    private javax.swing.JTextField txtacBuyingPrice;
    private javax.swing.JTextField txtacCropID;
    private javax.swing.JLabel txtacDescription;
    private javax.swing.JTextField txtacName;
    private javax.swing.JTextField txtacQty;
    // End of variables declaration//GEN-END:variables
}
