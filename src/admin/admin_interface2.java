/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package admin;

import admin.GiveRows;
import Connection.myconnection;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import login.RegisterPage;
import login.firstlogin;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.statistics.HistogramDataset;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class admin_interface2 extends javax.swing.JFrame {
    
    GiveRows ob = new GiveRows();

    public admin_interface2() {
        
        initComponents();
        
        showPieChart();
        showLineChart();
        showHistogram();
        slideshow();
        fill_the_table();
        if(ob.countRows()==0) noti.setBadgeColor(Color.green);
        noti.setText(String.valueOf(ob.countRows()));
        theme_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Sun.png"))); // NOI18N
    }
    public void fill_the_table()
    {
        ResultSet rs;
            try {
            Connection con = (Connection) myconnection.getConnection();
            PreparedStatement ps;
            ps = con.prepareStatement("select * from sold_product_info");
            rs = ps.executeQuery();
            while(rs.next())
            {
                String Product_Name = rs.getString(1);
                String Price = rs.getString(2);
                String Quantity = rs.getString(3);
                String User_Email = rs.getString(4);
                String tbdata[] = {Product_Name, Price,Quantity,User_Email};
                DefaultTableModel tblmodel = (DefaultTableModel) jTable1.getModel();
                tblmodel.addRow(tbdata);
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegisterPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
 
    
    
    public void slideshow()
    {
        int slide_size = 873;
        Thread slide=new Thread(){
        public void run(){
            try{
                while(true)
                {
                    slideshow_mother_panel.removeAll();
                    slideshow_mother_panel.repaint();
                    slideshow_mother_panel.revalidate();

                    slideshow_mother_panel.add(slide1);
                    slideshow_mother_panel.repaint();
                    slideshow_mother_panel.revalidate();
                    
                    Thread.sleep(5000);
                    
                    
                    slideshow_mother_panel.removeAll();
                    slideshow_mother_panel.repaint();
                    slideshow_mother_panel.revalidate();

                    slideshow_mother_panel.add(slide3);
                    slideshow_mother_panel.repaint();
                    slideshow_mother_panel.revalidate();

                    Thread.sleep(5000);
                    slideshow_mother_panel.removeAll();
                    slideshow_mother_panel.repaint();
                    slideshow_mother_panel.revalidate();

                    slideshow_mother_panel.add(slide2);
                    slideshow_mother_panel.repaint();
                    slideshow_mother_panel.revalidate();

                    Thread.sleep(5000);

                }
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        }
    }
    };slide.start();
    
    
        Thread th1=new Thread(){
        public void run(){
            try{
                for(int i=3119, j = 145110, k = 4510, l = 31190; ; i++, j+= 159, k--, l+=613)
                {
                    items_sold.setText(Integer.toString(k));
                    profit.setText(Integer.toString(j));
                    active_items.setText(Integer.toString(i));
                    expenses.setText(Integer.toString(l));
                    Thread.sleep(1200);
                    if(i%4 == 0)
                    {
                        i = i + 5;
                        j = j+324;
                        l+=235;
                        k -= 5;
                    }
                    k += 12;
                    j= j+213;
                    l+=533;
                }
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        }
    }
    };th1.start();
    
    Thread th5=new Thread(){
        public void run(){
            try{
                while(true)
                {
                    int x = Integer.parseInt(jLabel40.getText());
                    x--;
                    if(x == -1)
                    {
                        x = 59;
                        int y = Integer.parseInt(jLabel38.getText());
                        y--;
                        if(y == -1)
                            y = 59;
                        jLabel38.setText(Integer.toString(y));
                            
                    }
                        
                    jLabel40.setText(Integer.toString(x));
                    Thread.sleep(1000);
                }
                
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        }
    }
    };th5.start();
    
    }
    public void showPieChart(){
        
        //create dataset
      DefaultPieDataset barDataset = new DefaultPieDataset();
      barDataset.setValue("IPhone 15" , Double.valueOf(30));  
      barDataset.setValue("Samsung A34" , Double.valueOf(20));   
      barDataset.setValue("AWB Headset" , Double.valueOf(20));    
      barDataset.setValue("Moslin Saree" , Double.valueOf(15)); 
      barDataset.setValue("Others" , Double.valueOf(15));
      
      
      //create chart
       JFreeChart piechart = ChartFactory.createPieChart("Sales",barDataset, false,true,false);//explain
      
        PiePlot piePlot =(PiePlot) piechart.getPlot();
      
       //changing pie chart blocks colors
        piePlot.setSectionPaint("IPhone 15", new Color(255,255,102));
        piePlot.setSectionPaint("Samsung A34", new Color(102,255,102));
        piePlot.setSectionPaint("Moslin Saree", new Color(55, 0, 255));
        piePlot.setSectionPaint("AWB Headset", new Color(0,204,204));
        piePlot.setSectionPaint("Others", new Color(251,0,7));
        
      
       
        piePlot.setBackgroundPaint(Color.white);
        
        //create chartPanel to display chart(graph)
        ChartPanel barChartPanel = new ChartPanel(piechart);
        panelBarChart.removeAll();
        panelBarChart.add(barChartPanel, BorderLayout.CENTER);
        panelBarChart.validate();
    }
    public void showHistogram(){
        
         double[] values = { 95, 49, 14, 59, 50, 66, 47, 40, 1, 67,
                            12, 58, 28, 63, 14, 9, 31, 17, 94, 71,
                            49, 64, 73, 97, 15, 63, 10, 12, 31, 62,
                            93, 49, 74, 90, 59, 14, 15, 88, 26, 57,
                            77, 44, 58, 91, 10, 67, 57, 19, 88, 84                                
                          };
 
 
        HistogramDataset dataset = new HistogramDataset();
        dataset.addSeries("key", values, 20);
        
         JFreeChart chart = ChartFactory.createHistogram("Customer Visit","time", "Number of people", dataset,PlotOrientation.VERTICAL, false,true,false);
            XYPlot plot= chart.getXYPlot();
        plot.setBackgroundPaint(Color.WHITE);

        
        
        ChartPanel barpChartPanel2 = new ChartPanel(chart);
        histogram.removeAll();
        histogram.add(barpChartPanel2, BorderLayout.CENTER);
        histogram.validate();
    }

    public void showLineChart(){
        //create dataset for the graph
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(200, "Amount", "january");
        dataset.setValue(150, "Amount", "february");
        dataset.setValue(18, "Amount", "march");
        dataset.setValue(100, "Amount", "april");
        dataset.setValue(80, "Amount", "may");
        dataset.setValue(250, "Amount", "june");
        
        //create chart
        JFreeChart linechart = ChartFactory.createLineChart("Profit","Month","Amount", 
                dataset, PlotOrientation.VERTICAL, false,true,false);
        
        //create plot object
         CategoryPlot lineCategoryPlot = linechart.getCategoryPlot();
       // lineCategoryPlot.setRangeGridlinePaint(Color.BLUE);
        lineCategoryPlot.setBackgroundPaint(Color.white);
        
        //create render object to change the moficy the line properties like color
        LineAndShapeRenderer lineRenderer = (LineAndShapeRenderer) lineCategoryPlot.getRenderer();
        Color lineChartColor = new Color(0,0,0);
        lineRenderer.setSeriesPaint(0, lineChartColor);
        
         //create chartPanel to display chart(graph)
        ChartPanel lineChartPanel = new ChartPanel(linechart);
        panelLineChart.removeAll();
        panelLineChart.add(lineChartPanel, BorderLayout.CENTER);
        panelLineChart.validate();
        
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        noti = new customize.BadgeButton();
        jPanel3 = new javax.swing.JPanel();
        theme = new javax.swing.JLabel();
        theme_icon = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        mother_panel = new javax.swing.JPanel();
        home = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        slideshow_mother_panel = new javax.swing.JPanel();
        slide3 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        slide2 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        slide1 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        profit = new javax.swing.JLabel();
        profit1 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        expenses = new javax.swing.JLabel();
        profit2 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        items_sold = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        active_items = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        debug = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        analysis = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        rSTableMetro1 = new rojeru_san.complementos.RSTableMetro();
        panelLineChart = new javax.swing.JPanel();
        panelBarChart = new javax.swing.JPanel();
        histogram = new javax.swing.JPanel();
        notification = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        productname = new javax.swing.JTextField();
        quantity = new javax.swing.JTextField();
        totalprice = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 250, 250));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 750));

        jPanel2.setBackground(new java.awt.Color(204, 0, 52));
        jPanel2.setPreferredSize(new java.awt.Dimension(1200, 70));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 242, 242));
        jLabel1.setText("InnovativeDevelopers");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 20, -1, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/male_user_50px.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 10, 50, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_menu_48px_1.png"))); // NOI18N
        jLabel4.setText("jLabel1");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 50, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 47)); // NOI18N
        jLabel5.setText("l");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, 60));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search_26px.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 30, 30, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/group_message_26px.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 30, 30, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 47)); // NOI18N
        jLabel8.setText("l");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, -1, 60));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 47)); // NOI18N
        jLabel9.setText("l");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, -1, 60));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(242, 242, 242));
        jLabel11.setText("Admin");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 10, 80, 50));

        noti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/notification.jpg"))); // NOI18N
        noti.setText("badgeButton1");
        noti.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                notiMouseClicked(evt);
            }
        });
        noti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notiActionPerformed(evt);
            }
        });
        jPanel2.add(noti, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 20, 30, 40));

        jPanel3.setBackground(new java.awt.Color(255, 250, 250));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setPreferredSize(new java.awt.Dimension(250, 700));

        theme.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        theme.setForeground(new java.awt.Color(51, 51, 51));
        theme.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        theme.setText("Dark Mode");
        theme.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        theme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                themeMouseClicked(evt);
            }
        });

        theme_icon.setBackground(new java.awt.Color(51, 51, 51));
        theme_icon.setForeground(new java.awt.Color(255, 255, 255));
        theme_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Moon Symbol white.png"))); // NOI18N
        theme_icon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jPanel14.setBackground(new java.awt.Color(255, 127, 80));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Home");
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel13.setBackground(new java.awt.Color(255, 127, 80));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Analysis");
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel15.setBackground(new java.awt.Color(255, 127, 80));
        jPanel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel15MouseClicked(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Logout");
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel16.setBackground(new java.awt.Color(255, 127, 80));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Manage Users");
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel19.setBackground(new java.awt.Color(255, 127, 80));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Manage Sellers");
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel30MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(jLabel30)
                .addGap(65, 65, 65))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(theme_icon)
                .addGap(34, 34, 34)
                .addComponent(theme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(113, 113, 113))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(182, Short.MAX_VALUE)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(theme_icon)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(theme, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addGap(94, 94, 94))
        );

        mother_panel.setBackground(new java.awt.Color(255, 250, 250));
        mother_panel.setPreferredSize(new java.awt.Dimension(950, 700));
        mother_panel.setLayout(new java.awt.CardLayout());

        home.setBackground(new java.awt.Color(255, 250, 250));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.setPreferredSize(new java.awt.Dimension(210, 150));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setText("Total Views");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("10.3M");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(0, 33, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel19))
                    .addGap(0, 33, Short.MAX_VALUE)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(0, 36, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 37, Short.MAX_VALUE)))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.setPreferredSize(new java.awt.Dimension(210, 150));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Total Views");
        jPanel8.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 122, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("10.3M");
        jPanel8.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, 50));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel9.setPreferredSize(new java.awt.Dimension(210, 150));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setText("New User Today");
        jPanel9.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 150, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("2.38K");
        jPanel9.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 130, 55));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 204, 51));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("12%");
        jPanel9.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 40, 20));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.setPreferredSize(new java.awt.Dimension(210, 150));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setText("Todays Sale");
        jPanel10.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 122, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("25.4K(tk)");
        jPanel10.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, 55));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 0, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("5%");
        jPanel10.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 30, 20));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel11.setPreferredSize(new java.awt.Dimension(950, 63));

        jLabel2.setBackground(new java.awt.Color(255, 255, 250));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Website Overview");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel27.setBackground(new java.awt.Color(255, 250, 250));
        jPanel27.setPreferredSize(new java.awt.Dimension(950, 430));

        slideshow_mother_panel.setPreferredSize(new java.awt.Dimension(900, 450));
        slideshow_mother_panel.setLayout(new java.awt.CardLayout());

        slide3.setBackground(new java.awt.Color(0, 101, 110));
        slide3.setPreferredSize(new java.awt.Dimension(873, 450));

        jPanel20.setBackground(new java.awt.Color(174, 243, 89));

        jLabel59.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText("HDD Usage");

        jLabel60.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setText("Free Space");

        jLabel61.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setText("Used Space");

        jLabel62.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setText("382GB");

        jLabel63.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setText("126GB");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel59)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel61)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addComponent(jLabel63))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel60)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel62))))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(jLabel62))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61)
                    .addComponent(jLabel63))
                .addGap(0, 22, Short.MAX_VALUE))
        );

        jPanel21.setBackground(new java.awt.Color(220, 177, 134));

        jLabel64.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setText("Deliveries Shipped");

        jLabel65.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setText("Today");

        jLabel66.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setText("Last Day");

        jLabel67.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setText("12");

        jLabel68.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setText("49");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel65)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel67)
                        .addGap(9, 9, 9))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addComponent(jLabel66)
                                .addGap(108, 108, 108)
                                .addComponent(jLabel68))
                            .addComponent(jLabel64))
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel65)
                    .addComponent(jLabel67))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel66)
                    .addComponent(jLabel68))
                .addGap(0, 22, Short.MAX_VALUE))
        );

        jPanel22.setBackground(new java.awt.Color(255, 153, 51));

        jLabel69.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setText("Task Progress");

        jLabel70.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(255, 255, 255));
        jLabel70.setText("Completed");

        jLabel71.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(255, 255, 255));
        jLabel71.setText("Total");

        jLabel72.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(255, 255, 255));
        jLabel72.setText("12");

        jLabel73.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(255, 255, 255));
        jLabel73.setText("120");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel71)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                        .addComponent(jLabel73))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel69)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel70)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel72))))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel70)
                    .addComponent(jLabel72))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel71)
                    .addComponent(jLabel73))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel23.setBackground(new java.awt.Color(51, 102, 255));

        jLabel74.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(255, 255, 255));
        jLabel74.setText("Earning");

        jLabel75.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(255, 255, 255));
        jLabel75.setText("Today");

        jLabel76.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(255, 255, 255));
        jLabel76.setText("Last Day");

        jLabel77.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(255, 255, 255));
        jLabel77.setText("382GB");

        jLabel78.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(255, 255, 255));
        jLabel78.setText("126GB");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jLabel74)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jLabel76)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                        .addComponent(jLabel78))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jLabel75)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel77))))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel75)
                    .addComponent(jLabel77))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel76)
                    .addComponent(jLabel78))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel24.setBackground(new java.awt.Color(255, 0, 255));

        jLabel79.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(255, 255, 255));
        jLabel79.setText("Sales");

        jLabel80.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(255, 255, 255));
        jLabel80.setText("Today");

        jLabel81.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(255, 255, 255));
        jLabel81.setText("Last Day");

        jLabel82.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(255, 255, 255));
        jLabel82.setText("$122");

        jLabel83.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(255, 255, 255));
        jLabel83.setText("$12343");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel79)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel81)
                            .addComponent(jLabel80))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel82, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel83, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel80)
                    .addComponent(jLabel82))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel81)
                    .addComponent(jLabel83))
                .addGap(0, 22, Short.MAX_VALUE))
        );

        jPanel25.setBackground(new java.awt.Color(102, 78, 108));

        jLabel84.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(255, 255, 255));
        jLabel84.setText("App Download");

        jLabel85.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(255, 255, 255));
        jLabel85.setText("Today");

        jLabel86.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(255, 255, 255));
        jLabel86.setText("Last Day");

        jLabel87.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel87.setForeground(new java.awt.Color(255, 255, 255));
        jLabel87.setText("1.09K");

        jLabel88.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(255, 255, 255));
        jLabel88.setText("49M");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jLabel85)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel87))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addComponent(jLabel86)
                                .addGap(108, 108, 108)
                                .addComponent(jLabel88))
                            .addComponent(jLabel84))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel85)
                    .addComponent(jLabel87))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel86)
                    .addComponent(jLabel88))
                .addGap(0, 22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout slide3Layout = new javax.swing.GroupLayout(slide3);
        slide3.setLayout(slide3Layout);
        slide3Layout.setHorizontalGroup(
            slide3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, slide3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(slide3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(slide3Layout.createSequentialGroup()
                        .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(slide3Layout.createSequentialGroup()
                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(59, 59, 59)
                .addGroup(slide3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );
        slide3Layout.setVerticalGroup(
            slide3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(slide3Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(slide3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(49, 49, 49)
                .addGroup(slide3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        slideshow_mother_panel.add(slide3, "card3");

        slide2.setBackground(new java.awt.Color(108, 91, 123));
        slide2.setPreferredSize(new java.awt.Dimension(873, 450));
        slide2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                slide2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                slide2MouseExited(evt);
            }
        });

        jPanel26.setBackground(new java.awt.Color(51, 153, 255));
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel51.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("23");
        jPanel26.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 60, 50));

        jLabel52.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("Tasks");
        jPanel26.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 90, 40));

        jPanel28.setBackground(new java.awt.Color(0, 153, 153));
        jPanel28.setForeground(new java.awt.Color(255, 255, 255));
        jPanel28.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("182");
        jPanel28.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, 40));

        jLabel48.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("Clients");
        jPanel28.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 110, 40));

        jPanel29.setBackground(new java.awt.Color(204, 0, 255));
        jPanel29.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("325");
        jPanel29.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, 40));

        jLabel50.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("Servers");
        jPanel29.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 110, 40));

        jPanel30.setBackground(new java.awt.Color(153, 153, 0));
        jPanel30.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("402");
        jPanel30.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 90, 50));

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Delivered");
        jPanel30.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 140, 40));

        jPanel31.setBackground(new java.awt.Color(51, 255, 0));
        jPanel31.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel53.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("5204");
        jPanel31.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 150, 80));

        jLabel57.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("Daily Visits");
        jPanel31.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 170, 40));

        jLabel54.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("+12% more than last day");
        jPanel31.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 60));

        jPanel32.setBackground(new java.awt.Color(0, 102, 102));
        jPanel32.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("120");
        jPanel32.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 120, 70));

        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("Pending ");
        jPanel32.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 150, 40));

        jLabel58.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setText("Deliveries ");
        jPanel32.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, 40));

        jPanel33.setBackground(new java.awt.Color(153, 33, 72));
        jPanel33.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel89.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(255, 255, 255));
        jLabel89.setText("350");
        jPanel33.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 120, 80));

        jLabel90.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(255, 255, 255));
        jLabel90.setText("New Clients");
        jPanel33.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, 40));

        javax.swing.GroupLayout slide2Layout = new javax.swing.GroupLayout(slide2);
        slide2.setLayout(slide2Layout);
        slide2Layout.setHorizontalGroup(
            slide2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(slide2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(slide2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, slide2Layout.createSequentialGroup()
                        .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, slide2Layout.createSequentialGroup()
                        .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        slide2Layout.setVerticalGroup(
            slide2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(slide2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(slide2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(slide2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(slide2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(slide2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        slideshow_mother_panel.add(slide2, "card3");

        slide1.setBackground(new java.awt.Color(255, 255, 255));
        slide1.setMinimumSize(new java.awt.Dimension(873, 450));
        slide1.setPreferredSize(new java.awt.Dimension(900, 450));
        slide1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                slide1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                slide1MouseExited(evt);
            }
        });
        slide1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Total Profit:");
        slide1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 180, 80));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Today's Sales Overview");
        slide1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 400, 140));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Active Items:");
        slide1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 190, 90));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        profit.setBackground(new java.awt.Color(37, 150, 190));
        profit.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        profit.setForeground(new java.awt.Color(37, 150, 190));
        profit.setText("145,110");

        profit1.setBackground(new java.awt.Color(37, 150, 190));
        profit1.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        profit1.setForeground(new java.awt.Color(37, 150, 190));
        profit1.setText("$");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(profit1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(profit, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(profit, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(profit1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        slide1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, 130, 40));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Expenses:");
        slide1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 150, 90));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Items Sold:");
        slide1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 170, 90));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        expenses.setBackground(new java.awt.Color(37, 150, 190));
        expenses.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        expenses.setForeground(new java.awt.Color(255, 0, 0));
        expenses.setText("31,190");

        profit2.setBackground(new java.awt.Color(37, 150, 190));
        profit2.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        profit2.setForeground(new java.awt.Color(37, 150, 190));
        profit2.setText("$");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(profit2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(expenses, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(expenses, javax.swing.GroupLayout.PREFERRED_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(profit2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        slide1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 290, 130, 40));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        items_sold.setBackground(new java.awt.Color(37, 150, 190));
        items_sold.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        items_sold.setForeground(new java.awt.Color(37, 150, 190));
        items_sold.setText("3119");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(items_sold, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(items_sold, javax.swing.GroupLayout.PREFERRED_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        slide1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 90, 40));

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));

        active_items.setBackground(new java.awt.Color(37, 150, 190));
        active_items.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        active_items.setForeground(new java.awt.Color(37, 150, 190));
        active_items.setText("4510");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(active_items, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(active_items, javax.swing.GroupLayout.PREFERRED_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        slide1.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 90, 40));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/plain-blue-dmlktw5iuzdjvb7j.jpg"))); // NOI18N
        jLabel27.setMaximumSize(new java.awt.Dimension(700, 400));
        jLabel27.setMinimumSize(new java.awt.Dimension(700, 400));
        jLabel27.setPreferredSize(new java.awt.Dimension(900, 450));
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel27MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel27MouseExited(evt);
            }
        });
        slide1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, -1));

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(slide1, javax.swing.GroupLayout.PREFERRED_SIZE, 1348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(slideshow_mother_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 873, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(slide1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(slideshow_mother_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 250));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        debug.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        debug.setText("Big Sales Day in");
        debug.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel32.setText("Hour");

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel35.setText("6");
        jLabel35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel36.setText("Day");

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel37.setText("22");
        jLabel37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel38.setText("45");
        jLabel38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel39.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel39.setText("Minute");

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel40.setText("13");
        jLabel40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel41.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel41.setText("Second");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(debug, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel37)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel38))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel32)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel39)))
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel40)
                    .addComponent(jLabel41))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(debug, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel35)
                                .addComponent(jLabel37)
                                .addComponent(jLabel38)))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout homeLayout = new javax.swing.GroupLayout(home);
        home.setLayout(homeLayout);
        homeLayout.setHorizontalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeLayout.createSequentialGroup()
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, 990, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(homeLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(homeLayout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(homeLayout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        homeLayout.setVerticalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeLayout.createSequentialGroup()
                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE))
        );

        mother_panel.add(home, "card2");

        analysis.setBackground(new java.awt.Color(255, 250, 250));
        analysis.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSTableMetro1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"10212", "Iphone 15", "23", "$23,434"},
                {"12323", "AWB Headset", "43", "$2333"},
                {"13213", "Moslin Saree", "54", "$1243"},
                {"43432", "Moto G", "12", "$123,434"},
                {"54353", "BikeX", "45", "$223,434"},
                {"43534", "Samsung A34", "31", "$23,434"},
                {"23423", "Realme Narzo", "40", "$3123"},
                {"43324", "Neckband", "10", "$231"}
            },
            new String [] {
                "Product ID", "Product Name", "Quantity Sold", "Total Revenue"
            }
        ));
        rSTableMetro1.setColorBackgoundHead(new java.awt.Color(204, 0, 51));
        rSTableMetro1.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        rSTableMetro1.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        rSTableMetro1.setFuenteFilas(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rSTableMetro1.setFuenteFilasSelect(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rSTableMetro1.setFuenteHead(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rSTableMetro1.setRowHeight(24);
        jScrollPane2.setViewportView(rSTableMetro1);

        analysis.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 530, 240));

        panelLineChart.setBackground(new java.awt.Color(255, 250, 250));
        panelLineChart.setPreferredSize(new java.awt.Dimension(250, 200));
        panelLineChart.setLayout(new java.awt.BorderLayout());
        analysis.add(panelLineChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, 430, 280));

        panelBarChart.setBackground(new java.awt.Color(255, 250, 250));
        panelBarChart.setLayout(new java.awt.BorderLayout());
        analysis.add(panelBarChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 450, 280));

        histogram.setBackground(new java.awt.Color(255, 250, 250));
        histogram.setPreferredSize(new java.awt.Dimension(250, 200));
        histogram.setLayout(new java.awt.BorderLayout());
        analysis.add(histogram, new org.netbeans.lib.awtextra.AbsoluteConstraints(554, 376, 390, 240));

        mother_panel.add(analysis, "card2");

        notification.setBackground(new java.awt.Color(255, 250, 250));

        jLabel55.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel55.setText("Product Name:");

        jLabel56.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel56.setText("Quantity");

        jLabel92.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel92.setText("Customer Email");

        jLabel94.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel94.setText("Phone Number");

        jLabel96.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel96.setText("Location");

        jLabel98.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel98.setText("Total Price");

        productname.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        productname.setText("jTextField1");

        quantity.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        quantity.setText("jTextField1");

        totalprice.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        totalprice.setText("jTextField1");

        email.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        email.setText("jTextField1");

        jTextField5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextField5.setText("Not available now");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jTextField6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextField6.setText("not abailable");

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Quantity Ordered", "Price", "User_Email"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Send For Delivery");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout notificationLayout = new javax.swing.GroupLayout(notification);
        notification.setLayout(notificationLayout);
        notificationLayout.setHorizontalGroup(
            notificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(notificationLayout.createSequentialGroup()
                .addGroup(notificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(notificationLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(notificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(notificationLayout.createSequentialGroup()
                                .addGroup(notificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel94, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                    .addComponent(jLabel96, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(notificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                    .addComponent(jTextField6)))
                            .addGroup(notificationLayout.createSequentialGroup()
                                .addGroup(notificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel92, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                    .addComponent(jLabel98, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(notificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(productname, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                    .addComponent(quantity)
                                    .addComponent(totalprice)
                                    .addComponent(email, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(35, 35, 35))
                    .addGroup(notificationLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        notificationLayout.setVerticalGroup(
            notificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(notificationLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(notificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(notificationLayout.createSequentialGroup()
                        .addGroup(notificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productname, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(notificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(notificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalprice, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(notificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(notificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(notificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(95, 95, 95)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(225, Short.MAX_VALUE))
        );

        mother_panel.add(notification, "card2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(mother_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mother_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    int sz = 250;
    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        if(sz==250)
        {
            jPanel3.setSize(255,700);
            Thread slide=new Thread(){
            public void run(){
        try{
            for(int i=250;i>=0;i--){
            Thread.sleep(1);
            jPanel3.setSize(i,700);
                }
            }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
                }   
            }
        };slide.start();
        sz=0;
        }
        else
        {
            jPanel3.show();
            jPanel3.setSize(250, 700);
            Thread slide=new Thread(){
        public void run(){
            try{
                for(int i=0;i<=250;i++){
                    Thread.sleep(1);
                    jPanel3.setSize(i,700);
                }
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        }
    }
    };slide.start();
    sz=250; 
        }
    }//GEN-LAST:event_jLabel4MouseClicked

    int flg = 1;
    private void themeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_themeMouseClicked
        // TODO add your handling code here:
        if(flg == 0)
        {
            theme.setText("Dark Mode");
            theme_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/sun.png")));
            File selectedImageFIle = new File("D:\\Java swing\\icons_mysqlConnector\\icons\\blue.jpg");
            String SelectedImagePath = selectedImageFIle.getAbsolutePath();
            ImageIcon ic = new ImageIcon(SelectedImagePath);
            Image image = ic.getImage().getScaledInstance(jLabel27.getWidth(), jLabel27.getHeight(), Image.SCALE_SMOOTH);
            jLabel27.setIcon(new ImageIcon(image));
            
            theme.setForeground(new java.awt.Color(51, 51, 51));
            jLabel2.setForeground(new java.awt.Color(51, 51, 51));
            jLabel12.setForeground(new java.awt.Color(51, 51, 51));
            jLabel13.setForeground(new java.awt.Color(51, 51, 51));
            jLabel14.setForeground(new java.awt.Color(51, 51, 51));
            jLabel15.setForeground(new java.awt.Color(51, 51, 51));
            jLabel16.setForeground(new java.awt.Color(51, 51, 51));
            jLabel17.setForeground(new java.awt.Color(51, 51, 51));
            jLabel18.setForeground(new java.awt.Color(51, 51, 51));
            jLabel19.setForeground(new java.awt.Color(51, 51, 51));
            
            debug.setForeground(new java.awt.Color(51, 51, 51));
            jLabel32.setForeground(new java.awt.Color(51, 51, 51));
            jLabel35.setForeground(new java.awt.Color(51, 51, 51));
            jLabel36.setForeground(new java.awt.Color(51, 51, 51));
            jLabel37.setForeground(new java.awt.Color(51, 51, 51));
            jLabel38.setForeground(new java.awt.Color(51, 51, 51));
            jLabel39.setForeground(new java.awt.Color(51, 51, 51));
            jLabel40.setForeground(new java.awt.Color(51, 51, 51));
            jLabel41.setForeground(new java.awt.Color(51, 51, 51));
            
            jLabel22.setForeground(new java.awt.Color(255, 255, 255));
            jLabel23.setForeground(new java.awt.Color(255, 255, 255));
            jLabel24.setForeground(new java.awt.Color(255, 255, 255));
            jLabel25.setForeground(new java.awt.Color(255, 255, 255));
//            jLabel26.setForeground(new java.awt.Color(255, 255, 255));
            jLabel30.setForeground(new java.awt.Color(255, 255, 255));
            Thread th4=new Thread(){
            public void run(){
        try{
            
            jPanel3.setBackground(new java.awt.Color(51, 51, 51));
            jPanel4.setBackground(new java.awt.Color(51, 51, 51));
            jPanel7.setBackground(new java.awt.Color(51, 51, 51));
            jPanel8.setBackground(new java.awt.Color(51, 51, 51));
            jPanel9.setBackground(new java.awt.Color(51, 51, 51));
            jPanel10.setBackground(new java.awt.Color(51, 51, 51));
            jPanel11.setBackground(new java.awt.Color(51, 51, 51));
            jPanel27.setBackground(new java.awt.Color(51, 51, 51));
            jPanel13.setBackground(new java.awt.Color(51, 51, 51));
            jPanel14.setBackground(new java.awt.Color(51, 51, 51));
            jPanel16.setBackground(new java.awt.Color(51, 51, 51));
//            jPanel17.setBackground(new java.awt.Color(51, 51, 51));
            jPanel19.setBackground(new java.awt.Color(51, 51, 51));
            jPanel15.setBackground(new java.awt.Color(51, 51, 51));
            home.setBackground(new java.awt.Color(51, 51, 51));
            analysis.setBackground(new java.awt.Color(51, 51, 51));
            Thread.sleep(35);
            jPanel4.setBackground(new java.awt.Color(102, 102, 102));
            jPanel7.setBackground(new java.awt.Color(102, 102, 102));
            jPanel8.setBackground(new java.awt.Color(102, 102, 102));
            jPanel9.setBackground(new java.awt.Color(102, 102, 102));
            jPanel10.setBackground(new java.awt.Color(102, 102, 102));
            jPanel11.setBackground(new java.awt.Color(102, 102, 102));
            jPanel27.setBackground(new java.awt.Color(102, 102, 102));
            jPanel13.setBackground(new java.awt.Color(102, 102, 102));
            jPanel14.setBackground(new java.awt.Color(102, 102, 102));
            jPanel3.setBackground(new java.awt.Color(102, 102, 102));
            analysis.setBackground(new java.awt.Color(102, 102, 102));
            jPanel16.setBackground(new java.awt.Color(102, 102, 102));
            //jPanel17.setBackground(new java.awt.Color(102, 102, 102));
            jPanel19.setBackground(new java.awt.Color(102, 102, 102));
            home.setBackground(new java.awt.Color(102, 102, 102));
            jPanel15.setBackground(new java.awt.Color(102, 102, 102));
            Thread.sleep(35);
            jPanel4.setBackground(new java.awt.Color(153, 153, 153));
            jPanel7.setBackground(new java.awt.Color(153, 153, 153));
            jPanel8.setBackground(new java.awt.Color(153, 153, 153));
            jPanel9.setBackground(new java.awt.Color(153, 153, 153));
            jPanel10.setBackground(new java.awt.Color(153, 153, 153));
            jPanel11.setBackground(new java.awt.Color(153, 153, 153));
            jPanel27.setBackground(new java.awt.Color(153, 153, 153));
            jPanel13.setBackground(new java.awt.Color(153, 153, 153));
            jPanel14.setBackground(new java.awt.Color(153, 153, 153));
            jPanel3.setBackground(new java.awt.Color(153, 153, 153));
            jPanel16.setBackground(new java.awt.Color(153, 153, 153));
//            jPanel17.setBackground(new java.awt.Color(153, 153, 153));
            jPanel15.setBackground(new java.awt.Color(153, 153, 153));
            jPanel19.setBackground(new java.awt.Color(153, 153, 153));
            home.setBackground(new java.awt.Color(153, 153, 153));
            analysis.setBackground(new java.awt.Color(153, 153, 153));
            Thread.sleep(35);
            jPanel4.setBackground(new java.awt.Color(204, 204, 204));
            jPanel7.setBackground(new java.awt.Color(204, 204, 204));
            jPanel8.setBackground(new java.awt.Color(204, 204, 204));
            jPanel9.setBackground(new java.awt.Color(204, 204, 204));
            jPanel10.setBackground(new java.awt.Color(204, 204, 204));
            jPanel11.setBackground(new java.awt.Color(204, 204, 204));
            jPanel27.setBackground(new java.awt.Color(204, 204, 204));
            jPanel13.setBackground(new java.awt.Color(204, 204, 204));
            jPanel14.setBackground(new java.awt.Color(204, 204, 204));
            jPanel3.setBackground(new java.awt.Color(204, 204, 204));
            jPanel16.setBackground(new java.awt.Color(204, 204, 204));
//            jPanel17.setBackground(new java.awt.Color(204, 204, 204));
            jPanel15.setBackground(new java.awt.Color(204, 204, 204));
            jPanel19.setBackground(new java.awt.Color(204, 204, 204));
            home.setBackground(new java.awt.Color(204, 204, 204));
            analysis.setBackground(new java.awt.Color(204, 204, 204));
            Thread.sleep(35);
            jPanel4.setBackground(new java.awt.Color(255, 250, 250));
            jPanel7.setBackground(new java.awt.Color(255, 250, 250));
            jPanel8.setBackground(new java.awt.Color(255, 250, 250));
            jPanel9.setBackground(new java.awt.Color(255, 250, 250));
            jPanel10.setBackground(new java.awt.Color(255, 250, 250));
            jPanel11.setBackground(new java.awt.Color(255, 250, 250));
            jPanel27.setBackground(new java.awt.Color(255, 250, 250));
            jPanel13.setBackground(new java.awt.Color(255, 250, 250));
            jPanel14.setBackground(new java.awt.Color(255, 250,  250 ));
            jPanel3.setBackground(new java.awt.Color(255, 250, 250));
            jPanel16.setBackground(new java.awt.Color(255, 255, 255));
//            jPanel17.setBackground(new java.awt.Color(255, 255, 255));
            jPanel15.setBackground(new java.awt.Color(255, 255, 255));
            jPanel19.setBackground(new java.awt.Color(255, 255, 255));
            home.setBackground(new java.awt.Color(255, 255, 255));
            analysis.setBackground(new java.awt.Color(255, 250, 250));
            jPanel1.setBackground(new java.awt.Color(255, 250, 250));
            
            jPanel13.setBackground(new java.awt.Color(255, 127, 80));
            jPanel14.setBackground(new java.awt.Color(255, 127,  80 ));
            jPanel16.setBackground(new java.awt.Color(255, 127, 80));
//            jPanel17.setBackground(new java.awt.Color(255, 127, 80));
            jPanel15.setBackground(new java.awt.Color(255, 127, 80));
            jPanel19.setBackground(new java.awt.Color(255, 127, 80));
            
            
            }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
                }   
            }
        };th4.start();
        flg = 1;
        }
        else
        {
            theme.setText("Light Mode");
            File selectedImageFIle = new File("D:\\Java swing\\icons_mysqlConnector\\icons\\black.jpg");
            String SelectedImagePath = selectedImageFIle.getAbsolutePath();
            ImageIcon ic = new ImageIcon(SelectedImagePath);
            Image image = ic.getImage().getScaledInstance(jLabel27.getWidth(), jLabel27.getHeight(), Image.SCALE_SMOOTH);
            jLabel27.setIcon(new ImageIcon(image));
            theme_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Moon Symbol white.png")));
            theme.setForeground(new java.awt.Color(255, 250, 250));
            jLabel2.setForeground(new java.awt.Color(255, 250, 250));
            jLabel12.setForeground(new java.awt.Color(255, 250, 250));
            jLabel13.setForeground(new java.awt.Color(255, 250, 250));
            jLabel14.setForeground(new java.awt.Color(255, 250, 250));
            jLabel15.setForeground(new java.awt.Color(255, 250, 250));
            jLabel16.setForeground(new java.awt.Color(255, 250, 250));
            jLabel17.setForeground(new java.awt.Color(255, 250, 250));
            jLabel18.setForeground(new java.awt.Color(255, 250, 250));
            jLabel19.setForeground(new java.awt.Color(255, 250, 250));
            
            debug.setForeground(new java.awt.Color(255, 250, 250));
            jLabel32.setForeground(new java.awt.Color(255, 250, 250));
            jLabel35.setForeground(new java.awt.Color(255, 250, 250));
            jLabel36.setForeground(new java.awt.Color(255, 250, 250));
            jLabel37.setForeground(new java.awt.Color(255, 250, 250));
            jLabel38.setForeground(new java.awt.Color(255, 250, 250));
            jLabel39.setForeground(new java.awt.Color(255, 250, 250));
            jLabel40.setForeground(new java.awt.Color(255, 250, 250));
            jLabel41.setForeground(new java.awt.Color(255, 250, 250));
            
            jLabel22.setForeground(new java.awt.Color(0, 255, 255));
            jLabel23.setForeground(new java.awt.Color(0, 255, 255));
            jLabel24.setForeground(new java.awt.Color(0, 255, 255));
            jLabel25.setForeground(new java.awt.Color(0, 255, 255));
//            jLabel26.setForeground(new java.awt.Color(0, 255, 255));
            jLabel30.setForeground(new java.awt.Color(0, 255, 255));
            Thread th4=new Thread(){
            public void run(){
        try{
            jPanel4.setBackground(new java.awt.Color(255, 255, 255));
            jPanel7.setBackground(new java.awt.Color(255, 255, 255));
            jPanel8.setBackground(new java.awt.Color(255, 255, 255));
            jPanel9.setBackground(new java.awt.Color(255, 255, 255));
            jPanel10.setBackground(new java.awt.Color(255, 255, 255));
            jPanel11.setBackground(new java.awt.Color(255, 255, 255));
            jPanel27.setBackground(new java.awt.Color(255, 255, 255));
            jPanel3.setBackground(new java.awt.Color(255, 255, 255));
            jPanel13.setBackground(new java.awt.Color(255, 255, 255));
            jPanel14.setBackground(new java.awt.Color(255, 255, 255));
            jPanel16.setBackground(new java.awt.Color(255, 255, 255));
//            jPanel17.setBackground(new java.awt.Color(255, 255, 255));
            jPanel15.setBackground(new java.awt.Color(255, 255, 255));
            jPanel19.setBackground(new java.awt.Color(255, 255, 255));
            home.setBackground(new java.awt.Color(255, 255, 255));
            analysis.setBackground(new java.awt.Color(255, 255, 255));
            Thread.sleep(35);
            jPanel4.setBackground(new java.awt.Color(204, 204, 204));
            jPanel7.setBackground(new java.awt.Color(204, 204, 204));
            jPanel8.setBackground(new java.awt.Color(204, 204, 204));
            jPanel9.setBackground(new java.awt.Color(204, 204, 204));
            jPanel10.setBackground(new java.awt.Color(204, 204, 204));
            jPanel11.setBackground(new java.awt.Color(204, 204, 204));
            jPanel27.setBackground(new java.awt.Color(204, 204, 204));
            jPanel3.setBackground(new java.awt.Color(204, 204, 204));
            jPanel13.setBackground(new java.awt.Color(204, 204, 204));
            jPanel14.setBackground(new java.awt.Color(204, 204, 204));
            jPanel16.setBackground(new java.awt.Color(204, 204, 204));
//            jPanel17.setBackground(new java.awt.Color(204, 204, 204));
            jPanel15.setBackground(new java.awt.Color(204, 204, 204));
            jPanel19.setBackground(new java.awt.Color(204, 204, 204));
            home.setBackground(new java.awt.Color(204, 204, 204));
            analysis.setBackground(new java.awt.Color(204, 204, 204));
            Thread.sleep(35);
            jPanel4.setBackground(new java.awt.Color(153, 153, 153));
            jPanel7.setBackground(new java.awt.Color(153, 153, 153));
            jPanel8.setBackground(new java.awt.Color(153, 153, 153));
            jPanel9.setBackground(new java.awt.Color(153, 153, 153));
            jPanel10.setBackground(new java.awt.Color(153, 153, 153));
            jPanel11.setBackground(new java.awt.Color(153, 153, 153));
            jPanel27.setBackground(new java.awt.Color(153, 153, 153));
            jPanel3.setBackground(new java.awt.Color(153,153, 153));
            jPanel13.setBackground(new java.awt.Color(153, 153, 153));
            jPanel14.setBackground(new java.awt.Color(153, 102, 153));
            jPanel16.setBackground(new java.awt.Color(153, 153, 153));
//            jPanel17.setBackground(new java.awt.Color(153, 153, 153));
            jPanel15.setBackground(new java.awt.Color(153, 153, 153));
            jPanel19.setBackground(new java.awt.Color(153, 153, 153));
            home.setBackground(new java.awt.Color(153, 153, 153));
            analysis.setBackground(new java.awt.Color(153,153, 153));
            Thread.sleep(35);
            jPanel4.setBackground(new java.awt.Color(102, 102, 102));
            jPanel7.setBackground(new java.awt.Color(102, 102, 102));
            jPanel8.setBackground(new java.awt.Color(102, 102, 102));
            jPanel9.setBackground(new java.awt.Color(102, 102, 102));
            jPanel10.setBackground(new java.awt.Color(102, 102, 102));
            jPanel11.setBackground(new java.awt.Color(102, 102, 102));
            jPanel27.setBackground(new java.awt.Color(102, 102, 102));
            jPanel3.setBackground(new java.awt.Color(102, 102, 102));
            jPanel13.setBackground(new java.awt.Color(102, 102, 102));
            jPanel14.setBackground(new java.awt.Color(102, 102, 102));
            jPanel16.setBackground(new java.awt.Color(102, 102, 102));
//            jPanel17.setBackground(new java.awt.Color(102, 102, 102));
            jPanel15.setBackground(new java.awt.Color(102, 102, 102));
            jPanel19.setBackground(new java.awt.Color(102, 102, 102));
            home.setBackground(new java.awt.Color(102, 102, 102));
            analysis.setBackground(new java.awt.Color(102, 102, 102));
            Thread.sleep(35);
            jPanel4.setBackground(new java.awt.Color(51, 51, 51));
            jPanel7.setBackground(new java.awt.Color(51, 51, 51));
            jPanel8.setBackground(new java.awt.Color(51, 51, 51));
            jPanel9.setBackground(new java.awt.Color(51, 51, 51));
            jPanel10.setBackground(new java.awt.Color(51, 51, 51));
            jPanel11.setBackground(new java.awt.Color(51, 51, 51));
            jPanel27.setBackground(new java.awt.Color(51, 51, 51));
            jPanel3.setBackground(new java.awt.Color(51, 51, 51));
            jPanel13.setBackground(new java.awt.Color(51, 51, 51));
            jPanel14.setBackground(new java.awt.Color(51, 51, 51));
            analysis.setBackground(new java.awt.Color(51, 51, 51));
            jPanel16.setBackground(new java.awt.Color(51, 51, 51));
//            jPanel17.setBackground(new java.awt.Color(51, 51, 51));
            jPanel15.setBackground(new java.awt.Color(51, 51, 51));
            jPanel19.setBackground(new java.awt.Color(51, 51, 51));
            home.setBackground(new java.awt.Color(51, 51, 51));
            jPanel1.setBackground(new java.awt.Color(51, 51, 51));
            
            home.setBackground(new java.awt.Color(0, 0, 0));
            
            jPanel16.setBackground(new java.awt.Color(0, 0, 0));
//            jPanel17.setBackground(new java.awt.Color(0, 0, 0));
            jPanel13.setBackground(new java.awt.Color(0, 0, 0));
            jPanel14.setBackground(new java.awt.Color(0, 0, 0));
            jPanel15.setBackground(new java.awt.Color(0, 0, 0));
            jPanel19.setBackground(new java.awt.Color(0, 0, 0));
            
            }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
                }   
            }
        };th4.start();
            flg = 0;
        }
        
        
    }//GEN-LAST:event_themeMouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        // TODO add your handling code here:
        mother_panel.removeAll();
        mother_panel.repaint();
        mother_panel.revalidate();

        mother_panel.add(home);
        mother_panel.repaint();
        mother_panel.revalidate();
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        // TODO add your handling code here:
        mother_panel.removeAll();
        mother_panel.repaint();
        mother_panel.revalidate();

        mother_panel.add(analysis);
        mother_panel.repaint();
        mother_panel.revalidate();
        
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        // TODO add your handling code here:
        new firstlogin().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel25MouseClicked

    private void slide1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slide1MouseEntered
        // TODO add your handling code here:
  
    }//GEN-LAST:event_slide1MouseEntered

    private void slide1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slide1MouseExited
 
    }//GEN-LAST:event_slide1MouseExited

    private void slide2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slide2MouseEntered

    }//GEN-LAST:event_slide2MouseEntered

    private void slide2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slide2MouseExited

    }//GEN-LAST:event_slide2MouseExited

    private void jLabel27MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseExited

    }//GEN-LAST:event_jLabel27MouseExited

    private void jLabel27MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel27MouseEntered

    private void jLabel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel30MouseClicked

    private void jPanel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel15MouseClicked
        // TODO add your handling code here:
        new firstlogin().setVisible(true);
        dispose();
    }//GEN-LAST:event_jPanel15MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
        productname.setText(table.getValueAt(row, 0).toString());
        totalprice.setText(table.getValueAt(row, 1).toString());
        quantity.setText(table.getValueAt(row, 2).toString());
        email.setText(table.getValueAt(row, 3).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
        
        String product_name = table.getValueAt(row, 0).toString();
        String gmail = table.getValueAt(row, 3).toString();
        try {
            Connection con = (Connection) myconnection.getConnection();
            PreparedStatement ps;
            ps = con.prepareStatement("DELETE from sold_product_info WHERE User_Email = ? and Product_Name = ?");
            ps.setString(1, gmail);
            ps.setString(2, product_name);
            
            ps.execute();
            JOptionPane.showMessageDialog(new JFrame(), "Product out for delivery", "Dialog",
                                    JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(RegisterPage.class.getName()).log(Level.SEVERE, "here", ex);
        }
        table.removeRow(jTable1.getSelectedRow());
        productname.setText("");
        totalprice.setText("");
        email.setText("");
        quantity.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void notiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_notiActionPerformed

    private void notiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notiMouseClicked
        // TODO add your handling code here:
        mother_panel.removeAll();
        mother_panel.repaint();
        mother_panel.revalidate();

        mother_panel.add(notification);
        mother_panel.repaint();
        mother_panel.revalidate();
        fill_the_table();
        
    }//GEN-LAST:event_notiMouseClicked

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
            java.util.logging.Logger.getLogger(admin_interface2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin_interface2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin_interface2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin_interface2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new admin_interface2().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel active_items;
    private javax.swing.JPanel analysis;
    private javax.swing.JLabel debug;
    private javax.swing.JTextField email;
    private javax.swing.JLabel expenses;
    private javax.swing.JPanel histogram;
    private javax.swing.JPanel home;
    private javax.swing.JLabel items_sold;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JPanel mother_panel;
    private customize.BadgeButton noti;
    private javax.swing.JPanel notification;
    private javax.swing.JPanel panelBarChart;
    private javax.swing.JPanel panelLineChart;
    private javax.swing.JTextField productname;
    private javax.swing.JLabel profit;
    private javax.swing.JLabel profit1;
    private javax.swing.JLabel profit2;
    private javax.swing.JTextField quantity;
    private rojeru_san.complementos.RSTableMetro rSTableMetro1;
    private javax.swing.JPanel slide1;
    private javax.swing.JPanel slide2;
    private javax.swing.JPanel slide3;
    private javax.swing.JPanel slideshow_mother_panel;
    private javax.swing.JLabel theme;
    private javax.swing.JLabel theme_icon;
    private javax.swing.JTextField totalprice;
    // End of variables declaration//GEN-END:variables
}
