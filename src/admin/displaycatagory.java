/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package admin;
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
 * @author Dell
 */
public class displaycatagory extends javax.swing.JPanel {

   
    catagoryview jblist = null;
    String sagor="";
    String sagor2="";
    public void setistring(){
        try {
            Connection con = myconnection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT combo_name FROM selected_from_combo");
            if(rs.next())
            sagor=rs.getString("combo_name");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
   
       if(!sagor.isEmpty()){
          Connection con = myconnection.getConnection();
         PreparedStatement ps;
       try {
         
            String query = "DELETE FROM selected_from_combo WHERE combo_name = ?";
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setString(1, sagor);
            preparedStatement.executeUpdate();
       } catch (SQLException ex) {
            Logger.getLogger(displaycatagory.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
       
       try {
            Connection con = myconnection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT selected_search FROM selected_from_search");
            if(rs.next())
            sagor2=rs.getString("selected_search");
        } catch (Exception e) {
            e.printStackTrace();
        }
       
        if(!sagor2.isEmpty()){
          Connection con = myconnection.getConnection();
         PreparedStatement ps;
       try {
         
            String query = "DELETE FROM selected_from_search WHERE selected_search = ?";
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setString(1, sagor2);
            preparedStatement.executeUpdate();
       } catch (SQLException ex) {
            Logger.getLogger(displaycatagory.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
      // System.out.println(sagor2);
       //System.out.println(sagor);
        
    }
    
    public displaycatagory() {
        initComponents();
        set_job_combo();
        setistring();
        update_list2(sagor,sagor2);
        
        JScrollBar verticalScrollBar = ScrollView.getVerticalScrollBar();
        verticalScrollBar.setUnitIncrement(20);
        verticalScrollBar.setBlockIncrement(200);
        ScrollView.setVerticalScrollBar(new ScrollBarCustom());
    }
    
    public void set_job_combo() {
        jt.removeAll();
        jt.addItem("");
        try {
            Connection con = myconnection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT DISTINCT product_catagory FROM product_info");
            while (rs.next()) {
                jt.addItem(rs.getString("product_catagory"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        jt1.removeAll();
        jt1.addItem("");
        try {
            Connection con = myconnection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT DISTINCT product_supplier FROM product_info");
            while (rs.next()) {
                jt1.addItem(rs.getString("product_supplier"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void update_list2(String sa,String sa2) {
    String JT = sa;
    String JT1 = (String) (jt1.getSelectedIndex() == -1 ? "" : jt1.getItemAt(jt1.getSelectedIndex()));
    //String SKL = skl.getText();
    if(JT.equals("none")) JT="";
    if(JT1.equals("none")) JT1="";
    String CMP = sa2;
    tf.setText(sa2);
    jt.setSelectedItem(sa);
        float valu= (float) Integer.valueOf(spin_price.getText());
   // String LCTN = lctn.getText();
    var jobs = new ArrayList<productinfo>();

    try {
        Connection con = myconnection.getConnection();
        String query = "SELECT * FROM product_info WHERE product_name LIKE ? AND product_catagory LIKE ? AND product_supplier LIKE ? AND product_price <= ? ORDER BY product_name ASC";
        var st = con.prepareStatement(query);
        st.setString(2, JT.equals("") ? "%" : "%" + JT + "%");
        st.setString(3, JT1.equals("") ? "%" : "%" + JT1 + "%");
        st.setString(1, CMP.equals("") ? "%" : "%" + CMP + "%");
        st.setFloat(4,valu);
       

        var rs = st.executeQuery();
        while (rs.next()) {
            jobs.add(new productinfo(rs));
        }
        update_res_panel(new catagoryview(jobs));
    } catch (Exception e) {
        e.printStackTrace();
    }
    }
    
    
    
    public void update_list() {
    String JT = (String) (jt.getSelectedIndex() == -1 ? "" : jt.getItemAt(jt.getSelectedIndex()));
    String JT1 = (String) (jt1.getSelectedIndex() == -1 ? "" : jt1.getItemAt(jt1.getSelectedIndex()));
    //String SKL = skl.getText();
    if(JT.equals("none")) JT="";
    if(JT1.equals("none")) JT1="";
    String CMP = tf.getText();
   // String LCTN = lctn.getText();
    var jobs = new ArrayList<productinfo>();
    
            float valu= Float.parseFloat(spin_price.getText());


    try {
        Connection con = myconnection.getConnection();
        String query = "SELECT * FROM product_info WHERE product_name LIKE ? AND product_catagory LIKE ? AND product_supplier LIKE ? AND product_price <= ? ORDER BY product_name ASC";
        var st = con.prepareStatement(query);
        st.setString(2, JT.equals("") ? "%" : "%" + JT + "%");
        st.setString(3, JT1.equals("") ? "%" : "%" + JT1 + "%");
        st.setString(1, CMP.equals("") ? "%" : "%" + CMP + "%");
       st.setFloat(4,valu);

        var rs = st.executeQuery();
        while (rs.next()) {
            jobs.add(new productinfo(rs));
        }
        update_res_panel(new catagoryview(jobs));
    } catch (Exception e) {
        e.printStackTrace();
    }
    }
    
        public void update_res_panel(catagoryview bv) {
        if (jblist != null) {
            ScrollView.getViewport().remove(jblist);
        }
        ScrollView.getViewport().add(bv);
        this.validate();
        this.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSMaterialButtonCircle1 = new necesario.RSMaterialButtonCircle();
        tf = new customize.TextField();
        jt = new customize.Combobox();
        jt1 = new customize.Combobox();
        jSlider1 = new javax.swing.JSlider();
        ScrollView = new javax.swing.JScrollPane();
        jLabel2 = new javax.swing.JLabel();
        spin_price = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(1040, 600));

        rSMaterialButtonCircle1.setBackground(new java.awt.Color(255, 102, 0));
        rSMaterialButtonCircle1.setBorder(null);
        rSMaterialButtonCircle1.setText("Filter");
        rSMaterialButtonCircle1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        rSMaterialButtonCircle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonCircle1ActionPerformed(evt);
            }
        });

        tf.setLabelText("Product Name");

        jt.setLabeText("Product Type");

        jt1.setLabeText("Brand Name");

        jSlider1.setMajorTickSpacing(10);
        jSlider1.setMinorTickSpacing(5);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Price <");

        spin_price.setText("2500");
        spin_price.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                spin_priceCaretUpdate(evt);
            }
        });
        spin_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spin_priceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rSMaterialButtonCircle1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSlider1, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spin_price, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollView, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(rSMaterialButtonCircle1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jt, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jt1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spin_price, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScrollView)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rSMaterialButtonCircle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle1ActionPerformed
        // TODO add your handling code here:
        update_list();
    }//GEN-LAST:event_rSMaterialButtonCircle1ActionPerformed

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        // TODO add your handling code here:
        spin_price.setText("" + jSlider1.getValue()*50);
    }//GEN-LAST:event_jSlider1StateChanged

    private void spin_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spin_priceActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_spin_priceActionPerformed

    private void spin_priceCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_spin_priceCaretUpdate
        // TODO add your handling code here:
        //jSlider1.setValue(Integer.valueOf(spin_price.getText())/50);
        
    }//GEN-LAST:event_spin_priceCaretUpdate


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollView;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSlider jSlider1;
    private customize.Combobox jt;
    private customize.Combobox jt1;
    private necesario.RSMaterialButtonCircle rSMaterialButtonCircle1;
    private javax.swing.JTextField spin_price;
    private customize.TextField tf;
    // End of variables declaration//GEN-END:variables
}
