/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package admin;

/**
 *
 * @author Administrator
 */

  
import java.awt.Color;
import customize.WrapLayout;
import java.awt.Rectangle;
import java.util.ArrayList;


public class DonationView extends javax.swing.JPanel {

   
    ArrayList<donationinfo> job_d;
    int rows = 0;
    static final Rectangle pnl = new Rectangle(280, 420);

    public DonationView(ArrayList<donationinfo> job_d) {
        initComponents();
        this.job_d = job_d;
        rows = Math.ceilDiv(job_d.size(), 3);
        this.setLayout(new WrapLayout(WrapLayout.LEADING, 80, 80));
        var grid = this;
        grid.setBackground(Color.white);
        for (donationinfo bk: job_d) {
            grid.add(new donationinfoview(bk));
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

        setBackground(new java.awt.Color(255, 250, 250));
        setPreferredSize(new java.awt.Dimension(500, 5000));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2000, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
