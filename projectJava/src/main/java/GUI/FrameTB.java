/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.BLL_LoaiTB;
import BLL.BLL_NCC;
import BLL.BLL_NSX;
import BLL.BLL_ThietBi;
import DTO.LoaiThietBi;
import DTO.NhaCungCap;
import DTO.NhaSanXuat;
import DTO.ThietBi;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class FrameTB extends javax.swing.JPanel {

    BLL_ThietBi bll_tb = new BLL_ThietBi();
    BLL_LoaiTB bll_ltb = new BLL_LoaiTB();
    BLL_NCC bll_ncc = new BLL_NCC();
    BLL_NSX bll_nsx = new BLL_NSX();
    public FrameTB() {
        initComponents();
        hienThi();
        hienThiLoai();
        
    }

    public void hienThi()
    {
        
        DefaultTableModel model = (DefaultTableModel) jtbTB.getModel();

        
        ArrayList<ThietBi> list = bll_tb.getArrayList();
        
        
        model.setRowCount(0);
        for(int i = 0 ; i < list.size();i++)
        {
            model.addRow(new Object[]{list.get(i).getMaTB(),list.get(i).getTenTB(),list.get(i).getMaNSX(),list.get(i).getThongSo(),list.get(i).getMaNCC(),list.get(i).getMaLoai(),list.get(i).getGiaThanh(),list.get(i).getSoLuong(),list.get(i).getHinh()} );
        }
        
    }
    public void hienThi(ArrayList<ThietBi> list)
    {
        
        DefaultTableModel model = (DefaultTableModel) jtbTB.getModel();

        
        
        
        model.setRowCount(0);
        for(int i = 0 ; i < list.size();i++)
        {
            model.addRow(new Object[]{list.get(i).getMaTB(),list.get(i).getTenTB(),list.get(i).getMaNSX(),list.get(i).getThongSo(),list.get(i).getMaNCC(),list.get(i).getMaLoai(),list.get(i).getGiaThanh(),list.get(i).getSoLuong(),list.get(i).getHinh()} );
        }
        
    }
    public void hienThiLoai()
    {
        
        DefaultTableModel model = (DefaultTableModel) jtbLoaiTB.getModel();

        
        ArrayList<LoaiThietBi> list = bll_ltb.getArrayList();
        
        
        model.setRowCount(0);
        for(int i = 0 ; i < list.size();i++)
        {
            model.addRow(new Object[]{list.get(i).getMaLoai(),list.get(i).getTenLoai()} );
        }
        
    }
    public void hienThiLoai(ArrayList<LoaiThietBi> list)
    {
        
        DefaultTableModel model = (DefaultTableModel) jtbLoaiTB.getModel();

        
        
        
        
        model.setRowCount(0);
        for(int i = 0 ; i < list.size();i++)
        {
            model.addRow(new Object[]{list.get(i).getMaLoai(),list.get(i).getTenLoai()} );
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbTB = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbLoaiTB = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtMaLoai = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTenLoai = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jlbThongBao = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jrbmaTB = new javax.swing.JRadioButton();
        jrbTenTB = new javax.swing.JRadioButton();
        jrbMaNSX = new javax.swing.JRadioButton();
        jrbMaNCC = new javax.swing.JRadioButton();
        jrbMaLoai = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtTimKiemLoai = new javax.swing.JTextField();
        jrbMaLoaidow = new javax.swing.JRadioButton();
        jrbTenLoai = new javax.swing.JRadioButton();

        setPreferredSize(new java.awt.Dimension(850, 750));

        jtbTB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã TB", "Tên TB", "Mã NSX", "Thông số", "Mã NCC", "Mã Loại", "Giá thành", "Số lượng", "Hình"
            }
        ));
        jtbTB.setRowHeight(30);
        jtbTB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbTBMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbTB);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Quản lý thiết bị");

        jtbLoaiTB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Loại", "Tên Loại"
            }
        ));
        jtbLoaiTB.setRowHeight(30);
        jtbLoaiTB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbLoaiTBMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtbLoaiTB);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Quản lý loại thiết bị");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin loại thiết bị", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 14))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Mã loại");

        txtMaLoai.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMaLoai.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Tên Loại");

        txtTenLoai.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtTenLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenLoaiActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/them bt 50x50.png"))); // NOI18N
        jButton2.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fix bt 50x50.png"))); // NOI18N
        jButton3.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xoa bt 50x50.png"))); // NOI18N
        jButton4.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jlbThongBao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbThongBao.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMaLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jlbThongBao, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(36, 36, 36)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(36, 36, 36)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbThongBao, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Tìm Kiếm");

        jTextField1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField1CaretUpdate(evt);
            }
        });

        buttonGroup1.add(jrbmaTB);
        jrbmaTB.setSelected(true);
        jrbmaTB.setText("Mã TB");

        buttonGroup1.add(jrbTenTB);
        jrbTenTB.setText("Tên TB");

        buttonGroup1.add(jrbMaNSX);
        jrbMaNSX.setText("Mã NSX");

        buttonGroup1.add(jrbMaNCC);
        jrbMaNCC.setText("Mã NCC");

        buttonGroup1.add(jrbMaLoai);
        jrbMaLoai.setText("Mã Loại");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/refresh bt 50x50.png"))); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm Kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 14))); // NOI18N

        txtTimKiemLoai.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtTimKiemLoaiCaretUpdate(evt);
            }
        });

        buttonGroup2.add(jrbMaLoaidow);
        jrbMaLoaidow.setSelected(true);
        jrbMaLoaidow.setText("Mã Loại");

        buttonGroup2.add(jrbTenLoai);
        jrbTenLoai.setText("Tên Loại");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jrbMaLoaidow)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jrbTenLoai))
                    .addComponent(txtTimKiemLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTimKiemLoai)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbTenLoai)
                    .addComponent(jrbMaLoaidow))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jScrollPane1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(338, 338, 338)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(331, 331, 331)
                        .addComponent(jLabel2)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jrbmaTB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrbTenTB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrbMaNSX)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrbMaNCC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrbMaLoai))
                    .addComponent(jTextField1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbmaTB)
                    .addComponent(jrbTenTB)
                    .addComponent(jrbMaNSX)
                    .addComponent(jrbMaNCC)
                    .addComponent(jrbMaLoai))
                .addGap(3, 3, 3)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
    }// </editor-fold>//GEN-END:initComponents

    public String timMaNCC(String maNCC)
    {
        ArrayList<NhaCungCap> list_ncc = bll_ncc.getArrayList();
        String s="";
        for(int i = 0 ; i < list_ncc.size() ; i++)
        {
                if(list_ncc.get(i).getMaNCC().equals(maNCC))
                {
                    s=list_ncc.get(i).getTenNCC();
                    break;
                }
        }
        return s;
    }
    public String timMaLoai(String maLoai)
    {
        ArrayList<LoaiThietBi> list_ltb = bll_ltb.getArrayList();
        String s="";
        for(int i = 0 ; i < list_ltb.size() ; i++)
        {
                if(list_ltb.get(i).getMaLoai().equals(maLoai))
                {
                    s=list_ltb.get(i).getTenLoai();
                    break;
                }
        }
        return s;
    }
    public String timMaNSX(String maNSX)
    {
        ArrayList<NhaSanXuat> list_nsx = bll_nsx.getArrayList();
        String s="";
        for(int i = 0 ; i < list_nsx.size() ; i++)
        {
                if(list_nsx.get(i).getMaNSX().equals(maNSX))
                {
                    s=list_nsx.get(i).getTenNSX();
                    break;
                }
        }
        return s;
    }
    private void jtbTBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbTBMouseClicked
        
        int i=jtbTB.getSelectedRow();
        FrameThongTinThietBi f = new FrameThongTinThietBi();
       
        if(i>=0)
        {
    
            DefaultTableModel model = (DefaultTableModel) jtbTB.getModel();
            f.txtMaTB.setText(model.getValueAt(i, 0).toString());
            f.txtTenTb.setText(model.getValueAt(i, 1).toString());
            
            f.jcbNSX.setSelectedItem(timMaNSX(model.getValueAt(i, 2).toString()));
            f.txtThongSo.setText(model.getValueAt(i, 3).toString());
            f.jcbNCC.setSelectedItem(timMaNCC(model.getValueAt(i, 4).toString()));
            
            f.jcbLoai.setSelectedItem(timMaLoai(model.getValueAt(i, 5).toString()));
            f.txtGia.setText(model.getValueAt(i, 6).toString());
            f.txtSL.setText(model.getValueAt(i, 7).toString());
            f.txtTenHinh.setText(model.getValueAt(i, 8).toString());
            
            f.setVisible(true);
            f.setLocationRelativeTo(null);
            f.setResizable(false);

        }
       
    }//GEN-LAST:event_jtbTBMouseClicked

    private void txtTenLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenLoaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenLoaiActionPerformed

    private void jtbLoaiTBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbLoaiTBMouseClicked
        int i=jtbLoaiTB.getSelectedRow();
        
       
        if(i>=0)
        {
    
            DefaultTableModel model = (DefaultTableModel) jtbLoaiTB.getModel();
            txtMaLoai.setText(model.getValueAt(i, 0).toString());
            txtMaLoai.setEditable(false);
            txtTenLoai.setText(model.getValueAt(i, 1).toString());
            

        }
    }//GEN-LAST:event_jtbLoaiTBMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        LoaiThietBi ltb = new LoaiThietBi();
        if( txtTenLoai.getText().equals(""))
        {
            jlbThongBao.setText("Vui lòng nhập đầy đủ thông tin");
        }
        else 
        {
            ltb.setTenLoai(txtTenLoai.getText());
            jlbThongBao.setText(bll_ltb.them(ltb));
            hienThiLoai();
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        jlbThongBao.setText(bll_ltb.xoa(txtMaLoai.getText()));
        hienThiLoai();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        LoaiThietBi ltb = new LoaiThietBi();
        if(txtMaLoai.getText().equals("") || txtTenLoai.getText().equals(""))
        {
            jlbThongBao.setText("Vui lòng nhập đầy đủ thông tin");
        }
        else 
        {
            ltb.setTenLoai(txtTenLoai.getText());
            ltb.setMaLoai(txtMaLoai.getText());
            jlbThongBao.setText(bll_ltb.sua(ltb));
            hienThiLoai();
        }
       
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField1CaretUpdate
        // TODO add your handling code here:
        if(jrbMaLoai.isSelected())
        {
            hienThi(bll_tb.timKiemTheoMaLoai(jTextField1.getText()));
        }
        else if(jrbMaNCC.isSelected())
        {
            hienThi(bll_tb.timKiemTheoMaNCC(jTextField1.getText()));
        }
        else if(jrbMaNSX.isSelected())
        {
             hienThi(bll_tb.timKiemTheoMaNSX(jTextField1.getText()));
        }
        else if(jrbTenTB.isSelected())
        {
             hienThi(bll_tb.timKiemTheoTenTb(jTextField1.getText()));
        }
        else if(jrbmaTB.isSelected())
        {
             hienThi(bll_tb.timKiemTheoMaTB(jTextField1.getText()));
        }
    }//GEN-LAST:event_jTextField1CaretUpdate

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        hienThi();
        hienThiLoai();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtTimKiemLoaiCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtTimKiemLoaiCaretUpdate
        // TODO add your handling code here:
        if(jrbMaLoaidow.isSelected())
        {
            hienThiLoai(bll_ltb.timKiemTheoMaLoai(txtTimKiemLoai.getText()));
        }
        else if(jrbTenLoai.isSelected())
        {
            hienThiLoai(bll_ltb.timKiemTheoTenLoai(txtTimKiemLoai.getText()));
        }
    }//GEN-LAST:event_txtTimKiemLoaiCaretUpdate


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel jlbThongBao;
    private javax.swing.JRadioButton jrbMaLoai;
    private javax.swing.JRadioButton jrbMaLoaidow;
    private javax.swing.JRadioButton jrbMaNCC;
    private javax.swing.JRadioButton jrbMaNSX;
    private javax.swing.JRadioButton jrbTenLoai;
    private javax.swing.JRadioButton jrbTenTB;
    private javax.swing.JRadioButton jrbmaTB;
    private javax.swing.JTable jtbLoaiTB;
    protected javax.swing.JTable jtbTB;
    private javax.swing.JTextField txtMaLoai;
    private javax.swing.JTextField txtTenLoai;
    private javax.swing.JTextField txtTimKiemLoai;
    // End of variables declaration//GEN-END:variables
}
