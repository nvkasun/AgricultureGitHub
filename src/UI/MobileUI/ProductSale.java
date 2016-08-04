/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.MobileUI;

import Classes.Product.ProductsImp;
import Classes.Product.SetOfProductStock;
import Classes.Product.SetOfProducts;
import Classes.payment.SalesCart;
import Classes.payment.SetOfCart;
import Classes.serialization.Serialization;
import Classes.user.SetOfUsers;
import java.awt.geom.RoundRectangle2D;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Lakmi
 */
public class ProductSale extends javax.swing.JFrame {

    public static SalesCart cart = new SalesCart();
    public static final String FILE_NAME_Products = "DataFiles/Products.txt";
    public static final String FILE_NAME_ProductsStock = "DataFiles/ProductsStock.txt";
    public static final String FILE_NAME_Cart = "DataFiles/Cart.txt";
    public static SetOfUsers theUsers = new SetOfUsers();
    public static final String FILE_NAME_Users = "DataFiles/Users.txt";
    private SetOfProducts productSet = new SetOfProducts();
    private Serialization serialize = new Serialization();
    private SetOfProductStock productStockSet = new SetOfProductStock();
    private SetOfCart cartSet = new SetOfCart();
    public static String productID = "";
    /**
     * Creates new form ProductSale
     */
    String username, userLevel, email;

    public ProductSale() {
        initComponents();
        this.setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 95, 95));
    }

    public ProductSale(String userName, String userLevel, String email) {
        initComponents();
        this.username = userName;
        this.userLevel = userLevel;
        this.email = email;

        this.setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 95, 95));

        try {
            for (ProductsImp product : Serialization.deserializeProducts()) {
                if (product.getAvalability().equals("Yes")) {
                    productSet.addProducts(product);
                }

            }
        } catch (IOException ex) {
            Logger.getLogger(ProductSale.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductSale.class.getName()).log(Level.SEVERE, null, ex);
        }

        ListLoad(productSet);
    }

    /**
     *
     * load the list of product to sale
     *
     * @param crops
     */
    public void ListLoad(SetOfProducts products) {

        DefaultListModel listModel = new DefaultListModel();

        int i = 0;
        String data = "";
        listModel.addElement("ProductID     Unit Price      Name");
        if (products.size() != 0) {
            for (ProductsImp product : products) {
                data = product.getProductNo() + "                    " + product.getPrice() + "               " + product.getName();
                i++; 
                listModel.addElement(data);
            }
        }

        lstpsProduct.setModel(listModel);
        lstpsProduct.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtpsSearch = new javax.swing.JTextField();
        lblBack1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstpsProduct = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnnanpCancel = new javax.swing.JButton();
        exit = new javax.swing.JLabel();
        btnanpSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Products");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IM/MobileImages/download.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 30, 30));

        txtpsSearch.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtpsSearch.setForeground(new java.awt.Color(153, 153, 153));
        txtpsSearch.setText("Search");
        txtpsSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpsSearchKeyReleased(evt);
            }
        });
        getContentPane().add(txtpsSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 145, 260, 40));

        lblBack1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBack1MouseClicked(evt);
            }
        });
        getContentPane().add(lblBack1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 530, 20, 20));

        lstpsProduct.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        lstpsProduct.setForeground(new java.awt.Color(153, 153, 153));
        lstpsProduct.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        lstpsProduct.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstpsProductValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstpsProduct);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 260, 270));

        jButton1.setText("My Cart");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IM/MobileImages/androback.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 600));

        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 530, 20, 20));

        btnnanpCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IM/MobileImages/cancel.png"))); // NOI18N
        btnnanpCancel.setContentAreaFilled(false);
        btnnanpCancel.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IM/MobileImages/cancel1.png"))); // NOI18N
        btnnanpCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnnanpCancelMouseClicked(evt);
            }
        });
        btnnanpCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnanpCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnnanpCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, 100, 40));

        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 530, 40, 30));

        btnanpSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IM/MobileImages/OK.png"))); // NOI18N
        btnanpSave.setContentAreaFilled(false);
        btnanpSave.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IM/MobileImages/OK1.png"))); // NOI18N
        btnanpSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnanpSaveMouseClicked(evt);
            }
        });
        btnanpSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnanpSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnanpSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, 100, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked

    }//GEN-LAST:event_jLabel10MouseClicked

    private void btnnanpCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnanpCancelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnnanpCancelMouseClicked

    private void btnnanpCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnanpCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnnanpCancelActionPerformed

    private void btnanpSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnanpSaveMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnanpSaveMouseClicked

    private void btnanpSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnanpSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnanpSaveActionPerformed

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void txtpsSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpsSearchKeyReleased
        SetOfProducts search = new SetOfProducts();

        if (!txtpsSearch.getText().toString().equalsIgnoreCase("")) {
            search = productSet.getProductFromName(txtpsSearch.getText());
            ListLoad(search);

        }

    }//GEN-LAST:event_txtpsSearchKeyReleased

    private void lstpsProductValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstpsProductValueChanged
        String id = lstpsProduct.getSelectedValue().toString();
        String[] parts = id.split(" ");
        productID = parts[0];
       ViewaProduct p = new ViewaProduct(username, userLevel, email, productID);
        p.show();
        this.hide();
    }//GEN-LAST:event_lstpsProductValueChanged

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        MyCart c = new MyCart(username, userLevel, email);
        c.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jButton1MouseClicked

    private void lblBack1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBack1MouseClicked
        Adminandroid cl = new Adminandroid(username, userLevel, email);
       cl.setVisible(true);
        this.hide();
    }//GEN-LAST:event_lblBack1MouseClicked

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
            java.util.logging.Logger.getLogger(ProductSale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductSale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductSale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductSale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductSale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnanpSave;
    private javax.swing.JButton btnnanpCancel;
    private javax.swing.JLabel exit;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBack1;
    private javax.swing.JList lstpsProduct;
    private javax.swing.JTextField txtpsSearch;
    // End of variables declaration//GEN-END:variables
}