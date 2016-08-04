/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.MobileUI;

import Classes.Product.ProductStockImp;
import Classes.Product.ProductsImp;
import Classes.Product.SetOfProductStock;
import Classes.Product.SetOfProducts;
import Classes.Product.productObserver;
import Classes.Product.productObserverImp;
import Classes.payment.SalesCart;
import Classes.payment.SetOfCart;
import Classes.serialization.Serialization;
import java.awt.Image;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Lakmi
 */
public class ViewaProduct extends javax.swing.JFrame {

    private SetOfProducts productSet = new SetOfProducts();
    public static SalesCart cart = new SalesCart();
    private SetOfCart cartSet = new SetOfCart();
    private SetOfProductStock productStockSet = new SetOfProductStock();

    public static final String FILE_NAME_Cart = "DataFiles/Cart.txt";

    String username, userLevel, email, productID;

    /**
     * Creates new form Product
     */
    public ViewaProduct() {
        initComponents();
        this.setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 95, 95));
    }

    public ViewaProduct(String userName, String userLevel, String email, String ProductID) {
        initComponents();
        this.username = userName;
        this.userLevel = userLevel;
        this.email = email;
        this.productID = ProductID;

        lblpProductID.setText(productID);

        this.setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 95, 95));

        try {
            for (ProductsImp product : Serialization.deserializeProducts()) {
                if (product.getAvalability().equals("Yes")) {
                    productSet.addProducts(product);
                }

            }
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(ViewaProduct.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            for (SalesCart cart : Serialization.deserializeCart()) {
                cartSet.addCart(cart);
            }
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(ViewaProduct.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            for (ProductStockImp productsStock : Serialization.deserializeProductsStock()) {
                productStockSet.addProductStock(productsStock);

            }
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(ViewaProduct.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (ProductsImp product : productSet) {
            if (product.getProductNo() == Integer.parseInt(productID)) {
                lblpName.setText(product.getName());
                lblpUnitPrice.setText(Double.toString(product.getPrice()));
                lblpDescription.setText(product.getdescription());
                BufferedImage bufferedImage = null;
                try {
                    InputStream inputStream = new ByteArrayInputStream(product.getImage());
                    bufferedImage = ImageIO.read(inputStream);
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
                Image img = bufferedImage;
                Image newimg = img.getScaledInstance(imgpsImage.getWidth(), imgpsImage.getHeight(), java.awt.Image.SCALE_SMOOTH);
                ImageIcon imi = new ImageIcon(newimg);
                imgpsImage.setIcon(imi);

                break;
            }
        }
    }

    //clear all
    public void clear() {

        productSet.removeAll(productSet);
        productStockSet.removeAll(productStockSet);
        cartSet.removeAll(cartSet);
        try {
            for (ProductsImp products : Serialization.deserializeProducts()) {
                if (products.getAvalability().equals("Yes")) {
                    productSet.addProducts(products);
                }

            }

            for (ProductStockImp productsStock : Serialization.deserializeProductsStock()) {
                productStockSet.addProductStock(productsStock);

            }
            for (SalesCart cart : Serialization.deserializeCart()) {
                cartSet.addCart(cart);
            }

        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(ProductSale.class.getName()).log(Level.SEVERE, null, ex);
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
        imgpsImage = new javax.swing.JLabel();
        lblpProductID = new javax.swing.JLabel();
        lblpName = new javax.swing.JLabel();
        lblpUnitPrice = new javax.swing.JLabel();
        lblpDescription = new javax.swing.JLabel();
        btnCart = new javax.swing.JButton();
        txtpQty = new javax.swing.JTextField();
        uu = new javax.swing.JTextField();
        uu1 = new javax.swing.JTextField();
        lblBack = new javax.swing.JLabel();
        btnnanpCancel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setAlwaysOnTop(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Product Details");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 210, 40));

        imgpsImage.setBackground(new java.awt.Color(255, 255, 255));
        imgpsImage.setToolTipText("");
        getContentPane().add(imgpsImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 140, 150));

        lblpProductID.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        lblpProductID.setForeground(new java.awt.Color(153, 153, 153));
        lblpProductID.setText("ProductID");
        getContentPane().add(lblpProductID, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 120, -1));

        lblpName.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        lblpName.setForeground(new java.awt.Color(153, 153, 153));
        lblpName.setText("Name");
        getContentPane().add(lblpName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 120, -1));

        lblpUnitPrice.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        lblpUnitPrice.setForeground(new java.awt.Color(153, 153, 153));
        lblpUnitPrice.setText("Unit Price");
        getContentPane().add(lblpUnitPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 120, -1));

        lblpDescription.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        lblpDescription.setForeground(new java.awt.Color(153, 153, 153));
        lblpDescription.setText("Description");
        getContentPane().add(lblpDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 260, 90));

        btnCart.setText("Add to cart");
        btnCart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCartMouseClicked(evt);
            }
        });
        getContentPane().add(btnCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, -1, -1));

        txtpQty.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtpQty.setForeground(new java.awt.Color(153, 153, 153));
        txtpQty.setText("Quantity");
        txtpQty.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtpQtyMouseEntered(evt);
            }
        });
        getContentPane().add(txtpQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 110, 40));

        uu.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        uu.setForeground(new java.awt.Color(153, 153, 153));
        uu.setMinimumSize(new java.awt.Dimension(4, 24));
        uu.setPreferredSize(new java.awt.Dimension(76, 26));
        getContentPane().add(uu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 260, 90));

        uu1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        uu1.setForeground(new java.awt.Color(153, 153, 153));
        uu1.setMinimumSize(new java.awt.Dimension(4, 24));
        uu1.setPreferredSize(new java.awt.Dimension(76, 26));
        uu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uu1ActionPerformed(evt);
            }
        });
        getContentPane().add(uu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 140, 150));

        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });
        getContentPane().add(lblBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 530, 20, 20));

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
        getContentPane().add(btnnanpCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 100, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IM/MobileImages/androback.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 600));

        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 530, 40, 30));

        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 530, 20, 20));

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

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        ProductSale cl = new ProductSale(username, userLevel, email);
        cl.setVisible(true);
        this.hide();
    }//GEN-LAST:event_lblBackMouseClicked

    private void btnCartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCartMouseClicked
        int ProductID;
        String name;
        double qty, price, uprice, quantity = 0;
        if (lblpProductID.getText().isEmpty() || txtpQty.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please provide all details...", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
            ProductID = Integer.parseInt(lblpProductID.getText());
            qty = Double.parseDouble(txtpQty.getText());
            uprice = Double.parseDouble(lblpUnitPrice.getText());
            name = lblpName.getText();
            price = qty * uprice;

            for (ProductsImp products : productSet) {
                if (products.getProductNo() == ProductID) {
                    quantity = products.getQuantity();
                    System.out.print(quantity);
                    break;
                }

            }

            if (quantity >= qty) {

                String date = Calendar.getInstance().getTime().toString();
                cartSet.addCart(new SalesCart(username, ProductID, name, qty, uprice, price, date));

                try {
                    Serialization.Serialize(cartSet, FILE_NAME_Cart);
                    cartSet.removeAll(cartSet);
                    for (SalesCart cart : Serialization.deserializeCart()) {
                        cartSet.addCart(cart);
                        System.out.println(cart.getCartID());
                    }

                    ProductsImp products = productSet.getProductFromID(ProductID).firstElement();
                    products.setQuantity(qty);
                    productObserver observer2 = new productObserverImp(ProductID);
                    products.registerObserver(observer2);
                    products.setStatus("Remove");

                    JOptionPane.showMessageDialog(this, "Add Sucsessfully", "Message", JOptionPane.PLAIN_MESSAGE);
                } catch (IOException ex) {

                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ViewaProduct.class.getName()).log(Level.SEVERE, null, ex);
                }

                clear();

            } else {
                JOptionPane.showMessageDialog(this, "This product is out of Stock", "Sorry", JOptionPane.WARNING_MESSAGE);

            }

        }
    }//GEN-LAST:event_btnCartMouseClicked

    private void txtpQtyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtpQtyMouseEntered
        txtpQty.setText("");
    }//GEN-LAST:event_txtpQtyMouseEntered

    private void uu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uu1ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewaProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewaProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewaProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewaProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewaProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCart;
    private javax.swing.JButton btnnanpCancel;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel imgpsImage;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblpDescription;
    private javax.swing.JLabel lblpName;
    private javax.swing.JLabel lblpProductID;
    private javax.swing.JLabel lblpUnitPrice;
    private javax.swing.JTextField txtpQty;
    private javax.swing.JTextField uu;
    private javax.swing.JTextField uu1;
    // End of variables declaration//GEN-END:variables
}
