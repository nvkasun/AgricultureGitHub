package UI;

import Classes.Product.ProductsImp;
import Classes.Product.SetOfProducts;
import Classes.serialization.Serialization;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.stream.ImageOutputStream;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Lakmi
 */
public class AddNewProduct extends javax.swing.JFrame {

    public static ProductsImp products = new ProductsImp();
    public static final String FILE_NAME_Products = "DataFiles/Products.txt";
    private SetOfProducts productSet = new SetOfProducts();
    private Serialization serialize = new Serialization();
    JFileChooser chooser;
    FileNameExtensionFilter filter;
    FileInputStream fis;
    /**
     * Creates new form AddNewProduct
     */
    String username,userLevel,email;
    String workingDir = System.getProperty("user.dir");

    public AddNewProduct() {
        initComponents();
    }

    public AddNewProduct(String username, String userLevel, String email) {
        initComponents();
        this.username = username;
        this.userLevel = userLevel;
        this.email = email;
logedUser.setText(email);
        txtanpId.setEnabled(false);
        try {
            for (ProductsImp products : Serialization.deserializeProducts()) {
                productSet.addProducts(products);
                products.print();

            }
        } catch (IOException e) {
            try {
                serialize.Serialize(productSet, FILE_NAME_Products);
            } catch (IOException ex) {
                Logger.getLogger(AddNewProduct.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddNewProduct.class.getName()).log(Level.SEVERE, null, ex);
        }

        ImageIcon image = new ImageIcon(workingDir + "\\Images\\image.jpg");
        imageIcon.setIcon(image);
        Image img = ((ImageIcon) imageIcon.getIcon()).getImage();
        Image newimg = img.getScaledInstance(imageIcon.getWidth(), imageIcon.getHeight(), java.awt.Image.SCALE_SMOOTH);
        ImageIcon imi = new ImageIcon(newimg);
        imageIcon.setIcon(imi);

        loadAddProduct(productSet);
    }

    // table load
    private void loadAddProduct(SetOfProducts products) {

        String[] colName = {"ProductID", "Name", "Description", "Unit Price", "Total Quantity", "Avalability"};
        Object[][] object = new Object[products.size()][6];
        int i = 0;
        if (products.size() != 0) {
            for (ProductsImp product : products) {
                object[i][0] = product.getProductNo();
                object[i][1] = product.getName();
                object[i][2] = product.getdescription();
                object[i][3] = product.getPrice();
                object[i][4] = product.getQuantity();
                object[i][5] = product.getAvalability();
                i++;

            }
        }

        DefaultTableModel model = new DefaultTableModel(object, colName) {
            public boolean isCellEditable(int row, int column) {
                return false;//This causes all cells to be not editable
            }
        };
        tblanpProduct.setModel(model);
        tblanpProduct.setRowSorter(new TableRowSorter<TableModel>(model));
        tblanpProduct.setAutoscrolls(true);
        tblanpProduct.getTableHeader().setReorderingAllowed(false);

    }

   

    /**
     *clear all
     */
        public void clear() {
        txtanpName.setText("");
        txtanpDes.setText("");
        txtanpId.setText("");

        ImageIcon image = new ImageIcon(workingDir + "\\Images\\image.jpg");
        imageIcon.setIcon(image);
        Image img = ((ImageIcon) imageIcon.getIcon()).getImage();
        Image newimg = img.getScaledInstance(imageIcon.getWidth(), imageIcon.getHeight(), java.awt.Image.SCALE_SMOOTH);
        ImageIcon imi = new ImageIcon(newimg);
        imageIcon.setIcon(imi);
        productSet.removeAll(productSet);
        try {
            for (ProductsImp products : Serialization.deserializeProducts()) {
                productSet.addProducts(products);
                products.print();

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

        avalability = new javax.swing.ButtonGroup();
        jLabel28 = new javax.swing.JLabel();
        txtpProductSearch = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtanpId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtanpDes = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtanpName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnancSave = new javax.swing.JButton();
        btnancDelete = new javax.swing.JButton();
        btnancUpdate = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblanpProduct = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        btnpAddCart6 = new javax.swing.JButton();
        imageIcon = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtancName = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel34 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        btnancClear = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        logedUser = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search_icon.png"))); // NOI18N
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 280, 40, 40));

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
        getContentPane().add(txtpProductSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 280, 480, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Name               :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 140, -1));

        txtanpId.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        txtanpId.setForeground(new java.awt.Color(102, 102, 102));
        txtanpId.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(txtanpId, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 220, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Image              :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 460, 140, -1));

        txtanpDes.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        txtanpDes.setForeground(new java.awt.Color(102, 102, 102));
        txtanpDes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(txtanpDes, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, 220, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("ProductID         :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 140, -1));

        txtanpName.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        txtanpName.setForeground(new java.awt.Color(102, 102, 102));
        txtanpName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtanpName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtanpNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtanpName, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, 220, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel3.setText("Agriculture Sensoring Sys");
        jLabel3.setToolTipText("");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 130, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("www.Agrivi.com/Agriculture Sensoring/adminPanal.htm");
        jLabel8.setToolTipText("");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 540, 20));

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

        btnancSave.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        btnancSave.setForeground(new java.awt.Color(102, 102, 102));
        btnancSave.setText("Add");
        btnancSave.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnancSave.setContentAreaFilled(false);
        btnancSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnancSaveMouseClicked(evt);
            }
        });
        btnancSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnancSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnancSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 600, 160, 30));

        btnancDelete.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        btnancDelete.setForeground(new java.awt.Color(102, 102, 102));
        btnancDelete.setText("Delete");
        btnancDelete.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnancDelete.setContentAreaFilled(false);
        btnancDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnancDeleteMouseClicked(evt);
            }
        });
        btnancDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnancDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnancDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 600, 160, 30));

        btnancUpdate.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        btnancUpdate.setForeground(new java.awt.Color(102, 102, 102));
        btnancUpdate.setText("Update");
        btnancUpdate.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnancUpdate.setContentAreaFilled(false);
        btnancUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnancUpdateMouseClicked(evt);
            }
        });
        btnancUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnancUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnancUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 600, 160, 30));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));

        tblanpProduct.setForeground(new java.awt.Color(153, 153, 153));
        tblanpProduct.setModel(new javax.swing.table.DefaultTableModel(
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
        tblanpProduct.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblanpProduct.setFillsViewportHeight(true);
        tblanpProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblanpProductMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblanpProduct);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 330, 580, 250));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SemMainLogo.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 480, 160));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 240, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Manage Sensor Details");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 250, 40));

        jLabel13.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("Manage Users");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 260, 40));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 240, 10));

        jLabel20.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
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
        jLabel26.setForeground(new java.awt.Color(0, 102, 153));
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

        jLabel15.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("Field Stations");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 150, 30));

        btnpAddCart6.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        btnpAddCart6.setForeground(new java.awt.Color(102, 102, 102));
        btnpAddCart6.setText("Upload");
        btnpAddCart6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnpAddCart6.setContentAreaFilled(false);
        btnpAddCart6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnpAddCart6MouseClicked(evt);
            }
        });
        getContentPane().add(btnpAddCart6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 560, 220, 30));
        getContentPane().add(imageIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, 220, 130));

        jLabel16.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("Produnct Sales");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, 160, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Admin Panal");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 230, 140, 30));

        jLabel18.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setText("Data Analysis");
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 230, 140, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Description       :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 140, -1));

        txtancName.setEditable(false);
        txtancName.setBackground(new java.awt.Color(255, 255, 255));
        txtancName.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        txtancName.setForeground(new java.awt.Color(102, 102, 102));
        txtancName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(txtancName, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 640, 40));

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
        getContentPane().add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 650, 230, 10));

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
        getContentPane().add(btnancClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 600, 220, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/footer.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, -1, -1));

        logedUser.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        logedUser.setForeground(new java.awt.Color(102, 102, 102));
        logedUser.setText("logged User");
        getContentPane().add(logedUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 300, 50));

        logout.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        logout.setForeground(new java.awt.Color(102, 102, 102));
        logout.setText("Log Out");
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 90, 50));

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

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        manageSensorDetails m = new manageSensorDetails(username, userLevel, email);
        m.setVisible(true);
        this.hide();
        productSet.removeAll(productSet);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        userManagement a = new userManagement(username, userLevel, email);
        a.setVisible(true);
        this.hide();
        productSet.removeAll(productSet);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        AddCrop a = new AddCrop(username, userLevel, email);
        a.setVisible(true);

        this.hide();
        productSet.removeAll(productSet);
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        AddNewProduct a;
        a = new AddNewProduct(username, userLevel, email);
        a.setVisible(true);
        this.hide();
        productSet.removeAll(productSet);
    }//GEN-LAST:event_jLabel26MouseClicked

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        ProductStock p = new ProductStock(username, userLevel, email);
        p.setVisible(true);
        this.hide();
        productSet.removeAll(productSet);
    }//GEN-LAST:event_jLabel27MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        manage_farm m = new manage_farm(username, userLevel, email);
        m.setVisible(true);
        this.hide();
        productSet.removeAll(productSet);
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseClicked
        fertilizerManagement f = new fertilizerManagement(username, userLevel, email);
        f.setVisible(true);
        this.hide();
        productSet.removeAll(productSet);
    }//GEN-LAST:event_jLabel34MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        viewSensorDetails v = new viewSensorDetails(username, userLevel, email);
        v.setVisible(true);
        this.hide();
        productSet.removeAll(productSet);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        ProductSale p;
        p = new ProductSale(username, userLevel, email);
        p.setVisible(true);
        this.hide();
        productSet.removeAll(productSet);

    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        AddNewProduct u;
        u = new AddNewProduct(username, userLevel, email);
        u.setVisible(true);
        this.hide();

        productSet.removeAll(productSet);
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        field_harvest f = new field_harvest(username, userLevel, email);
        f.setVisible(true);
        this.hide();
        productSet.removeAll(productSet);
    }//GEN-LAST:event_jLabel18MouseClicked

    private void btnancSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnancSaveActionPerformed

    }//GEN-LAST:event_btnancSaveActionPerformed

    private void btnancSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnancSaveMouseClicked
        String name, description;
        if (txtanpName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please provide the name...", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
            name = txtanpName.getText();
            description = txtanpDes.getText();
            Icon icon = imageIcon.getIcon();

            BufferedImage image = new BufferedImage(icon.getIconWidth(),
                    icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2d = image.createGraphics();
            icon.paintIcon(null, g2d, 0, 0);
            g2d.dispose();

            try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
                ImageOutputStream ios = ImageIO.createImageOutputStream(baos);
                try {
                    ImageIO.write(image, "png", ios);
                    // Set a flag to indicate that the write was successful
                } finally {
                    ios.close();
                }
                byte[] imageInByte = baos.toByteArray();

                productSet.addProducts(new ProductsImp(name, description, 0, 0.00, "No", imageInByte));
            } catch (IOException ex) {
            }
           
            try {
                Serialization.Serialize(productSet, FILE_NAME_Products);
                JOptionPane.showMessageDialog(this, "Add Sucsessfully", "Message", JOptionPane.PLAIN_MESSAGE);
                clear();
            } catch (IOException ex) {
                Logger.getLogger(AddNewProduct.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Unsuccessful...", "Error", JOptionPane.ERROR_MESSAGE);
            }

            loadAddProduct(productSet);

        }


    }//GEN-LAST:event_btnancSaveMouseClicked

    private void btnancClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnancClearMouseClicked

        clear();
    }//GEN-LAST:event_btnancClearMouseClicked

    /**
     *upload image to the product 
     */
    public void get_image() {
        chooser = new JFileChooser();
        filter = new FileNameExtensionFilter("JPG & GIF Images", "jpg", "gif", "png");
        chooser.setFileFilter(filter);
        int result = chooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            ImageIcon icon = new ImageIcon(chooser.getSelectedFile().getAbsolutePath());
            Image img = icon.getImage();
            Image newimg = img.getScaledInstance(imageIcon.getWidth(), imageIcon.getHeight(), java.awt.Image.SCALE_SMOOTH);
            ImageIcon imi = new ImageIcon(newimg);
            imageIcon.setIcon(imi);
        }
    }


    private void btnancUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnancUpdateMouseClicked
        String name, description;

        if (txtanpName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please provide the name...", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
            name = txtanpName.getText();
            description = txtanpDes.getText();
            Icon icon = imageIcon.getIcon();

            BufferedImage image = new BufferedImage(icon.getIconWidth(),
                    icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2d = image.createGraphics();
            icon.paintIcon(null, g2d, 0, 0);
            g2d.dispose();

            try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
                ImageOutputStream ios = ImageIO.createImageOutputStream(baos);
                try {
                    ImageIO.write(image, "png", ios);
                    // Set a flag to indicate that the write was successful
                } finally {
                    ios.close();
                }
                byte[] imageInByte = baos.toByteArray();

                ProductsImp product = productSet.getProductFromID(Integer.parseInt(txtanpId.getText())).firstElement();

                String status = productSet.updateProducts(product, name, description, imageInByte);
                if (status.equals("success")) {
                    try {
                        Serialization.Serialize(productSet, FILE_NAME_Products);
                    } catch (IOException ex) {
                        Logger.getLogger(AddNewProduct.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    JOptionPane.showMessageDialog(this, "You have updated successful", "Congradulations", JOptionPane.INFORMATION_MESSAGE);
                    clear();
                    loadAddProduct(productSet);

                } else {
                    JOptionPane.showMessageDialog(this, "Update unsuccessful...", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }
    }//GEN-LAST:event_btnancUpdateMouseClicked

    private void btnancUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnancUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnancUpdateActionPerformed

    private void btnancDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnancDeleteMouseClicked
        int prodcutID;

        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this product?", "Confirm", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (confirm == 0) {
            if (txtanpId.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please select a product to delete...", "Error", JOptionPane.ERROR_MESSAGE);

            } else {
                prodcutID = Integer.parseInt(txtanpId.getText());

                ProductsImp product = productSet.getProductFromID(Integer.parseInt(txtanpId.getText())).firstElement();
                System.out.println("delete product" + product);

                if (productSet.removeProduct(product)) {
                    try {
                        Serialization.Serialize(productSet, FILE_NAME_Products);
                    } catch (IOException ex) {
                        Logger.getLogger(AddNewProduct.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    loadAddProduct(productSet);
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

    private void btnancDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnancDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnancDeleteActionPerformed

    private void txtpProductSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpProductSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpProductSearchActionPerformed

    private void txtanpNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtanpNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtanpNameActionPerformed

    private void txtpProductSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpProductSearchKeyReleased
        SetOfProducts search = new SetOfProducts();

        if (!txtpProductSearch.getText().toString().equalsIgnoreCase("")) {
            search = productSet.getProductFromName(txtpProductSearch.getText());
            loadAddProduct(search);

        }
    }//GEN-LAST:event_txtpProductSearchKeyReleased

    private void tblanpProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblanpProductMouseClicked

        DefaultTableModel dtm = (DefaultTableModel) tblanpProduct.getModel();

        int row = tblanpProduct.getSelectedRow();

        txtanpId.setText(tblanpProduct.getValueAt(row, 0).toString());
        txtanpName.setText(tblanpProduct.getValueAt(row, 1).toString());
        txtanpDes.setText(tblanpProduct.getValueAt(row, 2).toString());

        for (ProductsImp products : productSet) {
            if (products.getProductNo() == Integer.parseInt(txtanpId.getText())) {
                BufferedImage bufferedImage = null;
                try {
                    InputStream inputStream = new ByteArrayInputStream(products.getImage());
                    bufferedImage = ImageIO.read(inputStream);
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
                Image img = bufferedImage;
                Image newimg = img.getScaledInstance(imageIcon.getWidth(), imageIcon.getHeight(), java.awt.Image.SCALE_SMOOTH);
                ImageIcon imi = new ImageIcon(newimg);
                imageIcon.setIcon(imi);

                break;
            }

            products.print();
        }


    }//GEN-LAST:event_tblanpProductMouseClicked

    private void btnpAddCart6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnpAddCart6MouseClicked
        get_image();
    }//GEN-LAST:event_btnpAddCart6MouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        Login l=new Login();
        l.setVisible(true);
        this.hide();
    }//GEN-LAST:event_logoutMouseClicked

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
            java.util.logging.Logger.getLogger(AddNewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNewProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup avalability;
    private javax.swing.JButton btnancClear;
    private javax.swing.JButton btnancDelete;
    private javax.swing.JButton btnancSave;
    private javax.swing.JButton btnancUpdate;
    private javax.swing.JButton btnpAddCart6;
    private javax.swing.JLabel imageIcon;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
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
    private javax.swing.JLabel logout;
    private javax.swing.JTable tblanpProduct;
    private javax.swing.JTextField txtancName;
    private javax.swing.JTextField txtanpDes;
    private javax.swing.JTextField txtanpId;
    private javax.swing.JTextField txtanpName;
    private javax.swing.JTextField txtpProductSearch;
    // End of variables declaration//GEN-END:variables
}
