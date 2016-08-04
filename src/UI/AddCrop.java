/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Classes.farm.SetOfFarm;
import Classes.farm.farms;
import Classes.harvest.HarvestImp;
import Classes.harvest.SetOfHarvest;
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
public class AddCrop extends javax.swing.JFrame {

    public static HarvestImp crop = new HarvestImp();
    public static final String FILE_NAME_Crops = "DataFiles/harvest.txt";
    private SetOfHarvest cropSet = new SetOfHarvest();
    public static SetOfFarm farmSet = new SetOfFarm();
    private Serialization serialize = new Serialization();
    /**
     * Creates new form AddCrop
     */
    String username,
            /**
             * Creates new form AddCrop
             */
            userLevel,
            /**
             * Creates new form AddCrop
             */
            email;

    public AddCrop() throws IOException, ClassNotFoundException {
        initComponents();
        txtancCropID.setEnabled(false);

    }

    /**
     *
     * @param username
     * @param userLevel
     * @param email
     */
    public AddCrop(String username, String userLevel, String email) {
        initComponents();
        txtancCropID.setEnabled(false);
        this.username = username;
        this.userLevel = userLevel;
        this.email = email;
        txtancCropID.setEnabled(false);
        logedUser5.setText(email);

        try {
            for (HarvestImp crop : Serialization.deserializeHarvest()) {
                cropSet.addCrop(crop);

            }
        } catch (IOException e) {

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddCrop.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            for (farms farm : Serialization.deserializeFarm()) {
                farmSet.addfarm(farm);
                farm.print();
            }
        } catch (IOException ex) {
            Logger.getLogger(AddCrop.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddCrop.class.getName()).log(Level.SEVERE, null, ex);
        }

        loadCrop(cropSet);
        loadCombo(farmSet);

    }

    // table load
    private void loadCrop(SetOfHarvest crops) {

        String[] colName = {"Crop ID", "Name", "Qunatity", "Feilds", "Date", "Buying Price"};
        Object[][] object = new Object[crops.size()][6];
        int i = 0;
        if (crops.size() != 0) {
            for (HarvestImp crop : crops) {
                object[i][0] = crop.getharvestID();
                object[i][1] = crop.getName();
                object[i][2] = crop.getQuantity();
                object[i][3] = crop.getCropfeild();
                object[i][4] = crop.getDate();
                object[i][5] = crop.getBuyingPrice();

                i++;

            }
        }

        DefaultTableModel model = new DefaultTableModel(object, colName) {
            public boolean isCellEditable(int row, int column) {
                return false;//This causes all cells to be not editable
            }
        };
        tblspProduct.setModel(model);
        tblspProduct.setRowSorter(new TableRowSorter<TableModel>(model));
        tblspProduct.setAutoscrolls(true);
        tblspProduct.getTableHeader().setReorderingAllowed(false);

    }

    /** 
     * combo box load
     */
    private void loadCombo(SetOfFarm farms) {
        DefaultComboBoxModel jc = new DefaultComboBoxModel();
        System.out.print(farms);
        int i = 0;
        if (farms.size() != 0) {
            for (farms farm : farms) {

                jc.addElement(farm.getfarmNumber());
                i++;

            }
        }
        cmbProductID.setModel(jc);
    }

    /**
     * clear all
     */
    public void clear() {
        txtancName.setText("");
        txtancQty.setText("");
        txtancBuyingPrice.setText("");
        txtancCropID.setText("");
        cropSet.removeAll(cropSet);
        try {
            for (HarvestImp crop : Serialization.deserializeHarvest()) {
                cropSet.addCrop(crop);

            }
        } catch (IOException ex) {
            Logger.getLogger(registerUser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
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

        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtancCropID = new javax.swing.JTextField();
        txtancName = new javax.swing.JTextField();
        txtancQty = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbProductID = new javax.swing.JComboBox();
        txtancBuyingPrice = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtpProductSearch = new javax.swing.JTextField();
        btnancDelete = new javax.swing.JButton();
        btnancUpdate = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblspProduct = new javax.swing.JTable();
        txtancName1 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel34 = new javax.swing.JLabel();
        btnancSave = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JSeparator();
        btnancReset = new javax.swing.JButton();
        logedUser5 = new javax.swing.JLabel();
        logedUser6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Crop Name       :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, 130, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Crop ID             :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 130, -1));

        txtancCropID.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        txtancCropID.setForeground(new java.awt.Color(102, 102, 102));
        txtancCropID.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(txtancCropID, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 330, 180, -1));

        txtancName.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        txtancName.setForeground(new java.awt.Color(102, 102, 102));
        txtancName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(txtancName, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 370, 180, -1));

        txtancQty.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        txtancQty.setForeground(new java.awt.Color(102, 102, 102));
        txtancQty.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtancQty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtancQtyKeyTyped(evt);
            }
        });
        getContentPane().add(txtancQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, 180, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Quantity           :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, 150, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Crop field         :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, 150, -1));

        cmbProductID.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cmbProductID, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 450, 180, 30));

        txtancBuyingPrice.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        txtancBuyingPrice.setForeground(new java.awt.Color(102, 102, 102));
        txtancBuyingPrice.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtancBuyingPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtancBuyingPriceKeyTyped(evt);
            }
        });
        getContentPane().add(txtancBuyingPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 490, 180, -1));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search_icon.png"))); // NOI18N
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 280, 40, 40));

        txtpProductSearch.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        txtpProductSearch.setForeground(new java.awt.Color(102, 102, 102));
        txtpProductSearch.setToolTipText("");
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
        getContentPane().add(txtpProductSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 280, 440, 40));

        btnancDelete.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnancDelete.setForeground(new java.awt.Color(102, 102, 102));
        btnancDelete.setText("Delete");
        btnancDelete.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnancDelete.setContentAreaFilled(false);
        btnancDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnancDeleteMouseClicked(evt);
            }
        });
        getContentPane().add(btnancDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 590, 160, -1));

        btnancUpdate.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnancUpdate.setForeground(new java.awt.Color(102, 102, 102));
        btnancUpdate.setText("Update");
        btnancUpdate.setToolTipText("");
        btnancUpdate.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnancUpdate.setContentAreaFilled(false);
        btnancUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnancUpdateMouseClicked(evt);
            }
        });
        getContentPane().add(btnancUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 590, 150, -1));

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

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel3.setText("Agriculture Sensoring Sys");
        jLabel3.setToolTipText("");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 4, 130, 20));

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("www.Agrivi.com/Agriculture Sensoring/adminPanal.htm");
        jLabel9.setToolTipText("");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 31, 540, 20));

        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Buying Price     :");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 490, 150, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SemMainLogo.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 480, 160));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 240, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("Manage Sensor Details");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 250, 40));

        jLabel14.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Manage Users");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 260, 40));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 240, 10));

        jLabel20.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 102, 153));
        jLabel20.setText("Manage Crop");
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 240, 40));
        getContentPane().add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 240, 10));

        jLabel24.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(102, 102, 102));
        jLabel24.setText("Manage Products ");
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 190, 40));

        jLabel26.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(102, 102, 102));
        jLabel26.setText("Add Product");
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 190, 40));

        jLabel27.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(102, 102, 102));
        jLabel27.setText("Update Product");
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 190, 40));
        getContentPane().add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, 230, 10));

        jLabel22.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 102, 102));
        jLabel22.setText("Manage Fields");
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, 190, 40));
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, 230, 10));

        jLabel16.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("Field Stations");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 150, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("Product Sales");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, 160, 30));

        jLabel18.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setText("Admin Panal");
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 230, 140, 30));

        jLabel19.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setText("Data Analysis");
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 230, 140, 30));

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

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 330, 580, 240));

        txtancName1.setEditable(false);
        txtancName1.setBackground(new java.awt.Color(255, 255, 255));
        txtancName1.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        txtancName1.setForeground(new java.awt.Color(102, 102, 102));
        txtancName1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(txtancName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 640, 40));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 10, 350));

        jLabel34.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(102, 102, 102));
        jLabel34.setText("Manage Fertilizer");
        jLabel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel34MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, 190, 40));

        btnancSave.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnancSave.setForeground(new java.awt.Color(102, 102, 102));
        btnancSave.setText("Save");
        btnancSave.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnancSave.setContentAreaFilled(false);
        btnancSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnancSaveMouseClicked(evt);
            }
        });
        getContentPane().add(btnancSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 590, 150, -1));
        getContentPane().add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 650, 230, 10));

        btnancReset.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnancReset.setForeground(new java.awt.Color(102, 102, 102));
        btnancReset.setText("Clear");
        btnancReset.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnancReset.setContentAreaFilled(false);
        btnancReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnancResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnancReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 540, 170, -1));

        logedUser5.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        logedUser5.setForeground(new java.awt.Color(102, 102, 102));
        logedUser5.setText("logged User");
        getContentPane().add(logedUser5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 300, 50));

        logedUser6.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        logedUser6.setForeground(new java.awt.Color(102, 102, 102));
        logedUser6.setText("Log Out");
        logedUser6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logedUser6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logedUser6MouseClicked(evt);
            }
        });
        getContentPane().add(logedUser6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 90, 50));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/footer.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, -1, 210));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BackgroundImage.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 770));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setState(1);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        manageSensorDetails m = new manageSensorDetails(username, userLevel, email);
        m.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        userManagement a = new userManagement(username, userLevel, email);
        a.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        AddCrop a = new AddCrop(username, userLevel, email);
        a.setVisible(true);
        this.hide();

    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        AddNewProduct a = new AddNewProduct(username, userLevel, email);
        a.setVisible(true);
        this.hide();

    }//GEN-LAST:event_jLabel26MouseClicked

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        ProductStock p = new ProductStock(username, userLevel, email);
        p.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jLabel27MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        manage_farm m = new manage_farm(username, userLevel, email);
        m.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseClicked
        fertilizerManagement f = new fertilizerManagement(username, userLevel, email);
        f.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jLabel34MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        viewSensorDetails v = new viewSensorDetails(username, userLevel, email);
        v.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        ProductSale p;
        p = new ProductSale(username, userLevel, email);
        p.setVisible(true);
        this.hide();

    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        AddCrop a;
        a = new AddCrop(username, userLevel, email);
        a.setVisible(true);

        this.hide();
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        field_harvest f = new field_harvest(username, userLevel, email);
        f.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jLabel19MouseClicked

    private void btnancResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnancResetActionPerformed
        clear();
    }//GEN-LAST:event_btnancResetActionPerformed

    private void btnancSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnancSaveMouseClicked
        String name, feild;
        double price, qty;

        if (txtancName.getText().isEmpty() || txtancQty.getText().isEmpty() || txtancBuyingPrice.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please provide the name...", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
            name = txtancName.getText();
            qty = Double.parseDouble(txtancQty.getText());
            feild = cmbProductID.getSelectedItem().toString();
            price = Double.parseDouble(txtancBuyingPrice.getText());
            String date = Calendar.getInstance().getTime().toString();

            if (cropSet.addCrop(new HarvestImp(name, qty, feild, date, price))) {
                try {
                    Serialization.Serialize(cropSet, FILE_NAME_Crops);
                } catch (IOException ex) {
                    Logger.getLogger(AddCrop.class.getName()).log(Level.SEVERE, null, ex);
                }
                clear();

                loadCrop(cropSet);
                JOptionPane.showMessageDialog(this, "Add Sucsessfully", "Message", JOptionPane.PLAIN_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Unsuccessful...", "Error", JOptionPane.ERROR_MESSAGE);
            }

        }
    }//GEN-LAST:event_btnancSaveMouseClicked

    private void txtpProductSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpProductSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpProductSearchActionPerformed

    private void txtpProductSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpProductSearchKeyReleased
        SetOfHarvest search = new SetOfHarvest();

        if (!txtpProductSearch.getText().toString().equalsIgnoreCase("")) {
            search = cropSet.getCropFromName(txtpProductSearch.getText());
            loadCrop(search);

        }
    }//GEN-LAST:event_txtpProductSearchKeyReleased

    private void btnancUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnancUpdateMouseClicked
        String name, feild;
        double price, qty;

        if (txtancName.getText().isEmpty() || txtancQty.getText().isEmpty() || txtancBuyingPrice.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please provide the all details...", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
            name = txtancName.getText();
            qty = Double.parseDouble(txtancQty.getText());
            feild = cmbProductID.getSelectedItem().toString();
            price = Double.parseDouble(txtancBuyingPrice.getText());
            HarvestImp crop = cropSet.getCropFromID(Integer.parseInt(txtancCropID.getText())).firstElement();
            String date = Calendar.getInstance().getTime().toString();

            String status = cropSet.updateCrop(crop, name, date, qty, price, feild);
            if (status.equals("success")) {
                try {
                    Serialization.Serialize(cropSet, FILE_NAME_Crops);
                } catch (IOException ex) {
                    Logger.getLogger(AddCrop.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(this, "You have updated successful", "Congradulations", JOptionPane.INFORMATION_MESSAGE);
                clear();
                loadCrop(cropSet);

            } else {
                JOptionPane.showMessageDialog(this, "Update unsuccessful...", "Error", JOptionPane.ERROR_MESSAGE);
            }

        }
    }//GEN-LAST:event_btnancUpdateMouseClicked

    private void btnancDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnancDeleteMouseClicked
        int cropID;

        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this product?", "Confirm", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (confirm == 0) {
            if (txtancCropID.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please select a product to delete...", "Error", JOptionPane.ERROR_MESSAGE);

            } else {
                cropID = Integer.parseInt(txtancCropID.getText());

                HarvestImp crop = cropSet.getCropFromID(Integer.parseInt(txtancCropID.getText())).firstElement();
                System.out.println("delete product" + crop);

                if (cropSet.removeProduct(crop)) {
                    try {
                        Serialization.Serialize(cropSet, FILE_NAME_Crops);
                    } catch (IOException ex) {
                        Logger.getLogger(AddNewProduct.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    loadCrop(cropSet);
                    JOptionPane.showMessageDialog(this, "Delete Sucsessfully", "Message", JOptionPane.PLAIN_MESSAGE);
                    clear();

                } else {
                    JOptionPane.showMessageDialog(this, "Delete unsuccessful...", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            clear();

        }
    }//GEN-LAST:event_btnancDeleteMouseClicked

    private void tblspProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblspProductMouseClicked

        DefaultTableModel dtm = (DefaultTableModel) tblspProduct.getModel();

        int row = tblspProduct.getSelectedRow();

        txtancCropID.setText(tblspProduct.getValueAt(row, 0).toString());
        txtancName.setText(tblspProduct.getValueAt(row, 1).toString());
        txtancQty.setText(tblspProduct.getValueAt(row, 2).toString());
        cmbProductID.addItem(tblspProduct.getValueAt(row, 3).toString());
        txtancBuyingPrice.setText(tblspProduct.getValueAt(row, 5).toString());
    }//GEN-LAST:event_tblspProductMouseClicked


    private void txtancQtyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtancQtyKeyTyped
        validations.validateNumber(txtancQty, evt);

    }//GEN-LAST:event_txtancQtyKeyTyped

    private void txtancBuyingPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtancBuyingPriceKeyTyped
        validations.validateNumber(txtancBuyingPrice, evt);
    }//GEN-LAST:event_txtancBuyingPriceKeyTyped

    private void logedUser6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logedUser6MouseClicked
        Login l=new Login();
        l.setVisible(true);
        this.hide();
    }//GEN-LAST:event_logedUser6MouseClicked

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
            java.util.logging.Logger.getLogger(AddCrop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCrop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCrop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCrop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AddCrop().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(AddCrop.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(AddCrop.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnancDelete;
    private javax.swing.JButton btnancReset;
    private javax.swing.JButton btnancSave;
    private javax.swing.JButton btnancUpdate;
    private javax.swing.JComboBox cmbProductID;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JLabel logedUser1;
    private javax.swing.JLabel logedUser2;
    private javax.swing.JLabel logedUser5;
    private javax.swing.JLabel logedUser6;
    private javax.swing.JTable tblspProduct;
    private javax.swing.JTextField txtancBuyingPrice;
    private javax.swing.JTextField txtancCropID;
    private javax.swing.JTextField txtancName;
    private javax.swing.JTextField txtancName1;
    private javax.swing.JTextField txtancQty;
    private javax.swing.JTextField txtpProductSearch;
    // End of variables declaration//GEN-END:variables
}
