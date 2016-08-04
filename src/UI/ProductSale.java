package UI;

import Classes.Product.ProductStockImp;
import Classes.Product.ProductsImp;
import Classes.Product.SetOfProductStock;
import Classes.Product.SetOfProducts;
import Classes.Product.productObserver;
import Classes.Product.productObserverImp;
import Classes.payment.SalesCart;
import Classes.payment.SetOfCart;
import Classes.serialization.Serialization;
import Classes.user.SetOfUsers;
import Validations.validations;
import java.io.IOException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Lakmi
 */
public class ProductSale extends javax.swing.JFrame {

    public static SalesCart cart = new SalesCart();
    public static final String FILE_NAME_Products = "DataFiles/Products.txt";
    public static final String FILE_NAME_ProductsStock = "DataFiles/ProductsStock.txt";
    public static final String FILE_NAME_Cart = "DataFiles/Cart.txt";
    public static SetOfUsers theUsers = new SetOfUsers();
    public static final String FILE_NAME_Users = "DataFiles/Users.txt";
    private SetOfProducts productSet = new SetOfProducts();
    private Serialization serialize = new Serialization();
    private SetOfProductStock productStockSet = new SetOfProductStock();
    private SetOfCart cartSet = new SetOfCart();
    /**
     * Creates new form cropSale
     */
    String username, userLevel, email;

    private double uprice, quntity;
    private String name;

    public ProductSale() {
        txtanpId.setEnabled(false);
        initComponents();

        try {
            for (ProductStockImp productsStock : Serialization.deserializeProductsStock()) {
                productStockSet.addProductStock(productsStock);

            }
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(ProductSale.class.getName()).log(Level.SEVERE, null, ex);
        }
        loadProductSale(productSet);

    }

    public ProductSale(String username, String userLevel, String email) {
        initComponents();
        txtanpId.setEnabled(false);
        this.username = username;
        this.userLevel = userLevel;
        this.email = email;
        logedUser.setText(email);
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
                cartSet.addCart(cart);
            }
        } catch (IOException e) {

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductSale.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            for (ProductsImp product : Serialization.deserializeProducts()) {
                if (product.getAvalability().equals("Yes")) {
                    productSet.addProducts(product);
                }

            }
        } catch (IOException e) {

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductSale.class.getName()).log(Level.SEVERE, null, ex);
        }

        loadProductSale(productSet);

    }

// table load
    private void loadProductSale(SetOfProducts products) {

        String[] colName = {"ProductID", "Name", "Description", "Unit Price"};
        Object[][] object = new Object[products.size()][4];
        int i = 0;
        if (products.size() != 0) {
            for (ProductsImp product : products) {
                object[i][0] = product.getProductNo();
                object[i][1] = product.getName();
                object[i][2] = product.getdescription();
                object[i][3] = product.getPrice();
                i++;
            }

        }

        DefaultTableModel model = new DefaultTableModel(object, colName) {
            public boolean isCellEditable(int row, int column) {
                return false;//This causes all cells to be not editable
            }
        };

        tblepProduct.setModel(model);
        tblepProduct.setRowSorter(new TableRowSorter<TableModel>(model));
        tblepProduct.setAutoscrolls(true);
        tblepProduct.getTableHeader().setReorderingAllowed(false);

    }

    //clear all
    public void clear() {
        txtanpqty.setText("");
        txtanpId.setText("");
        productSet.removeAll(productSet);
        productStockSet.removeAll(productStockSet);
        try {
            for (ProductsImp products : Serialization.deserializeProducts()) {
                if (products.getAvalability().equals("Yes")) {
                    productSet.addProducts(products);
                }

            }

            for (ProductStockImp productsStock : Serialization.deserializeProductsStock()) {
                productStockSet.addProductStock(productsStock);

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

        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtanpId = new javax.swing.JTextField();
        txtanpqty = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        btnancClear = new javax.swing.JButton();
        btnancSave = new javax.swing.JButton();
        txtpProductSearch = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblepProduct = new javax.swing.JTable();
        btnnpCart = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtanpName = new javax.swing.JTextField();
        l4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtancName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        logedUser = new javax.swing.JLabel();
        logout4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Products");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search_icon.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(578, 295, 40, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("ProductID    :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 110, -1));

        txtanpId.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        txtanpId.setForeground(new java.awt.Color(102, 102, 102));
        txtanpId.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtanpId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtanpIdActionPerformed(evt);
            }
        });
        getContentPane().add(txtanpId, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 160, -1));

        txtanpqty.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        txtanpqty.setForeground(new java.awt.Color(102, 102, 102));
        txtanpqty.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtanpqty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtanpqtyActionPerformed(evt);
            }
        });
        txtanpqty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtanpqtyKeyTyped(evt);
            }
        });
        getContentPane().add(txtanpqty, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, 160, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Quantity      :");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 100, -1));

        btnancClear.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        btnancClear.setForeground(new java.awt.Color(102, 102, 102));
        btnancClear.setText("Clear");
        btnancClear.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnancClear.setContentAreaFilled(false);
        btnancClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnancClearMouseClicked(evt);
            }
        });
        getContentPane().add(btnancClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 490, 160, 30));

        btnancSave.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        btnancSave.setForeground(new java.awt.Color(102, 102, 102));
        btnancSave.setText("Add to Cart");
        btnancSave.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnancSave.setContentAreaFilled(false);
        btnancSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnancSaveMouseClicked(evt);
            }
        });
        getContentPane().add(btnancSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, 160, 30));

        txtpProductSearch.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        txtpProductSearch.setForeground(new java.awt.Color(102, 102, 102));
        txtpProductSearch.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtpProductSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpProductSearchActionPerformed(evt);
            }
        });
        txtpProductSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpProductSearchKeyReleased(evt);
            }
        });
        getContentPane().add(txtpProductSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 300, 640, 40));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));

        tblepProduct.setForeground(new java.awt.Color(153, 153, 153));
        tblepProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblepProduct.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblepProduct.setFillsViewportHeight(true);
        tblepProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblepProductMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblepProduct);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 350, 690, 220));

        btnnpCart.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        btnnpCart.setForeground(new java.awt.Color(102, 102, 102));
        btnnpCart.setText("NEXT");
        btnnpCart.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnnpCart.setContentAreaFilled(false);
        btnnpCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnpCartActionPerformed(evt);
            }
        });
        getContentPane().add(btnnpCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 650, 170, 40));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Min2.png"))); // NOI18N
        jButton3.setContentAreaFilled(false);
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Min.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 0, 40, 20));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Max2.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Max.png"))); // NOI18N
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 0, 40, 20));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Close2.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 0, 40, 20));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 240, 10));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 240, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("My Cart");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 220, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 153));
        jLabel8.setText("Products");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 260, 40));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 10, 350));

        l1.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        l1.setForeground(new java.awt.Color(102, 102, 102));
        l1.setText("Field Stations");
        l1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l1MouseClicked(evt);
            }
        });
        getContentPane().add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 150, 30));

        l2.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        l2.setForeground(new java.awt.Color(51, 51, 51));
        l2.setText("Product Sales");
        l2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l2MouseClicked(evt);
            }
        });
        getContentPane().add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 160, 30));

        l3.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        l3.setForeground(new java.awt.Color(102, 102, 102));
        l3.setText("Admin Panal");
        l3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l3MouseClicked(evt);
            }
        });
        getContentPane().add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 230, 140, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SemMainLogo.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 480, 160));

        txtanpName.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        txtanpName.setForeground(new java.awt.Color(102, 102, 102));
        txtanpName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(txtanpName, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, 730, 300));

        l4.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        l4.setForeground(new java.awt.Color(102, 102, 102));
        l4.setText("Data Analysis");
        l4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l4MouseClicked(evt);
            }
        });
        getContentPane().add(l4, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 230, 140, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/footer.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, -1, -1));

        txtancName.setEditable(false);
        txtancName.setBackground(new java.awt.Color(255, 255, 255));
        txtancName.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        txtancName.setForeground(new java.awt.Color(102, 102, 102));
        txtancName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(txtancName, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 660, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("www.Agrivi.com/Agriculture Sensoring/productSales.htm");
        jLabel9.setToolTipText("");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 31, 540, 20));

        jLabel11.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel11.setText("Agriculture Sensoring Sys");
        jLabel11.setToolTipText("");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 4, 130, 20));

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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BackgroundImage.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 770));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void btnnpCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnpCartActionPerformed
        // TODO add your handling code here:
        Cart c = new Cart(username, userLevel, email);
        c.show();
        this.hide();

    }//GEN-LAST:event_btnnpCartActionPerformed

    private void txtpProductSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpProductSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpProductSearchActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setState(1);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        Cart c = new Cart(username, userLevel, email);
        c.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        ProductSale p;
        p = new ProductSale(username, userLevel, email);
        p.setVisible(true);
        this.hide();

    }//GEN-LAST:event_jLabel8MouseClicked

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

    private void txtanpqtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtanpqtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtanpqtyActionPerformed

    private void btnancClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnancClearMouseClicked

        clear();
    }//GEN-LAST:event_btnancClearMouseClicked

    private void btnancSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnancSaveMouseClicked
        int ProductID;
        double qty, price;
        if (txtanpId.getText().isEmpty() || txtanpqty.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please provide all details...", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
            ProductID = Integer.parseInt(txtanpId.getText());
            qty = Double.parseDouble(txtanpqty.getText());
            price = qty * uprice;

            for (ProductsImp products : productSet) {
                if (products.getProductNo() == ProductID) {
                    quntity = products.getQuantity();
                    System.out.print(quntity);
                    break;
                }

            }

            if (quntity >= qty) {

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
                    Logger.getLogger(ProductSale.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(this, "Unsuccessful...", "Error", JOptionPane.ERROR_MESSAGE);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ProductSale.class.getName()).log(Level.SEVERE, null, ex);
                }

                clear();
                loadProductSale(productSet);

            } else {
                JOptionPane.showMessageDialog(this, "This product is out of Stock", "Sorry", JOptionPane.WARNING_MESSAGE);

            }

        }
    }//GEN-LAST:event_btnancSaveMouseClicked

    private void txtanpIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtanpIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtanpIdActionPerformed

    private void tblepProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblepProductMouseClicked
        DefaultTableModel dtm = (DefaultTableModel) tblepProduct.getModel();

        int row = tblepProduct.getSelectedRow();

        txtanpId.setText(tblepProduct.getValueAt(row, 0).toString());
        uprice = Double.parseDouble(tblepProduct.getValueAt(row, 3).toString());
        name = tblepProduct.getValueAt(row, 1).toString();

        for (ProductStockImp productsStock : productStockSet) {
            if (productsStock.getProductID() == Integer.parseInt(txtanpId.getText())) {
                quntity = quntity + productsStock.getQuantity();
                System.out.print(quntity);
            }
        }

    }//GEN-LAST:event_tblepProductMouseClicked

    private void txtpProductSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpProductSearchKeyReleased
        SetOfProducts search = new SetOfProducts();

        if (!txtpProductSearch.getText().toString().equalsIgnoreCase("")) {
            search = productSet.getProductFromName(txtpProductSearch.getText());
            loadProductSale(search);

        }


    }//GEN-LAST:event_txtpProductSearchKeyReleased

    private void txtanpqtyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtanpqtyKeyTyped
        validations.validateNumber(txtanpqty, evt);
    }//GEN-LAST:event_txtanpqtyKeyTyped

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
            java.util.logging.Logger.getLogger(ProductSale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductSale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductSale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductSale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ProductSale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnancClear;
    private javax.swing.JButton btnancSave;
    private javax.swing.JButton btnnpCart;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel logedUser;
    private javax.swing.JLabel logout4;
    private javax.swing.JTable tblepProduct;
    private javax.swing.JTextField txtancName;
    private javax.swing.JTextField txtanpId;
    private javax.swing.JTextField txtanpName;
    private javax.swing.JTextField txtanpqty;
    private javax.swing.JTextField txtpProductSearch;
    // End of variables declaration//GEN-END:variables
}
