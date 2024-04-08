/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package admin;

import Connection.myconnection;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Administrator
 */
public class DonatorInfo {
    Connection con = myconnection.getConnection();
    PreparedStatement ps;
    Statement st;
    ResultSet rs;

    public void insert(int id, String name, String mail, String location, String phone, String wb,String type,  InputStream imageStream) {
        String sql;
        try {
            if (imageStream != null) {
                // Include the image insertion
                sql = "insert into donation values(?,?,?,?,?,?,?,?)";
                ps = con.prepareStatement(sql);
                ps.setBinaryStream(8, imageStream);
                //System.out.println(imageStream);
            } else {
                // Exclude the image insertion
                sql = "insert into donation (Donator_Company_ID, Donator_Company_Name, Location, Email, Phone, Type, Website) values(?,?,?,?,?,?,?)";
                ps = con.prepareStatement(sql);
            }
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, location);
            ps.setString(4, mail);
            ps.setString(5, phone);
            ps.setString(6, type);
            ps.setString(7, wb);
     
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Information Added", "Success", JOptionPane.INFORMATION_MESSAGE);
            } 
        } catch (SQLException ex) {
            Logger.getLogger(DonatorInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int getmaxrowj() {
        int row = 0;
        try {
            st = con.createStatement();
            rs = st.executeQuery("select max(Donator_Company_ID) from donation");
            while (rs.next()) {
                row = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DonatorInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return row + 1;
    }
}
