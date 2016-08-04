/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Classes.Product.ProductStockImp;
import Classes.Product.Products;
import Classes.Product.ProductsImp;
import Classes.Product.SetOfProductStock;
import Classes.Product.SetOfProducts;
import Classes.Product.productObserver;
import Classes.Product.productObserverImp;
import Classes.serialization.Serialization;
import Validations.validations;
import java.io.IOException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Lakmi
 */
public class ProductStock extends javax.swing.JFrame {

    /**
     * Creates new form ProductStock
     */
    public static ProductStockImp products = new ProductStockImp();
    public static final String FILE_NAME_ProductsStock = "DataFiles/ProductsStock.txt";
    public static final String FILE_NAME_Products = "DataFiles/Products.txt";
    private Serialization serialize = new Serialization();
    private SetOfProductStock productStockSet = new SetOfProductStock();
    private SetOfProducts productSet = new SetOfProducts();

    String username, userLevel, email;

    public ProductStock() {
        initComponents();
    }

    public ProductStock(String username, String userLevel, String email) {
        initComponents();
        txtspStockid.setEnabled(false);
        this.username = username;
        this.userLevel = userLevel;
        this.email = email;
        txtupDate.setText(Calendar.getInstance().getTime().toString());
        logedUser.setText(email);
        try {
            for (ProductStockImp products : Serialization.deserializeProductsStock()) {
                productStockSet.addProductStock(products);
                System.out.println(products.getProductID());

            }

        } catch (ClassNotFoundException | IOException ex) {
            Logger.getLogger(ProductStock.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            for (ProductsImp productImp : Serialization.deserializeProducts()) {
                productSet.addProducts(productImp);
                System.out.println(productImp.getName());

            }

        } catch (ClassNotFoundException | IOException ex) {
            Logger.getLogger(ProductStock.class.getName()).log(Level.SEVERE, null, ex);
        }
        loadProductStock(productStockSet);
        loadCombo(productSet);

    }

    // table load
    private void loadProductStock(SetOfProductStock products) {

        String[] colName = {"StockID", "ProductID", "Date", "Quantity", "Unit Price"};
        Object[][] object = new Object[products.size()][5];
        int i = 0;
        if (products.size() != 0) {
            for (ProductStockImp product : products) {
                object[i][0] = product.getStockNo();
                object[i][1] = product.getProductID();
                object[i][2] = product.getDate();
                object[i][3] = product.getQuantity();
                object[i][4] = product.getPrice();

                i++;

            }
        }

        DefaultTableModel model = new DefaultTableModel(object, colName) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;//This causes all cells to be not editable
            }
        };
        tblspProduct.setModel(model);
        tblspProduct.setRowSorter(new TableRowSorter<>(model));
        tblspProduct.setAutoscrolls(true);
        tblspProduct.getTableHeader().setReorderingAllowed(false);

    }

// combo box load
    private void loadCombo(SetOfProducts products) {
        DefaultComboBoxModel jc = new DefaultComboBoxModel();
        System.out.print(products);
        int i = 0;
        if (products.size() != 0) {
            for (ProductsImp product : products) {

                jc.addElement(product.getProductNo());
                i++;

            }
        }
        cmbProductID.setModel(jc);
    }

    // clear all
    public void clear() {

        txtupQty.setText("");

        txtupUnitPrice.setText("");
        txtspStockid.setText("");

        productStockSet.removeAll(productStockSet);
        try {
            for (ProductStockImp productsStock : Serialization.deserializeProductsStock()) {
                productStockSet.addProductStock(productsStock);

            }
            for (ProductsImp productsMake : Serialization.deserializeProducts()) {
                productSet.addProducts(productsMake);

            }
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(registerUser.class.getName()).log(Level.SEVERE, null, ex);
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

        rdavalability = new javax.swing.ButtonGroup();
        jLabel11 = new javax.swing.JLabel();
        txtspStockid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmbProductID = new javax.swing.JComboBox();
        txtupQty = new javax.swing.JTextField();
        txtupDate = new javax.swing.JTextField();
        viewDetails3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtupUnitPrice = new javax.swing.JTextField();
        btnupSave = new javax.swing.JButton();
        btnupClear = new javax.swing.JButton();
        btnupDelete = new javax.swing.JButton();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        tblspProduct = new javax.swing.JTable();
        jLabel28 = new javax.swing.JLabel();
        txtpProductSearch2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btnupUpdate = new javax.swing.JLabel();
        txtancName = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        logedUser = new javax.swing.JLabel();
        logout4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("StockID            :");
        jLabel11.setToolTipText("");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 130, -1));

        txtspStockid.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        txtspStockid.setForeground(new java.awt.Color(102, 102, 102));
        txtspStockid.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(txtspStockid, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 190, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Add product to stock ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 260, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Product ID       :");
        jLabel10.setToolTipText("");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 130, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Quantity          :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 130, -1));

        cmbProductID.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cmbProductID, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, 190, 30));

        txtupQty.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        txtupQty.setForeground(new java.awt.Color(102, 102, 102));
        txtupQty.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtupQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtupQtyActionPerformed(evt);
            }
        });
        txtupQty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtupQtyKeyTyped(evt);
            }
        });
        getContentPane().add(txtupQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, 190, 30));

        txtupDate.setEditable(false);
        txtupDate.setBackground(new java.awt.Color(255, 255, 255));
        txtupDate.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        txtupDate.setForeground(new java.awt.Color(102, 102, 102));
        txtupDate.setToolTipText("Date format yyyy/mm/dd");
        txtupDate.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtupDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtupDateKeyTyped(evt);
            }
        });
        getContentPane().add(txtupDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 440, 190, 30));

        viewDetails3.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        viewDetails3.setForeground(new java.awt.Color(102, 102, 102));
        viewDetails3.setText("View Details");
        viewDetails3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        viewDetails3.setContentAreaFilled(false);
        viewDetails3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewDetails3MouseClicked(evt);
            }
        });
        getContentPane().add(viewDetails3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 620, 580, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Date                :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 440, 130, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("Unit Price        :");
        jLabel13.setToolTipText("");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 480, 130, -1));

        txtupUnitPrice.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        txtupUnitPrice.setForeground(new java.awt.Color(102, 102, 102));
        txtupUnitPrice.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtupUnitPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtupUnitPriceKeyTyped(evt);
            }
        });
        getContentPane().add(txtupUnitPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 480, 190, 30));

        btnupSave.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        btnupSave.setForeground(new java.awt.Color(102, 102, 102));
        btnupSave.setText("Save");
        btnupSave.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnupSave.setContentAreaFilled(false);
        btnupSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnupSaveMouseClicked(evt);
            }
        });
        getContentPane().add(btnupSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 570, 170, 30));

        btnupClear.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        btnupClear.setForeground(new java.awt.Color(102, 102, 102));
        btnupClear.setText("Clear");
        btnupClear.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnupClear.setContentAreaFilled(false);
        btnupClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnupClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 530, 190, 30));

        btnupDelete.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        btnupDelete.setForeground(new java.awt.Color(102, 102, 102));
        btnupDelete.setText("Delete");
        btnupDelete.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnupDelete.setContentAreaFilled(false);
        btnupDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnupDeleteMouseClicked(evt);
            }
        });
        getContentPane().add(btnupDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 570, 170, 30));

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
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, -1, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("Product Sales");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 140, 30));

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

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));

        tblspProduct.setForeground(new java.awt.Color(153, 153, 153));
        tblspProduct.setModel(new javax.swing.table.DefaultTableModel(
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
        tblspProduct.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblspProduct.setFillsViewportHeight(true);
        tblspProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblspProductMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblspProduct);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 340, 580, 200));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search_icon.png"))); // NOI18N
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 290, 40, 40));

        txtpProductSearch2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        txtpProductSearch2.setForeground(new java.awt.Color(102, 102, 102));
        txtpProductSearch2.setToolTipText("search product stock by product name");
        txtpProductSearch2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtpProductSearch2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpProductSearch2ActionPerformed(evt);
            }
        });
        txtpProductSearch2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpProductSearch2KeyReleased(evt);
            }
        });
        getContentPane().add(txtpProductSearch2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 290, 490, 40));

        jLabel17.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Admin Panal");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 230, 140, 30));

        jLabel18.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setText("Data Analysis");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 230, 140, 30));

        btnupUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/footer.png"))); // NOI18N
        getContentPane().add(btnupUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, -1, -1));

        txtancName.setEditable(false);
        txtancName.setBackground(new java.awt.Color(255, 255, 255));
        txtancName.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        txtancName.setForeground(new java.awt.Color(102, 102, 102));
        txtancName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(txtancName, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 590, 40));

        jLabel23.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel23.setText("Agriculture Sensoring Sys");
        jLabel23.setToolTipText("");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 4, 130, 20));

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

    private void txtupQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtupQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtupQtyActionPerformed

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
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        ProductStock p = new ProductStock(username, userLevel, email);
        p.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jLabel27MouseClicked

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        AddNewProduct a = new AddNewProduct(username, userLevel, email);
        a.setVisible(true);
        this.hide();

    }//GEN-LAST:event_jLabel26MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        AddCrop a = new AddCrop(username, userLevel, email);
        a.setVisible(true);
        this.hide();

    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        manageSensorDetails m = new manageSensorDetails(username, userLevel, email);
        m.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        userManagement a = new userManagement(username, userLevel, email);
        a.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseClicked
        fertilizerManagement f = new fertilizerManagement(username, userLevel, email);
        f.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jLabel34MouseClicked

    private void txtpProductSearch2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpProductSearch2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpProductSearch2ActionPerformed

    private void btnupSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnupSaveMouseClicked
        String id, qty, uprice, date;

        if (txtupQty.getText().isEmpty() || txtupUnitPrice.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please provide all feilds...", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
            id = cmbProductID.getSelectedItem().toString();
            qty = txtupQty.getText();
            uprice = txtupUnitPrice.getText();
            date = Calendar.getInstance().getTime().toString();

            ProductStockImp productInter = new ProductStockImp(Integer.parseInt(id), Double.parseDouble(qty), Double.parseDouble(uprice), date);
            productStockSet.addProductStock(productInter);
            try {
                Serialization.Serialize(productStockSet, FILE_NAME_ProductsStock);
                JOptionPane.showMessageDialog(this, "Added Sucsessfully", "Message", JOptionPane.PLAIN_MESSAGE);
            } catch (IOException ex) {
                Logger.getLogger(ProductStock.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Unsuccessful...", "Error", JOptionPane.ERROR_MESSAGE);
            }

            clear();
            loadProductStock(productStockSet);

            productObserver observer1 = new productObserverImp(Integer.parseInt(id));
            productInter.registerObserver(observer1);

            productInter.setStatus("Yes");

        }


    }//GEN-LAST:event_btnupSaveMouseClicked

    private void btnupDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnupDeleteMouseClicked

        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this product?", "Confirm",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (confirm == JOptionPane.NO_OPTION) {
        } else {

            if (txtspStockid.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please select a product to delete...", "Error", JOptionPane.ERROR_MESSAGE);

            } else {

                String id = cmbProductID.getSelectedItem().toString();
                ProductStockImp productStk = productStockSet.getProductStockFromStockID(Integer.parseInt(txtspStockid.getText())).firstElement();

                if (productStockSet.removeProductStock(productStk)) {
                    try {
                        Serialization.Serialize(productStockSet, FILE_NAME_ProductsStock);

                    } catch (IOException ex) {
                        Logger.getLogger(ProductStock.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    loadProductStock(productStockSet);
                    JOptionPane.showMessageDialog(this, "Delete Sucsessfully", "Message", JOptionPane.PLAIN_MESSAGE);
                    productObserver observer2 = new productObserverImp(Integer.parseInt(id));
                    productStk.registerObserver(observer2);

                    productStk.setStatus("Remove");
                    clear();
                } else {
                    JOptionPane.showMessageDialog(this, "Delete unsuccessful...", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnupDeleteMouseClicked

    private void btnupClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupClearActionPerformed
        clear();
    }//GEN-LAST:event_btnupClearActionPerformed

    private void txtpProductSearch2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpProductSearch2KeyReleased
        SetOfProductStock search = new SetOfProductStock();

        if (!txtpProductSearch2.getText().equalsIgnoreCase("")) {
            //search = productStockSet.getProdacutStockFromName(txtpProductSearch2.getText());
            loadProductStock(productStockSet);

        }
    }//GEN-LAST:event_txtpProductSearch2KeyReleased

    private void viewDetails3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewDetails3MouseClicked
        ProductDetails_analysis d = new ProductDetails_analysis(username, userLevel, email);
        d.setVisible(true);
        this.hide();
    }//GEN-LAST:event_viewDetails3MouseClicked

    private void tblspProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblspProductMouseClicked

        DefaultTableModel dtm = (DefaultTableModel) tblspProduct.getModel();

        int row = tblspProduct.getSelectedRow();

        txtspStockid.setText(tblspProduct.getValueAt(row, 0).toString());
        cmbProductID.addItem(tblspProduct.getValueAt(row, 1).toString());
        txtupDate.setText(tblspProduct.getValueAt(row, 2).toString());
        txtupQty.setText(tblspProduct.getValueAt(row, 3).toString());
        txtupUnitPrice.setText(tblspProduct.getValueAt(row, 4).toString());


    }//GEN-LAST:event_tblspProductMouseClicked

    private void txtupQtyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtupQtyKeyTyped
        validations.validateNumber(txtupQty, evt);
    }//GEN-LAST:event_txtupQtyKeyTyped

    private void txtupUnitPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtupUnitPriceKeyTyped
        validations.validateNumber(txtupUnitPrice, evt);
    }//GEN-LAST:event_txtupUnitPriceKeyTyped

    private void txtupDateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtupDateKeyTyped
        validations.validateNumber(txtupDate, evt);
    }//GEN-LAST:event_txtupDateKeyTyped

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
            java.util.logging.Logger.getLogger(ProductStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductStock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnupClear;
    private javax.swing.JButton btnupDelete;
    private javax.swing.JButton btnupSave;
    private javax.swing.JLabel btnupUpdate;
    private javax.swing.JComboBox cmbProductID;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel logedUser;
    private javax.swing.JLabel logout4;
    private javax.swing.ButtonGroup rdavalability;
    private javax.swing.JTable tblspProduct;
    private javax.swing.JTextField txtancName;
    private javax.swing.JTextField txtpProductSearch2;
    private javax.swing.JTextField txtspStockid;
    private javax.swing.JTextField txtupDate;
    private javax.swing.JTextField txtupQty;
    private javax.swing.JTextField txtupUnitPrice;
    private javax.swing.JButton viewDetails3;
    // End of variables declaration//GEN-END:variables
}
