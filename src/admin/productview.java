/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package admin;
import Connection.myconnection;
import javax.swing.ImageIcon;
import javax.swing.ImageIcon;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import login.RegisterPage;
/**
 *
 * @author Dell
 */
public class productview extends javax.swing.JPanel {

  
    public productview() {
        initComponents();
        
    }
    
    productinfo ji;
    String supp;
    public productview(productinfo ji) {
        
        initComponents();
        this.ji = ji;
        supp=ji.sup;
        name.setText(ji.pname);
        cata.setText(ji.pcatagory);
        price.setText(Float.toString(ji.pprice));
        quan.setValue(0);
        
        if (ji.pp != null) {
            ImageIcon imageIcon = new ImageIcon(ji.pp);
        Image image = imageIcon.getImage();

        // Get the size of the JLabel
        int labelWidth =302
                ;
        int labelHeight = 142;

        // Resize the image to fit the JLabel
        Image resizedImage = image.getScaledInstance(labelWidth, labelHeight, Image.SCALE_SMOOTH);

        

        // Set the resized image as the icon for the JLabel
        picc.setIcon(new ImageIcon(resizedImage));
            
            
            
            
            //pic.setIcon(imageIcon);
        } else {
            picc.setIcon(null);
        }
    }
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        picc = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cata = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        quan = new javax.swing.JSpinner();
        purchase = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(245, 245, 245));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Name");

        name.setBackground(new java.awt.Color(255, 255, 255));
        name.setOpaque(true);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Catagory");

        cata.setBackground(new java.awt.Color(255, 255, 255));
        cata.setOpaque(true);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Price");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Quantity");

        price.setBackground(new java.awt.Color(255, 255, 255));
        price.setOpaque(true);

        purchase.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        purchase.setText("Purchase");
        purchase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                purchaseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(picc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cata, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quan, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(price, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)))
                    .addComponent(purchase, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(picc, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cata, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(purchase))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void purchaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_purchaseMouseClicked
        // TODO add your handling code here:
        if(purchase.isSelected())
        {
            int quantity = (Integer) quan.getValue();
            int have_quantity= 0;
            String sql;
            
            Connection con = myconnection.getConnection();
            PreparedStatement ps;
            ResultSet rs;
            try {
                
                sql = "SELECT product_quantity FROM product_info where product_name = ?";
                ps = con.prepareStatement(sql);

                ps.setString(1, name.getText());
                
                rs = ps.executeQuery();
                if(rs.next())
                {
                    have_quantity = rs.getInt("product_quantity");
                }
            } catch (SQLException ex) {
                Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(quantity == 0)
            {
                JOptionPane.showMessageDialog(new JFrame(), "Increase the Quantity", "Dialog",
        JOptionPane.ERROR_MESSAGE);
            }
            
            else if(have_quantity < quantity)
            {
                JOptionPane.showMessageDialog(new JFrame(), "Not available", "Dialog",
        JOptionPane.ERROR_MESSAGE);
            }
            else 
            {
                JOptionPane.showMessageDialog(new JFrame(), "Added to cart", "Dialog",
                        JOptionPane.INFORMATION_MESSAGE);
                int id = 0;
                try {

                    PreparedStatement ps2;
                    ps2 = con.prepareStatement("Select * from kart");

                    ResultSet rs2;
                    rs2 = ps2.executeQuery();
                    while (rs2.next()) {
                        id++;
                    }

                } catch (SQLException ex) {
                    Logger.getLogger(productview.class.getName()).log(Level.SEVERE, "in else", ex);
                }
                try {
                    id++;
                    PreparedStatement ps2;
                    ps2 = con.prepareStatement("INSERT INTO kart values(?,?,?,?,?)");
                    ps2.setString(1, String.valueOf(id));
                    ps2.setString(2, name.getText());
                    ps2.setString(3, String.valueOf(quantity));
                    ps2.setString(4, String.valueOf(price.getText()));
                    ps2.setString(5, supp);

                    ps2.execute();

                } catch (SQLException ex) {
                    Logger.getLogger(productview.class.getName()).log(Level.SEVERE, "in else", ex);
                }
            }
            quan.setValue(Integer.valueOf(0));
            purchase.setSelected(false);
        }
    }//GEN-LAST:event_purchaseMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cata;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel name;
    private javax.swing.JLabel picc;
    private javax.swing.JLabel price;
    private javax.swing.JCheckBox purchase;
    private javax.swing.JSpinner quan;
    // End of variables declaration//GEN-END:variables
}
