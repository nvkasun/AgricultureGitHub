/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.MobileUI;

import java.awt.geom.RoundRectangle2D;
import Classes.analysis.Analiser;
import Classes.analysis.CropAnalyser;
import Classes.analysis.PriceDecorator;
import Classes.analysis.QuantityDecorator;
import Classes.farm.SetOfFarm;
import Classes.farm.farms;
import Classes.serialization.Serialization;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author gihan
 */
public class field_harvest extends javax.swing.JFrame {

    /**
     * Creates new form field_harvest
     */
    String username, userLevel, email;
    public static SetOfFarm thefarms = new SetOfFarm();
    SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");
    Calendar cal = Calendar.getInstance();

    public field_harvest() {
        initComponents();
    }

    public field_harvest(String userName, String userLevel, String email) {
        initComponents();
        this.username = userName;
        this.userLevel = userLevel;
        this.email = email;

        this.setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 95, 95));
        startDate.getMonthView().setUpperBound(Calendar.getInstance().getTime());
        endDate.getMonthView().setUpperBound(Calendar.getInstance().getTime());
        cal.add(Calendar.DATE, -1);
        startDate.setDate(cal.getTime());
        endDate.setDate(Calendar.getInstance().getTime());

        try {
            for (farms farm : Serialization.deserializeFarm()) {
                thefarms.addfarm(farm);
                farm.print();
            }
        } catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }

        String values = "";

        for (int i = 0; i < thefarms.size(); i++) {
            values = values + " " + thefarms.elementAt(i).getfarmNumber();
        }

        String[] splited = values.split("\\s+");
        for (int i = 0; i < splited.length; i++) {
            System.out.println(splited[i]);
        }
        loadCombo(jComboBox1, splited);
    }

    /**
     *
     * @param fieldID
     * @param start
     * @param end
     * @return
     */
    public String getAnalysis(String type, int fieldID, Date start, Date end) {

        String analiseDetails = "";
        if (type.equals("quantity") || type.equals("")) {
            Analiser analyser = new QuantityDecorator(new CropAnalyser());
            analiseDetails = analyser.analiseDetails("crop", fieldID, start, end);
            System.out.println(analiseDetails);
        } else {
            Analiser analyser = new PriceDecorator(new CropAnalyser());
            analiseDetails = analyser.analiseDetails("crop", fieldID, start, end);
            System.out.println(analiseDetails);
        }
        return analiseDetails;
    }

    /**
     *
     * @param values
     * @param jComboBox
     */
    public void loadCombo(JComboBox jComboBox, String[] values) {
        jComboBox.removeAllItems();
        jComboBox.addItem("Select a Farm");
        for (int i = 1; i < values.length; i++) {
            jComboBox.addItem(values[i]);
        }
    }

    /**
     *
     */
    private void process() {
        if (!jComboBox1.getSelectedItem().toString().equals("Select a Farm")) {
            String details, radio = "";
            if (rdYes.isSelected()) {
                radio = "quantity";
                details = getAnalysis(radio, Integer.parseInt(jComboBox1.getSelectedItem().toString()), startDate.getDate(), endDate.getDate());
                String[] count = details.split("Quntity");
                String[] averageSens = count[0].split(" ");
                AT.setText((double) Math.round((Double.parseDouble(averageSens[0]) * 100.0) / 100.0) + "");
                LS.setText((double) Math.round((Double.parseDouble(averageSens[1]) * 100.0) / 100.0) + "");
                SA.setText((double) Math.round((Double.parseDouble(averageSens[2]) * 100.0) / 100.0) + "");
                SM.setText((double) Math.round((Double.parseDouble(averageSens[3]) * 100.0) / 100.0) + "");
                ST.setText((double) Math.round((Double.parseDouble(averageSens[4]) * 100.0) / 100.0) + "");

                String[] tot = count[1].split(" ");
                total.setText(tot[0]);
                totalOfID.setText(tot[1]);
                precentage.setText(tot[2]);

                jLabel3.setText("Total  Quantity                   :");
                jLabel2.setText("Average  Quantity              :");
                jLabel20.setText("Presentage of Quantity         :");

            } else if (rdno.isSelected()) {
                radio = "price";
                details = getAnalysis(radio, Integer.parseInt(jComboBox1.getSelectedItem().toString()), startDate.getDate(), endDate.getDate());
                String[] count = details.split("price");
                String[] averageSens = count[0].split(" ");
                AT.setText((double) Math.round((Double.parseDouble(averageSens[0]) * 100.0) / 100.0) + "");
                LS.setText((double) Math.round((Double.parseDouble(averageSens[1]) * 100.0) / 100.0) + "");
                SA.setText((double) Math.round((Double.parseDouble(averageSens[2]) * 100.0) / 100.0) + "");
                SM.setText((double) Math.round((Double.parseDouble(averageSens[3]) * 100.0) / 100.0) + "");
                ST.setText((double) Math.round((Double.parseDouble(averageSens[4]) * 100.0) / 100.0) + "");

                jLabel3.setText("Total Average Price           :");
                jLabel2.setText("Average Price of Crop         :");
                jLabel20.setText("Percentage of Average Price :");

                String[] tot = count[1].split(" ");
                total.setText(tot[0]);
                totalOfID.setText(tot[1]);
                precentage.setText(tot[2]);
            }

        } else {
            AT.setText("");
            LS.setText("");
            SA.setText("");
            SM.setText("");
            ST.setText("");
            total.setText("");
            totalOfID.setText("");
            precentage.setText("");

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
        jToolBar1 = new javax.swing.JToolBar();
        jLabel4 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        startDate = new org.jdesktop.swingx.JXDatePicker();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        endDate = new org.jdesktop.swingx.JXDatePicker();
        rdno = new javax.swing.JRadioButton();
        rdYes = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        cc2 = new javax.swing.JTextField();
        cc = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        ST = new javax.swing.JTextField();
        AT = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        SM = new javax.swing.JTextField();
        LS = new javax.swing.JTextField();
        SA = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        precentage = new javax.swing.JTextField();
        totalOfID = new javax.swing.JTextField();
        total = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtancDescription = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Field Harvest Analysis");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 110, -1, -1));

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

        startDate.setForeground(new java.awt.Color(102, 102, 102));
        startDate.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        startDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startDateActionPerformed(evt);
            }
        });
        getContentPane().add(startDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 130, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Start Date         :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Select field        :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(102, 102, 102));
        jComboBox1.setBorder(null);
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 130, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("End Date          :");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        endDate.setForeground(new java.awt.Color(102, 102, 102));
        endDate.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        endDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endDateActionPerformed(evt);
            }
        });
        getContentPane().add(endDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 130, -1));

        rdno.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdno);
        rdno.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        rdno.setForeground(new java.awt.Color(102, 102, 102));
        rdno.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rdnoStateChanged(evt);
            }
        });
        getContentPane().add(rdno, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 20, 20));

        rdYes.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdYes);
        rdYes.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        rdYes.setForeground(new java.awt.Color(102, 102, 102));
        rdYes.setSelected(true);
        rdYes.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rdYesStateChanged(evt);
            }
        });
        getContentPane().add(rdYes, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 20, 20));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Price");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, -1, -1));

        jLabel29.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(102, 102, 102));
        jLabel29.setText("Quantity");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        cc2.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        cc2.setForeground(new java.awt.Color(102, 102, 102));
        cc2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(cc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 100, 30));

        cc.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        cc.setForeground(new java.awt.Color(102, 102, 102));
        cc.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(cc, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 100, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("Avg soil acidity");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 140, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("Avg soil moisture");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 140, 20));

        ST.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        ST.setForeground(new java.awt.Color(102, 102, 102));
        ST.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ST.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                STActionPerformed(evt);
            }
        });
        getContentPane().add(ST, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 130, 20));

        AT.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        AT.setForeground(new java.awt.Color(102, 102, 102));
        AT.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(AT, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 130, 20));

        jLabel16.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("Avg Lights");
        jLabel16.setToolTipText("");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 120, 20));

        SM.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        SM.setForeground(new java.awt.Color(102, 102, 102));
        SM.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(SM, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 130, 20));

        LS.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        LS.setForeground(new java.awt.Color(102, 102, 102));
        LS.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(LS, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 130, 20));

        SA.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        SA.setForeground(new java.awt.Color(102, 102, 102));
        SA.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        SA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SAActionPerformed(evt);
            }
        });
        getContentPane().add(SA, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 130, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Total  Quantity");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 140, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Average  Quantity");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 120, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
        jLabel20.setText("Presentage of Quantity");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 140, -1));

        precentage.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        precentage.setForeground(new java.awt.Color(102, 102, 102));
        precentage.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(precentage, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, 120, 20));

        totalOfID.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        totalOfID.setForeground(new java.awt.Color(102, 102, 102));
        totalOfID.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(totalOfID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 130, 20));

        total.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        total.setForeground(new java.awt.Color(102, 102, 102));
        total.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 130, 20));

        jLabel19.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setText("Avg soil Temperature");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, 20));

        jLabel18.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setText("Avg Air tempurature");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 140, 20));

        txtancDescription.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        txtancDescription.setForeground(new java.awt.Color(102, 102, 102));
        txtancDescription.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(txtancDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 280, 210));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IM/MobileImages/androback.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        analysisOptions a = new analysisOptions(username, userLevel, email);
        a.setVisible(true);
        this.hide();
    }//GEN-LAST:event_backMouseClicked

    private void startDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startDateActionPerformed
        if (startDate.getEditor().getText().isEmpty()) {
            cal.add(Calendar.DATE, -1);
            startDate.setDate(cal.getTime());
        }
        System.out.println(sdf.format(startDate.getDate()));
        process();
    }//GEN-LAST:event_startDateActionPerformed

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked

        process();
    }//GEN-LAST:event_jComboBox1MouseClicked

    private void endDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endDateActionPerformed
        if (endDate.getEditor().getText().isEmpty()) {
            endDate.setDate(Calendar.getInstance().getTime());
        }
        process();
    }//GEN-LAST:event_endDateActionPerformed

    private void rdYesStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rdYesStateChanged
        process();
    }//GEN-LAST:event_rdYesStateChanged

    private void rdnoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rdnoStateChanged
        process();
    }//GEN-LAST:event_rdnoStateChanged

    private void STActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_STActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_STActionPerformed

    private void SAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SAActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(field_harvest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
         //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new field_harvest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AT;
    private javax.swing.JTextField LS;
    private javax.swing.JTextField SA;
    private javax.swing.JTextField SM;
    private javax.swing.JTextField ST;
    private javax.swing.JLabel back;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField cc;
    private javax.swing.JTextField cc2;
    private org.jdesktop.swingx.JXDatePicker endDate;
    private javax.swing.JLabel exit;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField precentage;
    private javax.swing.JRadioButton rdYes;
    private javax.swing.JRadioButton rdno;
    private org.jdesktop.swingx.JXDatePicker startDate;
    private javax.swing.JTextField total;
    private javax.swing.JTextField totalOfID;
    private javax.swing.JTextField txtancDescription;
    // End of variables declaration//GEN-END:variables
}
