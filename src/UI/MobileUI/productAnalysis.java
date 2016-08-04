/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.MobileUI;

import Classes.Product.ProductsImp;
import Classes.Product.SetOfProducts;
import Classes.analysis.Analiser;
import Classes.analysis.PriceDecorator;
import Classes.analysis.ProductAnalyser;
import Classes.analysis.QuantityDecorator;
import Classes.serialization.Serialization;
import java.awt.geom.RoundRectangle2D;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

/**
 *
 * @author gihan
 */
public class productAnalysis extends javax.swing.JFrame {

    /**
     * Creates new form productAnalysis
     */
    String username, userLevel, email;
    SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");
    Calendar cal = Calendar.getInstance();
    private SetOfProducts productSet = new SetOfProducts();

    public productAnalysis() {
        initComponents();
    }

    public productAnalysis(String userName, String userLevel, String email) {
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
            for (ProductsImp productImp : Serialization.deserializeProducts()) {
                productSet.addProducts(productImp);
                System.out.println(productImp.getName());

            }

        } catch (ClassNotFoundException | IOException ex) {
            Logger.getLogger(productAnalysis.class.getName()).log(Level.SEVERE, null, ex);
        }

        String values = "";

        for (int i = 0; i < productSet.size(); i++) {
            values = values + "\n" + productSet.elementAt(i).getName();
        }

        String[] splited = values.split("\\n+");
        for (int i = 0; i < splited.length; i++) {
            System.out.println(splited[i]);
        }
        loadCombo(jComboBox1, splited);
    }

    /**
     *
     * @param type
     * @param productID
     * @param start
     * @param end
     * @return
     */
    public String getAnalysis(String type, int productID, Date start, Date end) {

        String analiseDetails = "";
        if (type.equals("quantity") || type.equals("")) {
            Analiser analyser = new QuantityDecorator(new ProductAnalyser());
            analiseDetails = analyser.analiseDetails("product", productID, start, end);
            System.out.println(analiseDetails);
        } else {
            Analiser analyser = new PriceDecorator(new ProductAnalyser());
            analiseDetails = analyser.analiseDetails("product", productID, start, end);
            System.out.println(analiseDetails);
        }
        return analiseDetails;
    }
     /**
     *
     * @param values
     * @param jComboBox
     */
    private void loadCombo(JComboBox jComboBox, String[] values) {
        jComboBox.removeAllItems();
        jComboBox.addItem("Select a Product");
        for (int i = 1; i < values.length; i++) {
            jComboBox.addItem(values[i]);
        }
    }

    /**
     *
     */
    private void process() {
        if (!jComboBox1.getSelectedItem().toString().equals("Select a Product")) {
            String productName = jComboBox1.getSelectedItem().toString();
            int productNo = 0;
            for (ProductsImp productImp : productSet) {
                if (productImp.getName().equals(productName)) {
                    productNo = productImp.getProductNo();
                    break;
                }
            }

            String details, radio = "";
            if (rdYes.isSelected()) {
                radio = "price";

                details = getAnalysis(radio, productNo, startDate.getDate(), endDate.getDate());
                String[] count = details.split("price");
                String[] averageSens = count[0].split(" ");
                avgBuyinPrice.setText(averageSens[1] + "0");

                String[] tot = count[1].split(" ");
                avgSellinPrice.setText(tot[0] + "0");

                if (avgSellinPrice.getText().equals("0.00")) {
                    profit.setText("0.00");

                } else {
                    profit.setText((Double.parseDouble(avgSellinPrice.getText()) - Double.parseDouble(avgBuyinPrice.getText())) + "0");
                }

            } else if (rdno.isSelected()) {
                radio = "quantity";
                details = getAnalysis(radio, productNo, startDate.getDate(), endDate.getDate());
                String[] count = details.split("Quntity");

                
                jLabel15.setText("Total  Sold Quantity              :");
                jLabel19.setText("Average  Sold Quantity         :");
                jLabel18.setText("Presentage of Sold Quantity :");
                String[] tot = count[1].split(" ");
                avgBuyinPrice.setText(tot[0] + "0");

                avgSellinPrice.setText(tot[1] + "0");
                profit.setText(tot[2]);
            }
        } else {
            profit.setText("");
            avgBuyinPrice.setText("");
            avgSellinPrice.setText("");
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
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        profit = new javax.swing.JTextField();
        avgSellinPrice = new javax.swing.JTextField();
        avgBuyinPrice = new javax.swing.JTextField();
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
        jLabel7.setText("Quantity");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, -1, -1));

        jLabel29.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(102, 102, 102));
        jLabel29.setText("Price");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        cc2.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        cc2.setForeground(new java.awt.Color(102, 102, 102));
        cc2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(cc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 100, 30));

        cc.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        cc.setForeground(new java.awt.Color(102, 102, 102));
        cc.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(cc, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 100, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("Average Buying Price");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 130, 30));

        jLabel19.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setText("Average Selling Price ");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 130, 30));

        jLabel18.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setText("Total Profit");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 130, 30));

        profit.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        profit.setForeground(new java.awt.Color(102, 102, 102));
        profit.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(profit, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 130, 30));

        avgSellinPrice.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        avgSellinPrice.setForeground(new java.awt.Color(102, 102, 102));
        avgSellinPrice.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(avgSellinPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 130, -1));

        avgBuyinPrice.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        avgBuyinPrice.setForeground(new java.awt.Color(102, 102, 102));
        avgBuyinPrice.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(avgBuyinPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 130, 30));

        txtancDescription.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        txtancDescription.setForeground(new java.awt.Color(102, 102, 102));
        txtancDescription.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(txtancDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 280, 170));

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
            java.util.logging.Logger.getLogger(productAnalysis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
         //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new productAnalysis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField avgBuyinPrice;
    private javax.swing.JTextField avgSellinPrice;
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
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField profit;
    private javax.swing.JRadioButton rdYes;
    private javax.swing.JRadioButton rdno;
    private org.jdesktop.swingx.JXDatePicker startDate;
    private javax.swing.JTextField txtancDescription;
    // End of variables declaration//GEN-END:variables
}
