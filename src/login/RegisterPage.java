/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package login;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.*;
import Connection.myconnection;
import java.awt.Image;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
/**
 *
 * @author Dell
 */
public class RegisterPage extends javax.swing.JFrame {

    /**
     * Creates new form RegisterPage
     */
    String SelectedImagePath = "";
    public RegisterPage() {
        initComponents();
        check_for_slider();
        comboresult.setText(combo.getSelectedItem().toString());
        
    }
    void check_for_slider()
    {
        Thread choose = new Thread() {
            public void run() {
                try {
                    while (true) {
                        //slider.setValue(Integer.valueOf(salary.getText())/1000);
                        
                        Thread.sleep(1);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        };
        choose.start();

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Gender = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        male_button = new javax.swing.JRadioButton();
        female_button = new javax.swing.JRadioButton();
        Toggle = new javax.swing.JToggleButton();
        TEXT = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        preference = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        nnn = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        locationfld = new javax.swing.JTextArea();
        cookies = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        profile_picture = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        combo = new javax.swing.JComboBox<>();
        comboresult = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0, 80));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("WELCOME");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 0, -1, 69));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Username*");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 155, 94, 22));
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 155, 212, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email*");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 186, 94, -1));
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 183, 212, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password*");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 214, 94, -1));
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 211, 212, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Date of birth");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 245, 94, -1));
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 245, 212, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Gender*");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 540, 107, 21));

        Gender.add(male_button);
        male_button.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        male_button.setForeground(new java.awt.Color(255, 255, 255));
        male_button.setText("Male");
        jPanel1.add(male_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 537, 98, -1));

        Gender.add(female_button);
        female_button.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        female_button.setForeground(new java.awt.Color(255, 255, 255));
        female_button.setText("Female");
        female_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                female_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(female_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 537, 98, -1));

        Toggle.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Toggle.setText("Change");
        Toggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToggleActionPerformed(evt);
            }
        });
        jPanel1.add(Toggle, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 590, 97, -1));

        TEXT.setText("Unmarried");
        jPanel1.add(TEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 590, 93, -1));

        add.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 660, -1, -1));
        jPanel1.add(preference, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 630, 71, -1));

        jScrollPane4.setMinimumSize(new java.awt.Dimension(10, 10));

        jTable2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Preferred Objects"
            }
        ));
        jTable2.setShowGrid(true);
        jScrollPane4.setViewportView(jTable2);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 630, 218, 50));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Preferences");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 630, 107, -1));

        nnn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nnn.setForeground(new java.awt.Color(255, 255, 255));
        nnn.setText("Location*");
        jPanel1.add(nnn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 730, 107, 26));

        locationfld.setColumns(10);
        locationfld.setRows(5);
        jScrollPane2.setViewportView(locationfld);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 730, 191, 51));

        cookies.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cookies.setForeground(new java.awt.Color(255, 255, 255));
        cookies.setText("Accept all terms and conditions");
        cookies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cookiesActionPerformed(evt);
            }
        });
        jPanel1.add(cookies, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 800, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Register");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 820, 200, 49));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Maritial status");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 590, -1, -1));
        jPanel1.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 690, 161, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Phone*");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 700, 94, -1));

        profile_picture.setOpaque(true);
        jPanel1.add(profile_picture, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 279, 321, 252));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Choose Picture");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 397, -1, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Your role*");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 130, 94, -1));

        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customer", "Admin", "Supplier" }));
        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });
        jPanel1.add(combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 127, 120, -1));
        jPanel1.add(comboresult, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 127, 88, -1));

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 670, 520));

        jLabel1.setBackground(new java.awt.Color(255, 117, 73));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 580));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void female_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_female_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_female_buttonActionPerformed

    private void ToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToggleActionPerformed
        // TODO add your handling code here:
        
        if(Toggle.isSelected()){
            TEXT.setText("Married");
        }
        else TEXT.setText("Unmarried");
    }//GEN-LAST:event_ToggleActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        if(preference.getText().equals(""))
        {
            
        }
        else
        {
            String data[] = {preference.getText()};
            DefaultTableModel model= (DefaultTableModel)jTable2.getModel();
            model.addRow(data);
            preference.setText("");
        }
    }//GEN-LAST:event_addActionPerformed

    private void cookiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cookiesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cookiesActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        
        
    }//GEN-LAST:event_formMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
       
           
            //new errorbox().setVisible(true);
            
            
        String uname=username.getText();
        String pass=password.getText();
        String em=email.getText();
        String phn=phone.getText();
        String user_location = locationfld.getText();
        String user_Gender = "";
        int chcker = 0;
        if(male_button.isSelected())
            user_Gender = "Male";
        else if(female_button.isSelected())
            user_Gender = "Female";
        else
            chcker = 1;
            
        
        if(uname.isEmpty()) JOptionPane.showMessageDialog(new JFrame(), "USERNAME is empty", "Dialog",
        JOptionPane.ERROR_MESSAGE);
        else if(pass.isEmpty()) JOptionPane.showMessageDialog(new JFrame(), "PASSWORD is Empty", "Dialog",
        JOptionPane.ERROR_MESSAGE);
        else if(em.isEmpty()) JOptionPane.showMessageDialog(new JFrame(), "Email is Empty", "Dialog",
        JOptionPane.ERROR_MESSAGE);
        else if(phn.isEmpty()) JOptionPane.showMessageDialog(new JFrame(), "PHONE is emtpy", "Dialog",
        JOptionPane.ERROR_MESSAGE);
        else if(user_location.isEmpty()) JOptionPane.showMessageDialog(new JFrame(), "Location is emtpy", "Dialog",
        JOptionPane.ERROR_MESSAGE);
        else if(SelectedImagePath.equals(""))
            JOptionPane.showMessageDialog(new JFrame(), "Profile Picture not provided", "Dialog",
        JOptionPane.ERROR_MESSAGE);
        else if(chcker == 1)
            JOptionPane.showMessageDialog(new JFrame(), "Gender not selected", "Dialog",
        JOptionPane.ERROR_MESSAGE);
        else if(comboresult.getText().equals("Customer")){
            ResultSet rs;
            try {
                Connection con = (Connection) myconnection.getConnection();
                PreparedStatement ps;
                ps = con.prepareStatement("select * from customer_information where EMAIL = ?");
                ps.setString(1, em);
                rs = ps.executeQuery();

                if (rs.next()) {
                    JOptionPane.showMessageDialog(this, "This Email has already been registered!", "ERROR", 1);
                } else {
                    PreparedStatement ps2;
                    String sql2 = "INSERT INTO customer_information values(?,?,?,?,?,?,?)";
                    try {
                        ps2 = con.prepareStatement(sql2);
                        ps2.setString(1, uname);
                        ps2.setString(2, em);
                        ps2.setString(3, pass);
                        ps2.setString(4, phn);
                        ps2.setString(5, SelectedImagePath);
                        ps2.setString(6, user_location);
                        ps2.setString(7, user_Gender);
                        if (ps2.executeUpdate() > 0) {
                            JOptionPane.showMessageDialog(new JFrame(), "Information added", "Dialog",
                                    JOptionPane.ERROR_MESSAGE);
                        }
                        new firstlogin().setVisible(true);
                        dispose();


                    } catch (SQLException ex) {
                        Logger.getLogger(RegisterPage.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }

            } catch (SQLException ex) {
                Logger.getLogger(RegisterPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(comboresult.getText().equals("Supplier"))
        {
            
            ResultSet rs;
            try {
                Connection con = (Connection) myconnection.getConnection();
                PreparedStatement ps;
                ps = con.prepareStatement("select * from supplier_information where supplier_store_name = ?");
                ps.setString(1, username.getText());
                rs = ps.executeQuery();
                System.out.print("gg");
                if (rs.next()) {
                    JOptionPane.showMessageDialog(this, "This Store Name has already been registered!", "ERROR", 1);
                } else {
                    PreparedStatement ps2;

                    String sql2 = "INSERT INTO supplier_information values(?,?,?,?,?,?,?)";
                    try {
                        ps2 = con.prepareStatement(sql2);
                        ps2.setString(1, uname);
                        ps2.setString(2, em);
                        ps2.setString(3, pass);
                        ps2.setString(4, phn);
                        ps2.setString(5, SelectedImagePath);
                        ps2.setString(6, user_location);
                        ps2.setString(7, user_Gender);
                        if (ps2.executeUpdate() > 0) {
                            JOptionPane.showMessageDialog(new JFrame(), "Information added", "Dialog",
                                    JOptionPane.ERROR_MESSAGE);
                        }
                        new firstlogin().setVisible(true);
                        dispose();


                    } catch (SQLException ex) {
                        Logger.getLogger(RegisterPage.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
                
            } catch (SQLException ex) {
                Logger.getLogger(RegisterPage.class.getName()).log(Level.SEVERE, "first one", ex);
            }
        }
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser("D:\\Java swing\\icons_mysqlConnector\\DP");
        chooser.showOpenDialog(null);
        File selectedImageFIle = chooser.getSelectedFile();
        SelectedImagePath = selectedImageFIle.getAbsolutePath();
        ImageIcon ic = new ImageIcon(SelectedImagePath);
        Image image = ic.getImage().getScaledInstance(profile_picture.getWidth(), profile_picture.getHeight(), Image.SCALE_SMOOTH);
        profile_picture.setIcon(new ImageIcon(image));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        new firstlogin().setVisible(true);
        dispose();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed
        // TODO add your handling code here:
        comboresult.setText(combo.getSelectedItem().toString());
        
     
    }//GEN-LAST:event_comboActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Gender;
    private javax.swing.JTextField TEXT;
    private javax.swing.JToggleButton Toggle;
    private javax.swing.JButton add;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JTextField comboresult;
    private javax.swing.JCheckBox cookies;
    private javax.swing.JTextField email;
    private javax.swing.JRadioButton female_button;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea locationfld;
    private javax.swing.JRadioButton male_button;
    private javax.swing.JLabel nnn;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField preference;
    private javax.swing.JLabel profile_picture;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}