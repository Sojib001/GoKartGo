/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package admin;

import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Connection.myconnection;
import java.awt.Image;
import java.io.File;
import java.lang.reflect.Array;
import java.util.Arrays;
import javax.swing.ImageIcon;
import login.firstlogin;

/**
 *
 * @author Administrator
 */
public class User extends javax.swing.JFrame {

    /**
     * Creates new form User
     */
    int flg = 0;

    public User() {
        initComponents();

        //suggestion_bar();

        slideshow();
        choice();
        time_counter();
        load();
    }
    String gmail;
    int flag = 0;
    public User(String email)
    {
        initComponents();
        gmail = email;
        //suggestion_bar();

        slideshow();
        time_counter();
        choice();
        load();
        

    }
    public void load()
    {
        File selectedImageFIle = new File("D:\\Java swing\\icons_mysqlConnector\\icons\\mouse.PNG");
        String SelectedImagePath = selectedImageFIle.getAbsolutePath();
        ImageIcon ic = new ImageIcon(SelectedImagePath);
        Image image = ic.getImage().getScaledInstance(electronics.getWidth(), electronics.getHeight(), Image.SCALE_SMOOTH);
        electronics.setIcon(new ImageIcon(image));

        selectedImageFIle = new File("D:\\Java swing\\icons_mysqlConnector\\icons\\womenfashion.jpg");
        SelectedImagePath = selectedImageFIle.getAbsolutePath();
        ic = new ImageIcon(SelectedImagePath);
        //image = ic.getImage().getScaledInstance(womensfashion.getWidth(), womensfashion.getHeight(), Image.SCALE_SMOOTH);
        //womensfashion.setIcon(new ImageIcon(image));

        selectedImageFIle = new File("D:\\Java swing\\icons_mysqlConnector\\icons\\1st.PNG");
        SelectedImagePath = selectedImageFIle.getAbsolutePath();
        ic = new ImageIcon(SelectedImagePath);
        image = ic.getImage().getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), Image.SCALE_SMOOTH);
        jLabel7.setIcon(new ImageIcon(image));

        selectedImageFIle = new File("D:\\Java swing\\icons_mysqlConnector\\icons\\inter_miami.PNG");
        SelectedImagePath = selectedImageFIle.getAbsolutePath();
        ic = new ImageIcon(SelectedImagePath);
        image = ic.getImage().getScaledInstance(intermiami.getWidth(), intermiami.getHeight(), Image.SCALE_SMOOTH);
        intermiami.setIcon(new ImageIcon(image));

        selectedImageFIle = new File("D:\\Java swing\\icons_mysqlConnector\\icons\\anitlost key.PNG");
        SelectedImagePath = selectedImageFIle.getAbsolutePath();
        ic = new ImageIcon(SelectedImagePath);
        image = ic.getImage().getScaledInstance(anitlostkey.getWidth(), anitlostkey.getHeight(), Image.SCALE_SMOOTH);
        anitlostkey.setIcon(new ImageIcon(image));

        selectedImageFIle = new File("D:\\Java swing\\icons_mysqlConnector\\icons\\bd.PNG");
        SelectedImagePath = selectedImageFIle.getAbsolutePath();
        ic = new ImageIcon(SelectedImagePath);
        image = ic.getImage().getScaledInstance(bd.getWidth(), bd.getHeight(), Image.SCALE_SMOOTH);
        bd.setIcon(new ImageIcon(image));

        selectedImageFIle = new File("D:\\Java swing\\icons_mysqlConnector\\icons\\tel.jpg");
        SelectedImagePath = selectedImageFIle.getAbsolutePath();
        ic = new ImageIcon(SelectedImagePath);
        image = ic.getImage().getScaledInstance(tel.getWidth(), tel.getHeight(), Image.SCALE_SMOOTH);
        tel.setIcon(new ImageIcon(image));

        selectedImageFIle = new File("D:\\Java swing\\icons_mysqlConnector\\icons\\honeynut.PNG");
        SelectedImagePath = selectedImageFIle.getAbsolutePath();
        ic = new ImageIcon(SelectedImagePath);
        image = ic.getImage().getScaledInstance(honeynut.getWidth(), honeynut.getHeight(), Image.SCALE_SMOOTH);
        honeynut.setIcon(new ImageIcon(image));

        selectedImageFIle = new File("D:\\Java swing\\icons_mysqlConnector\\icons\\headphone.jpg");
        SelectedImagePath = selectedImageFIle.getAbsolutePath();
        ic = new ImageIcon(SelectedImagePath);
        image = ic.getImage().getScaledInstance(headphone.getWidth(), headphone.getHeight(), Image.SCALE_SMOOTH);
        headphone.setIcon(new ImageIcon(image));

        selectedImageFIle = new File("D:\\Java swing\\icons_mysqlConnector\\icons\\jeans.jpeg");
        SelectedImagePath = selectedImageFIle.getAbsolutePath();
        ic = new ImageIcon(SelectedImagePath);
        image = ic.getImage().getScaledInstance(jeans.getWidth(), jeans.getHeight(), Image.SCALE_SMOOTH);
        jeans.setIcon(new ImageIcon(image));
        
        selectedImageFIle = new File("D:\\Java swing\\icons_mysqlConnector\\icons\\trimmers.PNG");
        SelectedImagePath = selectedImageFIle.getAbsolutePath();
        ic = new ImageIcon(SelectedImagePath);
        image = ic.getImage().getScaledInstance(trimmers.getWidth(), trimmers.getHeight(), Image.SCALE_SMOOTH);
        trimmers.setIcon(new ImageIcon(image));
        
        selectedImageFIle = new File("D:\\Java swing\\icons_mysqlConnector\\icons\\smartwatches.PNG");
        SelectedImagePath = selectedImageFIle.getAbsolutePath();
        ic = new ImageIcon(SelectedImagePath);
        image = ic.getImage().getScaledInstance(smartwatches.getWidth(), smartwatches.getHeight(), Image.SCALE_SMOOTH);
        smartwatches.setIcon(new ImageIcon(image));
        
        selectedImageFIle = new File("D:\\Java swing\\icons_mysqlConnector\\icons\\salwar.jpg");
        SelectedImagePath = selectedImageFIle.getAbsolutePath();
        ic = new ImageIcon(SelectedImagePath);
        image = ic.getImage().getScaledInstance(salwar.getWidth(), salwar.getHeight(), Image.SCALE_SMOOTH);
        salwar.setIcon(new ImageIcon(image));
        
        selectedImageFIle = new File("D:\\Java swing\\icons_mysqlConnector\\icons\\knife.PNG");
        SelectedImagePath = selectedImageFIle.getAbsolutePath();
        ic = new ImageIcon(SelectedImagePath);
        image = ic.getImage().getScaledInstance(knife.getWidth(), knife.getHeight(), Image.SCALE_SMOOTH);
        knife.setIcon(new ImageIcon(image));
        
        selectedImageFIle = new File("D:\\Java swing\\icons_mysqlConnector\\icons\\belts.PNG");
        SelectedImagePath = selectedImageFIle.getAbsolutePath();
        ic = new ImageIcon(SelectedImagePath);
        image = ic.getImage().getScaledInstance(Belts.getWidth(), Belts.getHeight(), Image.SCALE_SMOOTH);
        Belts.setIcon(new ImageIcon(image));
    }
    public void time_counter() {
        Thread th5 = new Thread() {
            public void run() {
                try {
                    while (true) {
                        int x = Integer.parseInt(jLabel103.getText());
                        x--;
                        if (x == -1) {
                            x = 59;
                            int y = Integer.parseInt(jLabel102.getText());
                            y--;
                            if (y == -1) {
                                y = 59;
                            }
                            jLabel102.setText(Integer.toString(y));

                        }

                        jLabel103.setText(Integer.toString(x));
                        Thread.sleep(1000);
                    }

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        };
        th5.start();
    }
    public void choice() {
        Thread choose = new Thread() {
            public void run() {
                try {
                    while (true) {

                        if (flag == 1) {
                            choice1.setVisible(true);
                        } else if (flag == 2) {
                            choice4.setVisible(true);
                        } else if (flag == 3) {
                            choice5.setVisible(true);
                        } else if (flag == 4) {
                            choice6.setVisible(true);
                        } else if (flag == 5) {
                            choice7.setVisible(true);
                        } else if (flag == 6) {
                            choice8.setVisible(true);
                        } else {
                            choice1.setVisible(false);
                            choice4.setVisible(false);
                            choice5.setVisible(false);
                            choice6.setVisible(false);
                            choice7.setVisible(false);
                            choice8.setVisible(false);
                        }

                        Thread.sleep(1);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        };
        choose.start();

    }
    public void slideshow() {
        File selectedImageFIle = new File("D:\\Java swing\\icons_mysqlConnector\\icons\\1st.PNG");
        String SelectedImagePath = selectedImageFIle.getAbsolutePath();
        ImageIcon ic = new ImageIcon(SelectedImagePath);
        Image image = ic.getImage().getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), Image.SCALE_SMOOTH);
        jLabel7.setIcon(new ImageIcon(image));

        selectedImageFIle = new File("D:\\Java swing\\icons_mysqlConnector\\icons\\2nd.PNG");
        SelectedImagePath = selectedImageFIle.getAbsolutePath();
        ic = new ImageIcon(SelectedImagePath);
        image = ic.getImage().getScaledInstance(jLabel12.getWidth(), jLabel12.getHeight(), Image.SCALE_SMOOTH);
        jLabel12.setIcon(new ImageIcon(image));

        selectedImageFIle = new File("D:\\Java swing\\icons_mysqlConnector\\icons\\3rd.PNG");
        SelectedImagePath = selectedImageFIle.getAbsolutePath();
        ic = new ImageIcon(SelectedImagePath);
        image = ic.getImage().getScaledInstance(jLabel81.getWidth(), jLabel81.getHeight(), Image.SCALE_SMOOTH);
        jLabel81.setIcon(new ImageIcon(image));
        Thread slide = new Thread() {
            public void run() {
                try {
                    while (true) {

                        slideshow_mother_panel.removeAll();
                        slideshow_mother_panel.repaint();
                        slideshow_mother_panel.revalidate();

                        slideshow_mother_panel.add(slide1);
                        slideshow_mother_panel.repaint();
                        slideshow_mother_panel.revalidate();

                        Thread.sleep(3000);

                        slideshow_mother_panel.removeAll();
                        slideshow_mother_panel.repaint();
                        slideshow_mother_panel.revalidate();

                        slideshow_mother_panel.add(slide2);
                        slideshow_mother_panel.repaint();
                        slideshow_mother_panel.revalidate();

                        Thread.sleep(3000);

                        slideshow_mother_panel.removeAll();
                        slideshow_mother_panel.repaint();
                        slideshow_mother_panel.revalidate();

                        slideshow_mother_panel.add(slide3);
                        slideshow_mother_panel.repaint();
                        slideshow_mother_panel.revalidate();

                        Thread.sleep(3000);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        };
        slide.start();
    }

//    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        searchh = new admin.AutocompleteComboBox();
        choice1 = new javax.swing.JPanel();
        x = new javax.swing.JLabel();
        muslim_wear = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        choice4 = new javax.swing.JPanel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        choice5 = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        choice6 = new javax.swing.JPanel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        choice7 = new javax.swing.JPanel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        choice8 = new javax.swing.JPanel();
        jLabel96 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        tel = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jeans = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        headphone = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        honeynut = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        smartwatches = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        trimmers = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        salwar = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        knife = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        Belts = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        curvesPanel1 = new SplashScreen.CurvesPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        slideshow_mother_panel = new javax.swing.JPanel();
        slide1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        slide2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        slide3 = new javax.swing.JPanel();
        jLabel81 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        anitlostkey = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        bd = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        electronics = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        intermiami = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        jLabel87 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jLabel102 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        jLabel101 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        jLabel88 = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        jLabel103 = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jPanel42 = new javax.swing.JPanel();
        jPanel43 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jPanel44 = new javax.swing.JPanel();
        jTextField7 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jTextField13 = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jTextField14 = new javax.swing.JTextField();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea7 = new javax.swing.JTextArea();
        jTextField15 = new javax.swing.JTextField();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextArea8 = new javax.swing.JTextArea();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTextArea9 = new javax.swing.JTextArea();
        jTextField18 = new javax.swing.JTextField();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTextArea10 = new javax.swing.JTextArea();
        jTextField19 = new javax.swing.JTextField();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTextArea11 = new javax.swing.JTextArea();
        jTextField20 = new javax.swing.JTextField();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTextArea12 = new javax.swing.JTextArea();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jScrollPane16 = new javax.swing.JScrollPane();
        jTextArea13 = new javax.swing.JTextArea();
        jTextField23 = new javax.swing.JTextField();
        jScrollPane17 = new javax.swing.JScrollPane();
        jTextArea14 = new javax.swing.JTextArea();
        jPanel47 = new javax.swing.JPanel();
        jTextField28 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jPanel37 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel39 = new javax.swing.JPanel();
        eleven = new javax.swing.JTextField();
        ten = new javax.swing.JTextField();
        nine = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        eight = new javax.swing.JTextArea();
        seven = new javax.swing.JTextField();
        six = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        five = new javax.swing.JTextArea();
        jPanel40 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        three = new javax.swing.JTextArea();
        jPanel41 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        four = new javax.swing.JTextArea();
        scrollBarCustom1 = new customize.ScrollBarCustom();
        one = new javax.swing.JTextField();
        two = new javax.swing.JTextField();
        donation2 = new admin.Donation();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(245, 245, 245));
        setForeground(new java.awt.Color(245, 245, 245));

        jTabbedPane1.setBackground(new java.awt.Color(255, 102, 0));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTabbedPane1.setOpaque(true);
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1048, 1000));

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setPreferredSize(new java.awt.Dimension(1040, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setPreferredSize(new java.awt.Dimension(1022, 1000));

        jPanel7.setBackground(new java.awt.Color(239, 239, 239));
        jPanel7.setPreferredSize(new java.awt.Dimension(1020, 1700));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(255, 51, 0));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/GOKARTGO1.gif.gif"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel8.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 2, 300, 60));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Find");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, -1, 20));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 51, 51));
        jButton2.setText("LogOut");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel8.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Shopping Cart.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel8.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, -1, 50));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 51, 51));
        jButton3.setText("Profile");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanel8.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, -1, -1));
        jPanel8.add(searchh, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 280, -1));

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 59));

        choice1.setBackground(new java.awt.Color(255, 250, 250));
        choice1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        choice1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                choice1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                choice1MouseExited(evt);
            }
        });

        x.setText("Traditional Wear");
        x.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        x.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                xMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                xMouseExited(evt);
            }
        });

        muslim_wear.setText("Muslim Wear");
        muslim_wear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        muslim_wear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                muslim_wearMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                muslim_wearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                muslim_wearMouseExited(evt);
            }
        });

        jLabel15.setText("shoes");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel15MouseExited(evt);
            }
        });

        jLabel58.setText("Bags");
        jLabel58.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel58.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel58MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel58MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel58MouseExited(evt);
            }
        });

        javax.swing.GroupLayout choice1Layout = new javax.swing.GroupLayout(choice1);
        choice1.setLayout(choice1Layout);
        choice1Layout.setHorizontalGroup(
            choice1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(choice1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(choice1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(x, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(muslim_wear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        choice1Layout.setVerticalGroup(
            choice1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(choice1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(x, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(muslim_wear, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.add(choice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 120, 240));

        choice4.setBackground(new java.awt.Color(255, 250, 250));
        choice4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        choice4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        choice4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                choice4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                choice4MouseExited(evt);
            }
        });

        jLabel69.setText("Kid's Bag");
        jLabel69.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel69MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel69MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel69MouseExited(evt);
            }
        });

        jLabel70.setText("Man's Bag");
        jLabel70.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel70MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel70MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel70MouseExited(evt);
            }
        });

        jLabel72.setText("Men's Watches");
        jLabel72.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel72MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel72MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel72MouseExited(evt);
            }
        });

        jLabel73.setText("Women's Watches");
        jLabel73.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel73MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel73MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel73MouseExited(evt);
            }
        });

        javax.swing.GroupLayout choice4Layout = new javax.swing.GroupLayout(choice4);
        choice4.setLayout(choice4Layout);
        choice4Layout.setHorizontalGroup(
            choice4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(choice4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(choice4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel69, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel72, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel73, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel70, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        choice4Layout.setVerticalGroup(
            choice4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(choice4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.add(choice4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 120, 240));

        choice5.setBackground(new java.awt.Color(255, 250, 250));
        choice5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        choice5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        choice5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                choice5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                choice5MouseExited(evt);
            }
        });

        jLabel74.setText("Skin Care");

        jLabel75.setText("Hair Care");

        jLabel76.setText("Make Up");

        jLabel78.setText("Fragnances");

        javax.swing.GroupLayout choice5Layout = new javax.swing.GroupLayout(choice5);
        choice5.setLayout(choice5Layout);
        choice5Layout.setHorizontalGroup(
            choice5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(choice5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(choice5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel74, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel76, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel78, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel75, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        choice5Layout.setVerticalGroup(
            choice5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(choice5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.add(choice5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 120, 240));

        choice6.setBackground(new java.awt.Color(255, 250, 250));
        choice6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        choice6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        choice6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                choice6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                choice6MouseExited(evt);
            }
        });

        jLabel82.setText("Clothing");
        jLabel82.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel82MouseClicked(evt);
            }
        });

        jLabel83.setText("Shoes");

        jLabel84.setText("Acccescories");

        jLabel86.setText("Watches");
        jLabel86.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel86MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel86MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel86MouseExited(evt);
            }
        });

        javax.swing.GroupLayout choice6Layout = new javax.swing.GroupLayout(choice6);
        choice6.setLayout(choice6Layout);
        choice6Layout.setHorizontalGroup(
            choice6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(choice6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(choice6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel82, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel84, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel86, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel83, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        choice6Layout.setVerticalGroup(
            choice6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(choice6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.add(choice6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 120, 240));

        choice7.setBackground(new java.awt.Color(255, 250, 250));
        choice7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        choice7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        choice7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                choice7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                choice7MouseExited(evt);
            }
        });

        jLabel89.setText("Smartphoes");

        jLabel90.setText("Featured Phones");

        jLabel91.setText("Tablet");

        jLabel92.setText("Screen Protectors");

        javax.swing.GroupLayout choice7Layout = new javax.swing.GroupLayout(choice7);
        choice7.setLayout(choice7Layout);
        choice7Layout.setHorizontalGroup(
            choice7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(choice7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(choice7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel89, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel91, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel92, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel90, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        choice7Layout.setVerticalGroup(
            choice7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(choice7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.add(choice7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 120, 240));

        choice8.setBackground(new java.awt.Color(255, 250, 250));
        choice8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        choice8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        choice8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                choice8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                choice8MouseExited(evt);
            }
        });

        jLabel96.setText("Fruits");

        jLabel98.setText("Cooking Ingridients");

        jLabel99.setText("Drinks");

        javax.swing.GroupLayout choice8Layout = new javax.swing.GroupLayout(choice8);
        choice8.setLayout(choice8Layout);
        choice8Layout.setHorizontalGroup(
            choice8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(choice8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(choice8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel96, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel98, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel99, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        choice8Layout.setVerticalGroup(
            choice8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(choice8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jPanel7.add(choice8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 120, 240));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setBackground(new java.awt.Color(245, 245, 245));
        jLabel3.setForeground(new java.awt.Color(248, 86, 6));
        jLabel3.setText("Women & Girls Fashion");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(245, 245, 245));
        jLabel4.setForeground(new java.awt.Color(248, 86, 6));
        jLabel4.setText("Health and Beauty");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(245, 245, 245));
        jLabel5.setForeground(new java.awt.Color(248, 86, 6));
        jLabel5.setText("Watches,Bags & Jwellery");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(245, 245, 245));
        jLabel6.setForeground(new java.awt.Color(248, 86, 6));
        jLabel6.setText("Mens & Boys Fashion");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(245, 245, 245));
        jLabel8.setForeground(new java.awt.Color(248, 86, 6));
        jLabel8.setText("Electronic Devices");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(245, 245, 245));
        jLabel9.setForeground(new java.awt.Color(248, 86, 6));
        jLabel9.setText("Groceries");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel7.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 75, 160, 240));

        jPanel6.setBackground(new java.awt.Color(255, 250, 250));
        jPanel6.setPreferredSize(new java.awt.Dimension(1020, 132));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Parachutt Hair Oil");
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("N350 wireless headphone");
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Men's Jeans");
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel54.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("Honeynut");
        jLabel54.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(tel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tel, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jeans.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jeans.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jeansMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jeans, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jeans, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        headphone.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        headphone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                headphoneMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headphone, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headphone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        honeynut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        honeynut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                honeynutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(honeynut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(honeynut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel17))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(91, 91, 91)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel54, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                .addGap(50, 50, 50))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel18)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel17)
                        .addComponent(jLabel54)))
                .addGap(3, 3, 3))
        );

        jPanel7.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 1000, -1));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setText("Trimmers");
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel12.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setText("Smart Watches");
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel12.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, -1, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setText("Cooking Knife");
        jLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel12.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 140, -1, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setText("Belts");
        jLabel23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel12.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 140, -1, -1));

        jLabel24.setText("Formal Shirts");
        jLabel24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel12.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 314, -1, -1));

        jLabel25.setText("Cloths and towels");
        jLabel25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel12.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 314, -1, -1));

        jLabel26.setText("Blutooth Headset");
        jLabel26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel12.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 314, -1, -1));

        jLabel27.setText("Door Hardware");
        jLabel27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel12.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 314, -1, -1));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(smartwatches, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(smartwatches, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
        );

        jPanel12.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, -1, -1));

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(trimmers, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(trimmers, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
        );

        jPanel12.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(salwar, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(salwar, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
        );

        jPanel12.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, -1, -1));

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(knife, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(knife, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
        );

        jPanel12.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, -1, -1));

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Belts, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Belts, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
        );

        jPanel12.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, -1, -1));

        jLabel59.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel59.setText("Salwar Kamees");
        jLabel59.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel12.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, -1, -1));

        jPanel7.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 707, 1000, 180));

        curvesPanel1.setPreferredSize(new java.awt.Dimension(975, 650));

        jPanel13.setBackground(new java.awt.Color(245, 245, 245));
        jPanel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel28.setText("Help Center");
        jLabel28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel29.setText("How to Buy");
        jLabel29.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel30.setText("Contact Us");
        jLabel30.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 102, 0));
        jLabel31.setText("Customer Care");

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel32.setText("Terms and Conditions");
        jLabel32.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30)
                            .addComponent(jLabel29)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32)))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel31)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31)
                .addGap(18, 18, 18)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel29)
                .addGap(18, 18, 18)
                .addComponent(jLabel30)
                .addGap(18, 18, 18)
                .addComponent(jLabel32)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jPanel14.setBackground(new java.awt.Color(245, 245, 245));
        jPanel14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 102, 0));
        jLabel33.setText("Earn with GoKartGo");

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel34.setText("Sell on GoKartGo");
        jLabel34.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel35.setText("Code of Conduct");
        jLabel35.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel33)
                .addGap(31, 31, 31)
                .addComponent(jLabel34)
                .addGap(18, 18, 18)
                .addComponent(jLabel35)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel15.setBackground(new java.awt.Color(245, 245, 245));
        jPanel15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 102, 0));
        jLabel36.setText("GoKartGo");

        jLabel37.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel37.setText("About Us");
        jLabel37.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel38.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel38.setText("GoKartGo exclusives");
        jLabel38.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel39.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel39.setText("Privacy Policy");
        jLabel39.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel40.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel40.setText("GoKartGo Donates");
        jLabel40.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36)
                    .addComponent(jLabel37)
                    .addComponent(jLabel38)
                    .addComponent(jLabel39)
                    .addComponent(jLabel40))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel36)
                .addGap(30, 30, 30)
                .addComponent(jLabel37)
                .addGap(37, 37, 37)
                .addComponent(jLabel38)
                .addGap(37, 37, 37)
                .addComponent(jLabel39)
                .addGap(31, 31, 31)
                .addComponent(jLabel40)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jPanel17.setBackground(new java.awt.Color(245, 245, 245));
        jPanel17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel45.setForeground(new java.awt.Color(255, 102, 0));
        jLabel45.setText("Verified By");

        jLabel46.setText("PCI DSS");

        jLabel47.setForeground(new java.awt.Color(255, 102, 0));
        jLabel47.setText("Registration ID");

        jLabel48.setText("2004000");

        jPanel16.setBackground(new java.awt.Color(245, 245, 245));
        jPanel16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel42.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 102, 0));
        jLabel42.setText("International");

        jLabel41.setText("Bangladesh");
        jLabel41.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel43.setText("Pakistan");
        jLabel43.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel44.setText("India");
        jLabel44.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel42))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel41)
                            .addComponent(jLabel43)
                            .addComponent(jLabel44))))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel42)
                .addGap(18, 18, 18)
                .addComponent(jLabel41)
                .addGap(18, 18, 18)
                .addComponent(jLabel43)
                .addGap(18, 18, 18)
                .addComponent(jLabel44)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel48)
                    .addComponent(jLabel47)
                    .addComponent(jLabel46)
                    .addComponent(jLabel45))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel47)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel48)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel18.setBackground(new java.awt.Color(245, 245, 245));
        jPanel18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel49.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 102, 0));
        jLabel49.setText("Follow us");

        jLabel50.setText("Facebook");
        jLabel50.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel51.setText("Twitter");
        jLabel51.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel52.setText("Instagram");
        jLabel52.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel50)
                        .addGap(52, 52, 52)
                        .addComponent(jLabel51)
                        .addGap(56, 56, 56)
                        .addComponent(jLabel52))
                    .addComponent(jLabel49))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel49)
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(jLabel51)
                    .addComponent(jLabel52))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout curvesPanel1Layout = new javax.swing.GroupLayout(curvesPanel1);
        curvesPanel1.setLayout(curvesPanel1Layout);
        curvesPanel1Layout.setHorizontalGroup(
            curvesPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(curvesPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(curvesPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(curvesPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(curvesPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        curvesPanel1Layout.setVerticalGroup(
            curvesPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(curvesPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(curvesPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(curvesPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(curvesPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(226, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 990, Short.MAX_VALUE)
            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(curvesPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 978, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 980, Short.MAX_VALUE)
            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel19Layout.createSequentialGroup()
                    .addComponent(curvesPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel7.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 907, 990, 980));

        slideshow_mother_panel.setLayout(new java.awt.CardLayout());

        jLabel7.setPreferredSize(new java.awt.Dimension(1168, 240));

        javax.swing.GroupLayout slide1Layout = new javax.swing.GroupLayout(slide1);
        slide1.setLayout(slide1Layout);
        slide1Layout.setHorizontalGroup(
            slide1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(slide1Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        slide1Layout.setVerticalGroup(
            slide1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );

        slideshow_mother_panel.add(slide1, "card3");

        slide2.setBackground(new java.awt.Color(153, 255, 255));

        javax.swing.GroupLayout slide2Layout = new javax.swing.GroupLayout(slide2);
        slide2.setLayout(slide2Layout);
        slide2Layout.setHorizontalGroup(
            slide2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );
        slide2Layout.setVerticalGroup(
            slide2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );

        slideshow_mother_panel.add(slide2, "card2");

        jLabel81.setPreferredSize(new java.awt.Dimension(1168, 240));

        javax.swing.GroupLayout slide3Layout = new javax.swing.GroupLayout(slide3);
        slide3.setLayout(slide3Layout);
        slide3Layout.setHorizontalGroup(
            slide3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(slide3Layout.createSequentialGroup()
                .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        slide3Layout.setVerticalGroup(
            slide3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel81, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );

        slideshow_mother_panel.add(slide3, "card3");

        jPanel7.add(slideshow_mother_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 720, 200));

        jPanel22.setBackground(new java.awt.Color(255, 250, 250));
        jPanel22.setPreferredSize(new java.awt.Dimension(1020, 132));

        jLabel53.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText("Anitlost key");
        jLabel53.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel55.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setText("BD World Cup Jersey");
        jLabel55.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel56.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setText("Electronics");
        jLabel56.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel57.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setText("Inter Miami Jersy");
        jLabel57.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jPanel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        anitlostkey.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        anitlostkey.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                anitlostkeyMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addComponent(anitlostkey, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(anitlostkey, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
        );

        jPanel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        bd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bdMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        electronics.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        electronics.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                electronicsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(electronics, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(electronics, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        intermiami.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        intermiami.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                intermiamiMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(intermiami, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(intermiami, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(98, 98, 98)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
                .addGap(86, 86, 86)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel56, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                .addGap(46, 46, 46))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel56)
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel55)
                        .addComponent(jLabel57)))
                .addGap(3, 3, 3))
        );

        jPanel7.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 1000, -1));

        jPanel31.setBackground(new java.awt.Color(255, 250, 250));

        jLabel87.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel87.setText("Ending In");

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel87, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel87, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 90, 30));

        jPanel32.setBackground(new java.awt.Color(255, 102, 51));

        jLabel102.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(255, 255, 255));
        jLabel102.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel102.setText("54");

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel102, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 30, 30));

        jPanel33.setBackground(new java.awt.Color(255, 250, 250));

        jLabel101.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel101.setText("Flash Sale");

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel101, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 90, 30));

        jPanel34.setBackground(new java.awt.Color(255, 102, 51));

        jLabel88.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(255, 255, 255));
        jLabel88.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel88.setText("09");

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel88, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 30, 30));

        jPanel35.setBackground(new java.awt.Color(255, 102, 51));

        jLabel103.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(255, 255, 255));
        jLabel103.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel103.setText("56");

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel103, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel103, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 30, 30));

        jPanel36.setBackground(new java.awt.Color(255, 250, 250));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setText("Categories");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, 130, 40));

        jScrollPane1.setViewportView(jPanel7);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 790));

        jTabbedPane1.addTab("Home", jPanel1);

        jPanel2.setBackground(new java.awt.Color(245, 245, 245));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 754));

        jPanel42.setBackground(new java.awt.Color(255, 255, 255));
        jPanel42.setPreferredSize(new java.awt.Dimension(1022, 2000));

        jPanel43.setBackground(new java.awt.Color(255, 255, 255));
        jPanel43.setPreferredSize(new java.awt.Dimension(1026, 75));
        jPanel43.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 102, 0));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/GOKARTGO.gif.gif"))); // NOI18N
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jPanel43.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 5, -1, 50));

        jButton5.setBackground(new java.awt.Color(255, 102, 0));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Home");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jPanel43.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(894, 5, -1, -1));

        jPanel44.setBackground(new java.awt.Color(255, 102, 0));

        jTextField7.setBackground(new java.awt.Color(255, 102, 0));
        jTextField7.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(255, 255, 255));
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setText("Bangladesh's #1 ");
        jTextField7.setBorder(null);
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jTextField9.setBackground(new java.awt.Color(255, 102, 0));
        jTextField9.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(255, 255, 255));
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField9.setText("Marketplace");
        jTextField9.setBorder(null);
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jTextField10.setEditable(false);
        jTextField10.setBackground(new java.awt.Color(255, 102, 0));
        jTextField10.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(255, 255, 255));
        jTextField10.setText(" reach millions of customers today!");
        jTextField10.setBorder(null);
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        jLabel60.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setText("Create a GoKartGo seller account in 5 minutes and");

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel60, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        jTextField11.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jTextField11.setText("Why Sell On GoKartGo?");
        jTextField11.setBorder(null);

        jTextField12.setEditable(false);
        jTextField12.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jTextField12.setText("Reach");
        jTextField12.setBorder(null);

        jTextArea5.setEditable(false);
        jTextArea5.setColumns(20);
        jTextArea5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextArea5.setRows(5);
        jTextArea5.setText("Millions of customers on Daraz, \nBangladesh's most visited \nshopping destination");
        jTextArea5.setBorder(null);
        jScrollPane7.setViewportView(jTextArea5);

        jTextField13.setEditable(false);
        jTextField13.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField13.setText("Timely Payments");
        jTextField13.setBorder(null);
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });

        jTextArea6.setEditable(false);
        jTextArea6.setColumns(20);
        jTextArea6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextArea6.setRows(5);
        jTextArea6.setText("Funds are safely deposited \ndirectly to your bank account \non a weekly basis");
        jTextArea6.setBorder(null);
        jScrollPane8.setViewportView(jTextArea6);

        jTextField14.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jTextField14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField14.setText("Marketing Tools");
        jTextField14.setBorder(null);
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });

        jTextArea7.setEditable(false);
        jTextArea7.setColumns(20);
        jTextArea7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextArea7.setRows(5);
        jTextArea7.setText("Find new customers & grow \nmore with advertising and our whole \nrange of marketing tools");
        jTextArea7.setBorder(null);
        jScrollPane9.setViewportView(jTextArea7);

        jTextField15.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jTextField15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField15.setText("Support&Training");
        jTextField15.setBorder(null);

        jTextArea8.setEditable(false);
        jTextArea8.setColumns(20);
        jTextArea8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextArea8.setRows(5);
        jTextArea8.setText("Learn all about ecommerce \nfor free and get help with seller \nsupport and Daraz University");
        jTextArea8.setBorder(null);
        jScrollPane10.setViewportView(jTextArea8);

        jTextField16.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jTextField16.setText("Five Simple Steps To Start Selling");
        jTextField16.setBorder(null);

        jTextField17.setEditable(false);
        jTextField17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField17.setText("Sign Up For Free");
        jTextField17.setBorder(null);

        jTextArea9.setEditable(false);
        jTextArea9.setColumns(20);
        jTextArea9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextArea9.setRows(5);
        jTextArea9.setText("Create your account through \nour website or mobile app \nwith just your phone number");
        jTextArea9.setBorder(null);
        jScrollPane12.setViewportView(jTextArea9);

        jTextField18.setEditable(false);
        jTextField18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField18.setText("ADD Profile Information");
        jTextField18.setBorder(null);

        jTextArea10.setEditable(false);
        jTextArea10.setColumns(20);
        jTextArea10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextArea10.setRows(5);
        jTextArea10.setText("Create your account through \nour website or mobile app \nwith just your phone number");
        jTextArea10.setBorder(null);
        jScrollPane13.setViewportView(jTextArea10);

        jTextField19.setEditable(false);
        jTextField19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField19.setText("ADD Address Information");
        jTextField19.setBorder(null);
        jTextField19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField19ActionPerformed(evt);
            }
        });

        jTextArea11.setEditable(false);
        jTextArea11.setColumns(20);
        jTextArea11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextArea11.setRows(5);
        jTextArea11.setTabSize(5);
        jTextArea11.setText("Provide all address \ndetails of your business");
        jTextArea11.setBorder(null);
        jScrollPane14.setViewportView(jTextArea11);

        jTextField20.setEditable(false);
        jTextField20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField20.setText("ADD ID and Bank Information");
        jTextField20.setBorder(null);

        jTextArea12.setEditable(false);
        jTextArea12.setColumns(20);
        jTextArea12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextArea12.setRows(5);
        jTextArea12.setTabSize(5);
        jTextArea12.setText("Add in your ID & Business related \ndetails. Include necessary bank \ninformation for payments");
        jTextArea12.setBorder(null);
        jScrollPane15.setViewportView(jTextArea12);

        jTextField21.setEditable(false);
        jTextField21.setBackground(new java.awt.Color(255, 102, 0));
        jTextField21.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jTextField21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField21.setText("FREQUENTLY ASKED QUESTION");
        jTextField21.setBorder(null);
        jTextField21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField21ActionPerformed(evt);
            }
        });

        jTextField22.setEditable(false);
        jTextField22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField22.setText("What Catagories I Sell On GoKartGo?");
        jTextField22.setBorder(null);

        jTextArea13.setEditable(false);
        jTextArea13.setColumns(20);
        jTextArea13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextArea13.setRows(5);
        jTextArea13.setText("GoKartGo has over 30 main categories of goods that you can sell your products in, including fashion, electronics, FMCG, lifestyle, health & beauty\n to name a few. However, we do have items that are counterfeit, dangerous and prohibited by law or cultural norms which sellers must\n refrain from listing.");
        jTextArea13.setBorder(null);
        jScrollPane16.setViewportView(jTextArea13);

        jTextField23.setEditable(false);
        jTextField23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField23.setText("What Is GoKartGo Commission?");
        jTextField23.setBorder(null);
        jTextField23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField23ActionPerformed(evt);
            }
        });

        jTextArea14.setEditable(false);
        jTextArea14.setColumns(20);
        jTextArea14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextArea14.setRows(5);
        jTextArea14.setText("Opening a shop on GoKartGo is completely free. However, GoKartGo does deduct a small percentage of commission from the payment of your orders. \nEach product commission depends on the type of category it falls under.");
        jTextArea14.setBorder(null);
        jScrollPane17.setViewportView(jTextArea14);

        jPanel47.setBackground(new java.awt.Color(255, 102, 0));

        jTextField28.setEditable(false);
        jTextField28.setBackground(new java.awt.Color(255, 102, 0));
        jTextField28.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jTextField28.setForeground(new java.awt.Color(255, 255, 255));
        jTextField28.setText("Start selling with GoKartGo today.");
        jTextField28.setBorder(null);

        jTextField29.setEditable(false);
        jTextField29.setBackground(new java.awt.Color(255, 102, 0));
        jTextField29.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jTextField29.setForeground(new java.awt.Color(255, 255, 255));
        jTextField29.setText("What are you waiting for?");
        jTextField29.setBorder(null);
        jTextField29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField25ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 102, 0));
        jButton9.setText("Get Started");
        jButton9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel47Layout.createSequentialGroup()
                        .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel47Layout.createSequentialGroup()
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))))
        );

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, 1037, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(305, 305, 305)
                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(208, 208, 208)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(208, 208, 208)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(250, 250, 250)
                        .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(250, 250, 250)
                        .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 1030, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 867, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel42Layout.createSequentialGroup()
                                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel42Layout.createSequentialGroup()
                                .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(250, 250, 250)
                                .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jPanel44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        jScrollPane11.setViewportView(jPanel42);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 1058, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Become a seller", jPanel2);

        jPanel3.setBackground(new java.awt.Color(245, 245, 245));
        jPanel3.setPreferredSize(new java.awt.Dimension(1020, 790));

        jScrollPane5.setPreferredSize(new java.awt.Dimension(1300, 700));

        jPanel37.setBackground(new java.awt.Color(255, 250, 250));
        jPanel37.setPreferredSize(new java.awt.Dimension(1035, 2200));

        jPanel38.setBackground(new java.awt.Color(255, 250, 250));
        jPanel38.setPreferredSize(new java.awt.Dimension(1020, 75));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 102, 0));
        jLabel11.setText("GoKartGo");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 102, 0));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Home");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(41, 41, 41))
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel39.setBackground(new java.awt.Color(255, 102, 0));
        jPanel39.setPreferredSize(new java.awt.Dimension(1020, 325));

        eleven.setEditable(false);
        eleven.setBackground(new java.awt.Color(255, 102, 0));
        eleven.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        eleven.setForeground(new java.awt.Color(255, 255, 255));
        eleven.setText("GoKartGo Donates");
        eleven.setBorder(null);

        ten.setBackground(new java.awt.Color(255, 102, 0));
        ten.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        ten.setForeground(new java.awt.Color(255, 255, 255));
        ten.setText("MAKING A DIFFERENCE IS ");
        ten.setBorder(null);

        nine.setBackground(new java.awt.Color(255, 102, 0));
        nine.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        nine.setForeground(new java.awt.Color(255, 255, 255));
        nine.setText("JUST A CLICK AWAY");
        nine.setBorder(null);

        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        eight.setBackground(new java.awt.Color(255, 102, 0));
        eight.setColumns(20);
        eight.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        eight.setForeground(new java.awt.Color(255, 255, 255));
        eight.setRows(5);
        eight.setText("Doante to your favourite \ncharity with no survice fee");
        eight.setBorder(null);
        eight.setSelectionColor(new java.awt.Color(255, 102, 0));
        jScrollPane2.setViewportView(eight);

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ten)
                    .addComponent(eleven)
                    .addComponent(nine)
                    .addComponent(jScrollPane2))
                .addContainerGap(503, Short.MAX_VALUE))
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(eleven, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ten, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        seven.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        seven.setForeground(new java.awt.Color(0, 102, 102));
        seven.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        seven.setText("Donate To  A Cause  That Means The Most To You");
        seven.setBorder(null);

        six.setEditable(false);
        six.setBackground(new java.awt.Color(255, 255, 255));
        six.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        six.setForeground(new java.awt.Color(0, 102, 102));
        six.setText("Let's Uplift The Community Together");
        six.setBorder(null);

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setBorder(null);
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane3.setHorizontalScrollBar(null);

        five.setColumns(20);
        five.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        five.setRows(5);
        five.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras justo mauris, lobortis ut lobortis sed, \nvestibulum vitae odio. Nam interdum, lorem eget gravida faucibus, lectus turpis viverra sem, vel gravida \nmetus lorem eu justo. Etiam a nunc nec augue rhoncus blandit consequat vitae est. In iaculis nunc in\n dignissim rhoncus. Nullam tempus, quam non fringilla porttitor, ex purus congue enim, sed sagittis arcu \nerat in diam. Morbi in ipsum sodales, varius odio a, ornare nisl. Fusce ullamcorper venenatis\n malesuada. Cras ut magna pellentesque, congue ligula ac, mattis lorem. Pellentesque ornare felis \nac ipsum tincidunt, non lobortis lorem pellentesque.Quisque fermentum at felis non tempor. In nec \nlectus placerat, pellentesque eros cursus, placerat neque. Pellentesque habitant morbi tristique\n senectus et netus et malesuada fames ac turpis egestas. Pellentesque rutrum nunc in gravida semper.\n Ut finibus sollicitudin dui eget cursus. Nulla et leo in lorem rutrum convallis at eu lectus. Aliquam mi \ndolor, gravida sed nisi id, posuere venenatis enim. Quisque posuere consequat urna, blandit auctor\n tellus suscipit eget. Curabitur imperdiet nisi \nultrices, aliquam erat sit amet, lobortis tortor. Maecenas aliquet, massa eu molestie consequat, urna leo aliquam lectus, ac gravida mi augue et magna. Proin sed nisl nulla.\n Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.");
        jScrollPane3.setViewportView(five);

        jPanel40.setBackground(new java.awt.Color(102, 0, 102));

        jScrollPane4.setBorder(null);
        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        three.setColumns(20);
        three.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        three.setRows(5);
        three.setText("Lorem ipsum dolor sit amet, consectetur \nadipiscing elit. Cras justo mauris, lobortis ut\n lobortis sed, vestibulum vitae odio. Nam \ninterdum,lorem eget gravida faucibus, lectus \nturpis viverra sem, vel gravida metus lorem eu \njusto. Etiam a nunc nec augue rhoncus blandit \nconsequatvitae est. In iaculis nunc in dignissim \nrhoncus.\n\n\nKadija Mariam\nDonates From  Chittagong\n");
        three.setBorder(null);
        jScrollPane4.setViewportView(three);

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel40Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel41.setBackground(new java.awt.Color(255, 51, 0));

        jScrollPane6.setBorder(null);
        jScrollPane6.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane6.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        four.setColumns(20);
        four.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        four.setRows(5);
        four.setText("Lorem ipsum dolor sit amet, consectetur \nadipiscing elit. Cras justo mauris, lobortis ut\n lobortis sed, vestibulum vitae odio. Nam \ninterdum,lorem eget gravida faucibus, lectus \nturpis viverra sem, vel gravida metus lorem eu \njusto. Etiam a nunc nec augue rhoncus blandit \nconsequatvitae est. In iaculis nunc in dignissim \nrhoncus.\n\n\nSabbir Ahmed\nDonates From  Sylhet\n");
        four.setBorder(null);
        jScrollPane6.setViewportView(four);

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel41Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        one.setEditable(false);
        one.setBackground(new java.awt.Color(255, 102, 0));
        one.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        one.setForeground(new java.awt.Color(255, 255, 255));
        one.setText("If you work for the social prosperity.");

        two.setEditable(false);
        two.setBackground(new java.awt.Color(255, 102, 0));
        two.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        two.setForeground(new java.awt.Color(255, 255, 255));
        two.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        two.setText("JOIN US?");
        two.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twoMouseClicked(evt);
            }
        });
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(six)
                                .addComponent(jScrollPane3))
                            .addGroup(jPanel37Layout.createSequentialGroup()
                                .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel37Layout.createSequentialGroup()
                                .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel37Layout.createSequentialGroup()
                                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(seven, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel39, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1015, Short.MAX_VALUE)
                                    .addComponent(jPanel38, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1015, Short.MAX_VALUE)
                                    .addComponent(donation2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(238, 238, 238)
                                .addComponent(scrollBarCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollBarCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(donation2, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(one))
                .addGap(0, 73, Short.MAX_VALUE))
        );

        jScrollPane5.setViewportView(jPanel37);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 1058, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("GoKartGo Donations", jPanel3);

        jPanel4.setBackground(new java.awt.Color(245, 245, 245));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1058, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Help & Support", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 821, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        


        
        String sss=(String) searchh.getSelectedItem();
        if(searchh.getSelectedIndex() == -1) sss="";
        String sql;
          Connection con = myconnection.getConnection();
                    PreparedStatement ps;
        try {
           
             sql = "insert into selected_from_search (selected_search) values(?)";
             ps = con.prepareStatement(sql);
        
            ps.setString(1, sss);
           
            ps.executeUpdate() ;
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        new Allcategories(gmail).setVisible(true);
        dispose();











    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        // TODO add your handling code here:
        //choice(1);
        flag = 1;
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        //choice(0);
        flag = 0;
    }//GEN-LAST:event_jLabel3MouseExited

    private void choice1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_choice1MouseEntered
        // TODO add your handling code here:
        flag = 1;

    }//GEN-LAST:event_choice1MouseEntered

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        // TODO add your handling code here:
        flag = 3;
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        // TODdd your handling code here:
        flag = 0;
    }//GEN-LAST:event_jLabel4MouseExited

    private void choice4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_choice4MouseEntered
        // TODO add your handling code here:
        flag = 2;
    }//GEN-LAST:event_choice4MouseEntered

    private void choice5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_choice5MouseEntered
        // TODO add your handling code here:
        flag = 3;
    }//GEN-LAST:event_choice5MouseEntered

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        // TODO add your handling code here:
        flag = 2;
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        // TODO add your handling code here:
        flag = 0;
    }//GEN-LAST:event_jLabel5MouseExited

    private void choice1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_choice1MouseExited
        // TODO add your handling code here:
        flag = 0;
    }//GEN-LAST:event_choice1MouseExited

    private void choice4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_choice4MouseExited
        // TODO add your handling code here:
        flag = 0;
    }//GEN-LAST:event_choice4MouseExited

    private void choice5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_choice5MouseExited
        // TODO add your handling code here:
        flag = 0;
    }//GEN-LAST:event_choice5MouseExited

    private void choice6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_choice6MouseEntered
        // TODO add your handling code here:
        flag = 4;
    }//GEN-LAST:event_choice6MouseEntered

    private void choice6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_choice6MouseExited
        // TODO add your handling code here:
        flag = 0;
    }//GEN-LAST:event_choice6MouseExited

    private void choice7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_choice7MouseEntered
        // TODO add your handling code here:
        flag = 5;
    }//GEN-LAST:event_choice7MouseEntered

    private void choice7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_choice7MouseExited
        // TODO add your handling code here:
        flag = 0;
    }//GEN-LAST:event_choice7MouseExited

    private void choice8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_choice8MouseEntered
        // TODO add your handling code here:
        flag = 6;
    }//GEN-LAST:event_choice8MouseEntered

    private void choice8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_choice8MouseExited
        // TODO add your handling code here:
        flag = 0;
    }//GEN-LAST:event_choice8MouseExited

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        // TODO add your handling code here:
        flag = 4;
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        // TODO add your handling code here:
        flag = 5;
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
        // TODO add your handling code here:
        flag = 6;
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        // TODO add your handling code here:
        flag = 0;
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        // TODO add your handling code here:
        flag = 0;
    }//GEN-LAST:event_jLabel8MouseExited

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        // TODO add your handling code here:
        flag = 0;
    }//GEN-LAST:event_jLabel9MouseExited

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel16MouseClicked

    private void telMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telMouseClicked
        // TODO add your handling code here:
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Hair Oil");
        cars.add("Grocery");
        cars.add("100");
        cars.add("5");
        cars.add("D:\\Java swing\\icons_mysqlConnector\\icons\\tel.jpg");
        cars.add(gmail);
        new ViewMedicine(cars).setVisible(true);
        //dispose();
    }//GEN-LAST:event_telMouseClicked

    private void headphoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headphoneMouseClicked
        // TODO add your handling code here:
                ArrayList<String> cars = new ArrayList<String>();
        cars.add("Headphone");
        cars.add("Electronics");
        cars.add("1600");
        cars.add("75");
        cars.add("D:\\Java swing\\icons_mysqlConnector\\icons\\headphone.jpg");
        cars.add(gmail);
        new ViewMedicine(cars).setVisible(true);
    }//GEN-LAST:event_headphoneMouseClicked

    private void honeynutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_honeynutMouseClicked
        // TODO add your handling code here:
                ArrayList<String> cars = new ArrayList<String>();
        cars.add("Honey Nuts");
        cars.add("Grocery");
        cars.add("1200");
        cars.add("5");
        cars.add("D:\\Java swing\\icons_mysqlConnector\\icons\\honeynut.PNG");
        cars.add(gmail);
        new ViewMedicine(cars).setVisible(true);
    }//GEN-LAST:event_honeynutMouseClicked

    private void jeansMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jeansMouseClicked
        // TODO add your handling code here:
                ArrayList<String> cars = new ArrayList<String>();
        cars.add("Jeans");
        cars.add("Fashion");
        cars.add("750");
        cars.add("25");
        cars.add("D:\\Java swing\\icons_mysqlConnector\\icons\\jeans.jpeg");
        cars.add(gmail);
        new ViewMedicine(cars).setVisible(true);
    }//GEN-LAST:event_jeansMouseClicked

    private void anitlostkeyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_anitlostkeyMouseClicked
        // TODO add your handling code here:
                ArrayList<String> cars = new ArrayList<String>();
        cars.add("Anti Lost Key");
        cars.add("Daily Hacks");
        cars.add("900");
        cars.add("55");
        cars.add("D:\\Java swing\\icons_mysqlConnector\\icons\\anitlost key.PNG");
        cars.add(gmail);
        new ViewMedicine(cars).setVisible(true);
    }//GEN-LAST:event_anitlostkeyMouseClicked

    private void bdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bdMouseClicked
        // TODO add your handling code here:
                ArrayList<String> cars = new ArrayList<String>();
        cars.add("Bangladesh Jersey");
        cars.add("Man's Fashion");
        cars.add("1500");
        cars.add("50");
        cars.add("D:\\Java swing\\icons_mysqlConnector\\icons\\bd.PNG");
        cars.add(gmail);
        new ViewMedicine(cars).setVisible(true);
    }//GEN-LAST:event_bdMouseClicked

    private void intermiamiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_intermiamiMouseClicked
        // TODO add your handling code here:
                ArrayList<String> cars = new ArrayList<String>();
        cars.add("Inter Miami Jersy");
        cars.add("Man's Fashion");
        cars.add("1000");
        cars.add("5");
        cars.add("D:\\Java swing\\icons_mysqlConnector\\icons\\inter_miami.PNG");
        cars.add(gmail);
        new ViewMedicine(cars).setVisible(true);
    }//GEN-LAST:event_intermiamiMouseClicked

    private void electronicsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_electronicsMouseClicked
        // TODO add your handling code here:
                ArrayList<String> cars = new ArrayList<String>();
        cars.add("Wired Mouse");
        cars.add("Electronics");
        cars.add("500");
        cars.add("50");
        cars.add("D:\\Java swing\\icons_mysqlConnector\\icons\\mouse.PNG");
        cars.add(gmail);
        new ViewMedicine(cars).setVisible(true);
    }//GEN-LAST:event_electronicsMouseClicked

    private void xMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseClicked
        // TODO add your handling code here:
        String sql;
          Connection con = myconnection.getConnection();
                    PreparedStatement ps;
        try {
           
             sql = "insert into selected_from_combo (combo_name) values(?)";
             ps = con.prepareStatement(sql);
        
            ps.setString(1, x.getText());
           
            ps.executeUpdate() ;
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        new Allcategories(gmail).setVisible(true);
        dispose();
    }//GEN-LAST:event_xMouseClicked

    private void xMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseEntered
        // TODO add your handling code here:
        flag = 1;
    }//GEN-LAST:event_xMouseEntered

    private void xMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_xMouseExited

    private void muslim_wearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_muslim_wearMouseClicked
        // TODO add your handling code here:
        String sql;
        Connection con = myconnection.getConnection();
        PreparedStatement ps;
        try {

            sql = "insert into selected_from_combo (combo_name) values(?)";
            ps = con.prepareStatement(sql);

            ps.setString(1, "Muslim Wear");

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        new Allcategories().setVisible(true);
        dispose();
    }//GEN-LAST:event_muslim_wearMouseClicked

    private void muslim_wearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_muslim_wearMouseEntered
        // TODO add your handling code here:
        flag = 1;
    }//GEN-LAST:event_muslim_wearMouseEntered

    private void muslim_wearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_muslim_wearMouseExited
        // TODO add your handling code here:
        
    }//GEN-LAST:event_muslim_wearMouseExited

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
        String sql;
          Connection con = myconnection.getConnection();
                    PreparedStatement ps;
        try {
           
             sql = "insert into selected_from_combo (combo_name) values(?)";
             ps = con.prepareStatement(sql);
        
            ps.setString(1, "Shoes");
           
            ps.executeUpdate() ;
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        new Allcategories(gmail).setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseEntered
        // TODO add your handling code here:
        flag = 1;
    }//GEN-LAST:event_jLabel15MouseEntered

    private void jLabel15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseExited
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jLabel15MouseExited

    private void jLabel58MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel58MouseClicked
        String sql;
          Connection con = myconnection.getConnection();
                    PreparedStatement ps;
        try {
           
             sql = "insert into selected_from_combo (combo_name) values(?)";
             ps = con.prepareStatement(sql);
        
            ps.setString(1, "Bags");
           
            ps.executeUpdate() ;
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        new Allcategories(gmail).setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel58MouseClicked

    private void jLabel58MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel58MouseEntered
        // TODO add your handling code here:
        flag = 1;
    }//GEN-LAST:event_jLabel58MouseEntered

    private void jLabel58MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel58MouseExited
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jLabel58MouseExited

    private void jLabel69MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel69MouseClicked
        String sql;
        Connection con = myconnection.getConnection();
        PreparedStatement ps;
        try {

            sql = "insert into selected_from_combo (combo_name) values(?)";
            ps = con.prepareStatement(sql);

            ps.setString(1, "Bags");

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }

        new Allcategories(gmail).setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel69MouseClicked

    private void jLabel69MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel69MouseEntered
        // TODO add your handling code here:
        flag = 2;
    }//GEN-LAST:event_jLabel69MouseEntered

    private void jLabel69MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel69MouseExited
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jLabel69MouseExited

    private void jLabel70MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel70MouseClicked
        String sql;
        Connection con = myconnection.getConnection();
        PreparedStatement ps;
        try {

            sql = "insert into selected_from_combo (combo_name) values(?)";
            ps = con.prepareStatement(sql);

            ps.setString(1, "Bags");

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }

        new Allcategories(gmail).setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel70MouseClicked

    private void jLabel70MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel70MouseEntered
        // TODO add your handling code here:
        flag = 2;
    }//GEN-LAST:event_jLabel70MouseEntered

    private void jLabel70MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel70MouseExited
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jLabel70MouseExited

    private void jLabel72MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel72MouseClicked
        String sql;
        Connection con = myconnection.getConnection();
        PreparedStatement ps;
        try {

            sql = "insert into selected_from_combo (combo_name) values(?)";
            ps = con.prepareStatement(sql);

            ps.setString(1, "Men's watches");

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }

        new Allcategories(gmail).setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel72MouseClicked

    private void jLabel72MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel72MouseEntered
        // TODO add your handling code here:
        flag = 2;
    }//GEN-LAST:event_jLabel72MouseEntered

    private void jLabel72MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel72MouseExited
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jLabel72MouseExited

    private void jLabel73MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel73MouseClicked
        String sql;
        Connection con = myconnection.getConnection();
        PreparedStatement ps;
        try {

            sql = "insert into selected_from_combo (combo_name) values(?)";
            ps = con.prepareStatement(sql);

            ps.setString(1, "Women's Watch");

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }

        new Allcategories(gmail).setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel73MouseClicked

    private void jLabel73MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel73MouseEntered
        // TODO add your handling code here:
        flag = 2;
    }//GEN-LAST:event_jLabel73MouseEntered

    private void jLabel73MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel73MouseExited
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jLabel73MouseExited

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        new firstlogin().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        new customer_profile(gmail).setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        new User().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4MouseClicked

    private void twoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twoMouseClicked
        // TODO add your handling code here:
        new DonatorSignup().setVisible(true);
    }//GEN-LAST:event_twoMouseClicked

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_twoActionPerformed

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
        new User().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5MouseClicked

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jTextField19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField19ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jTextField25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField25ActionPerformed

    private void jTextField23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField23ActionPerformed

    private void jTextField21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField21ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        new Kart(gmail).setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel82MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel82MouseClicked
        // TODO add your handling code here:
        String sql;
          Connection con = myconnection.getConnection();
                    PreparedStatement ps;
        try {
           
             sql = "insert into selected_from_combo (combo_name) values(?)";
             ps = con.prepareStatement(sql);
        
            ps.setString(1, "Clothing");
           
            ps.executeUpdate() ;
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        new Allcategories(gmail).setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel82MouseClicked

    private void jLabel86MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel86MouseClicked
        // TODO add your handling code here:
        String sql;
          Connection con = myconnection.getConnection();
                    PreparedStatement ps;
        try {
           
             sql = "insert into selected_from_combo (combo_name) values(?)";
             ps = con.prepareStatement(sql);
        
            ps.setString(1, "%Watches%");
           
            ps.executeUpdate() ;
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        new Allcategories(gmail).setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel86MouseClicked

    private void jLabel86MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel86MouseEntered
        // TODO add your handling code here:
        flag = 4;
    }//GEN-LAST:event_jLabel86MouseEntered

    private void jLabel86MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel86MouseExited
        // TODO add your handling code here:
        flag = 0;
    }//GEN-LAST:event_jLabel86MouseExited

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
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new User().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Belts;
    private javax.swing.JLabel anitlostkey;
    private javax.swing.JLabel bd;
    private javax.swing.JPanel choice1;
    private javax.swing.JPanel choice4;
    private javax.swing.JPanel choice5;
    private javax.swing.JPanel choice6;
    private javax.swing.JPanel choice7;
    private javax.swing.JPanel choice8;
    private SplashScreen.CurvesPanel curvesPanel1;
    private admin.Donation donation2;
    private javax.swing.JTextArea eight;
    private javax.swing.JLabel electronics;
    private javax.swing.JTextField eleven;
    private javax.swing.JTextArea five;
    private javax.swing.JTextArea four;
    private javax.swing.JLabel headphone;
    private javax.swing.JLabel honeynut;
    private javax.swing.JLabel intermiami;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea10;
    private javax.swing.JTextArea jTextArea11;
    private javax.swing.JTextArea jTextArea12;
    private javax.swing.JTextArea jTextArea13;
    private javax.swing.JTextArea jTextArea14;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextArea jTextArea7;
    private javax.swing.JTextArea jTextArea8;
    private javax.swing.JTextArea jTextArea9;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel jeans;
    private javax.swing.JLabel knife;
    private javax.swing.JLabel muslim_wear;
    private javax.swing.JTextField nine;
    private javax.swing.JTextField one;
    private javax.swing.JLabel salwar;
    private customize.ScrollBarCustom scrollBarCustom1;
    private admin.AutocompleteComboBox searchh;
    private javax.swing.JTextField seven;
    private javax.swing.JTextField six;
    private javax.swing.JPanel slide1;
    private javax.swing.JPanel slide2;
    private javax.swing.JPanel slide3;
    private javax.swing.JPanel slideshow_mother_panel;
    private javax.swing.JLabel smartwatches;
    private javax.swing.JLabel tel;
    private javax.swing.JTextField ten;
    private javax.swing.JTextArea three;
    private javax.swing.JLabel trimmers;
    private javax.swing.JTextField two;
    private javax.swing.JLabel x;
    // End of variables declaration//GEN-END:variables
}
