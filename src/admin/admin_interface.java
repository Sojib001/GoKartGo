/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package admin;

import java.awt.Component;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import login.firstlogin;
import seller.seller_interface;

/**
 *
 * @author Dell
 */
public class admin_interface extends javax.swing.JFrame {

    /**
     * Creates new form admin_interface
     */
    String[] name_arr = {"Sajib", "Sagor", "Sourav", "Adnan", "Hasnat"};
    String[] email_arr = {"Sajib@gmail.com", "Sagor@gmail.com", "Sourav@gmail.com", "Adnan@gmail.com", "Hasnat@gmail.com"};
    String[] shoptype_arr = {"Book Store", "Sports Store", "Hardware Store", "Grocery Store", "Hypermarket"};
    String[] phone_arr = {"345345", "345345", "345345", "345345", "345345"};
    String[] username_arr = {"Sojib123", "Sagor321", "Sourav456", "Adnan654", "Hasnat110"};
    String[] shopname_arr = {"Sojib Enterprise", "Sagor Enterprise", "Sourav Enterprise", "Adnan Enterprise", "Hasnat Enterprise"};
    
    
    public admin_interface() {
        initComponents();
        File selectedImageFIle = new File("D:\\Java swing\\icons_mysqlConnector\\icons\\book.png");
        String SelectedImagePath = selectedImageFIle.getAbsolutePath();
        ImageIcon ic = new ImageIcon(SelectedImagePath);
        Image image = ic.getImage().getScaledInstance(pic1.getWidth(), pic1.getHeight(), Image.SCALE_SMOOTH);
        pic1.setIcon(new ImageIcon(image));
        
        selectedImageFIle = new File("D:\\Java swing\\icons_mysqlConnector\\icons\\sport.png");
        SelectedImagePath = selectedImageFIle.getAbsolutePath();
        ic = new ImageIcon(SelectedImagePath);
        image = ic.getImage().getScaledInstance(pic1.getWidth(), pic1.getHeight(), Image.SCALE_SMOOTH);
        pic2.setIcon(new ImageIcon(image));
        
        selectedImageFIle = new File("D:\\Java swing\\icons_mysqlConnector\\icons\\hardware.png");
        SelectedImagePath = selectedImageFIle.getAbsolutePath();
        ic = new ImageIcon(SelectedImagePath);
        image = ic.getImage().getScaledInstance(pic1.getWidth(), pic1.getHeight(), Image.SCALE_SMOOTH);
        pic3.setIcon(new ImageIcon(image));
        
        selectedImageFIle = new File("D:\\Java swing\\icons_mysqlConnector\\icons\\hypermarket.png");
        SelectedImagePath = selectedImageFIle.getAbsolutePath();
        ic = new ImageIcon(SelectedImagePath);
        image = ic.getImage().getScaledInstance(pic1.getWidth(), pic1.getHeight(), Image.SCALE_SMOOTH);
        pic4.setIcon(new ImageIcon(image));
        
        selectedImageFIle = new File("D:\\Java swing\\icons_mysqlConnector\\icons\\grocery.png");
        SelectedImagePath = selectedImageFIle.getAbsolutePath();
        ic = new ImageIcon(SelectedImagePath);
        image = ic.getImage().getScaledInstance(pic1.getWidth(), pic1.getHeight(), Image.SCALE_SMOOTH);
        pic5.setIcon(new ImageIcon(image));
        
        
        //String SelectedImagePath = absolutepath("D:\\Java swing\\icons_mysqlConnector\\icons\\books.png");
        
    }
    public admin_interface(String s) {
        initComponents();
        //String SelectedImagePath = absolutepath("D:\\Java swing\\icons_mysqlConnector\\icons\\books.png");
        File selectedImageFIle = new File("D:\\Java swing\\icons_mysqlConnector\\icons\\book.png");
        String SelectedImagePath = selectedImageFIle.getAbsolutePath();
        ImageIcon ic = new ImageIcon(SelectedImagePath);
        Image image = ic.getImage().getScaledInstance(pic1.getWidth(), pic1.getHeight(), Image.SCALE_SMOOTH);
        pic1.setIcon(new ImageIcon(image));
        
        selectedImageFIle = new File("D:\\Java swing\\icons_mysqlConnector\\icons\\sport.png");
        SelectedImagePath = selectedImageFIle.getAbsolutePath();
        ic = new ImageIcon(SelectedImagePath);
        image = ic.getImage().getScaledInstance(pic1.getWidth(), pic1.getHeight(), Image.SCALE_SMOOTH);
        pic2.setIcon(new ImageIcon(image));
        
        selectedImageFIle = new File("D:\\Java swing\\icons_mysqlConnector\\icons\\hardware.png");
        SelectedImagePath = selectedImageFIle.getAbsolutePath();
        ic = new ImageIcon(SelectedImagePath);
        image = ic.getImage().getScaledInstance(pic1.getWidth(), pic1.getHeight(), Image.SCALE_SMOOTH);
        pic3.setIcon(new ImageIcon(image));
        
        selectedImageFIle = new File("D:\\Java swing\\icons_mysqlConnector\\icons\\hypermarket.png");
        SelectedImagePath = selectedImageFIle.getAbsolutePath();
        ic = new ImageIcon(SelectedImagePath);
        image = ic.getImage().getScaledInstance(pic1.getWidth(), pic1.getHeight(), Image.SCALE_SMOOTH);
        pic4.setIcon(new ImageIcon(image));
        
        selectedImageFIle = new File("D:\\Java swing\\icons_mysqlConnector\\icons\\grocery.png");
        SelectedImagePath = selectedImageFIle.getAbsolutePath();
        ic = new ImageIcon(SelectedImagePath);
        image = ic.getImage().getScaledInstance(pic1.getWidth(), pic1.getHeight(), Image.SCALE_SMOOTH);
        pic5.setIcon(new ImageIcon(image));
        username.setText(s);
            DefaultTableModel table = (DefaultTableModel)jTable1.getModel();
            String val1 = "2004003";
            String val2 = "Sajib";
            String val3 = "Sajib@gmail.com";
            String val4 = "123";
            String val5 = "032424";
            String val6 = "Your Favourite color?";
            String val7 = "Black";
            String val8 = "Akmol Ali, CTG";
            String val9 = "Bangladesh";
            
            table.addRow(new Object[]{val1, val2, val3, val4, val5, val6, val7, val8, val9});
            
            val1 = "2004005";
            val2 = "Hasnat";
            val3 = "Hasnat@gmail.com";
            val4 = "456";
            val5 = "0345424";
            val6 = "Your Favourite color?";
            val7 = "Pink";
            val8 = "New Market, CTG";
            val9 = "Bangladesh";
            table.addRow(new Object[]{val1, val2, val3, val4, val5, val6, val7, val8, val9});
            
            val1 = "2004006";
            val2 = "Sowrav";
            val3 = "Sowrav@gmail.com";
            val4 = "789";
            val5 = "0124424";
            val6 = "Your Favourite color?";
            val7 = "Red";
            val8 = "Raujan, CTG";
            val9 = "Bangladesh";
            table.addRow(new Object[]{val1, val2, val3, val4, val5, val6, val7, val8, val9});
            
            val1 = "2004010";
            val2 = "Sagor";
            val3 = "Sagor@gmail.com";
            val4 = "789";
            val5 = "03428344";
            val6 = "Your Favourite color?";
            val7 = "Cyan";
            val8 = "Patenga, CTG";
            val9 = "Bangladesh";
            table.addRow(new Object[]{val1, val2, val3, val4, val5, val6, val7, val8, val9});
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        username = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        mother_panel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        seller = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        pic1 = new javax.swing.JLabel();
        see = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jpanel4 = new javax.swing.JPanel();
        see1 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        pic3 = new javax.swing.JLabel();
        jpanel5 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        see2 = new javax.swing.JButton();
        pic2 = new javax.swing.JLabel();
        jpanel6 = new javax.swing.JPanel();
        see7 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        pic4 = new javax.swing.JLabel();
        jpanel7 = new javax.swing.JPanel();
        see3 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        pic5 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        see4 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        see5 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        see6 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        user = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        userid = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        securityquestion = new javax.swing.JTextField();
        answer = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        line1 = new javax.swing.JTextField();
        Jlabelline2 = new javax.swing.JLabel();
        line2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        username.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        username.setText("XYZ");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("LOGOUT");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(username, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel2.setBackground(new java.awt.Color(128, 128, 128));
        jPanel2.setForeground(new java.awt.Color(18, 18, 18));

        jButton1.setText("Manage User");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Manage Seller");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(369, 369, 369)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(448, 448, 448))
        );

        mother_panel.setLayout(new java.awt.CardLayout());

        seller.setBackground(new java.awt.Color(204, 204, 204));

        pic1.setBackground(new java.awt.Color(255, 255, 255));

        see.setText("See Details");
        see.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seeMouseClicked(evt);
            }
        });
        see.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seeActionPerformed(evt);
            }
        });

        jButton7.setText("Remove");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pic1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(see, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pic1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(see, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        see1.setText("See Details");
        see1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                see1MouseClicked(evt);
            }
        });
        see1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                see1ActionPerformed(evt);
            }
        });

        jButton8.setText("Remove");

        javax.swing.GroupLayout jpanel4Layout = new javax.swing.GroupLayout(jpanel4);
        jpanel4.setLayout(jpanel4Layout);
        jpanel4Layout.setHorizontalGroup(
            jpanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(see1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
            .addComponent(jButton8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pic3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jpanel4Layout.setVerticalGroup(
            jpanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(see1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jpanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpanel4Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(pic3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(70, 70, 70)))
        );

        jButton9.setText("Remove");

        see2.setText("See Details");
        see2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                see2MouseClicked(evt);
            }
        });
        see2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                see2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanel5Layout = new javax.swing.GroupLayout(jpanel5);
        jpanel5.setLayout(jpanel5Layout);
        jpanel5Layout.setHorizontalGroup(
            jpanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(see2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
            .addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pic2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpanel5Layout.setVerticalGroup(
            jpanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pic2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(see2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        see7.setText("See Details");
        see7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                see7MouseClicked(evt);
            }
        });
        see7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                see7ActionPerformed(evt);
            }
        });

        jButton14.setText("Remove");

        javax.swing.GroupLayout jpanel6Layout = new javax.swing.GroupLayout(jpanel6);
        jpanel6.setLayout(jpanel6Layout);
        jpanel6Layout.setHorizontalGroup(
            jpanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(see7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
            .addComponent(jButton14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pic4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpanel6Layout.setVerticalGroup(
            jpanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pic4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(see7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        see3.setText("See Details");
        see3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                see3MouseClicked(evt);
            }
        });
        see3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                see3ActionPerformed(evt);
            }
        });

        jButton10.setText("Remove");

        javax.swing.GroupLayout jpanel7Layout = new javax.swing.GroupLayout(jpanel7);
        jpanel7.setLayout(jpanel7Layout);
        jpanel7Layout.setHorizontalGroup(
            jpanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(see3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pic5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpanel7Layout.setVerticalGroup(
            jpanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pic5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(see3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        see4.setText("See Details");
        see4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                see4MouseClicked(evt);
            }
        });
        see4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                see4ActionPerformed(evt);
            }
        });

        jButton11.setText("Remove");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(see4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(225, Short.MAX_VALUE)
                .addComponent(see4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        see5.setText("See Details");
        see5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                see5MouseClicked(evt);
            }
        });
        see5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                see5ActionPerformed(evt);
            }
        });

        jButton12.setText("Remove");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(see5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(208, Short.MAX_VALUE)
                .addComponent(see5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        see6.setText("See Details");
        see6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                see6MouseClicked(evt);
            }
        });
        see6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                see6ActionPerformed(evt);
            }
        });

        jButton13.setText("Remove");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(see6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(225, Short.MAX_VALUE)
                .addComponent(see6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout sellerLayout = new javax.swing.GroupLayout(seller);
        seller.setLayout(sellerLayout);
        sellerLayout.setHorizontalGroup(
            sellerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sellerLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(sellerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(sellerLayout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addComponent(jpanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sellerLayout.createSequentialGroup()
                        .addGroup(sellerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jpanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(108, 108, 108)
                        .addGroup(sellerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(87, 87, 87)
                .addGroup(sellerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        sellerLayout.setVerticalGroup(
            sellerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sellerLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(sellerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50)
                .addGroup(sellerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(sellerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sellerLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(sellerLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jScrollPane2.setViewportView(seller);

        mother_panel.add(jScrollPane2, "card4");

        user.setBackground(new java.awt.Color(51, 51, 51));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("User ID");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Username");

        userid.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        userid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useridActionPerformed(evt);
            }
        });

        name.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Password");

        email.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Email");

        password.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Phone ");

        phone.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Security Question");

        securityquestion.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        securityquestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                securityquestionActionPerformed(evt);
            }
        });

        answer.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        answer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Address Line 1 (State and Area)");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Answer");

        line1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        line1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                line1ActionPerformed(evt);
            }
        });

        Jlabelline2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Jlabelline2.setForeground(new java.awt.Color(255, 255, 255));
        Jlabelline2.setText("Address Line 2 (Country)");

        line2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        line2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                line2ActionPerformed(evt);
            }
        });

        jButton3.setText("Update");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Delete");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User ID", "Username", "Email", "Password", "Phone", "Security Question", "Answer", "Address Line 1", "Address Line 2"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton5.setText("Add New");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout userLayout = new javax.swing.GroupLayout(user);
        user.setLayout(userLayout);
        userLayout.setHorizontalGroup(
            userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                    .addComponent(email)
                    .addComponent(password)
                    .addComponent(phone)
                    .addComponent(userid))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 373, Short.MAX_VALUE)
                .addGroup(userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(securityquestion)
                        .addComponent(answer)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(line1)
                        .addComponent(Jlabelline2, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                        .addComponent(line2, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(userLayout.createSequentialGroup()
                        .addGroup(userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(113, 113, 113))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        userLayout.setVerticalGroup(
            userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userid, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(securityquestion, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(answer, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(line1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jlabelline2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(line2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(userLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(userLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 147, Short.MAX_VALUE))
        );

        mother_panel.add(user, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mother_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mother_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        mother_panel.removeAll();
        mother_panel.repaint();
        mother_panel.revalidate();

        mother_panel.add(user);
        mother_panel.repaint();
        mother_panel.revalidate();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        mother_panel.removeAll();
        mother_panel.repaint();
        mother_panel.revalidate();

        mother_panel.add(seller);
        mother_panel.repaint();
        mother_panel.revalidate();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        new firstlogin().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void useridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_useridActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneActionPerformed

    private void securityquestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_securityquestionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_securityquestionActionPerformed

    private void answerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answerActionPerformed

    private void line1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_line1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_line1ActionPerformed

    private void line2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_line2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_line2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
        if (userid.getText().equals("") || name.getText().equals("") || securityquestion.getText().equals("") || email.getText().equals("")|| password.getText().equals("")|| phone.getText().equals("")|| line1.getText().equals("")|| Jlabelline2.getText().equals("")|| answer.getText().equals("")) {
            JOptionPane.showMessageDialog(new JFrame(), "Please Complete all the fields", "Dialog",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            DefaultTableModel table = (DefaultTableModel)jTable1.getModel();
            
            String ids = userid.getText();
            String names = name.getText();
            String emails = email.getText();
            String passwords = password.getText();
            String phones = phone.getText();
            String securityquestions = securityquestion.getText();
            String answers = answer.getText();
            String line1s = line1.getText();
            String line2s = line2.getText();
            table.addRow(new Object[]{ids, names, emails, passwords, phones, securityquestions, answers, line1s, line2s});
            // image_label.remove(imageicon);
            userid.setText("");
            name.setText("");
            email.setText("");
            password.setText("");
            phone.setText("");
            securityquestion.setText("");
            answer.setText("");
            line1.setText("");
            line2.setText("");
        }
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        DefaultTableModel table = (DefaultTableModel)jTable1.getModel();
            
        if(userid.getText().equals(""))
        {
            JOptionPane.showMessageDialog(new JFrame(), "Secelct a row!", "Dialog",
                    JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            String val1 = userid.getText();
            String val2 = name.getText();
            String val3 = email.getText();
            String val4 = password.getText();
            String val5 = phone.getText();
            String val6 = securityquestion.getText();
            String val7 = answer.getText();
            String val8 = line1.getText();
            String val9 = line2.getText();
            
            table.addRow(new Object[]{val1, val2, val3, val4, val5, val6, val7, val8, val9});
            table.removeRow(jTable1.getSelectedRow());
            userid.setText("");
            name.setText("");
            email.setText("");
            password.setText("");
            phone.setText("");
            securityquestion.setText("");
            answer.setText("");
            line1.setText("");
            line2.setText("");
            
        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
         DefaultTableModel table = (DefaultTableModel)jTable1.getModel();
         userid.setText(table.getValueAt(row, 0).toString());
         name.setText(table.getValueAt(row, 1).toString());
         email.setText(table.getValueAt(row, 2).toString());
         password.setText(table.getValueAt(row, 3).toString());
         phone.setText(table.getValueAt(row, 4).toString());
         securityquestion.setText(table.getValueAt(row, 5).toString());
         answer.setText(table.getValueAt(row, 6).toString());
         line1.setText(table.getValueAt(row, 7).toString());
         line2.setText(table.getValueAt(row, 8).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        DefaultTableModel table = (DefaultTableModel)jTable1.getModel();
            
        if(userid.getText().equals(""))
        {
            JOptionPane.showMessageDialog(new JFrame(), "Secelct a row!", "Dialog",
                    JOptionPane.ERROR_MESSAGE);
        }
        else if(table.getRowCount() == 0)
        {
            
            JOptionPane.showMessageDialog(new JFrame(), "Insert a row first!", "Dialog",
                    JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            
            table.removeRow(jTable1.getSelectedRow());
            userid.setText("");
            name.setText("");
            email.setText("");
            password.setText("");
            securityquestion.setText("");
            answer.setText("");
            line1.setText("");
            line2.setText("");
            phone.setText("");
        }
    }//GEN-LAST:event_jButton4MouseClicked

    private void seeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seeActionPerformed

    private void seeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seeMouseClicked
        // TODO add your handling code here:
        String f = "D:\\Java swing\\icons_mysqlConnector\\icons\\book.png";
        new data_collector(name_arr, email_arr, phone_arr, username_arr, shoptype_arr, shopname_arr, 0, f).setVisible(true);
        dispose();
    }//GEN-LAST:event_seeMouseClicked

    private void see1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_see1MouseClicked
        // TODO add your handling code here:
        String f = "D:\\Java swing\\icons_mysqlConnector\\icons\\hardware.png";
        new data_collector(name_arr, email_arr, phone_arr, username_arr, shoptype_arr, shopname_arr, 1, f).setVisible(true);
        dispose();
    }//GEN-LAST:event_see1MouseClicked

    private void see1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_see1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_see1ActionPerformed

    private void see2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_see2MouseClicked
        // TODO add your handling code here:
        String f = "D:\\Java swing\\icons_mysqlConnector\\icons\\sport.png";
        new data_collector(name_arr, email_arr, phone_arr, username_arr, shoptype_arr, shopname_arr, 2, f).setVisible(true);
        dispose();
    }//GEN-LAST:event_see2MouseClicked

    private void see2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_see2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_see2ActionPerformed

    private void see3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_see3MouseClicked
        // TODO add your handling code here:
        String f = "D:\\Java swing\\icons_mysqlConnector\\icons\\grocery.png";
        new data_collector(name_arr, email_arr, phone_arr, username_arr, shoptype_arr, shopname_arr, 4, f).setVisible(true);
        dispose();
    }//GEN-LAST:event_see3MouseClicked

    private void see3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_see3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_see3ActionPerformed

    private void see4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_see4MouseClicked
        // TODO add your handling code here:
        String f = "D:\\Java swing\\icons_mysqlConnector\\icons\\book.png";
        new data_collector(name_arr, email_arr, phone_arr, username_arr, shoptype_arr, shopname_arr, 5, f).setVisible(true);
        dispose();
        
    }//GEN-LAST:event_see4MouseClicked

    private void see4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_see4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_see4ActionPerformed

    private void see5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_see5MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_see5MouseClicked

    private void see5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_see5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_see5ActionPerformed

    private void see6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_see6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_see6MouseClicked

    private void see6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_see6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_see6ActionPerformed

    private void see7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_see7MouseClicked
        // TODO add your handling code here:
        String f = "D:\\Java swing\\icons_mysqlConnector\\icons\\hypermarket.png";
        new data_collector(name_arr, email_arr, phone_arr, username_arr, shoptype_arr, shopname_arr, 6, f).setVisible(true);
        dispose();
    }//GEN-LAST:event_see7MouseClicked

    private void see7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_see7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_see7ActionPerformed
    
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
            java.util.logging.Logger.getLogger(admin_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jlabelline2;
    private javax.swing.JTextField answer;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel jpanel4;
    private javax.swing.JPanel jpanel5;
    private javax.swing.JPanel jpanel6;
    private javax.swing.JPanel jpanel7;
    private javax.swing.JTextField line1;
    private javax.swing.JTextField line2;
    private javax.swing.JPanel mother_panel;
    private javax.swing.JTextField name;
    private javax.swing.JTextField password;
    private javax.swing.JTextField phone;
    private javax.swing.JLabel pic1;
    private javax.swing.JLabel pic2;
    private javax.swing.JLabel pic3;
    private javax.swing.JLabel pic4;
    private javax.swing.JLabel pic5;
    private javax.swing.JTextField securityquestion;
    private javax.swing.JButton see;
    private javax.swing.JButton see1;
    private javax.swing.JButton see2;
    private javax.swing.JButton see3;
    private javax.swing.JButton see4;
    private javax.swing.JButton see5;
    private javax.swing.JButton see6;
    private javax.swing.JButton see7;
    private javax.swing.JPanel seller;
    private javax.swing.JPanel user;
    private javax.swing.JTextField userid;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
