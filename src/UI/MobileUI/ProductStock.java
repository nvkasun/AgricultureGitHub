package UI.MobileUI;

import Classes.Product.ProductStockImp;
import Classes.Product.ProductsImp;
import Classes.Product.SetOfProductStock;
import Classes.Product.SetOfProducts;
import Classes.Product.productObserver;
import Classes.Product.productObserverImp;
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
public class ProductStock extends javax.swing.JFrame {

    /**
     * Creates new form ProductStock
     */
    public static ProductStockImp products = new ProductStockImp();
    public static final String FILE_NAME_ProductsStock = "DataFiles/ProductsStock.txt";
    public static final String FILE_NAME_Products = "DataFiles/Products.txt";
    private Serialization serialize = new Serialization();
    private SetOfProductStock productStockSet = new SetOfProductStock();
    private SetOfProducts productSet = new SetOfProducts();

    String username, userLevel, email;

    public ProductStock() {
        initComponents();
        this.setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 95, 95));
    }

    public ProductStock(String username, String userLevel, String email) {
        initComponents();
        this.username = username;
        this.userLevel = userLevel;
        this.email = email;

        this.setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 95, 95));

        try {
            for (ProductStockImp products : Serialization.deserializeProductsStock()) {
                productStockSet.addProductStock(products);
                System.out.println(products.getProductID());

            }
        } catch (IOException ex) {
            Logger.getLogger(ProductStock.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductStock.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            for (ProductsImp productImp : Serialization.deserializeProducts()) {
                productSet.addProducts(productImp);
                System.out.println(productImp.getName());

            }
        } catch (IOException ex) {
            Logger.getLogger(ProductStock.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductStock.class.getName()).log(Level.SEVERE, null, ex);
        }
        loadCombo(productSet);

    }

// combo box load
    private void loadCombo(SetOfProducts products) {
        DefaultComboBoxModel jc = new DefaultComboBoxModel();
        System.out.print(products);
        int i = 0;
        if (products.size() != 0) {
            for (ProductsImp product : products) {

                jc.addElement(product.getProductNo());
                i++;

            }
        }
        cmbProductID.setModel(jc);
    }

    // clear all
    public void clear() {

        txtacQty.setText("");
        txtacPrice.setText("");

        productStockSet.removeAll(productStockSet);

        try {
            for (ProductStockImp productsStock : Serialization.deserializeProductsStock()) {
                productStockSet.addProductStock(productsStock);

            }
            for (ProductsImp productsMake : Serialization.deserializeProducts()) {
                productSet.addProducts(productsMake);

            }

        } catch (IOException ex) {
            Logger.getLogger(ProductStock.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductStock.class.getName()).log(Level.SEVERE, null, ex);
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
        txtacPrice = new javax.swing.JTextField();
        txtacQty = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmbProductID = new javax.swing.JComboBox();
        lblBack = new javax.swing.JLabel();
        btnnacCancel = new javax.swing.JButton();
        btnacSave = new javax.swing.JButton();
        exit = new javax.swing.JLabel();
        txtacDescription = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Product Stock");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        txtacPrice.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtacPrice.setForeground(new java.awt.Color(153, 153, 153));
        txtacPrice.setText("Unit Price");
        txtacPrice.setToolTipText("Unit Price");
        txtacPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtacPriceKeyTyped(evt);
            }
        });
        getContentPane().add(txtacPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 200, 28));

        txtacQty.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtacQty.setForeground(new java.awt.Color(153, 153, 153));
        txtacQty.setText("Quantity");
        txtacQty.setToolTipText("Quantity");
        txtacQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtacQtyActionPerformed(evt);
            }
        });
        txtacQty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtacQtyKeyTyped(evt);
            }
        });
        getContentPane().add(txtacQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 200, 28));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Product ID :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 90, -1));

        cmbProductID.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbProductID.setToolTipText("Product ID");
        cmbProductID.setName("FarmID"); // NOI18N
        getContentPane().add(cmbProductID, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 120, 30));

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

        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 530, 40, 30));

        txtacDescription.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IM/MobileImages/androback.png"))); // NOI18N
        getContentPane().add(txtacDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 600));

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        ProductStockList cl = new ProductStockList(username, userLevel, email);
        cl.show();
        this.hide();
    }//GEN-LAST:event_lblBackMouseClicked

    private void btnnacCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnacCancelMouseClicked
        clear();
    }//GEN-LAST:event_btnnacCancelMouseClicked

    private void btnnacCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnacCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnnacCancelActionPerformed

    private void btnacSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnacSaveMouseClicked
        String name, feild, id, date;
        double price, qty;

        if (txtacQty.getText().isEmpty() || txtacPrice.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please provide the name...", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
            id = cmbProductID.getSelectedItem().toString();

            qty = Double.parseDouble(txtacQty.getText());
            feild = cmbProductID.getSelectedItem().toString();
            price = Double.parseDouble(txtacPrice.getText());
            date = Calendar.getInstance().getTime().toString();

            ProductStockImp productInter = new ProductStockImp(Integer.parseInt(id), qty, price, date);
            productStockSet.addProductStock(productInter);

            try {
                Serialization.Serialize(productStockSet, FILE_NAME_ProductsStock);
                JOptionPane.showMessageDialog(this, "Added Sucsessfully", "Message", JOptionPane.PLAIN_MESSAGE);
            } catch (IOException ex) {
                Logger.getLogger(ProductStock.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Unsuccessful...", "Error", JOptionPane.ERROR_MESSAGE);
            }

            clear();

            productObserver observer1 = new productObserverImp(Integer.parseInt(id));
            productInter.registerObserver(observer1);

            productInter.setStatus("Yes");

        }

    }//GEN-LAST:event_btnacSaveMouseClicked

    private void btnacSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnacSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnacSaveActionPerformed

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        if (userLevel.equals("user")) {
            Usermainandro u = new Usermainandro(username, userLevel, email);
            u.setVisible(true);
            this.hide();
        } else if (userLevel.equals("admin")) {
            Adminandroid a = new Adminandroid(username, userLevel, email);
            a.setVisible(true);
            this.hide();
        }
    }//GEN-LAST:event_backMouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked

    }//GEN-LAST:event_jLabel9MouseClicked

    private void txtacQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtacQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtacQtyActionPerformed

    private void txtacQtyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtacQtyKeyTyped
        validations.validateNumber(txtacQty, evt);
    }//GEN-LAST:event_txtacQtyKeyTyped

    private void txtacPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtacPriceKeyTyped
        validations.validateNumber(txtacPrice, evt);
    }//GEN-LAST:event_txtacPriceKeyTyped

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
            java.util.logging.Logger.getLogger(ProductStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductStock().setVisible(true);
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
    private javax.swing.JLabel txtacDescription;
    private javax.swing.JTextField txtacPrice;
    private javax.swing.JTextField txtacQty;
    // End of variables declaration//GEN-END:variables
}