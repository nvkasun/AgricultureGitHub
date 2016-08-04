/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.MobileUI;

import Classes.analysis.CropAnalyser;
import Classes.farm.farms;
import Classes.serialization.Serialization;
import java.awt.geom.RoundRectangle2D;
import java.io.IOException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gihan
 */
public class data_analysis extends javax.swing.JFrame {

    /**
     * Creates new form data_analysis
     */
    String username, userLevel, email;

    public data_analysis() {
        initComponents();
         this.setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 95, 95));
    }

    /**
     *
     * @param username
     * @param userLevel
     * @param email
     */
    public data_analysis(String username, String userLevel, String email) {

        initComponents();
        this.username = username;
        this.userLevel = userLevel;
        this.email = email;
         this.setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 95, 95));

        String values = "a\nb\n";
        try {
            for (farms farm : Serialization.deserializeFarm()) {

                values = values + "\n" + farm.getfarmNumber();
            }
            String[] farms = values.split("\\n+");
            jComboBox1.removeAllItems();

            jComboBox1.addItem("Select a Farm");
            for (int i = 2; i < farms.length; i++) {
                jComboBox1.addItem(farms[i]);
                System.out.println(farms[i]);
            }
        } catch (ClassNotFoundException | IOException ex) {
            Logger.getLogger(data_analysis.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel11 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        SM = new javax.swing.JLabel();
        ST = new javax.swing.JLabel();
        AT = new javax.swing.JLabel();
        SA = new javax.swing.JLabel();
        LS = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        jLabel11.setText("Farm ID          :");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 100, -1));

        jComboBox1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 11)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select a Farm" }));
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 140, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel2.setText("Average Soil Moisture        :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 170, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel3.setText("Average Soil Temperature  :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 170, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel4.setText("Average Air Tempurature   :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 170, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel5.setText("Average Soil Acidity           :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 170, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel6.setText("Average Lights                   :");
        jLabel6.setToolTipText("");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 170, -1));

        SM.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        getContentPane().add(SM, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 80, -1));

        ST.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        getContentPane().add(ST, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 80, -1));

        AT.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        getContentPane().add(AT, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 80, -1));

        SA.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        getContentPane().add(SA, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 80, -1));

        LS.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        getContentPane().add(LS, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 80, -1));

        jLabel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Average details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semilight", 0, 18))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 280, 190));

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IM/MobileImages/androback.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked
        CropAnalyser cropAnalyser = new CropAnalyser();
        String farm = jComboBox1.getSelectedItem().toString();
        System.out.print(farm);
        if (farm.equals("Select a Farm")) {
            AT.setText("");
            LS.setText("");
            SA.setText("");
            SM.setText("");
            ST.setText("");
        } else {
            String details = cropAnalyser.analiseDetails("crop", Integer.parseInt(farm), Calendar.getInstance().getTime(), Calendar.getInstance().getTime());
            String[] count = details.split(" ");
            System.out.println(count[4]);
            AT.setText((double)Math.round((Double.parseDouble(count[0]) * 100.0 ) / 100.0)+"");
            LS.setText((double)Math.round((Double.parseDouble(count[1]) * 100.0 ) / 100.0)+"");
            SA.setText((double)Math.round((Double.parseDouble(count[2]) * 100.0 ) / 100.0)+"");
            SM.setText((double)Math.round((Double.parseDouble(count[3]) * 100.0 ) / 100.0)+"");
            ST.setText((double)Math.round((Double.parseDouble(count[4]) * 100.0 ) / 100.0)+"");
        }
    }//GEN-LAST:event_jComboBox1MouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        mobViewsensors a = new mobViewsensors(username, userLevel, email);
        a.setVisible(true);
        this.hide();
    }//GEN-LAST:event_backMouseClicked

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
            java.util.logging.Logger.getLogger(data_analysis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(data_analysis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(data_analysis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(data_analysis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new data_analysis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AT;
    private javax.swing.JLabel LS;
    private javax.swing.JLabel SA;
    private javax.swing.JLabel SM;
    private javax.swing.JLabel ST;
    private javax.swing.JLabel back;
    private javax.swing.JLabel exit;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
