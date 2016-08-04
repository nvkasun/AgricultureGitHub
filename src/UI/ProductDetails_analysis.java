/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Classes.Product.ProductStockImp;
import Classes.Product.ProductsImp;
import Classes.Product.SetOfProductStock;
import Classes.Product.SetOfProducts;
import Classes.analysis.ProductAnalyser;
import Classes.serialization.Serialization;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.*;

/**
 *
 * @author gihan
 */
public class ProductDetails_analysis extends javax.swing.JFrame {

    /**
     * Creates new form ProductDetails_analysis
     */
    public static final String FILE_NAME_ProductsStock = "DataFiles/ProductsStock.txt";
    public static final String FILE_NAME_Products = "DataFiles/Products.txt";
    private SetOfProductStock theProductStrock = new SetOfProductStock();
    private SetOfProductStock searchProductStrock = new SetOfProductStock();
    private SetOfProducts searchProductStrockByName = new SetOfProducts();
    private SetOfProducts productSet = new SetOfProducts();
    ProductAnalyser productAnalyser = new ProductAnalyser();

    String username, userLevel, email;

    /**
     *
     */
    public ProductDetails_analysis() {
        initComponents();
    }

    /**
     *
     * @param username
     * @param userLevel
     * @param email
     */
    public ProductDetails_analysis(String username, String userLevel, String email) {
        initComponents();
        this.username = username;
        this.userLevel = userLevel;
        this.email = email;
        logedUser.setText(email);

        try {
            for (ProductStockImp stockImp : Serialization.deserializeProductsStock()) {

                theProductStrock.addProductStock(stockImp);
            }
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(ProductDetails_analysis.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            for (ProductsImp productImp : Serialization.deserializeProducts()) {
                productSet.addProducts(productImp);
            }
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(ProductDetails_analysis.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (ProductStockImp stockImp : theProductStrock) {
            for (ProductsImp productImp : productSet) {
                if (productImp.getProductNo() == stockImp.getProductID()) {
                    searchProductStrockByName.addProducts(productImp);
                    System.out.println(productImp.getName());
                }
            }
        }

        loadTable(theProductStrock);

    }

    /**
     * load table method
     *
     * @param productStock
     */
    public void loadTable(SetOfProductStock productStock) {

        String details = "";
        int[] array = new int[productStock.size()];

        for (int i = 0; i < productStock.size(); i++) {
            array[i] = (productStock.elementAt(i).getProductID());
        }

        HashSet<Integer> set = new HashSet<>();

        set = getDistinctProductID(array);

        if (!set.isEmpty()) {
            for (int productId : set) {
                Calendar cal = Calendar.getInstance();
                cal.add(Calendar.DATE, -7);
                Date sevenDaysFromToday = cal.getTime();
                details = details + productAnalyser.analiseDetails("product",productId,sevenDaysFromToday,Calendar.getInstance().getTime());
            }
            String[] tableDataRow = details.split(" ");

            String[] colName = {"Product ID", "Product Name", "Average Buying Price"};
            Object[][] object = new Object[tableDataRow.length][3];
            int i = 0;
            if (tableDataRow.length != 0) {

                for (String rowData : tableDataRow) {
                    String[] tableDataCol = rowData.split(",");
                    object[i][0] = tableDataCol[0];
                    object[i][1] = tableDataCol[1];
                    object[i][2] = tableDataCol[2];
                    i++;
                }
            }

            DefaultTableModel model = new DefaultTableModel(object, colName) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;//This causes all cells to be not editable
                }
            };
            productAnalysisTable.setModel(model);
            productAnalysisTable.setRowSorter(new TableRowSorter<TableModel>(model));
            productAnalysisTable.setAutoscrolls(true);
            productAnalysisTable.getTableHeader().setReorderingAllowed(false);
        } else {
            String[] colName = {"Product ID", "Product Name", "Average Buying Price"};
            Object[][] object = new Object[1][3];
            int i = 0;

            object[i][0] = "";
            object[i][1] = "";
            object[i][2] = "";

            DefaultTableModel model = new DefaultTableModel(object, colName) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;//This causes all cells to be not editable
                }
            };
            productAnalysisTable.setModel(model);
            productAnalysisTable.setRowSorter(new TableRowSorter<TableModel>(model));
            productAnalysisTable.setAutoscrolls(true);
            productAnalysisTable.getTableHeader().setReorderingAllowed(false);
        }

    }

    /**
     *
     * @param arr
     * @return
     */
    public static HashSet getDistinctProductID(int arr[]) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {

            if (!set.contains(arr[i])) {
                set.add(arr[i]);

            }
        }

        return set;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rdavalability = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtpProductSearch2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtancName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        productAnalysisTable = new javax.swing.JTable();
        jLabel23 = new javax.swing.JLabel();
        btnupUpdate = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        logedUser = new javax.swing.JLabel();
        logout4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Products Analaysis of last seven days...");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 450, -1));

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
        getContentPane().add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 240, 10));
        getContentPane().add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, 230, 10));
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, 230, 10));

        jLabel22.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 102, 102));
        jLabel22.setText("Manage Fields");
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, 190, 40));

        jLabel27.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 102, 153));
        jLabel27.setText("Update Product");
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 190, 40));

        jLabel26.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(102, 102, 102));
        jLabel26.setText("Add Product");
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 190, 40));

        jLabel24.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(102, 102, 102));
        jLabel24.setText("Manage Products ");
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 190, 40));

        jLabel20.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
        jLabel20.setText("Manage Crop");
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 240, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Manage Sensor Details");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 250, 40));

        jLabel15.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("Manage Users");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 260, 40));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 10, 350));

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Field Stations");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 150, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("Product Sales");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, 150, 30));

        jLabel34.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(102, 102, 102));
        jLabel34.setText("Manage Fertilizer");
        jLabel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel34MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, 190, 40));
        getContentPane().add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 650, 230, 10));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SemMainLogo.png"))); // NOI18N
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 480, 160));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search_icon.png"))); // NOI18N
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 40, 40));

        txtpProductSearch2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        txtpProductSearch2.setForeground(new java.awt.Color(102, 102, 102));
        txtpProductSearch2.setText("Search By Product Name...");
        txtpProductSearch2.setToolTipText("search product stock by product name");
        txtpProductSearch2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtpProductSearch2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtpProductSearch2MouseEntered(evt);
            }
        });
        txtpProductSearch2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpProductSearch2KeyReleased(evt);
            }
        });
        getContentPane().add(txtpProductSearch2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 420, 40));

        jLabel17.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Admin Panal");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 230, 140, 30));

        jLabel18.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setText("Data Analysis");
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 230, 140, 30));

        txtancName.setEditable(false);
        txtancName.setBackground(new java.awt.Color(255, 255, 255));
        txtancName.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        txtancName.setForeground(new java.awt.Color(102, 102, 102));
        txtancName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(txtancName, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 640, 40));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        productAnalysisTable.setForeground(new java.awt.Color(153, 153, 153));
        productAnalysisTable.setModel(new javax.swing.table.DefaultTableModel(
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
        productAnalysisTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        productAnalysisTable.setFillsViewportHeight(true);
        jScrollPane1.setViewportView(productAnalysisTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 690, 270));

        jLabel23.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel23.setText("Agriculture Sensoring Sys");
        jLabel23.setToolTipText("");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 4, 130, 20));

        btnupUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/footer.png"))); // NOI18N
        getContentPane().add(btnupUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, -1, -1));

        jLabel30.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(102, 102, 102));
        jLabel30.setText("www.Agrivi.com/Agriculture Sensoring/adminPanal.htm");
        jLabel30.setToolTipText("");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 31, 540, 20));

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
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setState(1);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        manage_farm m = new manage_farm(username, userLevel, email);
        m.setVisible(true);
        this.hide();
        theProductStrock.removeAll(theProductStrock);
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        ProductStock p = new ProductStock(username, userLevel, email);
        p.setVisible(true);
        this.hide();
        theProductStrock.removeAll(theProductStrock);


    }//GEN-LAST:event_jLabel27MouseClicked

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        AddNewProduct a;
        a = new AddNewProduct(username, userLevel, email);
        a.setVisible(true);
        this.hide();
        theProductStrock.removeAll(theProductStrock);

    }//GEN-LAST:event_jLabel26MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        AddCrop a = new AddCrop(username, userLevel, email);
        a.setVisible(true);
        this.hide();
        theProductStrock.removeAll(theProductStrock);

    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        manageSensorDetails m = new manageSensorDetails(username, userLevel, email);
        m.setVisible(true);
        this.hide();
        theProductStrock.removeAll(theProductStrock);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        userManagement a = new userManagement(username, userLevel, email);
        a.setVisible(true);
        this.hide();
        theProductStrock.removeAll(theProductStrock);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseClicked
        fertilizerManagement f = new fertilizerManagement(username, userLevel, email);
        f.setVisible(true);
        this.hide();
        theProductStrock.removeAll(theProductStrock);
    }//GEN-LAST:event_jLabel34MouseClicked

    private void txtpProductSearch2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpProductSearch2KeyReleased

        if (!txtpProductSearch2.getText().equalsIgnoreCase("")) {

            searchProductStrock.removeAll(searchProductStrock);

            for (ProductsImp productImp : searchProductStrockByName) {
                if (productImp.getName().contains(txtpProductSearch2.getText())) {
                    for (ProductStockImp stockImp : theProductStrock) {

                        if (stockImp.getProductID() == productImp.getProductNo()) {
                            searchProductStrock.addProductStock(stockImp);
                        }

                    }

                }
            }

            loadTable(searchProductStrock);

        }


    }//GEN-LAST:event_txtpProductSearch2KeyReleased

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        field_harvest f = new field_harvest(username, userLevel, email);
        f.setVisible(true);
        this.hide();
        theProductStrock.removeAll(theProductStrock);

    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        ProductSale p = new ProductSale(username, userLevel, email);
        p.setVisible(true);
        this.hide();
        theProductStrock.removeAll(theProductStrock);
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        viewSensorDetails v = new viewSensorDetails(username, userLevel, email);
        v.setVisible(true);
        this.hide();
        theProductStrock.removeAll(theProductStrock);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        userManagement u = new userManagement(username, userLevel, email);
        u.setVisible(true);
        this.hide();
        theProductStrock.removeAll(theProductStrock);
    }//GEN-LAST:event_jLabel17MouseClicked

    private void txtpProductSearch2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtpProductSearch2MouseEntered
        txtpProductSearch2.setText("");
    }//GEN-LAST:event_txtpProductSearch2MouseEntered

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductDetails_analysis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductDetails_analysis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnupUpdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel logedUser;
    private javax.swing.JLabel logout1;
    private javax.swing.JLabel logout2;
    private javax.swing.JLabel logout4;
    private javax.swing.JTable productAnalysisTable;
    private javax.swing.ButtonGroup rdavalability;
    private javax.swing.JTextField txtancName;
    private javax.swing.JTextField txtpProductSearch2;
    // End of variables declaration//GEN-END:variables
}
