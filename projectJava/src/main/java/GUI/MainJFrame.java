/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class MainJFrame extends javax.swing.JFrame {

    public static String userName,quyen,maNV,maPN;
   
    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        jlbUser.setText(userName);
        jLbQuyen.setText(quyen);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Phần Mềm Quản Lý Cửa Hàng Bán Máy Tính");
        jPnView.removeAll();
            jPnView.setLayout(new BorderLayout());
            jPnView.add(new FrameThongKe());
            jPnView.validate();
            jPnView.repaint();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPnView = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jpnTK = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jbtTK = new javax.swing.JButton();
        jpnTB = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jbtTB = new javax.swing.JButton();
        jpnPN = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jbtPN = new javax.swing.JButton();
        jpnPX = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jbtPX = new javax.swing.JButton();
        jpnNV = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jbtNV = new javax.swing.JButton();
        jpnKH = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jbtKH = new javax.swing.JButton();
        jpnDT = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jbtDT = new javax.swing.JButton();
        jpnThongKe = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jbtThongKe = new javax.swing.JButton();
        jpnHome = new javax.swing.JPanel();
        jbtHome = new javax.swing.JButton();
        jlbUser = new javax.swing.JLabel();
        jLbQuyen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPnView.setPreferredSize(new java.awt.Dimension(1200, 750));

        javax.swing.GroupLayout jPnViewLayout = new javax.swing.GroupLayout(jPnView);
        jPnView.setLayout(jPnViewLayout);
        jPnViewLayout.setHorizontalGroup(
            jPnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 920, Short.MAX_VALUE)
        );
        jPnViewLayout.setVerticalGroup(
            jPnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel9.setBackground(new java.awt.Color(41, 183, 230));
        jPanel9.setPreferredSize(new java.awt.Dimension(290, 750));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dang xuat bt 35x35.png"))); // NOI18N
        jButton1.setToolTipText("Đăng xuất");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cai dat bt 35x35.png"))); // NOI18N
        jButton2.setToolTipText("Đổi mật khẩu");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jpnTK.setBackground(new java.awt.Color(41, 183, 230));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tai khoan bd 30x51.png"))); // NOI18N

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/border right 30x51.png"))); // NOI18N

        jbtTK.setBackground(new java.awt.Color(41, 183, 230));
        jbtTK.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbtTK.setForeground(new java.awt.Color(255, 255, 255));
        jbtTK.setText("Tài Khoản");
        jbtTK.setBorder(null);
        jbtTK.setBorderPainted(false);
        jbtTK.setContentAreaFilled(false);
        jbtTK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtTK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtTKMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtTKMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbtTKMousePressed(evt);
            }
        });
        jbtTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtTKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnTKLayout = new javax.swing.GroupLayout(jpnTK);
        jpnTK.setLayout(jpnTKLayout);
        jpnTKLayout.setHorizontalGroup(
            jpnTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTKLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtTK, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1))
        );
        jpnTKLayout.setVerticalGroup(
            jpnTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTKLayout.createSequentialGroup()
                .addGroup(jpnTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jpnTKLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jbtTK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnTB.setBackground(new java.awt.Color(41, 183, 230));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thiet bi bd 30x51.png"))); // NOI18N

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/border right 30x51.png"))); // NOI18N

        jbtTB.setBackground(new java.awt.Color(41, 183, 230));
        jbtTB.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbtTB.setForeground(new java.awt.Color(255, 255, 255));
        jbtTB.setText("Thiết Bị");
        jbtTB.setBorder(null);
        jbtTB.setBorderPainted(false);
        jbtTB.setContentAreaFilled(false);
        jbtTB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtTB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtTBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtTBMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbtTBMousePressed(evt);
            }
        });
        jbtTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtTBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnTBLayout = new javax.swing.GroupLayout(jpnTB);
        jpnTB.setLayout(jpnTBLayout);
        jpnTBLayout.setHorizontalGroup(
            jpnTBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTBLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtTB, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5))
        );
        jpnTBLayout.setVerticalGroup(
            jpnTBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTBLayout.createSequentialGroup()
                .addGroup(jpnTBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jpnTBLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jbtTB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnPN.setBackground(new java.awt.Color(41, 183, 230));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/phieu nhap bd 30x51.png"))); // NOI18N

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/border right 30x51.png"))); // NOI18N

        jbtPN.setBackground(new java.awt.Color(41, 183, 230));
        jbtPN.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbtPN.setForeground(new java.awt.Color(255, 255, 255));
        jbtPN.setText("Phiếu Nhập");
        jbtPN.setBorder(null);
        jbtPN.setBorderPainted(false);
        jbtPN.setContentAreaFilled(false);
        jbtPN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtPN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtPNMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtPNMouseExited(evt);
            }
        });
        jbtPN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtPNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnPNLayout = new javax.swing.GroupLayout(jpnPN);
        jpnPN.setLayout(jpnPNLayout);
        jpnPNLayout.setHorizontalGroup(
            jpnPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnPNLayout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtPN, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7))
        );
        jpnPNLayout.setVerticalGroup(
            jpnPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnPNLayout.createSequentialGroup()
                .addGroup(jpnPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jpnPNLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jbtPN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnPX.setBackground(new java.awt.Color(41, 183, 230));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/phieu xuat bd 30x51.png"))); // NOI18N

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/border right 30x51.png"))); // NOI18N

        jbtPX.setBackground(new java.awt.Color(41, 183, 230));
        jbtPX.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbtPX.setForeground(new java.awt.Color(255, 255, 255));
        jbtPX.setText("Phiếu Xuất");
        jbtPX.setBorder(null);
        jbtPX.setBorderPainted(false);
        jbtPX.setContentAreaFilled(false);
        jbtPX.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtPX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtPXMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtPXMouseExited(evt);
            }
        });
        jbtPX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtPXActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnPXLayout = new javax.swing.GroupLayout(jpnPX);
        jpnPX.setLayout(jpnPXLayout);
        jpnPXLayout.setHorizontalGroup(
            jpnPXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnPXLayout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtPX, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9))
        );
        jpnPXLayout.setVerticalGroup(
            jpnPXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnPXLayout.createSequentialGroup()
                .addGroup(jpnPXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jpnPXLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jbtPX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnNV.setBackground(new java.awt.Color(41, 183, 230));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhan vien bd 30x51.png"))); // NOI18N

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/border right 30x51.png"))); // NOI18N

        jbtNV.setBackground(new java.awt.Color(41, 183, 230));
        jbtNV.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbtNV.setForeground(new java.awt.Color(255, 255, 255));
        jbtNV.setText("Nhân Viên");
        jbtNV.setBorder(null);
        jbtNV.setBorderPainted(false);
        jbtNV.setContentAreaFilled(false);
        jbtNV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtNVMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtNVMouseExited(evt);
            }
        });
        jbtNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtNVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnNVLayout = new javax.swing.GroupLayout(jpnNV);
        jpnNV.setLayout(jpnNVLayout);
        jpnNVLayout.setHorizontalGroup(
            jpnNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnNVLayout.createSequentialGroup()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtNV, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11))
        );
        jpnNVLayout.setVerticalGroup(
            jpnNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnNVLayout.createSequentialGroup()
                .addGroup(jpnNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jpnNVLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jbtNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnKH.setBackground(new java.awt.Color(41, 183, 230));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/khach hang bd 30x51.png"))); // NOI18N

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/border right 30x51.png"))); // NOI18N

        jbtKH.setBackground(new java.awt.Color(41, 183, 230));
        jbtKH.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbtKH.setForeground(new java.awt.Color(255, 255, 255));
        jbtKH.setText("Khách Hàng");
        jbtKH.setBorder(null);
        jbtKH.setBorderPainted(false);
        jbtKH.setContentAreaFilled(false);
        jbtKH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtKHMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtKHMouseExited(evt);
            }
        });
        jbtKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtKHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnKHLayout = new javax.swing.GroupLayout(jpnKH);
        jpnKH.setLayout(jpnKHLayout);
        jpnKHLayout.setHorizontalGroup(
            jpnKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnKHLayout.createSequentialGroup()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtKH, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13))
        );
        jpnKHLayout.setVerticalGroup(
            jpnKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnKHLayout.createSequentialGroup()
                .addGroup(jpnKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jpnKHLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jbtKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnDT.setBackground(new java.awt.Color(41, 183, 230));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doi tac bd 30x51.png"))); // NOI18N

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/border right 30x51.png"))); // NOI18N

        jbtDT.setBackground(new java.awt.Color(41, 183, 230));
        jbtDT.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbtDT.setForeground(new java.awt.Color(255, 255, 255));
        jbtDT.setText("Đối Tác");
        jbtDT.setBorder(null);
        jbtDT.setBorderPainted(false);
        jbtDT.setContentAreaFilled(false);
        jbtDT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtDT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtDTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtDTMouseExited(evt);
            }
        });
        jbtDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtDTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnDTLayout = new javax.swing.GroupLayout(jpnDT);
        jpnDT.setLayout(jpnDTLayout);
        jpnDTLayout.setHorizontalGroup(
            jpnDTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnDTLayout.createSequentialGroup()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtDT, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15))
        );
        jpnDTLayout.setVerticalGroup(
            jpnDTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnDTLayout.createSequentialGroup()
                .addGroup(jpnDTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jpnDTLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jbtDT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnThongKe.setBackground(new java.awt.Color(41, 183, 230));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thong ke bd 30x51.png"))); // NOI18N

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/border right 30x51.png"))); // NOI18N

        jbtThongKe.setBackground(new java.awt.Color(41, 183, 230));
        jbtThongKe.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbtThongKe.setForeground(new java.awt.Color(255, 255, 255));
        jbtThongKe.setText("Thống kê");
        jbtThongKe.setBorder(null);
        jbtThongKe.setBorderPainted(false);
        jbtThongKe.setContentAreaFilled(false);
        jbtThongKe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtThongKeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtThongKeMouseExited(evt);
            }
        });
        jbtThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtThongKeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnThongKeLayout = new javax.swing.GroupLayout(jpnThongKe);
        jpnThongKe.setLayout(jpnThongKeLayout);
        jpnThongKeLayout.setHorizontalGroup(
            jpnThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThongKeLayout.createSequentialGroup()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17))
        );
        jpnThongKeLayout.setVerticalGroup(
            jpnThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThongKeLayout.createSequentialGroup()
                .addGroup(jpnThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jpnThongKeLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jbtThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jbtHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/house bt 50x30.png"))); // NOI18N
        jbtHome.setBorder(null);
        jbtHome.setBorderPainted(false);
        jbtHome.setContentAreaFilled(false);
        jbtHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtHomeMouseExited(evt);
            }
        });
        jbtHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnHomeLayout = new javax.swing.GroupLayout(jpnHome);
        jpnHome.setLayout(jpnHomeLayout);
        jpnHomeLayout.setHorizontalGroup(
            jpnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnHomeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbtHome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpnHomeLayout.setVerticalGroup(
            jpnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnHomeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbtHome))
        );

        jlbUser.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jlbUser.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLbQuyen.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLbQuyen.setForeground(new java.awt.Color(51, 255, 51));
        jLbQuyen.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jpnHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jpnTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jpnTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jpnPN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jpnPX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jpnNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jpnKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jpnDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jpnThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jlbUser, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLbQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlbUser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLbQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jpnHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpnTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jpnTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jpnPN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jpnPX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jpnNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jpnKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jpnDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jpnThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPnView, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 811, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPnView, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtTKActionPerformed
        // TODO add your handling code here:
        
        if(quyen.equals("employee"))
        {
            JOptionPane.showMessageDialog(this, "Tài khoản của bạn không có quyền truy cập chức năng này","Thông báo",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            jPnView.removeAll();
            jPnView.setLayout(new BorderLayout());
            jPnView.add(new FrameAccount());
            jPnView.validate();
            jPnView.repaint();
        }
        
        
    }//GEN-LAST:event_jbtTKActionPerformed

    private void jbtTKMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtTKMouseExited
        // TODO add your handling code here:
       
            jpnTK.setBackground(new Color(41,183,230));
            jbtTK.setBackground(new Color(41,183,230));
        
        
    }//GEN-LAST:event_jbtTKMouseExited

    private void jbtTKMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtTKMouseEntered
        // TODO add your handling code here:
        jpnTK.setBackground(new Color(15,150,200));
        jbtTK.setBackground(new Color(15,150,200));
    }//GEN-LAST:event_jbtTKMouseEntered

    private void jbtTBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtTBMouseEntered
        // TODO add your handling code here:
        jpnTB.setBackground(new Color(15,150,200));
        jbtTB.setBackground(new Color(15,150,200));
    }//GEN-LAST:event_jbtTBMouseEntered

    private void jbtTBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtTBMouseExited
       
            jpnTB.setBackground(new Color(41,183,230));
            jbtTB.setBackground(new Color(41,183,230));
        
       
    }//GEN-LAST:event_jbtTBMouseExited

    private void jbtTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtTBActionPerformed
        // TODO add your handling code here:
        
        if(quyen.equals("employee") || quyen.equals("manager"))
        {
            jPnView.removeAll();
            jPnView.setLayout(new BorderLayout());
            jPnView.add(new FrameTB());
            jPnView.validate();
            jPnView.repaint();
            
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Tài khoản của bạn không có quyền truy cập chức năng này","Thông báo",JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_jbtTBActionPerformed

    private void jbtPNMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtPNMouseEntered
        jpnPN.setBackground(new Color(15,150,200));
        jbtPN.setBackground(new Color(15,150,200));
    }//GEN-LAST:event_jbtPNMouseEntered

    private void jbtPNMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtPNMouseExited
        jpnPN.setBackground(new Color(41,183,230));
        jbtPN.setBackground(new Color(41,183,230));
    }//GEN-LAST:event_jbtPNMouseExited

    private void jbtPNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPNActionPerformed
        // TODO add your handling code here:
        if(quyen.equals("employee") || quyen.equals("manager"))
        {
            jPnView.removeAll();
            jPnView.setLayout(new BorderLayout());
            jPnView.add(new FramePN());
            jPnView.validate();
            jPnView.repaint();
            
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Tài khoản của bạn không có quyền truy cập chức năng này","Thông báo",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jbtPNActionPerformed

    private void jbtPXMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtPXMouseEntered
        jpnPX.setBackground(new Color(15,150,200));
        jbtPX.setBackground(new Color(15,150,200));
    }//GEN-LAST:event_jbtPXMouseEntered

    private void jbtPXMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtPXMouseExited
        jpnPX.setBackground(new Color(41,183,230));
        jbtPX.setBackground(new Color(41,183,230));
    }//GEN-LAST:event_jbtPXMouseExited

    private void jbtPXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPXActionPerformed
        // TODO add your handling code here:
        if(quyen.equals("employee") || quyen.equals("manager"))
        {
            FrameAddPhieuXuat a =new FrameAddPhieuXuat();
            a.setVisible(true);
            a.setLocationRelativeTo(null);
            a.setResizable(false);
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Tài khoản của bạn không có quyền truy cập chức năng này","Thông báo",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jbtPXActionPerformed

    private void jbtNVMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtNVMouseEntered
        jpnNV.setBackground(new Color(15,150,200));
        jbtNV.setBackground(new Color(15,150,200));
    }//GEN-LAST:event_jbtNVMouseEntered

    private void jbtNVMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtNVMouseExited
        jpnNV.setBackground(new Color(41,183,230));
        jbtNV.setBackground(new Color(41,183,230));
    }//GEN-LAST:event_jbtNVMouseExited

    private void jbtNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtNVActionPerformed
        // TODO add your handling code here:
        if(quyen.equals("admin") || quyen.equals("manager"))
        {
            jPnView.removeAll();
            jPnView.setLayout(new BorderLayout());
            jPnView.add(new FrameNhanVien());
            jPnView.validate();
            jPnView.repaint();
            
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Tài khoản của bạn không có quyền truy cập chức năng này","Thông báo",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jbtNVActionPerformed

    private void jbtKHMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtKHMouseEntered
        jpnKH.setBackground(new Color(15,150,200));
        jbtKH.setBackground(new Color(15,150,200));
    }//GEN-LAST:event_jbtKHMouseEntered

    private void jbtKHMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtKHMouseExited
        jpnKH.setBackground(new Color(41,183,230));
        jbtKH.setBackground(new Color(41,183,230));
    }//GEN-LAST:event_jbtKHMouseExited

    private void jbtKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtKHActionPerformed
        // TODO add your handling code here:
        if(quyen.equals("employee") || quyen.equals("manager"))
        {
            jPnView.removeAll();
            jPnView.setLayout(new BorderLayout());
            jPnView.add(new FrameKhachHang());
            jPnView.validate();
            jPnView.repaint();
            
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Tài khoản của bạn không có quyền truy cập chức năng này","Thông báo",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jbtKHActionPerformed

    private void jbtDTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtDTMouseEntered
        jpnDT.setBackground(new Color(15,150,200));
        jbtDT.setBackground(new Color(15,150,200));
    }//GEN-LAST:event_jbtDTMouseEntered

    private void jbtDTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtDTMouseExited
        jpnDT.setBackground(new Color(41,183,230));
        jbtDT.setBackground(new Color(41,183,230));
    }//GEN-LAST:event_jbtDTMouseExited

    private void jbtDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDTActionPerformed
        // TODO add your handling code here:
        if(quyen.equals("employee") || quyen.equals("manager"))
        {
            jPnView.removeAll();
            jPnView.setLayout(new BorderLayout());
            jPnView.add(new FrameDoiTac());
            jPnView.validate();
            jPnView.repaint();
            
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Tài khoản của bạn không có quyền truy cập chức năng này","Thông báo",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jbtDTActionPerformed

    private void jbtThongKeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtThongKeMouseEntered
        jpnThongKe.setBackground(new Color(15,150,200));
        jbtThongKe.setBackground(new Color(15,150,200));
    }//GEN-LAST:event_jbtThongKeMouseEntered

    private void jbtThongKeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtThongKeMouseExited
        jpnThongKe.setBackground(new Color(41,183,230));
        jbtThongKe.setBackground(new Color(41,183,230));
    }//GEN-LAST:event_jbtThongKeMouseExited

    private void jbtThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtThongKeActionPerformed
        // TODO add your handling code here:
        jPnView.removeAll();
            jPnView.setLayout(new BorderLayout());
            jPnView.add(new FrameThongKe());
            jPnView.validate();
            jPnView.repaint();
    }//GEN-LAST:event_jbtThongKeActionPerformed

    private void jbtHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtHomeActionPerformed
        jPnView.removeAll();
            jPnView.setLayout(new BorderLayout());
            jPnView.add(new FrameThongKe());
            jPnView.validate();
            jPnView.repaint();
    }//GEN-LAST:event_jbtHomeActionPerformed

    private void jbtHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtHomeMouseExited
        // TODO add your handling code here:
        jpnHome.setBackground(Color.BLACK);
        jpnHome.setBackground(Color.BLACK);
    }//GEN-LAST:event_jbtHomeMouseExited

    private void jbtHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtHomeMouseEntered
        // TODO add your handling code here:
        jpnHome.setBackground(Color.RED);
        jpnHome.setBackground(Color.RED);
    }//GEN-LAST:event_jbtHomeMouseEntered

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        dispose();
        new DNDK().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        FrameDoiPass f = new FrameDoiPass();
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jbtTKMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtTKMousePressed
        // TODO add your handling code here:
        jpnTK.setBackground(new Color(15,150,200));
        jbtTK.setBackground(new Color(15,150,200));
    }//GEN-LAST:event_jbtTKMousePressed

    private void jbtTBMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtTBMousePressed
        // TODO add your handling code here:
        jpnTB.setBackground(new Color(15,150,200));
        jbtTB.setBackground(new Color(15,150,200));
    }//GEN-LAST:event_jbtTBMousePressed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLbQuyen;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPnView;
    private javax.swing.JButton jbtDT;
    private javax.swing.JButton jbtHome;
    private javax.swing.JButton jbtKH;
    private javax.swing.JButton jbtNV;
    private javax.swing.JButton jbtPN;
    private javax.swing.JButton jbtPX;
    private javax.swing.JButton jbtTB;
    private javax.swing.JButton jbtTK;
    private javax.swing.JButton jbtThongKe;
    private javax.swing.JLabel jlbUser;
    private javax.swing.JPanel jpnDT;
    private javax.swing.JPanel jpnHome;
    private javax.swing.JPanel jpnKH;
    private javax.swing.JPanel jpnNV;
    private javax.swing.JPanel jpnPN;
    private javax.swing.JPanel jpnPX;
    private javax.swing.JPanel jpnTB;
    private javax.swing.JPanel jpnTK;
    private javax.swing.JPanel jpnThongKe;
    // End of variables declaration//GEN-END:variables
}
