/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package customize;


import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JScrollBar;


public class ScrollBarCustom extends JScrollBar{
    public ScrollBarCustom(){
        setUI(new ModernScrollBarUI());
        setPreferredSize(new Dimension(10,10));
        setForeground(new Color(48,144,216));
        setBackground(Color.WHITE);
    }

}