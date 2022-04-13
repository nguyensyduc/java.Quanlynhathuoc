/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Dao.QlyNVDao;
import Entity.QlyNV;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.util.List;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class TC_QuanLyNV extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public TC_QuanLyNV() {
        initComponents();
        LoadData();
        SetControls();
        btnThem.setBackground(Color.green);
        btnSua.setBackground(Color.green);
        btnXoa.setBackground(Color.green);
        btnHuy.setBackground(Color.green);
        
        
        txtMaNV.setEditable(false);
        txtTenNV.setEditable(false);
        txtNgaySinh.setEditable(false);
        txtLuong.setEditable(false);
        txtQue.setEditable(false);
        rdoNam.setEnabled(false);
        rdoNu.setEnabled(false);
        btnThem.setVisible(false);
        btnSua.setVisible(false);
        btnXoa.setVisible(false);
        btnHuy.setVisible(false);
    }
    public void SetControls(){
        txtMaNV.setText("");
        txtTenNV.setText("");
        txtLuong.setText("");
        txtNgaySinh.setText("");
        txtQue.setText("");
        txtMaNV.setEditable(false);
        txtTenNV.setEditable(false);
        txtNgaySinh.setEditable(false);
        txtLuong.setEditable(false);
        txtQue.setEditable(false);
        rdoNam.setEnabled(false);
        rdoNu.setEnabled(false);
        btnThem.setVisible(false);
        btnSua.setVisible(false);
        btnXoa.setVisible(false);
        btnHuy.setVisible(false);

        btnOptionThem.setVisible(true);
        btnOptionSua.setVisible(true);
        btnOptionXoa.setVisible(true);
    }
    String selectImagePath="";
    QlyNV nv = new QlyNV();
    QlyNVDao nvDao = new QlyNVDao();
    DefaultTableModel tableModel;
    public void LoadData(){
//        String[] columnName={"Mã nhân viên","Tên nhân viên","Lương cơ bản","Quê quán","Ngày sinh","Giới tính"};
//        Object[] rowData;
//        tableModel.setColumnIdentifiers(columnName);
//        List<QlyNV> list = nvDao.getAll();
//        for (QlyNV qlyNV : list) {
//            rowData = new Object[]{qlyNV.getManv(),qlyNV.getTennv(),qlyNV.getLuongCb(),qlyNV.getQuequan(),qlyNV.getNgaysinh(),qlyNV.getGioitinh()};
//            tableModel.addRow(rowData);
//        }
        Vector vctHeader = new Vector();
        Vector vctData = new Vector();
        
        vctHeader.add("Mã nhân viên");
        vctHeader.add("Tên nhân viên");
        vctHeader.add("Lương cơ bản");
        vctHeader.add("Quê quán");
        vctHeader.add("Ngày sinh");
        vctHeader.add("Giới tính");
        vctHeader.add("Hình ảnh");
        List<QlyNV> list = nvDao.getAll();
        list.stream().map(danhuc -> {
            Vector vector = new Vector();
            vector.add(danhuc.getManv());
            vector.add(danhuc.getTennv());
            vector.add(danhuc.getLuongCb());
            vector.add(danhuc.getQuequan());
            vector.add(danhuc.getNgaysinh());
            vector.add(danhuc.getGioitinh());
            vector.add(danhuc.getHinhanh());
            return vector;
        }).forEachOrdered(vector -> {
            vctData.add(vector);
        });
        tableModel = new DefaultTableModel(vctData,vctHeader);
        tableNV.setModel(tableModel);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtMaNV = new javax.swing.JTextField();
        txtTenNV = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNgaySinh = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();
        btnImage = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtQue = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        txtLuong = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        btnOptionThem = new javax.swing.JButton();
        btnOptionSua = new javax.swing.JButton();
        btnOptionXoa = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableNV = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jPanel4.setBackground(new java.awt.Color(255, 255, 102));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Thông tin nhân viên: "));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Mã Nhân Viên");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Tên Nhân Viên");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Ngày Sinh");

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnImage.setText("Chọn Ảnh");
        btnImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(btnImage)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(btnImage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Lương Cơ bản");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Quê Quán");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Giới tính");

        buttonGroup1.add(rdoNam);
        rdoNam.setText("Nam");

        buttonGroup1.add(rdoNu);
        rdoNu.setText("Nữ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rdoNam, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdoNu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtMaNV)
                    .addComponent(txtTenNV)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtLuong)
                    .addComponent(txtQue, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(71, 71, 71))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtQue, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdoNam)
                            .addComponent(rdoNu)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Tác vụ"));

        btnThem.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnThem.setText("Thêm nhân viên");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSua.setText("Sửa nhân viên");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnXoa.setText("Xóa nhân viên");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnHuy.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnHuy.setText("Hủy thao tác");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        btnOptionThem.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnOptionThem.setText("Thêm nhân viên");
        btnOptionThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOptionThemActionPerformed(evt);
            }
        });

        btnOptionSua.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnOptionSua.setText("Sửa nhân viên");
        btnOptionSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOptionSuaActionPerformed(evt);
            }
        });

        btnOptionXoa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnOptionXoa.setText("Xóa nhân viên");
        btnOptionXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOptionXoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnThem)
                .addGap(94, 94, 94)
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123)
                .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(btnOptionThem)
                .addGap(160, 160, 160)
                .addComponent(btnOptionSua, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160)
                .addComponent(btnOptionXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnOptionXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnOptionThem, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnOptionSua, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Danh sách nhân viên: "));

        tableNV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã Nhân Viên", "Tên Nhân Viên", "Lương cơ bản", "Ngày sinh", "Giới tính", "Quê quán"
            }
        ));
        tableNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableNVMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableNV);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
        );

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 29)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ NHÂN VIÊN");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        String manv = txtMaNV.getText();
        String tennv = txtTenNV.getText();
        String luongCb = txtLuong.getText();
        String ngaysinh = txtNgaySinh.getText();
        String que = txtQue.getText();
        String gioitinh = "";
        String hinhanh = selectImagePath;
        if (tennv!=null && !tennv.equals("")) {
            int fluongCb = 0;
            try {
                fluongCb=Integer.parseInt(luongCb);
                if(rdoNam.isSelected()){
                    gioitinh = "Nam";
                }
                else{
                    gioitinh = "Nữ";
                }
                
            } catch (Exception e) {
                e.printStackTrace();
            }
            List<QlyNV> listCheck = nvDao.getmanv(txtMaNV.getText());
            if(listCheck.size()>0){
                JOptionPane.showMessageDialog(null, "Mã nhân viên bị trùng", "vui lòng kiểm tra lại", JOptionPane.ERROR_MESSAGE);
                txtMaNV.requestFocus();
            }
            else{
                if(nvDao.insert(new QlyNV(manv, tennv, fluongCb, que, ngaysinh, gioitinh, hinhanh))>0) {
                JOptionPane.showMessageDialog(null, "Thêm nhân viên "+txtTenNV.getText()+" thành công !");
                    SetControls();
                    LoadData();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Thêm mới thất bại !");
                }    
            }    
        }
        else{
            JOptionPane.showMessageDialog(null, "Bạn phải nhập tên nhân viên!!!!");
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        try {
            String manv = txtMaNV.getText();
            String tennv = txtTenNV.getText();
            String luongCb = txtLuong.getText();
            String ngaysinh = txtNgaySinh.getText();
            String que = txtQue.getText();
            String gioitinh = "";
            String hinhanh = selectImagePath;
            int fluongCb = 0;
            try {
                fluongCb=Integer.parseInt(luongCb);
                if(rdoNam.isSelected()){
                    gioitinh = "Nam";
                }
                else{
                    gioitinh = "Nữ";
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            QlyNV nv = new QlyNV(manv, tennv, fluongCb, que, ngaysinh, gioitinh, hinhanh);
            int tbao = JOptionPane.showConfirmDialog(null, "Bạn có muốn sửa nhân viên "+txtTenNV.getText() +" không", "!!!!!", JOptionPane.YES_NO_OPTION);
            if(tbao==JOptionPane.YES_OPTION){
                nvDao.update(nv);
                JOptionPane.showMessageDialog(null, "Sửa thành công");
                SetControls();
                LoadData();
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        try {
            String manv = txtMaNV.getText();
            String tennv = txtTenNV.getText();
            String luongCb = txtLuong.getText();
            String ngaysinh = txtNgaySinh.getText();
            String que = txtQue.getText();
            String gioitinh = "";
            String hinhanh = selectImagePath;
            int fluongCb = 0;
            try {
                fluongCb=Integer.parseInt(luongCb);
                if(rdoNam.isSelected()){
                    gioitinh = "Nam";
                }
                else{
                    gioitinh = "Nữ";
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            QlyNV nv = new QlyNV(manv, tennv, fluongCb, que, ngaysinh, gioitinh, hinhanh);
            int tbao = JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa nhân viên "+txtTenNV.getText() +" không", "!!!!!", JOptionPane.YES_NO_OPTION);
            if(tbao==JOptionPane.YES_OPTION){
                nvDao.delete(nv);
                JOptionPane.showMessageDialog(null, "Xóa thành công");
                SetControls();
                LoadData();
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        SetControls();
    }//GEN-LAST:event_btnHuyActionPerformed

    private void btnOptionThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOptionThemActionPerformed
        txtMaNV.setEditable(true);
        txtTenNV.setEditable(true);
        txtNgaySinh.setEditable(true);
        txtLuong.setEditable(true);
        txtQue.setEditable(true);
        rdoNam.setEnabled(true);
        rdoNu.setEnabled(true);
        btnSua.setEnabled(false);
        btnXoa.setEnabled(false);
        btnThem.setEnabled(true);

        btnThem.setVisible(true);
        btnHuy.setVisible(true);
        btnSua.setVisible(true);
        btnXoa.setVisible(true);
        btnOptionThem.setVisible(false);
        btnOptionSua.setVisible(false);
        btnOptionXoa.setVisible(false);
    }//GEN-LAST:event_btnOptionThemActionPerformed

    private void btnOptionSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOptionSuaActionPerformed
        txtMaNV.setEditable(false);
        txtTenNV.setEditable(true);
        txtNgaySinh.setEditable(true);
        txtLuong.setEditable(true);
        txtQue.setEditable(true);
        rdoNam.setEnabled(true);
        rdoNu.setEnabled(true);
        btnThem.setEnabled(false);
        btnXoa.setEnabled(false);
        btnSua.setEnabled(true);

        btnThem.setVisible(true);
        btnHuy.setVisible(true);
        btnSua.setVisible(true);
        btnXoa.setVisible(true);
        btnOptionThem.setVisible(false);
        btnOptionSua.setVisible(false);
        btnOptionXoa.setVisible(false);
    }//GEN-LAST:event_btnOptionSuaActionPerformed

    private void btnOptionXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOptionXoaActionPerformed
        btnSua.setEnabled(false);
        btnThem.setEnabled(false);
        btnXoa.setEnabled(true);

        btnThem.setVisible(true);
        btnHuy.setVisible(true);
        btnSua.setVisible(true);
        btnXoa.setVisible(true);
        btnOptionThem.setVisible(false);
        btnOptionSua.setVisible(false);
        btnOptionXoa.setVisible(false);
    }//GEN-LAST:event_btnOptionXoaActionPerformed

    private void tableNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableNVMouseClicked
        int index = tableNV.getSelectedRow();
        txtMaNV.setText((String)(tableModel.getValueAt(index,0)));
        txtTenNV.setText((String)(tableModel.getValueAt(index,1)));
        txtLuong.setText((String.valueOf(tableModel.getValueAt(index,2))));
        txtQue.setText((String)(tableModel.getValueAt(index,3)));
        txtNgaySinh.setText((String)(tableModel.getValueAt(index,4)));
        String gioitinh=tableModel.getValueAt(index, 5).toString();
        if(gioitinh.equals("Nam")){
            rdoNam.setSelected(true);
        }
        else{
            rdoNu.setSelected(true);
        }
        String path = tableModel.getValueAt(index,6).toString();
        ImageIcon ii = new ImageIcon(path);
        Image image = ii.getImage().getScaledInstance(lblImage.getWidth(), lblImage.getHeight(), Image.SCALE_SMOOTH);
        lblImage.setIcon(new ImageIcon(image));
    }//GEN-LAST:event_tableNVMouseClicked

    private void btnImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImageActionPerformed
        try {
            JFileChooser fileChooser = new JFileChooser("C:/Users/ADMIN/Documents/NetBeansProjects/BaiTapNhomJava/src");
            FileNameExtensionFilter imageFilter = new FileNameExtensionFilter("hinh anh", "png","jpg");
            fileChooser.addChoosableFileFilter(imageFilter);
            fileChooser.setFileFilter(imageFilter);
            fileChooser.setMultiSelectionEnabled(false);
            int x = fileChooser.showOpenDialog(null);
            if(x==JFileChooser.APPROVE_OPTION){
                File f = fileChooser.getSelectedFile();
                selectImagePath = f.getAbsolutePath();
                ImageIcon ii = new ImageIcon(selectImagePath);
                Image image = ii.getImage().getScaledInstance(lblImage.getWidth(), lblImage.getHeight(), Image.SCALE_SMOOTH);
                lblImage.setIcon(new ImageIcon(image));
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnImageActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnImage;
    private javax.swing.JButton btnOptionSua;
    private javax.swing.JButton btnOptionThem;
    private javax.swing.JButton btnOptionXoa;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImage;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTable tableNV;
    private javax.swing.JTextField txtLuong;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtQue;
    private javax.swing.JTextField txtTenNV;
    // End of variables declaration//GEN-END:variables
}
