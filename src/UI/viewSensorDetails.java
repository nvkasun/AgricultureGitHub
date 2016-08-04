/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Classes.farm.SetOfFarm;
import Classes.farm.farms;
import Classes.serialization.Serialization;
import java.awt.Image;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Sachi
 */
public class viewSensorDetails extends javax.swing.JFrame {

    /**
     * Creates new form UserviewSensorDetails
     */
    String username, userLevel;
    public static SetOfFarm thefarms = new SetOfFarm();
    public static SetOfFarm searchfarm = new SetOfFarm();
    public static final String FILE_NAME_farms = "DataFiles/farms.txt";

    /**
     *
     */
    public viewSensorDetails() {
        initComponents();
    }

    /**
     *
     * @param username
     * @param userLevel
     * @param email
     */
    public viewSensorDetails(String username, String userLevel, String email) {
        initComponents();
        this.username = username;
        this.userLevel = userLevel;
        logedUser.setText(email);

        try {
            for (farms farm : Serialization.deserializeFarm()) {
                thefarms.addfarm(farm);
                farm.print();
            }
        } catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }

        try {

            String location = "Badulla";
            String url = "http://maps.googleapis.com/maps/api/staticmap?center=" + location + "&size=670x330&maptype=roadmap&";

            double longi = 0.00, lati = 0.00;
            String color;
            final String[] proper_noun = {"red", "brown", "#347C17", "#56A5EC", "purple", "#347C17"};
            Random random = new Random();
            for (farms farm : thefarms) {
                longi = Double.parseDouble(farm.getlongitude());
                lati = Double.parseDouble(farm.getlatitude());
                int index = random.nextInt(proper_noun.length);
                color = proper_noun[index];
                url = url + "markers=color:" + color + "%7Clabel:" + farm.getfarmNumber() + "%7C" + longi + "," + lati + "&";
            }
            url = url + "sensor=false&zoom=3";

            String destinationFile = "src\\Images\\googleImage.jpg";
            String str = destinationFile;
            URL urls = new URL(url);
            OutputStream os;
            try (InputStream is = urls.openStream()) {
                os = new FileOutputStream(destinationFile);
                byte[] b = new byte[2048];
                int length;
                while ((length = is.read(b)) != -1) {
                    os.write(b, 0, length);
                }
            }
            os.close();

            Image map = ImageIO.read(new File("src\\Images\\googleImage.jpg"));
            googleMap.setText("");
            googleMap.setIcon(new ImageIcon(map.getScaledInstance(670, 330, Image.SCALE_SMOOTH)));

        } catch (NumberFormatException | IOException e) {
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

        search1 = new javax.swing.JTextField();
        googleMap = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtanpDes = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        addDetails = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        viewDetails = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        txtancName = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        logedUser = new javax.swing.JLabel();
        logout4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        search1.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        search1.setForeground(new java.awt.Color(102, 102, 102));
        search1.setText("Location ...");
        search1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        search1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                search1MouseClicked(evt);
            }
        });
        search1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search1KeyReleased(evt);
            }
        });
        getContentPane().add(search1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 260, 40));

        googleMap.setToolTipText("");
        getContentPane().add(googleMap, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 290, 670, 330));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 153));
        jLabel7.setText("View Sensor Details");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 260, 40));

        txtanpDes.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        txtanpDes.setForeground(new java.awt.Color(102, 102, 102));
        txtanpDes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(txtanpDes, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 290, 670, 330));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 10, 350));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SemMainLogo.png"))); // NOI18N
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 480, 150));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search_icon.png"))); // NOI18N
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, -1, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Field Stations");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 150, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Product Sales");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 230, 150, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Admin Panal");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 230, 140, 30));

        addDetails.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        addDetails.setForeground(new java.awt.Color(102, 102, 102));
        addDetails.setText("Add Sensor Details");
        addDetails.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        addDetails.setContentAreaFilled(false);
        addDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addDetailsMouseClicked(evt);
            }
        });
        getContentPane().add(addDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, 260, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Data Analysis");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 230, 140, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semilight", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Find Location");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 220, 60));

        viewDetails.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        viewDetails.setForeground(new java.awt.Color(102, 102, 102));
        viewDetails.setText("View Details");
        viewDetails.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        viewDetails.setContentAreaFilled(false);
        viewDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewDetailsMouseClicked(evt);
            }
        });
        getContentPane().add(viewDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 500, 260, 40));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/footer.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 1360, -1));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 282, 240, 10));

        txtancName.setEditable(false);
        txtancName.setBackground(new java.awt.Color(255, 255, 255));
        txtancName.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        txtancName.setForeground(new java.awt.Color(102, 102, 102));
        txtancName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(txtancName, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 630, 40));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Close2.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 0, 40, 20));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Max2.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Max.png"))); // NOI18N
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 0, 40, 20));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Min2.png"))); // NOI18N
        jButton3.setContentAreaFilled(false);
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Min.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 0, 40, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel5.setText("Agriculture Sensoring Sys");
        jLabel5.setToolTipText("");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 4, 130, 20));

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("www.Agrivi.com/Agriculture Sensoring/FieldStations.htm");
        jLabel9.setToolTipText("");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 31, 540, 20));

        logedUser.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        logedUser.setForeground(new java.awt.Color(102, 102, 102));
        logedUser.setText("logged User");
        getContentPane().add(logedUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 300, 50));

        logout4.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        logout4.setForeground(new java.awt.Color(102, 102, 102));
        logout4.setText("Log Out");
        logout4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout4MouseClicked(evt);
            }
        });
        getContentPane().add(logout4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 90, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BackgroundImage.png"))); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(1360, 771));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1370, 770));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        viewSensorDetails v = new viewSensorDetails(username, userLevel, logedUser.getText());
        v.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setState(1);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void viewDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewDetailsMouseClicked
        data_analysis d = new data_analysis(username, userLevel, logedUser.getText());
        d.setVisible(true);
        this.hide();
    }//GEN-LAST:event_viewDetailsMouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        ProductSale p = new ProductSale(username, userLevel, logedUser.getText());
        p.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        viewSensorDetails v = new viewSensorDetails(username, userLevel, logedUser.getText());
        v.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        userManagement u = new userManagement(username, userLevel, logedUser.getText());
        u.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        field_harvest f = new field_harvest(username, userLevel, logedUser.getText());
        f.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void search1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search1KeyReleased
        loadMap(search1.getText().toLowerCase());
    }//GEN-LAST:event_search1KeyReleased

    private void search1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search1MouseClicked
        search1.setText("");
    }//GEN-LAST:event_search1MouseClicked

    private void addDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addDetailsMouseClicked
        manageSensorDetails v = new manageSensorDetails(username, userLevel, logedUser.getText());
        v.setVisible(true);
        this.hide();
    }//GEN-LAST:event_addDetailsMouseClicked

    private void logout4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout4MouseClicked
        Login l=new Login();
        l.setVisible(true);
        this.hide();
    }//GEN-LAST:event_logout4MouseClicked

    /**
     *
     * @param locations
     */
    public void loadMap(String locations) {

        try {
            for (farms farm : Serialization.deserializeFarm()) {
                thefarms.addfarm(farm);
                farm.print();
            }
        } catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }

        try {

            String url = "http://maps.googleapis.com/maps/api/staticmap?center=" + locations + "&size=670x330&maptype=roadmap&";

            double longi = 0.00, lati = 0.00;
            String color;
            final String[] proper_noun = {"red", "brown", "green", "blue", "purple", "yellow"};
            Random random = new Random();
            for (farms farm : thefarms) {
                longi = Double.parseDouble(farm.getlongitude());
                lati = Double.parseDouble(farm.getlatitude());
                int index = random.nextInt(proper_noun.length);
                color = proper_noun[index];
                url = url + "markers=color:" + color + "%7Clabel:" + farm.getfarmNumber() + "%7C" + longi + "," + lati + "&";
            }
            url = url + "sensor=false&zoom=3";

            String destinationFile = "src\\Images\\googleImage.jpg";
            String str = destinationFile;
            URL urls = new URL(url);
            OutputStream os;
            try (InputStream is = urls.openStream()) {
                os = new FileOutputStream(destinationFile);
                byte[] b = new byte[2048];
                int length;
                while ((length = is.read(b)) != -1) {
                    os.write(b, 0, length);
                }
            }
            os.close();

            Image map = ImageIO.read(new File("src\\Images\\googleImage.jpg"));
            googleMap.setText("");
            googleMap.setIcon(new ImageIcon(map.getScaledInstance(670, 330, Image.SCALE_SMOOTH)));

        } catch (NumberFormatException | IOException e) {
        }
    }

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
            java.util.logging.Logger.getLogger(viewSensorDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewSensorDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDetails;
    private javax.swing.JLabel googleMap;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel logedUser;
    private javax.swing.JLabel logout4;
    private javax.swing.JTextField search1;
    private javax.swing.JTextField txtancName;
    private javax.swing.JTextField txtanpDes;
    private javax.swing.JButton viewDetails;
    // End of variables declaration//GEN-END:variables
}