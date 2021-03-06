/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.MobileUI;

import Classes.farm.SetOfFarm;
import java.awt.geom.RoundRectangle2D;

/**
 *
 * @author Sachi
 */
public class userManageOptions extends javax.swing.JFrame {

    /**
     * Creates new form field_harvest1
     */
    String userName, userLevel, email;
    public static SetOfFarm thefarms = new SetOfFarm();
    public static SetOfFarm searchfarm = new SetOfFarm();
    public static final String FILE_NAME_farms = "DataFiles/farms.txt";
    String workingDir = System.getProperty("user.dir");

    /**
     *
     */
    public userManageOptions() {
        initComponents();
        this.setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 95, 95));
    }

    /**
     *
     * @param userName
     * @param userLevel
     * @param email
     */
    public userManageOptions(String userName, String userLevel, String email) {
        initComponents();
        this.userName = userName;
        this.userLevel = userLevel;
        this.email = email;
        this.setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 95, 95));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel28 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        SensorM = new javax.swing.JButton();
        userM = new javax.swing.JButton();
        exit = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 30, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Log Out");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 110, 40));

        SensorM.setText("User List");
        SensorM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SensorMMouseClicked(evt);
            }
        });
        getContentPane().add(SensorM, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 230, 30));

        userM.setText("Add New User");
        userM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userMMouseClicked(evt);
            }
        });
        getContentPane().add(userM, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 230, 30));

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

        jLabel4.setFont(new java.awt.Font("Segoe UI Semilight", 0, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Manage Users");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 200, 40));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IM/MobileImages/Adminandro.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
adminOptions d = new adminOptions(userName, userLevel,email);
        d.setVisible(true);
        this.hide();

    }//GEN-LAST:event_backMouseClicked

    private void userMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMMouseClicked
        newUser n = new newUser(userName, userLevel, email);
        n.setVisible(true);
        this.hide();
    }//GEN-LAST:event_userMMouseClicked

    private void SensorMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SensorMMouseClicked
        userList v = new userList(userName, userLevel, email);
        v.setVisible(true);
        this.hide();
    }//GEN-LAST:event_SensorMMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        Moblogin m=new Moblogin();
        m.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(userManageOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userManageOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userManageOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userManageOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userManageOptions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SensorM;
    private javax.swing.JLabel back;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton userM;
    // End of variables declaration//GEN-END:variables
}
