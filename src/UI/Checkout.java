package UI;

import Classes.payment.SalesCart;
import Classes.payment.SetOfCart;
import Classes.payment.maestroStrategy;
import Classes.payment.masterCardStrategy;
import Classes.payment.payPalStrategy;
import Classes.payment.visaStrategy;
import Classes.serialization.Serialization;
import Validations.validations;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Lakmi
 */
public class Checkout extends javax.swing.JFrame {

    public static SalesCart payment = new SalesCart();
    public static final String FILE_NAME_Payment = "DataFiles/payments.txt";
    private SetOfCart cartSet = new SetOfCart();
    private Serialization serialize = new Serialization();

    /**
     * Creates new form checkout
     */
    String username, userLevel, email;
    double total;

    public Checkout() {
        initComponents();

    }

    public Checkout(String username, String userLevel, String email) {
        initComponents();

        this.username = username;
        this.userLevel = userLevel;
        this.email = email;

        if (userLevel == "user") {
            l1.setText("Home");
            l2.setText("Product Sales");
            l3.setText("View Profile");
            l4.setText("Feedbacks");
        } else {
            l1.setText("Field Stations");
            l2.setText("Product Sales");
            l3.setText("Admin Panal");
            l4.setText("Data Analysis");
        }

        logedUser.setText(email);
        try {
            for (SalesCart cart : Serialization.deserializeCart()) {
                if (cart.getEmail().equals(username)) {
                    cartSet.addCart(cart);
                    System.out.println(cart.getCartID());
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Checkout.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Checkout.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Checkout(String username, String userLevel, String email, double tot) {
        initComponents();

        this.username = username;
        this.userLevel = userLevel;
        this.email = email;
        this.total = tot;

        if (userLevel == "user") {
            l1.setText("Home");
            l2.setText("Product Sales");
            l3.setText("View Profile");
            l4.setText("Feedbacks");
        } else {
            l1.setText("Field Stations");
            l2.setText("Product Sales");
            l3.setText("Admin Panal");
            l4.setText("Data Analysis");
        }

        try {
            for (SalesCart cart : Serialization.deserializeCart()) {
                if (cart.getEmail().equals(username)) {
                    cartSet.addCart(cart);
                    System.out.println(cart.getCartID());
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Checkout.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Checkout.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //clear all
    public void clear() {
        txtspCardNo.setText("");
        txtspExpireDate.setText("");
        txtspSecurityCode.setText("");
        txtemail.setText("");
        txtpwd.setText("");
        txtName.setText("");
        cartSet.removeAll(cartSet);

        try {
            for (SalesCart cart : Serialization.deserializeCart()) {
                if (cart.getEmail().equals(username)) {
                    cartSet.addCart(cart);
                    System.out.println(cart.getCartID());
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Checkout.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Checkout.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void removeCart() {

        try {
            for (SalesCart cart : Serialization.deserializeCart()) {
                if (cart.getEmail().equals(username)) {
                    cartSet.addCart(cart);
                    cartSet.removeAllCart(cart);
                    System.out.println("remove cart");
                    System.out.println(cart.getCartID());
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Checkout.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Checkout.class.getName()).log(Level.SEVERE, null, ex);
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
        rbtnPaypal = new javax.swing.JRadioButton();
        rbtnVisa = new javax.swing.JRadioButton();
        rbtnMaestro = new javax.swing.JRadioButton();
        rbtnMaster = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtspAddress1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtspCardNo = new javax.swing.JTextField();
        txtspExpireDate = new javax.swing.JTextField();
        txtspSecurityCode = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtspAddress = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtancName = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        txtemail = new javax.swing.JTextField();
        txtpwd = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        logedUser = new javax.swing.JLabel();
        logout4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rbtnPaypal.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbtnPaypal);
        rbtnPaypal.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        rbtnPaypal.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(rbtnPaypal, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 380, -1, -1));

        rbtnVisa.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbtnVisa);
        rbtnVisa.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        rbtnVisa.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(rbtnVisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 380, -1, -1));

        rbtnMaestro.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbtnMaestro);
        rbtnMaestro.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        rbtnMaestro.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(rbtnMaestro, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, -1, -1));

        rbtnMaster.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbtnMaster);
        rbtnMaster.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        rbtnMaster.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(rbtnMaster, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("Email           :");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 500, 100, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Password     :");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 540, 100, -1));

        txtspAddress1.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        txtspAddress1.setForeground(new java.awt.Color(102, 102, 102));
        txtspAddress1.setText("Clear");
        txtspAddress1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtspAddress1.setContentAreaFilled(false);
        txtspAddress1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtspAddress1MouseClicked(evt);
            }
        });
        getContentPane().add(txtspAddress1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 620, 210, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Name               :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 420, 140, -1));

        txtName.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        txtName.setForeground(new java.awt.Color(102, 102, 102));
        txtName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, 200, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Paypal users fill these details");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 430, -1, 50));

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Card Number    :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 460, 140, -1));

        txtspCardNo.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        txtspCardNo.setForeground(new java.awt.Color(102, 102, 102));
        txtspCardNo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(txtspCardNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 460, 200, -1));

        txtspExpireDate.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        txtspExpireDate.setForeground(new java.awt.Color(102, 102, 102));
        txtspExpireDate.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtspExpireDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtspExpireDateActionPerformed(evt);
            }
        });
        txtspExpireDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtspExpireDateKeyTyped(evt);
            }
        });
        getContentPane().add(txtspExpireDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 500, 200, -1));

        txtspSecurityCode.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        txtspSecurityCode.setForeground(new java.awt.Color(102, 102, 102));
        txtspSecurityCode.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(txtspSecurityCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 540, 200, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setText("Select your payment option");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, -1, 50));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("CVV                  :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 540, 140, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Expire date        :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 500, 140, -1));

        txtspAddress.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        txtspAddress.setForeground(new java.awt.Color(102, 102, 102));
        txtspAddress.setText("Save");
        txtspAddress.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtspAddress.setContentAreaFilled(false);
        txtspAddress.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtspAddressMouseClicked(evt);
            }
        });
        getContentPane().add(txtspAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 580, 210, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Products");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 260, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("My Cart");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 220, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 153));
        jLabel10.setText("Check Out");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 190, 40));

        l1.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        l1.setForeground(new java.awt.Color(102, 102, 102));
        l1.setText("Field Stations");
        l1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l1MouseClicked(evt);
            }
        });
        getContentPane().add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 150, 30));

        l2.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        l2.setForeground(new java.awt.Color(51, 51, 51));
        l2.setText("Product Sales");
        l2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l2MouseClicked(evt);
            }
        });
        getContentPane().add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, 160, 30));

        l3.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        l3.setForeground(new java.awt.Color(102, 102, 102));
        l3.setText("Admin Panal");
        l3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l3MouseClicked(evt);
            }
        });
        getContentPane().add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 230, 140, 30));

        l4.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        l4.setForeground(new java.awt.Color(102, 102, 102));
        l4.setText("Data Analysis");
        l4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l4MouseClicked(evt);
            }
        });
        getContentPane().add(l4, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 230, 140, 30));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SemMainLogo.png"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 480, 160));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Close2.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 0, 40, 20));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Max2.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Max.png"))); // NOI18N
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 0, 40, 20));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Min2.png"))); // NOI18N
        jButton3.setContentAreaFilled(false);
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Min.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 0, 40, 20));

        txtancName.setEditable(false);
        txtancName.setBackground(new java.awt.Color(255, 255, 255));
        txtancName.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        txtancName.setForeground(new java.awt.Color(102, 102, 102));
        txtancName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(txtancName, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 630, 40));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 240, 10));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 240, -1));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 282, 240, -1));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 10, 350));

        txtemail.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        txtemail.setForeground(new java.awt.Color(102, 102, 102));
        txtemail.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 500, 210, -1));

        txtpwd.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        txtpwd.setForeground(new java.awt.Color(102, 102, 102));
        txtpwd.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtpwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpwdActionPerformed(evt);
            }
        });
        getContentPane().add(txtpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 540, 210, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/visa.png"))); // NOI18N
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 360, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/paypal.png"))); // NOI18N
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 360, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/mestro.png"))); // NOI18N
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 360, 90, 50));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/master.png"))); // NOI18N
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, -1, 50));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/footer.png"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 1360, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel11.setText("Agriculture Sensoring Sys");
        jLabel11.setToolTipText("");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 4, 130, 20));

        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("www.Agrivi.com/Agriculture Sensoring/productSales.htm");
        jLabel12.setToolTipText("");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 31, 540, 20));

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
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 770));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        ProductSale p;
        p = new ProductSale(username, userLevel, email);
        p.setVisible(true);
        this.hide();

    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        Cart c = new Cart(username, userLevel, email);
        c.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        Checkout s = new Checkout(username, userLevel, email);
        s.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setState(1);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void l1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l1MouseClicked
        if (userLevel == "user") {
            userMain u = new userMain(username, userLevel, email);
            u.setVisible(true);
            this.hide();
        } else {
            viewSensorDetails v = new viewSensorDetails(username, userLevel, email);
            v.setVisible(true);
            this.hide();
        }
    }//GEN-LAST:event_l1MouseClicked

    private void l2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l2MouseClicked
        ProductSale p;
        p = new ProductSale(username, userLevel, email);
        p.setVisible(true);
        this.hide();

    }//GEN-LAST:event_l2MouseClicked

    private void l3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l3MouseClicked
        if (userLevel == "user") {
            viewProfile v = new viewProfile(username, userLevel, email);
            v.setVisible(true);
            this.hide();
        } else {
            userManagement u = new userManagement(username, userLevel, email);
            u.setVisible(true);
            this.hide();
        }
    }//GEN-LAST:event_l3MouseClicked

    private void l4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l4MouseClicked
        if (userLevel == "user") {
            feedback f = new feedback(username, userLevel, email);
            f.setVisible(true);
            this.hide();
        } else {
            field_harvest f = new field_harvest(username, userLevel, email);
            f.setVisible(true);
            this.hide();
        }
    }//GEN-LAST:event_l4MouseClicked

    private void txtspExpireDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtspExpireDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtspExpireDateActionPerformed

    private void txtpwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpwdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpwdActionPerformed

    private void txtspAddressMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtspAddressMouseClicked

        if (rbtnMaster.isSelected()) {

            if (txtName.getText().isEmpty() || txtspCardNo.getText().isEmpty() || txtspExpireDate.getText().isEmpty() || txtspSecurityCode.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please provide all details...", "Error", JOptionPane.ERROR_MESSAGE);

            } else {
                cartSet.pay(new masterCardStrategy(txtName.getText(), txtspCardNo.getText(), txtspSecurityCode.getText(), txtspExpireDate.getText()), total);
                JOptionPane.showMessageDialog(this, "Deduct " + total + " from your master card", "Message", JOptionPane.PLAIN_MESSAGE);
                removeCart();
            }

        } else if (rbtnMaestro.isSelected()) {

            if (txtName.getText().isEmpty() || txtspCardNo.getText().isEmpty() || txtspExpireDate.getText().isEmpty() || txtspSecurityCode.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please provide all details...", "Error", JOptionPane.ERROR_MESSAGE);

            } else {
                cartSet.pay(new maestroStrategy(txtName.getText(), txtspCardNo.getText(), txtspSecurityCode.getText(), txtspExpireDate.getText()), total);
                JOptionPane.showMessageDialog(this, "Deduct " + total + " from your maestro card", "Message", JOptionPane.PLAIN_MESSAGE);
                removeCart();
            }

        } else if (rbtnVisa.isSelected()) {

            if (txtName.getText().isEmpty() || txtspCardNo.getText().isEmpty() || txtspExpireDate.getText().isEmpty() || txtspSecurityCode.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please provide all details...", "Error", JOptionPane.ERROR_MESSAGE);

            } else {
                cartSet.pay(new visaStrategy(txtName.getText(), txtspCardNo.getText(), txtspSecurityCode.getText(), txtspExpireDate.getText()), total);
                JOptionPane.showMessageDialog(this, "Deduct " + total + " from your visa card", "Message", JOptionPane.PLAIN_MESSAGE);
                removeCart();
            }

        } else if (rbtnPaypal.isSelected()) {

            if (txtemail.getText().isEmpty() || txtpwd.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please provide all details...", "Error", JOptionPane.ERROR_MESSAGE);

            } else {
                cartSet.pay(new payPalStrategy(txtemail.getText(), txtpwd.getText()), total);
                JOptionPane.showMessageDialog(this, "Deduct " + total + " from your paypal account", "Message", JOptionPane.PLAIN_MESSAGE);

                removeCart();
            }

        } else {
            JOptionPane.showMessageDialog(this, "Please select your payment option...", "Error", JOptionPane.ERROR_MESSAGE);

        }
        clear();
    }//GEN-LAST:event_txtspAddressMouseClicked

    private void txtspAddress1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtspAddress1MouseClicked
        clear();
    }//GEN-LAST:event_txtspAddress1MouseClicked

    private void txtspExpireDateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtspExpireDateKeyTyped
        validations.validateNumber(txtspExpireDate, evt);
    }//GEN-LAST:event_txtspExpireDateKeyTyped

    private void logout4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout4MouseClicked
        Login l=new Login();
        l.setVisible(true);
        this.hide();
    }//GEN-LAST:event_logout4MouseClicked

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
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Checkout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel logedUser;
    private javax.swing.JLabel logout1;
    private javax.swing.JLabel logout2;
    private javax.swing.JLabel logout3;
    private javax.swing.JLabel logout4;
    private javax.swing.JRadioButton rbtnMaestro;
    private javax.swing.JRadioButton rbtnMaster;
    private javax.swing.JRadioButton rbtnPaypal;
    private javax.swing.JRadioButton rbtnVisa;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtancName;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtpwd;
    private javax.swing.JButton txtspAddress;
    private javax.swing.JButton txtspAddress1;
    private javax.swing.JTextField txtspCardNo;
    private javax.swing.JTextField txtspExpireDate;
    private javax.swing.JTextField txtspSecurityCode;
    // End of variables declaration//GEN-END:variables
}
