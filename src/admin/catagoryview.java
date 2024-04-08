/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package admin;
import java.awt.Color;
import customize.WrapLayout;
import java.awt.Rectangle;
import java.util.ArrayList;
/**
 *
 * @author Dell
 */
public class catagoryview extends javax.swing.JPanel {

   
   public catagoryview(){initComponents();}

   ArrayList<productinfo> job_dd;
    int rows = 0;
    static final Rectangle pnl = new Rectangle(280, 420);

    public catagoryview(ArrayList<productinfo> job_dd) {
        initComponents();
        this.job_dd = job_dd;
        rows = Math.ceilDiv(job_dd.size(), 3);
        this.setLayout(new WrapLayout(WrapLayout.LEADING, 80, 80));
        var grid = this;
        grid.setBackground(Color.white);
        for (productinfo bk: job_dd) {
            grid.add(new productview(bk));
        }
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 250, 250));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
