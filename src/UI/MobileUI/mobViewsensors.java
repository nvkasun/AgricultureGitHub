/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.MobileUI;

import Classes.farm.SetOfFarm;
import Classes.farm.farms;
import Classes.serialization.Serialization;
import java.awt.Image;
import java.awt.geom.RoundRectangle2D;
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
public class mobViewsensors extends javax.swing.JFrame {

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
    public mobViewsensors() {
        initComponents();
        this.setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 95, 95));
    }

    /**
     *
     * @param userName
     * @param userLevel
     * @param email
     */
    public mobViewsensors(String userName, String userLevel, String email) {
        initComponents();
        this.userName = userName;
        this.userLevel = userLevel;
        this.email = email;
        this.setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 95, 95));
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

        ImageIcon image = new ImageIcon(workingDir + "\\Images\\search_icon.png");
        jLabel28.setIcon(image);
        Image img = ((ImageIcon) jLabel28.getIcon()).getImage();
        Image newimg = img.getScaledInstance(jLabel28.getWidth(), jLabel28.getHeight(), java.awt.Image.SCALE_SMOOTH);
        ImageIcon imi = new ImageIcon(newimg);
        jLabel28.setIcon(imi);

    }

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
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        search1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        googleMap = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        exit = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Find Location");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, 30));
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 30, 30));

        search1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
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
        getContentPane().add(search1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 260, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Farms");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 90, 40));

        googleMap.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        getContentPane().add(googleMap, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 260, 240));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IM/MobileImages/View more1.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IM/MobileImages/View more.png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, 110, 40));

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

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IM/MobileImages/androback.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void search1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search1MouseClicked
        search1.setText("");
    }//GEN-LAST:event_search1MouseClicked

    private void search1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search1KeyReleased
        loadMap(search1.getText().toLowerCase());
    }//GEN-LAST:event_search1KeyReleased

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked

        Adminandroid a = new Adminandroid(userName, userLevel, email);
        a.setVisible(true);
        this.hide();

    }//GEN-LAST:event_backMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        SensorOption d = new SensorOption(userName, userLevel,email);
        d.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(mobViewsensors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mobViewsensors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mobViewsensors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mobViewsensors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mobViewsensors().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel googleMap;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField search1;
    // End of variables declaration//GEN-END:variables
}
