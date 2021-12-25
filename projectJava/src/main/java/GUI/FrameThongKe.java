/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.BLL_ThongKe;
import DTO.CtPhieuXuat;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;


/**
 *
 * @author ADMIN
 */
public class FrameThongKe extends javax.swing.JPanel {

    BLL_ThongKe bll_thongke = new BLL_ThongKe();
    
     
    public FrameThongKe() {
        initComponents();
        setDataSLPX(jpnSLpx);
        setDataGiaPX(jpnGia);
        
    }
    public ArrayList<String> get7day()
    {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        Calendar c1 = Calendar.getInstance();
        
        Date date = new Date();

        c1.setTime(date);
        
        
        
        ArrayList<String> a = new ArrayList<>();
        a.add(dateFormat.format(c1.getTime()));
        for(int i=0;i<6;i++)
        {
            c1.add(Calendar.DATE, -1);
            
            a.add(dateFormat.format(c1.getTime()));
            
        }
        return a;
    }
    public void setDataSLPX(JPanel jpnItem) {
        ArrayList<String> date = get7day();
//        System.out.println(date.get(1));
        ArrayList<String> maPX0 = bll_thongke.getArrayList(date.get(0));
        ArrayList<String> maPX1 = bll_thongke.getArrayList(date.get(1));
        ArrayList<String> maPX2 = bll_thongke.getArrayList(date.get(2));
        ArrayList<String> maPX3 = bll_thongke.getArrayList(date.get(3));
        ArrayList<String> maPX4 = bll_thongke.getArrayList(date.get(4));
        ArrayList<String> maPX5 = bll_thongke.getArrayList(date.get(5));
        ArrayList<String> maPX6 = bll_thongke.getArrayList(date.get(6));
        int soLuong[] = new int [7];
        if(maPX0.isEmpty())
        {
            soLuong[0]=0;
        }
        else
        {
            for(String i : maPX0)
            {
                soLuong[0] += bll_thongke.getSL(i);
            }
        }
        if(maPX1.isEmpty())
        {
            soLuong[1]=0;
        }
        else
        {
            for(String i : maPX1)
            {
                soLuong[1] += bll_thongke.getSL(i);
            }
        }
        if(maPX2.isEmpty())
        {
            soLuong[2]=0;
        }
        else
        {
            for(String i : maPX2)
            {
                soLuong[2] += bll_thongke.getSL(i);
            }
        }
        if(maPX3.isEmpty())
        {
            soLuong[3]=0;
        }
        else
        {
            for(String i : maPX3)
            {
                soLuong[3] += bll_thongke.getSL(i);
            }
        }
        if(maPX4.isEmpty())
        {
            soLuong[4]=0;
        }
        else
        {
            for(String i : maPX4)
            {
                soLuong[4] += bll_thongke.getSL(i);
            }
        }
        if(maPX5.isEmpty())
        {
            soLuong[5]=0;
        }
        else
        {
            for(String i : maPX5)
            {
                soLuong[5] += bll_thongke.getSL(i);
            }
        }
        if(maPX6.isEmpty())
        {
            soLuong[6]=0;
        }
        else
        {
            for(String i : maPX6)
            {
                soLuong[6] += bll_thongke.getSL(i);
            }
        }
        
        
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        int k=0;
            for (int i =0 ;i < date.size();i++) 
            {
                dataset.addValue(soLuong[k], "Số Lượng" , date.get(i));
                k++;
            }
        

        JFreeChart barChart = ChartFactory.createBarChart(
                "Biểu đồ thống kê số lượng phiếu xuất trong 7 ngày gần nhất".toUpperCase(),
                "Thời gian", "Số lượng",
                dataset, PlotOrientation.VERTICAL, false, true, false);

        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new Dimension(jpnItem.getWidth(), 321));

        jpnItem.removeAll();
        jpnItem.setLayout(new CardLayout());
        jpnItem.add(chartPanel);
        jpnItem.validate();
        jpnItem.repaint();
    }
    public void setDataSLPN(JPanel jpnItem) {
        ArrayList<String> date = get7day();
        
        ArrayList<String> maPX0 = bll_thongke.getArrayListmaPn(date.get(0));
        ArrayList<String> maPX1 = bll_thongke.getArrayListmaPn(date.get(1));
        ArrayList<String> maPX2 = bll_thongke.getArrayListmaPn(date.get(2));
        ArrayList<String> maPX3 = bll_thongke.getArrayListmaPn(date.get(3));
        ArrayList<String> maPX4 = bll_thongke.getArrayListmaPn(date.get(4));
        ArrayList<String> maPX5 = bll_thongke.getArrayListmaPn(date.get(5));
        ArrayList<String> maPX6 = bll_thongke.getArrayListmaPn(date.get(6));
        int soLuong[] = new int [7];
        if(maPX0.isEmpty())
        {
            soLuong[0]=0;
        }
        else
        {
            for(String i : maPX0)
            {
                soLuong[0] += bll_thongke.getSLPN(i);
            }
        }
        if(maPX1.isEmpty())
        {
            soLuong[1]=0;
        }
        else
        {
            for(String i : maPX1)
            {
                soLuong[1] += bll_thongke.getSLPN(i);
            }
        }
        if(maPX2.isEmpty())
        {
            soLuong[2]=0;
        }
        else
        {
            for(String i : maPX2)
            {
                soLuong[2] += bll_thongke.getSLPN(i);
            }
        }
        if(maPX3.isEmpty())
        {
            soLuong[3]=0;
        }
        else
        {
            for(String i : maPX3)
            {
                soLuong[3] += bll_thongke.getSLPN(i);
            }
        }
        if(maPX4.isEmpty())
        {
            soLuong[4]=0;
        }
        else
        {
            for(String i : maPX4)
            {
                soLuong[4] += bll_thongke.getSLPN(i);
            }
        }
        if(maPX5.isEmpty())
        {
            soLuong[5]=0;
        }
        else
        {
            for(String i : maPX5)
            {
                soLuong[5] += bll_thongke.getSLPN(i);
            }
        }
        if(maPX6.isEmpty())
        {
            soLuong[6]=0;
        }
        else
        {
            for(String i : maPX6)
            {
                soLuong[6] += bll_thongke.getSLPN(i);
            }
        }
        
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        int k=0;
            for (int i =0 ;i < date.size();i++) 
            {
                dataset.addValue(soLuong[k], "Số Lượng" , date.get(i));
                k++;
            }
        

        JFreeChart barChart = ChartFactory.createBarChart(
                "Biểu đồ thống kê số lượng phiếu nhập trong 7 ngày gần nhất".toUpperCase(),
                "Thời gian", "Số lượng",
                dataset, PlotOrientation.VERTICAL, false, true, false);

        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new Dimension(jpnItem.getWidth(), 321));

        jpnItem.removeAll();
        jpnItem.setLayout(new CardLayout());
        jpnItem.add(chartPanel);
        jpnItem.validate();
        jpnItem.repaint();
    }

    public void setDataGiaPX(JPanel jpnItem) {
        ArrayList<String> date = get7day();
        
        ArrayList<String> maPX0 = bll_thongke.getArrayList(date.get(0));
        ArrayList<String> maPX1 = bll_thongke.getArrayList(date.get(1));
        ArrayList<String> maPX2 = bll_thongke.getArrayList(date.get(2));
        ArrayList<String> maPX3 = bll_thongke.getArrayList(date.get(3));
        ArrayList<String> maPX4 = bll_thongke.getArrayList(date.get(4));
        ArrayList<String> maPX5 = bll_thongke.getArrayList(date.get(5));
        ArrayList<String> maPX6 = bll_thongke.getArrayList(date.get(6));
        int gia[] = new int [7];
        if(maPX0.isEmpty())
        {
            gia[0]=0;
        }
        else
        {
            for(String i : maPX0)
            {
                gia[0] += bll_thongke.getGia(i);
            }
        }
        if(maPX1.isEmpty())
        {
            gia[1]=0;
        }
        else
        {
            for(String i : maPX1)
            {
                gia[1] += bll_thongke.getGia(i);
            }
        }
        if(maPX2.isEmpty())
        {
            gia[2]=0;
        }
        else
        {
            for(String i : maPX2)
            {
                gia[2] += bll_thongke.getGia(i);
            }
        }
        if(maPX3.isEmpty())
        {
            gia[3]=0;
        }
        else
        {
            for(String i : maPX3)
            {
                gia[3] += bll_thongke.getGia(i);
            }
        }
        if(maPX4.isEmpty())
        {
            gia[4]=0;
        }
        else
        {
            for(String i : maPX4)
            {
                gia[4] += bll_thongke.getGia(i);
            }
        }
        if(maPX5.isEmpty())
        {
            gia[5]=0;
        }
        else
        {
            for(String i : maPX5)
            {
                gia[5] += bll_thongke.getGia(i);
            }
        }
        if(maPX6.isEmpty())
        {
            gia[6]=0;
        }
        else
        {
            for(String i : maPX6)
            {
                gia[6] += bll_thongke.getGia(i);
            }
        }
      
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        int k=0;
            for (int i =0 ;i < date.size();i++) 
            {
                dataset.addValue(gia[k], "Tổng tiền (VNĐ)" , date.get(i));
                k++;
            }
        

        JFreeChart barChart = ChartFactory.createBarChart(
                "Biểu đồ thống kê tổng doanh thu phiếu xuất trong 7 ngày gần nhất".toUpperCase(),
                "Thời gian", "Doanh thu ($)",
                dataset, PlotOrientation.VERTICAL, false, true, false);

        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new Dimension(jpnItem.getWidth(), 321));

        jpnItem.removeAll();
        jpnItem.setLayout(new CardLayout());
        jpnItem.add(chartPanel);
        jpnItem.validate();
        jpnItem.repaint();
    }
    public void setDataGiaPN(JPanel jpnItem) {
        ArrayList<String> date = get7day();
        
        ArrayList<String> maPX0 = bll_thongke.getArrayListmaPn(date.get(0));
        ArrayList<String> maPX1 = bll_thongke.getArrayListmaPn(date.get(1));
        ArrayList<String> maPX2 = bll_thongke.getArrayListmaPn(date.get(2));
        ArrayList<String> maPX3 = bll_thongke.getArrayListmaPn(date.get(3));
        ArrayList<String> maPX4 = bll_thongke.getArrayListmaPn(date.get(4));
        ArrayList<String> maPX5 = bll_thongke.getArrayListmaPn(date.get(5));
        ArrayList<String> maPX6 = bll_thongke.getArrayListmaPn(date.get(6));
        int gia[] = new int [7];
        if(maPX0.isEmpty())
        {
            gia[0]=0;
        }
        else
        {
            for(String i : maPX0)
            {
                gia[0] += bll_thongke.getGiaPN(i);
            }
        }
        if(maPX1.isEmpty())
        {
            gia[1]=0;
        }
        else
        {
            for(String i : maPX1)
            {
                gia[1] += bll_thongke.getGiaPN(i);
            }
        }
        if(maPX2.isEmpty())
        {
            gia[2]=0;
        }
        else
        {
            for(String i : maPX2)
            {
                gia[2] += bll_thongke.getGiaPN(i);
            }
        }
        if(maPX3.isEmpty())
        {
            gia[3]=0;
        }
        else
        {
            for(String i : maPX3)
            {
                gia[3] += bll_thongke.getGiaPN(i);
            }
        }
        if(maPX4.isEmpty())
        {
            gia[4]=0;
        }
        else
        {
            for(String i : maPX4)
            {
                gia[4] += bll_thongke.getGiaPN(i);
            }
        }
        if(maPX5.isEmpty())
        {
            gia[5]=0;
        }
        else
        {
            for(String i : maPX5)
            {
                gia[5] += bll_thongke.getGiaPN(i);
            }
        }
        if(maPX6.isEmpty())
        {
            gia[6]=0;
        }
        else
        {
            for(String i : maPX6)
            {
                gia[6] += bll_thongke.getGiaPN(i);
            }
        }
      
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        int k=0;
            for (int i =0 ;i < date.size();i++) 
            {
                dataset.addValue(gia[k], "Tổng tiền (VNĐ)" , date.get(i));
                k++;
            }
        

        JFreeChart barChart = ChartFactory.createBarChart(
                "Biểu đồ thống kê tổng doanh thu phiếu nhập trong 7 ngày gần nhất".toUpperCase(),
                "Thời gian", "Tổng tiền ($)",
                dataset, PlotOrientation.VERTICAL, false, true, false);

        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new Dimension(jpnItem.getWidth(), 321));

        jpnItem.removeAll();
        jpnItem.setLayout(new CardLayout());
        jpnItem.add(chartPanel);
        jpnItem.validate();
        jpnItem.repaint();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnSLpx = new javax.swing.JPanel();
        jpnGia = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        javax.swing.GroupLayout jpnSLpxLayout = new javax.swing.GroupLayout(jpnSLpx);
        jpnSLpx.setLayout(jpnSLpxLayout);
        jpnSLpxLayout.setHorizontalGroup(
            jpnSLpxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpnSLpxLayout.setVerticalGroup(
            jpnSLpxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnGiaLayout = new javax.swing.GroupLayout(jpnGia);
        jpnGia.setLayout(jpnGiaLayout);
        jpnGiaLayout.setHorizontalGroup(
            jpnGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpnGiaLayout.setVerticalGroup(
            jpnGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 233, Short.MAX_VALUE)
        );

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Phiếu xuất", "Phiếu nhập" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xemchitiet bt 87x23.png"))); // NOI18N
        jButton1.setPreferredSize(new java.awt.Dimension(87, 23));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnSLpx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(638, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jpnSLpx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpnGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if(jComboBox1.getSelectedItem().toString().equals("Phiếu xuất"))
        {
            setDataGiaPX(jpnGia);
            setDataSLPX(jpnSLpx);
        }
        else 
        {
            setDataGiaPN(jpnGia);
            setDataSLPN(jpnSLpx);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        if(jComboBox1.getSelectedItem().toString().equals("Phiếu xuất"))
        {
            FrameCtThongKePX f = new FrameCtThongKePX();
            f.setVisible(true);
            f.setResizable(false);
            f.setLocationRelativeTo(null);
        }
        else 
        {
            FrameCtThongKePN f = new FrameCtThongKePN();
            f.setVisible(true);
            f.setResizable(false);
            f.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jpnGia;
    private javax.swing.JPanel jpnSLpx;
    // End of variables declaration//GEN-END:variables
}
