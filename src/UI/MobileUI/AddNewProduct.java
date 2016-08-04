package UI.MobileUI;

import Classes.Product.ProductsImp;
import Classes.Product.SetOfProducts;
import Classes.serialization.Serialization;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.stream.ImageOutputStream;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Lakmi
 */
public class AddNewProduct extends javax.swing.JFrame {

    public static ProductsImp products = new ProductsImp();
    public static final String FILE_NAME_Products = "DataFiles/Products.txt";
    private SetOfProducts productSet = new SetOfProducts();
    private Serialization serialize = new Serialization();
    JFileChooser chooser;
    FileNameExtensionFilter filter;
    FileInputStream fis;
    String workingDir = System.getProperty("user.dir");
    String userName, userLevel, email, ProductID;

    /**
     * Creates new form ProductManagment
     */
    public AddNewProduct() {
        initComponents();
        txtanpProductID.setEditable(false);
        this.setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 95, 95));

        try {
            for (ProductsImp products : Serialization.deserializeProducts()) {
                productSet.addProducts(products);
            }
        } catch (IOException ex) {
            Logger.getLogger(AddNewProduct.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddNewProduct.class.getName()).log(Level.SEVERE, null, ex);
        }

        ImageIcon image = new ImageIcon(workingDir + "\\Images\\image.jpg");
        lblanpImage.setIcon(image);
        Image img = ((ImageIcon) lblanpImage.getIcon()).getImage();
        Image newimg = img.getScaledInstance(lblanpImage.getWidth(), lblanpImage.getHeight(), java.awt.Image.SCALE_SMOOTH);
        ImageIcon imi = new ImageIcon(newimg);
        lblanpImage.setIcon(imi);

    }

    public AddNewProduct(String userName, String userLevel, String email) {
        initComponents();
        this.userName = userName;
        this.userLevel = userLevel;
        this.email = email;
        txtanpProductID.setEditable(false);

        this.setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 95, 95));

        try {
            for (ProductsImp products : Serialization.deserializeProducts()) {
                productSet.addProducts(products);
            }
        } catch (IOException ex) {
            Logger.getLogger(AddNewProduct.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddNewProduct.class.getName()).log(Level.SEVERE, null, ex);
        }

        ImageIcon image = new ImageIcon(workingDir + "\\Images\\image.jpg");
        lblanpImage.setIcon(image);
        Image img = ((ImageIcon) lblanpImage.getIcon()).getImage();
        Image newimg = img.getScaledInstance(lblanpImage.getWidth(), lblanpImage.getHeight(), java.awt.Image.SCALE_SMOOTH);
        ImageIcon imi = new ImageIcon(newimg);
        lblanpImage.setIcon(imi);

    }

    public AddNewProduct(String userName, String userLevel, String email, String ProductID) {
        initComponents();
        this.userName = userName;
        this.userLevel = userLevel;
        this.email = email;
        this.ProductID = ProductID;
        txtanpProductID.setText(ProductID);

        txtanpProductID.setEditable(false);

        this.setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 95, 95));

        try {
            for (ProductsImp products : Serialization.deserializeProducts()) {
                productSet.addProducts(products);
            }
        } catch (IOException ex) {
            Logger.getLogger(AddNewProduct.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddNewProduct.class.getName()).log(Level.SEVERE, null, ex);
        }

        ImageIcon image = new ImageIcon(workingDir + "\\Images\\image.jpg");
        lblanpImage.setIcon(image);
        Image img = ((ImageIcon) lblanpImage.getIcon()).getImage();
        Image newimg = img.getScaledInstance(lblanpImage.getWidth(), lblanpImage.getHeight(), java.awt.Image.SCALE_SMOOTH);
        ImageIcon imi = new ImageIcon(newimg);
        lblanpImage.setIcon(imi);

    }

    /**
     * upload image to the product
     */
    public void get_image() {
        chooser = new JFileChooser();
        filter = new FileNameExtensionFilter("JPG & GIF Images", "jpg", "gif", "png");
        chooser.setFileFilter(filter);
        int result = chooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            ImageIcon icon = new ImageIcon(chooser.getSelectedFile().getAbsolutePath());
            Image img = icon.getImage();
            Image newimg = img.getScaledInstance(lblanpImage.getWidth(), lblanpImage.getHeight(), java.awt.Image.SCALE_SMOOTH);
            ImageIcon imi = new ImageIcon(newimg);
            lblanpImage.setIcon(imi);
        }
    }

    /**
     * clear all
     */
    public void clear() {
        txtanpName.setText("");
        txtanpDescription.setText("");

        ImageIcon image = new ImageIcon(workingDir + "\\Images\\image.jpg");
        lblanpImage.setIcon(image);
        Image img = ((ImageIcon) lblanpImage.getIcon()).getImage();
        Image newimg = img.getScaledInstance(lblanpImage.getWidth(), lblanpImage.getHeight(), java.awt.Image.SCALE_SMOOTH);
        ImageIcon imi = new ImageIcon(newimg);
        lblanpImage.setIcon(imi);
        productSet.removeAll(productSet);

        try {
            for (ProductsImp products : Serialization.deserializeProducts()) {
                productSet.addProducts(products);

            }
        } catch (IOException ex) {
            Logger.getLogger(AddNewProduct.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddNewProduct.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel3 = new javax.swing.JLabel();
        lblanpImage = new javax.swing.JLabel();
        uu = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtanpName = new javax.swing.JTextField();
        txtanpProductID = new javax.swing.JTextField();
        btnanpSave = new javax.swing.JButton();
        btnnanpCancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtanpDescription = new javax.swing.JTextArea();
        exit = new javax.swing.JLabel();
        back2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Add Product");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        lblanpImage.setBackground(new java.awt.Color(255, 255, 255));
        lblanpImage.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        lblanpImage.setForeground(new java.awt.Color(153, 153, 153));
        lblanpImage.setText("Upload Image");
        lblanpImage.setToolTipText("");
        getContentPane().add(lblanpImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 120, 90));

        uu.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        uu.setForeground(new java.awt.Color(153, 153, 153));
        uu.setMinimumSize(new java.awt.Dimension(4, 24));
        uu.setPreferredSize(new java.awt.Dimension(76, 26));
        getContentPane().add(uu, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 146, 120, 100));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IM/MobileImages/Upload1.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IM/MobileImages/Upload.png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 216, 70, 30));

        txtanpName.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtanpName.setForeground(new java.awt.Color(153, 153, 153));
        txtanpName.setText("Product Name");
        txtanpName.setMinimumSize(new java.awt.Dimension(4, 24));
        txtanpName.setPreferredSize(new java.awt.Dimension(76, 26));
        getContentPane().add(txtanpName, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 200, 28));

        txtanpProductID.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtanpProductID.setForeground(new java.awt.Color(153, 153, 153));
        txtanpProductID.setText("Product ID");
        txtanpProductID.setMinimumSize(new java.awt.Dimension(4, 24));
        txtanpProductID.setPreferredSize(new java.awt.Dimension(76, 26));
        getContentPane().add(txtanpProductID, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 200, 28));

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
        getContentPane().add(btnanpSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 100, 40));

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
        getContentPane().add(btnnanpCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 100, 40));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setForeground(new java.awt.Color(153, 153, 153));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txtanpDescription.setColumns(20);
        txtanpDescription.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtanpDescription.setForeground(new java.awt.Color(153, 153, 153));
        txtanpDescription.setRows(5);
        txtanpDescription.setText("Description");
        txtanpDescription.setBorder(null);
        txtanpDescription.setName(""); // NOI18N
        jScrollPane1.setViewportView(txtanpDescription);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 200, 60));

        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 530, 40, 30));

        back2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back2MouseClicked(evt);
            }
        });
        getContentPane().add(back2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, 40, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IM/MobileImages/androback.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnanpSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnanpSaveMouseClicked
        String name, description;
        if (txtanpName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please provide the name...", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
            if (ProductID.isEmpty()) {
                name = txtanpName.getText();
                description = txtanpDescription.getText();
                Icon icon = lblanpImage.getIcon();

                BufferedImage image = new BufferedImage(icon.getIconWidth(),
                        icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
                Graphics2D g2d = image.createGraphics();
                icon.paintIcon(null, g2d, 0, 0);
                g2d.dispose();

                try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
                    ImageOutputStream ios = ImageIO.createImageOutputStream(baos);
                    try {
                        ImageIO.write(image, "png", ios);
                        // Set a flag to indicate that the write was successful
                    } finally {
                        ios.close();
                    }
                    byte[] imageInByte = baos.toByteArray();

                    productSet.addProducts(new ProductsImp(name, description, 0, 0.00, "No", imageInByte));
                } catch (IOException ex) {

                }

                try {
                    Serialization.Serialize(productSet, FILE_NAME_Products);
                    JOptionPane.showMessageDialog(this, "Add Sucsessfully", "Message", JOptionPane.PLAIN_MESSAGE);
                    clear();
                } catch (IOException ex) {
                    Logger.getLogger(AddNewProduct.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                name = txtanpName.getText();
                description = txtanpDescription.getText();
                Icon icon = lblanpImage.getIcon();

                BufferedImage image = new BufferedImage(icon.getIconWidth(),
                        icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
                Graphics2D g2d = image.createGraphics();
                icon.paintIcon(null, g2d, 0, 0);
                g2d.dispose();

                try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
                    ImageOutputStream ios = ImageIO.createImageOutputStream(baos);
                    try {
                        ImageIO.write(image, "png", ios);
                        // Set a flag to indicate that the write was successful
                    } finally {
                        ios.close();
                    }
                    byte[] imageInByte = baos.toByteArray();

                    ProductsImp product = productSet.getProductFromID(Integer.parseInt(ProductID)).firstElement();

                    String status = productSet.updateProducts(product, name, description, imageInByte);
                    if (status.equals("success")) {
                        try {
                            Serialization.Serialize(productSet, FILE_NAME_Products);
                        } catch (IOException ex) {
                            Logger.getLogger(AddNewProduct.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        JOptionPane.showMessageDialog(this, "You have updated successful", "Congradulations", JOptionPane.INFORMATION_MESSAGE);
                        clear();

                    } else {
                        JOptionPane.showMessageDialog(this, "Update unsuccessful...", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }

        }

    }//GEN-LAST:event_btnanpSaveMouseClicked

    private void btnanpSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnanpSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnanpSaveActionPerformed

    private void btnnanpCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnanpCancelMouseClicked
        clear();
    }//GEN-LAST:event_btnnanpCancelMouseClicked

    private void btnnanpCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnanpCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnnanpCancelActionPerformed

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        get_image();
    }//GEN-LAST:event_jButton1MouseClicked

    private void back2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back2MouseClicked
        ProductList pl = new ProductList();
        pl.show();
        this.hide();
    }//GEN-LAST:event_back2MouseClicked

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
            java.util.logging.Logger.getLogger(AddNewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNewProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back2;
    private javax.swing.JButton btnanpSave;
    private javax.swing.JButton btnnanpCancel;
    private javax.swing.JLabel exit;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblanpImage;
    private javax.swing.JTextArea txtanpDescription;
    private javax.swing.JTextField txtanpName;
    private javax.swing.JTextField txtanpProductID;
    private javax.swing.JTextField uu;
    // End of variables declaration//GEN-END:variables
}
