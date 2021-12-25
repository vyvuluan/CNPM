/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.BLL_LoaiTB;
import BLL.BLL_NCC;
import BLL.BLL_NSX;
import BLL.BLL_PN;
import BLL.BLL_ThietBi;
import DTO.CtPhieuNhap;
import DTO.LoaiThietBi;
import DTO.NhaCungCap;
import DTO.NhaSanXuat;
import DTO.PhieuNhap;
import DTO.ThietBi;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class FramePN extends javax.swing.JPanel {

    BLL_NCC bll_ncc = new BLL_NCC();
    BLL_NSX bll_nsx = new BLL_NSX();
    BLL_PN bll_pn = new BLL_PN();
    BLL_ThietBi bll_tb = new BLL_ThietBi();
    BLL_LoaiTB bll_ltb = new BLL_LoaiTB();
    JFileChooser fc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
    public FramePN() {
        
        ArrayList<NhaCungCap> list = bll_ncc.getArrayList();
        ArrayList<NhaSanXuat> listNSX = bll_nsx.getArrayList();
        ArrayList<LoaiThietBi> list_ltb = bll_ltb.getArrayList();
        initComponents();
        
        for(int i=0 ; i< list.size();i++)
        {
            jCBNCC.addItem(list.get(i).getTenNCC());
        }
        for(int i=0 ; i< listNSX.size();i++)
        {
            jCBNSX.addItem(listNSX.get(i).getTenNSX());
        }
        for(int i = 0 ; i < list_ltb.size() ; i++)
        {
            txtMaLoai.addItem(list_ltb.get(i).getTenLoai());
        }
        ArrayList<PhieuNhap> listPN = bll_pn.getArrayList();
        truyenCbMaPN(listPN);
        //set ẩn hiện
        jpnCTPN.setEnabled(false);
        txtGiaBan.setEditable(false);
        txtMaLoai.setEnabled(false);
        txtTenTb.setEditable(false);
        jCBNSX.setEnabled(false);
        txtThongSo.setEditable(false);
        jbtLuu.setEnabled(false);
        btnChonHinh.setEnabled(false);
        txtGiaNhap.setEditable(false);
        txtMaTB.setEditable(false);
        txtSL.setEditable(false);
        
        jbtsua.setEnabled(false);
        jbtXoa.setEnabled(false);
//        xacNhan(listPN);
        
    }
    public void hienThi(String maPN)
    {
        DefaultTableModel model = (DefaultTableModel) jtbCtPn.getModel();

        
        ArrayList<CtPhieuNhap> list = new ArrayList<>();
        list = bll_pn.getArrayListCTPN();
    
        model.setRowCount(0);
        for(int i = 0 ; i < list.size();i++)
        {
            if(maPN.equals(list.get(i).getMaPN()))
                model.addRow(new Object[]{list.get(i).getMaPN(),list.get(i).getMaTB(),list.get(i).getSoLuong(),list.get(i).getDonGia()} );
        }
    }
    public void truyenCbMaPN(ArrayList<PhieuNhap> listPN) //khi chưa tạo pN mới thì sẽ mã PN cuối cùng
    {
        for(int i = 0 ; i< listPN.size();i++)
        {
            jcbMaPn.addItem(listPN.get(i).getMaPN());
        }
        if(listPN.size()>0)
        {
            jcbMaPn.setSelectedItem(listPN.get(listPN.size()-1).getMaPN());
        }
        
    }
    public void truyenCbMaPN_1item(ArrayList<PhieuNhap> listPN) //khi đã thêm 1 PN mới sẽ hiển thị mã PN đó ở cbobox
    {
        
            jcbMaPn.addItem(listPN.get(listPN.size()-1).getMaPN());
        jcbMaPn.setSelectedItem(listPN.get(listPN.size()-1).getMaPN());
        
        
    }
    public void xacNhan(ArrayList<PhieuNhap> listPN)
    {
        
        for(PhieuNhap i : listPN)
        {
            if(i.getMaPN().equals(jcbMaPn.getSelectedItem().toString()))
            {
                if(i.getTinhTrang().equals("true"))
                {
                    jbtXacNhan.setEnabled(false);
                    jtbCtPn.setEnabled(false);
                    jbnAdd.setEnabled(false);
                    jbtLuu.setEnabled(false);
                    jbtsua.setEnabled(false);
                    jbtXoa.setEnabled(false);
                    jbtIn.setEnabled(true);
                }
                else 
                {
                    jbtXacNhan.setEnabled(true);
                    jtbCtPn.setEnabled(true);
                    jbnAdd.setEnabled(true);
                    jbtIn.setEnabled(false);
                }
                break;
            }
        }
        
        
    }
    public static void copyFile(File source, File dest) throws IOException 
    {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
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

        jLabel2 = new javax.swing.JLabel();
        jpnPN = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jCBNCC = new javax.swing.JComboBox<>();
        jlbmaPn = new javax.swing.JLabel();
        jcbMaPn = new javax.swing.JComboBox<>();
        jbtXacNhan = new javax.swing.JButton();
        jbtIn = new javax.swing.JButton();
        jpnCTPN = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtGiaNhap = new javax.swing.JTextField();
        txtMaLoai = new javax.swing.JComboBox<>();
        jCBNSX = new javax.swing.JComboBox<>();
        txtSL = new javax.swing.JTextField();
        txtGiaBan = new javax.swing.JTextField();
        txtTenTb = new javax.swing.JTextField();
        txtThongSo = new javax.swing.JTextField();
        jbtLuu = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtMaTB = new javax.swing.JTextField();
        jbnAdd = new javax.swing.JButton();
        jlbTB = new javax.swing.JLabel();
        jbtsua = new javax.swing.JButton();
        jbtXoa = new javax.swing.JButton();
        jlbHinh = new javax.swing.JLabel();
        btnChonHinh = new javax.swing.JButton();
        jlbTenHinh = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbCtPn = new javax.swing.JTable();

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setText("Quản lý phiếu nhập");

        jpnPN.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin phiếu nhập", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 14))); // NOI18N

        jButton1.setText("Phiếu Nhập mới");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Chọn nhà cung cấp");
        jLabel1.setPreferredSize(new java.awt.Dimension(120, 30));

        jCBNCC.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCBNCC.setPreferredSize(new java.awt.Dimension(120, 30));
        jCBNCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBNCCActionPerformed(evt);
            }
        });

        jlbmaPn.setText("Phiếu nhập");

        jcbMaPn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMaPnActionPerformed(evt);
            }
        });

        jbtXacNhan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thanhtoan_70x23.png"))); // NOI18N
        jbtXacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtXacNhanActionPerformed(evt);
            }
        });

        jbtIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inpn_70x23.png"))); // NOI18N
        jbtIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtInActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnPNLayout = new javax.swing.GroupLayout(jpnPN);
        jpnPN.setLayout(jpnPNLayout);
        jpnPNLayout.setHorizontalGroup(
            jpnPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnPNLayout.createSequentialGroup()
                .addGroup(jpnPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnPNLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jCBNCC, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpnPNLayout.createSequentialGroup()
                        .addGroup(jpnPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnPNLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jpnPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlbmaPn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1)))
                            .addGroup(jpnPNLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jcbMaPn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 38, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jpnPNLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jpnPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbtIn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnPNLayout.setVerticalGroup(
            jpnPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnPNLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCBNCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlbmaPn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jcbMaPn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtIn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpnCTPN.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin thiết bị", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 14))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Tên thiết bị");
        jLabel3.setPreferredSize(new java.awt.Dimension(60, 25));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Loại thiết bị");
        jLabel4.setPreferredSize(new java.awt.Dimension(63, 25));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Chọn nhà sản xuất");
        jLabel5.setPreferredSize(new java.awt.Dimension(103, 25));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Thông số kỹ thuật");
        jLabel6.setPreferredSize(new java.awt.Dimension(96, 25));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Giá nhập");
        jLabel7.setPreferredSize(new java.awt.Dimension(50, 25));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Giá bán");
        jLabel8.setPreferredSize(new java.awt.Dimension(43, 25));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("Số lượng");
        jLabel9.setPreferredSize(new java.awt.Dimension(51, 25));

        txtGiaNhap.setPreferredSize(new java.awt.Dimension(7, 25));

        txtMaLoai.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtMaLoai.setMinimumSize(new java.awt.Dimension(53, 25));
        txtMaLoai.setPreferredSize(new java.awt.Dimension(53, 25));

        jCBNSX.setPreferredSize(new java.awt.Dimension(53, 25));
        jCBNSX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBNSXActionPerformed(evt);
            }
        });

        txtSL.setPreferredSize(new java.awt.Dimension(7, 25));

        txtGiaBan.setMinimumSize(new java.awt.Dimension(7, 25));
        txtGiaBan.setPreferredSize(new java.awt.Dimension(55, 25));
        txtGiaBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGiaBanActionPerformed(evt);
            }
        });

        txtTenTb.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtTenTb.setPreferredSize(new java.awt.Dimension(7, 25));

        txtThongSo.setPreferredSize(new java.awt.Dimension(55, 25));

        jbtLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save bt 50x50.png"))); // NOI18N
        jbtLuu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtLuu.setPreferredSize(new java.awt.Dimension(50, 50));
        jbtLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtLuuActionPerformed(evt);
            }
        });

        jLabel10.setText("Mã Thiết Bị");

        txtMaTB.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtMaTBCaretUpdate(evt);
            }
        });
        txtMaTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaTBActionPerformed(evt);
            }
        });

        jbnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/them bt 50x50.png"))); // NOI18N
        jbnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbnAdd.setPreferredSize(new java.awt.Dimension(50, 50));
        jbnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnAddActionPerformed(evt);
            }
        });

        jlbTB.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbTB.setForeground(new java.awt.Color(255, 51, 0));

        jbtsua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fix bt 50x50.png"))); // NOI18N
        jbtsua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtsua.setPreferredSize(new java.awt.Dimension(50, 50));
        jbtsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtsuaActionPerformed(evt);
            }
        });

        jbtXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xoa bt 50x50.png"))); // NOI18N
        jbtXoa.setToolTipText("");
        jbtXoa.setBorderPainted(false);
        jbtXoa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtXoa.setPreferredSize(new java.awt.Dimension(50, 50));
        jbtXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtXoaActionPerformed(evt);
            }
        });

        btnChonHinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chonanh bt 80x23.png"))); // NOI18N
        btnChonHinh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnChonHinh.setPreferredSize(new java.awt.Dimension(80, 23));
        btnChonHinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChonHinhActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnCTPNLayout = new javax.swing.GroupLayout(jpnCTPN);
        jpnCTPN.setLayout(jpnCTPNLayout);
        jpnCTPNLayout.setHorizontalGroup(
            jpnCTPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnCTPNLayout.createSequentialGroup()
                .addGroup(jpnCTPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnCTPNLayout.createSequentialGroup()
                        .addGroup(jpnCTPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jpnCTPNLayout.createSequentialGroup()
                                .addGroup(jpnCTPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpnCTPNLayout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnCTPNLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(jpnCTPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jpnCTPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jpnCTPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtGiaBan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                    .addComponent(txtMaLoai, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtMaTB)
                                    .addComponent(txtGiaNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jbtLuu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jpnCTPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jpnCTPNLayout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addGroup(jpnCTPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jpnCTPNLayout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtThongSo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnCTPNLayout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCBNSX, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnCTPNLayout.createSequentialGroup()
                                        .addGroup(jpnCTPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jpnCTPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtTenTb, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                            .addComponent(txtSL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addGroup(jpnCTPNLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jbnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtsua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(jbtXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpnCTPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbHinh, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpnCTPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnChonHinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlbTenHinh, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jpnCTPNLayout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jlbTB, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 22, Short.MAX_VALUE))
        );
        jpnCTPNLayout.setVerticalGroup(
            jpnCTPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnCTPNLayout.createSequentialGroup()
                .addGroup(jpnCTPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnCTPNLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(jpnCTPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCBNSX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jpnCTPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpnCTPNLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jlbHinh, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addGroup(jpnCTPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnChonHinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpnCTPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSL, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtGiaNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(jpnCTPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtMaTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtThongSo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbTenHinh, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jpnCTPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtsua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtLuu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jlbTB, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtbCtPn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã PN", "Mã TB", "Số Lượng", "Đơn Giá"
            }
        ));
        jtbCtPn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbCtPnMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbCtPn);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jpnPN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jpnCTPN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpnPN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnCTPN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        PhieuNhap phieunhap = new PhieuNhap();
        phieunhap.setMaNV(MainJFrame.maNV);
        String tenNCC = (String) jCBNCC.getSelectedItem();
        ArrayList<NhaCungCap> list = bll_ncc.getArrayList();
        for(int i = 0 ;i < list.size();i++)
        {
            if(tenNCC.equals(list.get(i).getTenNCC()))
            {
                phieunhap.setMaNCC(list.get(i).getMaNCC());
            }
        }
        Date ngayNhap  = new Date();
        phieunhap.setNgayNhap(ngayNhap);
        jlbTB.setText(bll_pn.them(phieunhap));
         ArrayList<PhieuNhap> list_pn = bll_pn.getArrayList();
         
        jlbmaPn.setText(list_pn.get(list_pn.size()-1).getMaPN());
        truyenCbMaPN_1item(list_pn);
        jpnCTPN.setEnabled(true);
        txtGiaNhap.setEditable(true);
        txtMaTB.setEditable(true);
        txtSL.setEditable(true);
        jCBNCC.setEnabled(false);
        jbtLuu.setEnabled(false);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCBNCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBNCCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBNCCActionPerformed

    private void jCBNSXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBNSXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBNSXActionPerformed

    private void jbtLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtLuuActionPerformed
        // TODO add your handling code here:
        
        if(txtMaTB.getText().equals("") || txtGiaNhap.getText().equals("") || txtSL.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this,"Vui lòng nhập đầy đủ thông tin");
        }
        else 
        {
            ArrayList<ThietBi> listTB = bll_tb.getArrayList();
            try
            {
                String maTB="";
                int soLuong = Integer.parseInt(txtSL.getText());

                int giaNhap = Integer.parseInt(txtGiaNhap.getText());
                int dem=0;
                for(int i=0;i<listTB.size();i++)
                {
                    if(txtMaTB.getText().equals(listTB.get(i).getMaTB()))
                    {
                        
                        maTB = txtMaTB.getText();
                        int slTmp =listTB.get(i).getSoLuong() + soLuong;
                        listTB.get(i).setSoLuong(slTmp);
                        bll_tb.suaSL(maTB, slTmp);
                        dem++;
                        //Thêm chi tiết phiếu nhập
                        
                        CtPhieuNhap ct = new CtPhieuNhap();
                        ArrayList<CtPhieuNhap> listCtPN = bll_pn.getArrayListCTPN();
                        int demCt=0;
                        
                        for(int o=0; o< listCtPN.size();o++)
                        {
                            //có mã CT và TB nên tăng số lượng
                            if(listCtPN.get(o).getMaTB().equals(maTB) && listCtPN.get(o).getMaPN().equals((String) jcbMaPn.getSelectedItem()))
                            {
                                bll_tb.suaSL(maTB, slTmp );
                                bll_pn.suaCtPNsoLuong_donGia((String) jcbMaPn.getSelectedItem(), maTB, soLuong + listCtPN.get(o).getSoLuong(),giaNhap);
                                demCt++;
                                hienThi(jcbMaPn.getSelectedItem().toString());
                                jbtLuu.setEnabled(false);
                                break;
                            }
                            
                        }
                        if(demCt==0) //không có mã CT và TB nên tạo CT mới
                        {
                            ct.setMaPN((String) jcbMaPn.getSelectedItem());
                            ct.setDonGia(giaNhap);
                            ct.setMaTB(maTB);
                            ct.setSoLuong(soLuong);
                            jlbTB.setText(bll_pn.themCTPN(ct));
                            hienThi(jcbMaPn.getSelectedItem().toString());
                            break;
                        }
                    }
                }

                if(dem==0) //Không có mã sản phẩm vừa nhập trong kho
                {
                    
                    jbtLuu.setEnabled(true);                        
                    jbnAdd.setEnabled(false);
                    if(txtGiaBan.getText().equals(""))
                    {
                        int qes=JOptionPane.showConfirmDialog(null, "Không có mã thiết bị bạn vừa nhập! Bạn có muốn thêm thiết bị mới?", "Question",JOptionPane.YES_NO_OPTION); 
                        if( qes == JOptionPane.YES_OPTION)
                        {
                            txtGiaBan.setEditable(true);
                            txtMaLoai.setEnabled(true);
                            txtTenTb.setEditable(true);
                            jCBNSX.setEnabled(true);
                            txtThongSo.setEditable(true);
                            btnChonHinh.setEnabled(true);
                        }
                    }
                    
                    
                    else
                    {
                        if(txtTenTb.getText().equals("") ||  txtThongSo.getText().equals(""))
                        {
                            JOptionPane.showMessageDialog(this,"Vui lòng nhập đầy đủ thông tin");
                        }
                        else
                        {
                            try
                            {
                                txtGiaBan.setEditable(true);
                                txtMaLoai.setEnabled(true);
                                txtTenTb.setEditable(true);
                                jCBNSX.setEnabled(true);
                                txtThongSo.setEditable(true);
                                jbtLuu.setEnabled(true);
                                jbnAdd.setEnabled(false);
                                btnChonHinh.setEnabled(true);
                                int giaBan = Integer.parseInt(txtGiaBan.getText());


                                ThietBi tb = new ThietBi();
                                tb.setGiaThanh(giaBan);
                                ArrayList<LoaiThietBi> list_ltb = bll_ltb.getArrayList();
                                String tenLoai = (String) txtMaLoai.getSelectedItem();
                                for(int l = 0 ;l < list_ltb.size();l++)
                                {
                                    if(tenLoai.equals(list_ltb.get(l).getTenLoai()))
                                    {
                                        tb.setMaLoai(list_ltb.get(l).getMaLoai());
                                            
                                    }
                                }
                                    
                                
                                String tenNCC = (String) jCBNCC.getSelectedItem();
                                ArrayList<NhaCungCap> list = bll_ncc.getArrayList();
                                for(int j = 0 ;j < list.size();j++)
                                {
                                    if(tenNCC.equals(list.get(j).getTenNCC()))
                                    {
                                        tb.setMaNCC(list.get(j).getMaNCC());
                                    }
                                }
                                String tenNSX = (String) jCBNSX.getSelectedItem();
                                ArrayList<NhaSanXuat> list_nsx = bll_nsx.getArrayList();
                                for(int k = 0 ;k < list_nsx.size();k++)
                                {
                                    if(tenNSX.equals(list_nsx.get(k).getTenNSX()))
                                    {
                                        tb.setMaNSX(list_nsx.get(k).getMaNSX());
                                    }
                                }
                                tb.setSoLuong(soLuong);
                                tb.setTenTB(txtTenTb.getText());
                                tb.setThongSo(txtThongSo.getText());
                                tb.setHinh(jlbTenHinh.getText());
                                jlbTB.setText(bll_tb.themTB(tb));



                                //Thêm chi tiết phiếu nhập
                                ArrayList<ThietBi> listTB1 = bll_tb.getArrayList();
                                maTB = listTB1.get(listTB1.size()-1).getMaTB();
                               
                                CtPhieuNhap ct = new CtPhieuNhap();
                                ct.setMaPN((String) jcbMaPn.getSelectedItem());
                                ct.setDonGia(giaNhap);
                                ct.setMaTB(maTB);
                                ct.setSoLuong(soLuong);
                                jlbTB.setText(bll_pn.themCTPN(ct));
                                hienThi(jcbMaPn.getSelectedItem().toString());
                                txtGiaBan.setEditable(false);
                                txtMaLoai.setEnabled(false);
                                txtTenTb.setEditable(false);
                                jCBNSX.setEnabled(false);
                                txtThongSo.setEditable(false);
                                jbtLuu.setEnabled(false);
                                jbnAdd.setEnabled(true);
                                jbtsua.setEnabled(false);
                                btnChonHinh.setEnabled(false);
                            }
                            catch(NumberFormatException ex)
                            {
                                JOptionPane.showMessageDialog(this,"Giá bán phải là 1 số");

                            }
                        }
                        
                    }
                    

                }



            }
            catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(this,"Giá và số lượng phải là 1 số");
            }
        }
        
    }//GEN-LAST:event_jbtLuuActionPerformed

    private void txtGiaBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGiaBanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGiaBanActionPerformed

    private void jbnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnAddActionPerformed
        // TODO add your handling code here:
        jpnCTPN.setEnabled(true);
        txtGiaNhap.setEditable(true);
        txtMaTB.setEditable(true);
        txtSL.setEditable(true);
        jCBNCC.setEnabled(false);
        jbtLuu.setEnabled(true);
        txtMaLoai.setEnabled(true);
        jCBNSX.setEnabled(true);
        txtMaLoai.setEnabled(false);
        jCBNSX.setEnabled(false);
        
        txtGiaNhap.setText("");
        txtMaTB.setText("");
        txtSL.setText("");
        txtGiaBan.setText("");
        
        txtTenTb.setText("");
        txtThongSo.setText("");
        
       
        
    }//GEN-LAST:event_jbnAddActionPerformed

    private void jcbMaPnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMaPnActionPerformed
        // TODO add your handling code here:
        jlbTB.setText((String) jcbMaPn.getSelectedItem());
        ArrayList <PhieuNhap> list = bll_pn.getArrayList();
        xacNhan(list);
        hienThi((String) jcbMaPn.getSelectedItem());
    }//GEN-LAST:event_jcbMaPnActionPerformed

    private void txtMaTBCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtMaTBCaretUpdate
        // TODO add your handling code here: 
    }//GEN-LAST:event_txtMaTBCaretUpdate

    private void txtMaTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaTBActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txtMaTBActionPerformed

    private void jtbCtPnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbCtPnMouseClicked
        // TODO add your handling code here:
        int i=jtbCtPn.getSelectedRow();
        
        if(i>=0)
        {
            txtGiaNhap.setEditable(true);
            txtSL.setEditable(true);
            jbnAdd.setEnabled(true);
            jbtsua.setEnabled(true);
            jbtXoa.setEnabled(true);
           DefaultTableModel model = (DefaultTableModel) jtbCtPn.getModel();
           txtGiaNhap.setText(model.getValueAt(i, 3).toString());
           txtMaTB.setText(model.getValueAt(i, 1).toString());
           
           txtSL.setText(model.getValueAt(i, 2).toString());
           ArrayList <ThietBi> listTB = bll_tb.getArrayList();
           for(ThietBi tb : listTB )
           {
               if(tb.getMaTB().equals(model.getValueAt(i, 1).toString()))
               {
                    jlbHinh.setIcon(new ImageIcon(getClass().getResource("/"+ tb.getHinh())));
                    break;
               }
           }
           
        }
    }//GEN-LAST:event_jtbCtPnMouseClicked

    private void jbtXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtXoaActionPerformed
        int qes=JOptionPane.showConfirmDialog(null, "Tiếp tục không?", "Question",JOptionPane.YES_NO_OPTION); 
        if( qes == JOptionPane.YES_OPTION)
        {
            jlbTB.setText(bll_pn.xoaCtPN(jcbMaPn.getSelectedItem().toString(), txtMaTB.getText()));
            ArrayList<ThietBi> listTB= bll_tb.getArrayList();

                for(int i =0 ;i< listTB.size();i++)
                {
                    if(txtMaTB.getText().equals(listTB.get(i).getMaTB()))
                    {
                        bll_tb.suaSL(txtMaTB.getText(), listTB.get(i).getSoLuong()- Integer.parseInt(txtSL.getText()));
                    }
                }
                hienThi(jcbMaPn.getSelectedItem().toString());
            jbtsua.setEnabled(false);
            jbtXoa.setEnabled(false);
        }
        
        
        
        
    }//GEN-LAST:event_jbtXoaActionPerformed

    private void jbtsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtsuaActionPerformed
        // TODO add your handling code here:
        CtPhieuNhap ctpn = new CtPhieuNhap();
        try
        {
            int soLuong  = Integer.parseInt(txtSL.getText());
             
            int donGia  = Integer.parseInt(txtGiaNhap.getText());
            ctpn.setDonGia(donGia);
            ctpn.setMaPN(jcbMaPn.getSelectedItem().toString());
            ctpn.setMaTB(txtMaTB.getText());
            ctpn.setSoLuong(soLuong);
            ArrayList<ThietBi> listTB= bll_tb.getArrayList();
            ArrayList<CtPhieuNhap> listCtpn= bll_pn.getArrayListCTPN();
            int kq=0;
            for(int i = 0 ; i < listCtpn.size() ; i++)
            {
                if(listCtpn.get(i).getMaTB().equals(txtMaTB.getText()))
                {
                    kq= soLuong - listCtpn.get(i).getSoLuong(); break;
                }
            }
            //cập nhập số lượng thiết bị
            for(int i =0 ;i< listTB.size();i++)
            {
                if(txtMaTB.getText().equals(listTB.get(i).getMaTB()))
                {
                    if(bll_pn.suaCtPN(ctpn) == true && bll_tb.suaSL(txtMaTB.getText(), listTB.get(i).getSoLuong() + kq ) == true)
                    {
                        jlbTB.setText("Sửa Chi tiết phiếu xuất thành công");
                    }
                    else jlbTB.setText("Sửa Chi tiết phiếu xuất Thất bại");
                    hienThi(jcbMaPn.getSelectedItem().toString());
                    jbtsua.setEnabled(false);
                    jbtXoa.setEnabled(false);
                    break;
                }
            }
        }
        catch(NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(this,"Giá và số lượng phải là 1 số");
        }
        
    }//GEN-LAST:event_jbtsuaActionPerformed

    private void btnChonHinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChonHinhActionPerformed
     
        fc.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("PNG and JPG images","png", "jpg");
        fc.addChoosableFileFilter(filter);
        int returnValue = fc.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) 
        {
            InputStream inStream = null;
            OutputStream outStream = null;
            try {
                copyFile(new File(fc.getSelectedFile().getPath()), new File("src/main/resources/"+ fc.getSelectedFile().getName()));
                
            } catch (IOException ex) {
                Logger.getLogger(FramePN.class.getName()).log(Level.SEVERE, null, ex);
            }
            jlbTenHinh.setText(fc.getSelectedFile().getName());
            jlbHinh.setIcon(new ImageIcon(getClass().getResource("/"+ jlbTenHinh.getText())));
        }
        else
        {
            jlbTenHinh.setText("bạn đã cancel");
        }
        
    }//GEN-LAST:event_btnChonHinhActionPerformed

    private void jbtXacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtXacNhanActionPerformed
//        System.out.println(bll_pn.countDong(jcbMaPn.getSelectedItem().toString()));
        if(bll_pn.countDong(jcbMaPn.getSelectedItem().toString())==0)
        {
            JOptionPane.showMessageDialog(this, "Không có thiết bị để thanh toán"); 
        }
        else
        {
            JOptionPane.showMessageDialog(this, bll_pn.suaTinhTrang(jcbMaPn.getSelectedItem().toString()));       
            if(bll_pn.suaTinhTrang(jcbMaPn.getSelectedItem().toString()).equals("Thanh toán phiếu nhập thành công"))
            {
                jbtXacNhan.setEnabled(false);
            }
        }
        
    }//GEN-LAST:event_jbtXacNhanActionPerformed

    private void jbtInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtInActionPerformed
        bll_pn.in(jcbMaPn.getSelectedItem().toString());
    }//GEN-LAST:event_jbtInActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChonHinh;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jCBNCC;
    private javax.swing.JComboBox<String> jCBNSX;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbnAdd;
    private javax.swing.JButton jbtIn;
    private javax.swing.JButton jbtLuu;
    private javax.swing.JButton jbtXacNhan;
    private javax.swing.JButton jbtXoa;
    private javax.swing.JButton jbtsua;
    private javax.swing.JComboBox<String> jcbMaPn;
    private javax.swing.JLabel jlbHinh;
    private javax.swing.JLabel jlbTB;
    private javax.swing.JLabel jlbTenHinh;
    private javax.swing.JLabel jlbmaPn;
    private javax.swing.JPanel jpnCTPN;
    private javax.swing.JPanel jpnPN;
    private javax.swing.JTable jtbCtPn;
    private javax.swing.JTextField txtGiaBan;
    private javax.swing.JTextField txtGiaNhap;
    private javax.swing.JComboBox<String> txtMaLoai;
    private javax.swing.JTextField txtMaTB;
    private javax.swing.JTextField txtSL;
    private javax.swing.JTextField txtTenTb;
    private javax.swing.JTextField txtThongSo;
    // End of variables declaration//GEN-END:variables
}
