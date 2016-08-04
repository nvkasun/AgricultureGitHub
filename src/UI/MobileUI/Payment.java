package UI.MobileUI;

import Classes.payment.SalesCart;
import Classes.payment.SetOfCart;
import Classes.payment.maestroStrategy;
import Classes.payment.masterCardStrategy;
import Classes.payment.payPalStrategy;
import Classes.payment.visaStrategy;
import Classes.serialization.Serialization;
import java.awt.geom.RoundRectangle2D;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Lakmi
 */
public class Payment extends javax.swing.JFrame {

    /**
     * Creates new form Payment
     */
    public static SalesCart payment = new SalesCart();
    public static final String FILE_NAME_Payment = "DataFiles/payments.txt";
    private SetOfCart cartSet = new SetOfCart();
    private Serialization serialize = new Serialization();
    double total;
    String username, userLevel, email;

    public Payment() {
        initComponents();
        payPalPanel.setVisible(false);
        cardPanel.setVisible(false);
        this.setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 95, 95));

    }

    public Payment(String username, String userLevel, String email) {
        initComponents();

        this.username = username;
        this.userLevel = userLevel;
        this.email = email;

        payPalPanel.setVisible(false);
        cardPanel.setVisible(false);
        this.setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 95, 95));

        try {
            for (SalesCart cart : Serialization.deserializeCart()) {
                if (cart.getEmail().equals(username)) {
                    cartSet.addCart(cart);
                    System.out.println(cart.getCartID());
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Payment.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Payment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Payment(String username, String userLevel, String email, double tot) {
        initComponents();

        this.username = username;
        this.userLevel = userLevel;
        this.email = email;
        this.total = tot;

        payPalPanel.setVisible(false);
        cardPanel.setVisible(false);
        this.setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 95, 95));

        try {
            for (SalesCart cart : Serialization.deserializeCart()) {
                if (cart.getEmail().equals(username)) {
                    cartSet.addCart(cart);
                    System.out.println(cart.getCartID());
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Payment.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Payment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //clear all
    public void clear() {
        txtspmEmail.setText("");
        txtspmpass.setText("");
        txtspmDwe.setText("");
        txtspmExpireDate.setText("");
        txtspmSecurityCode.setText("");
        cartSet.removeAll(cartSet);

        try {
            for (SalesCart cart : Serialization.deserializeCart()) {
                if (cart.getEmail().equals(username)) {
                    cartSet.addCart(cart);
                    System.out.println(cart.getCartID());
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Payment.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Payment.class.getName()).log(Level.SEVERE, null, ex);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        rbtnPaypal = new javax.swing.JRadioButton();
        rbtnVisa = new javax.swing.JRadioButton();
        rbtnMaestro = new javax.swing.JRadioButton();
        rbtnMaster = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        cardPanel = new javax.swing.JPanel();
        txtspmDwe = new javax.swing.JTextField();
        txtspmExpireDate = new javax.swing.JTextField();
        txtspmSecurityCode = new javax.swing.JTextField();
        txtspmName = new javax.swing.JTextField();
        payPalPanel = new javax.swing.JPanel();
        txtspmpass = new javax.swing.JTextField();
        txtspmEmail = new javax.swing.JTextField();
        btnanpSave = new javax.swing.JButton();
        btnnanpCancel = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Select Payment Method");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        rbtnPaypal.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbtnPaypal);
        rbtnPaypal.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        rbtnPaypal.setForeground(new java.awt.Color(102, 102, 102));
        rbtnPaypal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnPaypalMouseClicked(evt);
            }
        });
        getContentPane().add(rbtnPaypal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, -1, -1));

        rbtnVisa.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbtnVisa);
        rbtnVisa.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        rbtnVisa.setForeground(new java.awt.Color(102, 102, 102));
        rbtnVisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnVisaMouseClicked(evt);
            }
        });
        getContentPane().add(rbtnVisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        rbtnMaestro.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbtnMaestro);
        rbtnMaestro.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        rbtnMaestro.setForeground(new java.awt.Color(102, 102, 102));
        rbtnMaestro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnMaestroMouseClicked(evt);
            }
        });
        getContentPane().add(rbtnMaestro, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, -1));

        rbtnMaster.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbtnMaster);
        rbtnMaster.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        rbtnMaster.setForeground(new java.awt.Color(102, 102, 102));
        rbtnMaster.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnMasterMouseClicked(evt);
            }
        });
        getContentPane().add(rbtnMaster, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/master.png"))); // NOI18N
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 90, 50));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/mestro.png"))); // NOI18N
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 90, 50));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/visa.png"))); // NOI18N
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/paypal.png"))); // NOI18N
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 90, -1));

        cardPanel.setBackground(new java.awt.Color(255, 255, 255));
        cardPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtspmDwe.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        txtspmDwe.setForeground(new java.awt.Color(153, 153, 153));
        txtspmDwe.setToolTipText("Card Number");
        txtspmDwe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtspmDweActionPerformed(evt);
            }
        });
        cardPanel.add(txtspmDwe, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 200, 30));

        txtspmExpireDate.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        txtspmExpireDate.setForeground(new java.awt.Color(153, 153, 153));
        txtspmExpireDate.setToolTipText("Expire Date");
        cardPanel.add(txtspmExpireDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 200, 30));

        txtspmSecurityCode.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        txtspmSecurityCode.setForeground(new java.awt.Color(153, 153, 153));
        txtspmSecurityCode.setToolTipText("Security Code");
        cardPanel.add(txtspmSecurityCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 200, 30));

        txtspmName.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        txtspmName.setForeground(new java.awt.Color(153, 153, 153));
        txtspmName.setToolTipText("User Name");
        txtspmName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtspmNameActionPerformed(evt);
            }
        });
        cardPanel.add(txtspmName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 200, 30));

        getContentPane().add(cardPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 260, 160));

        payPalPanel.setBackground(new java.awt.Color(255, 255, 255));
        payPalPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtspmpass.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        txtspmpass.setForeground(new java.awt.Color(153, 153, 153));
        txtspmpass.setToolTipText("Password");
        txtspmpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtspmpassActionPerformed(evt);
            }
        });
        payPalPanel.add(txtspmpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 200, 30));

        txtspmEmail.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        txtspmEmail.setForeground(new java.awt.Color(153, 153, 153));
        txtspmEmail.setToolTipText("Email");
        txtspmEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        payPalPanel.add(txtspmEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 200, 30));

        getContentPane().add(payPalPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 260, 140));

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
        getContentPane().add(btnanpSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 100, 40));

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
        getContentPane().add(btnnanpCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 100, 40));

        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 530, 20, 20));

        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 530, 40, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IM/MobileImages/androback.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnanpSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnanpSaveMouseClicked
        if (rbtnMaster.isSelected()) {

            if (txtspmName.getText().isEmpty() || txtspmDwe.getText().isEmpty() || txtspmSecurityCode.getText().isEmpty() || txtspmExpireDate.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please provide all details...", "Error", JOptionPane.ERROR_MESSAGE);

            } else {
                cartSet.pay(new masterCardStrategy(txtspmName.getText(), txtspmDwe.getText(), txtspmSecurityCode.getText(), txtspmExpireDate.getText()), total);
                JOptionPane.showMessageDialog(this, "Deduct " + total + " from your master card", "Message", JOptionPane.PLAIN_MESSAGE);

            }

        } else if (rbtnMaestro.isSelected()) {

            if (txtspmName.getText().isEmpty() || txtspmDwe.getText().isEmpty() || txtspmSecurityCode.getText().isEmpty() || txtspmExpireDate.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please provide all details...", "Error", JOptionPane.ERROR_MESSAGE);

            } else {
                cartSet.pay(new maestroStrategy(txtspmName.getText(), txtspmDwe.getText(), txtspmSecurityCode.getText(), txtspmExpireDate.getText()), total);
                JOptionPane.showMessageDialog(this, "Deduct " + total + " from your maestro card", "Message", JOptionPane.PLAIN_MESSAGE);

            }

        } else if (rbtnVisa.isSelected()) {

            if (txtspmName.getText().isEmpty() || txtspmDwe.getText().isEmpty() || txtspmSecurityCode.getText().isEmpty() || txtspmExpireDate.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please provide all details...", "Error", JOptionPane.ERROR_MESSAGE);

            } else {
                cartSet.pay(new visaStrategy(txtspmName.getText(), txtspmDwe.getText(), txtspmSecurityCode.getText(), txtspmExpireDate.getText()), total);
                JOptionPane.showMessageDialog(this, "Deduct " + total + " from your visa card", "Message", JOptionPane.PLAIN_MESSAGE);

            }

        } else if (rbtnPaypal.isSelected()) {

            if (txtspmpass.getText().isEmpty() || txtspmEmail.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please provide all details...", "Error", JOptionPane.ERROR_MESSAGE);

            } else {
                cartSet.pay(new payPalStrategy(txtspmEmail.getText(), txtspmpass.getText()), total);
                JOptionPane.showMessageDialog(this, "Deduct " + total + " from your paypal account", "Message", JOptionPane.PLAIN_MESSAGE);

            }

        } else {
            JOptionPane.showMessageDialog(this, "Please select your payment option...", "Error", JOptionPane.ERROR_MESSAGE);

        }
        clear();
    }//GEN-LAST:event_btnanpSaveMouseClicked

    private void btnanpSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnanpSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnanpSaveActionPerformed

    private void btnnanpCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnanpCancelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnnanpCancelMouseClicked

    private void btnnanpCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnanpCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnnanpCancelActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked

    }//GEN-LAST:event_jLabel5MouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void txtspmDweActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtspmDweActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtspmDweActionPerformed

    private void txtspmNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtspmNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtspmNameActionPerformed

    private void rbtnMaestroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnMaestroMouseClicked
        cardPanel.setVisible(true);
        payPalPanel.setVisible(false);
    }//GEN-LAST:event_rbtnMaestroMouseClicked

    private void rbtnMasterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnMasterMouseClicked
        cardPanel.setVisible(true);
        payPalPanel.setVisible(false);
    }//GEN-LAST:event_rbtnMasterMouseClicked

    private void rbtnVisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnVisaMouseClicked
        cardPanel.setVisible(true);
        payPalPanel.setVisible(false);
    }//GEN-LAST:event_rbtnVisaMouseClicked

    private void rbtnPaypalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnPaypalMouseClicked
        payPalPanel.setVisible(true);
        cardPanel.setVisible(false);
    }//GEN-LAST:event_rbtnPaypalMouseClicked

    private void txtspmpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtspmpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtspmpassActionPerformed

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
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnanpSave;
    private javax.swing.JButton btnnanpCancel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel cardPanel;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel payPalPanel;
    private javax.swing.JRadioButton rbtnMaestro;
    private javax.swing.JRadioButton rbtnMaster;
    private javax.swing.JRadioButton rbtnPaypal;
    private javax.swing.JRadioButton rbtnVisa;
    private javax.swing.JTextField txtspmDwe;
    private javax.swing.JTextField txtspmEmail;
    private javax.swing.JTextField txtspmExpireDate;
    private javax.swing.JTextField txtspmName;
    private javax.swing.JTextField txtspmSecurityCode;
    private javax.swing.JTextField txtspmpass;
    // End of variables declaration//GEN-END:variables
}