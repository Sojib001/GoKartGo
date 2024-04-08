package admin;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import customize.*;
import Connection.myconnection;
import java.util.ArrayList;
import javax.swing.JScrollBar;
import customize.ScrollBarCustom;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
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
/**
 *
 * @author Administrator
 */
import customize.*;
import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class AutocompleteComboBox extends JComboBox<String> {
    private List<String> data;

    public AutocompleteComboBox() {
        initializeData();

        setEditable(true);
        getEditor().getEditorComponent().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                JTextField textField = (JTextField) getEditor().getEditorComponent();
                String input = textField.getText().toLowerCase();
                autoComplete(input);
            }
        });
    }

    private void initializeData() {
        data = new ArrayList<>();
        
        
         
        
        try {
            Connection con = myconnection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT DISTINCT product_name FROM product_info");
            while (rs.next()) {
                data.add(rs.getString("product_name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        data.add("Apple");
        data.add("Banana");
        data.add("Orange");
        data.add("Mango");
        data.add("women");
        data.add("man");
        data.add("shoe");
        data.add("clothing");
        data.add("kid");
        data.add("bag");
        data.add("burqa");
        data.add("shirt");
    }

    private void autoComplete(String input) {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        for (String item : data) {
            if (item.toLowerCase().startsWith(input)) {
                model.addElement(item);
            }
        }
        setModel(model);
        setSelectedItem(input);
        showPopup();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("AutocompleteComboBox Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 200);

            AutocompleteComboBox autocompleteComboBox = new AutocompleteComboBox();
            frame.getContentPane().add(autocompleteComboBox);

            frame.setVisible(true);
        });
    }
}