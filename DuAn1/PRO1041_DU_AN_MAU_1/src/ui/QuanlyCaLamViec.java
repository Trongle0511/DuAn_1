/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package ui;
/**
 *
 * @author PC
 */
public class QuanlyCaLamViec extends javax.swing.JDialog {

    /**
     * Creates new form QuanlyCaLamViec
     */
    public QuanlyCaLamViec(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
    }
    public void init(){
        setLocationRelativeTo(this);
        setTitle("Ca Làm Việc");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnTong = new javax.swing.JPanel();
        jpnDanhMuc = new javax.swing.JPanel();
        btnHoaDon = new javax.swing.JButton();
        btnViTri = new javax.swing.JButton();
        btnChucVu = new javax.swing.JButton();
        btnNhanVien = new javax.swing.JButton();
        btnThongKe = new javax.swing.JButton();
        btnKho = new javax.swing.JButton();
        btnDoUong = new javax.swing.JButton();
        btnNhapHang = new javax.swing.JButton();
        jpnQuanLyTacVu = new javax.swing.JPanel();
        jpnQuanLyCaLamViec = new javax.swing.JPanel();
        lblMaNV = new javax.swing.JLabel();
        lblTenNV = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        txtKhuVuc = new javax.swing.JTextField();
        btnThemKV = new javax.swing.JButton();
        btnSuaKV = new javax.swing.JButton();
        btnNhapLaiKV = new javax.swing.JButton();
        btnXoaKhuVuc = new javax.swing.JButton();
        txtTenNV = new javax.swing.JTextField();
        lblKhuVuc = new javax.swing.JLabel();
        cboBuoiLamViec = new javax.swing.JComboBox<>();
        lblBuoiLamViec = new javax.swing.JLabel();
        btnPrev = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        lblQuanLyCaLamViec = new javax.swing.JLabel();
        jpnBangKhuVuc = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKhuVuc = new javax.swing.JTable();
        jpnTimKiem = new javax.swing.JPanel();
        lblBuoiLamViecTK = new javax.swing.JLabel();
        lblKhuVucTK = new javax.swing.JLabel();
        txtKhuVucTK = new javax.swing.JTextField();
        cboBuoiLamViecTK = new javax.swing.JComboBox<>();
        btnTimKiem = new javax.swing.JButton();
        lblTimKiem = new javax.swing.JLabel();
        lbllogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jpnDanhMuc.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Quản lý Chức Năng\n\n", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 17))); // NOI18N
        jpnDanhMuc.setName(""); // NOI18N

        btnHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/List.png"))); // NOI18N
        btnHoaDon.setText("HÓA ĐƠN");
        btnHoaDon.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnViTri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Smile.png"))); // NOI18N
        btnViTri.setText("CA LÀM VIỆC");
        btnViTri.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnChucVu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Certificate.png"))); // NOI18N
        btnChucVu.setText("CHỨC VỤ ");
        btnChucVu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/User.png"))); // NOI18N
        btnNhanVien.setText("NHÂN VIÊN ");
        btnNhanVien.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Bell.png"))); // NOI18N
        btnThongKe.setText("THỐNG KÊ");
        btnThongKe.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnKho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Brick house.png"))); // NOI18N
        btnKho.setText("KHO");
        btnKho.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnDoUong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Yin-Yang.png"))); // NOI18N
        btnDoUong.setText("ĐỒ UỐNG");
        btnDoUong.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnNhapHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Scroll list.png"))); // NOI18N
        btnNhapHang.setText("NHẬP HÀNG");
        btnNhapHang.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jpnDanhMucLayout = new javax.swing.GroupLayout(jpnDanhMuc);
        jpnDanhMuc.setLayout(jpnDanhMucLayout);
        jpnDanhMucLayout.setHorizontalGroup(
            jpnDanhMucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnDanhMucLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpnDanhMucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDoUong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThongKe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNhapHang, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                    .addComponent(btnKho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnChucVu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnViTri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnDanhMucLayout.setVerticalGroup(
            jpnDanhMucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnDanhMucLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnViTri, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnDoUong, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnKho, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnNhapHang, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpnQuanLyTacVu.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Quản lý tác vụ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N

        jpnQuanLyCaLamViec.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblMaNV.setText("Mã NV:");

        lblTenNV.setText("Tên NV:");

        btnThemKV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Add.png"))); // NOI18N
        btnThemKV.setText("THÊM ");
        btnThemKV.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnThemKV.setVerifyInputWhenFocusTarget(false);
        btnThemKV.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnThemKV.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnSuaKV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Edit.png"))); // NOI18N
        btnSuaKV.setText("SỬA ");
        btnSuaKV.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSuaKV.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnNhapLaiKV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Refresh.png"))); // NOI18N
        btnNhapLaiKV.setText("NHẬP LẠI ");
        btnNhapLaiKV.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNhapLaiKV.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnNhapLaiKV.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnXoaKhuVuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Delete.png"))); // NOI18N
        btnXoaKhuVuc.setText("XÓA");
        btnXoaKhuVuc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnXoaKhuVuc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lblKhuVuc.setText("Khu vực:");

        cboBuoiLamViec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sáng ", "Sáng Trưa", "Trưa", "Trưa Tối", "Tối", "Tối Sáng" }));

        lblBuoiLamViec.setText("Buổi làm việc:");

        btnPrev.setText("<<");
        btnPrev.setEnabled(false);

        btnFirst.setText("|<");
        btnFirst.setEnabled(false);

        btnNext.setText(">>");
        btnNext.setEnabled(false);

        btnLast.setText(">|");
        btnLast.setEnabled(false);

        javax.swing.GroupLayout jpnQuanLyCaLamViecLayout = new javax.swing.GroupLayout(jpnQuanLyCaLamViec);
        jpnQuanLyCaLamViec.setLayout(jpnQuanLyCaLamViecLayout);
        jpnQuanLyCaLamViecLayout.setHorizontalGroup(
            jpnQuanLyCaLamViecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQuanLyCaLamViecLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnQuanLyCaLamViecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnQuanLyCaLamViecLayout.createSequentialGroup()
                        .addComponent(lblTenNV)
                        .addGap(18, 18, 18)
                        .addComponent(txtTenNV))
                    .addGroup(jpnQuanLyCaLamViecLayout.createSequentialGroup()
                        .addComponent(lblKhuVuc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtKhuVuc))
                    .addGroup(jpnQuanLyCaLamViecLayout.createSequentialGroup()
                        .addGroup(jpnQuanLyCaLamViecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnQuanLyCaLamViecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jpnQuanLyCaLamViecLayout.createSequentialGroup()
                                    .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(57, 57, 57)
                                    .addComponent(btnPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(60, 60, 60)
                                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(56, 56, 56)
                                    .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jpnQuanLyCaLamViecLayout.createSequentialGroup()
                                    .addComponent(lblBuoiLamViec)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cboBuoiLamViec, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(216, 216, 216)))
                            .addGroup(jpnQuanLyCaLamViecLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnThemKV, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSuaKV, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNhapLaiKV, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnXoaKhuVuc, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpnQuanLyCaLamViecLayout.createSequentialGroup()
                                .addComponent(lblMaNV)
                                .addGap(21, 21, 21)
                                .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpnQuanLyCaLamViecLayout.setVerticalGroup(
            jpnQuanLyCaLamViecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQuanLyCaLamViecLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnQuanLyCaLamViecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaNV)
                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnQuanLyCaLamViecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTenNV)
                    .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnQuanLyCaLamViecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKhuVuc)
                    .addComponent(txtKhuVuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnQuanLyCaLamViecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboBuoiLamViec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBuoiLamViec))
                .addGap(52, 52, 52)
                .addGroup(jpnQuanLyCaLamViecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFirst)
                    .addComponent(btnPrev)
                    .addComponent(btnNext)
                    .addComponent(btnLast))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpnQuanLyCaLamViecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThemKV, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSuaKV)
                    .addComponent(btnNhapLaiKV)
                    .addComponent(btnXoaKhuVuc))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        lblQuanLyCaLamViec.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblQuanLyCaLamViec.setText("Quản lý ca làm việc");

        jpnBangKhuVuc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblKhuVuc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "MÃ NV", "TÊN NV", "KHU VỰC", "BUỔI LÀM VIỆC", "THỜI GIAN"
            }
        ));
        jScrollPane1.setViewportView(tblKhuVuc);

        javax.swing.GroupLayout jpnBangKhuVucLayout = new javax.swing.GroupLayout(jpnBangKhuVuc);
        jpnBangKhuVuc.setLayout(jpnBangKhuVucLayout);
        jpnBangKhuVucLayout.setHorizontalGroup(
            jpnBangKhuVucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnBangKhuVucLayout.createSequentialGroup()
                .addGap(0, 3, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpnBangKhuVucLayout.setVerticalGroup(
            jpnBangKhuVucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnBangKhuVucLayout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jpnTimKiem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblBuoiLamViecTK.setText("Buổi làm việc:");

        lblKhuVucTK.setText("Khu vực:");

        cboBuoiLamViecTK.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sáng ", "Sáng Trưa", "Trưa", "Trưa Tối", "Tối", "Tối Sáng" }));

        btnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Zoom.png"))); // NOI18N
        btnTimKiem.setText("Tìm Kiếm");

        javax.swing.GroupLayout jpnTimKiemLayout = new javax.swing.GroupLayout(jpnTimKiem);
        jpnTimKiem.setLayout(jpnTimKiemLayout);
        jpnTimKiemLayout.setHorizontalGroup(
            jpnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTimKiemLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jpnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpnTimKiemLayout.createSequentialGroup()
                        .addGroup(jpnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblKhuVucTK)
                            .addComponent(lblBuoiLamViecTK))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtKhuVucTK)
                            .addComponent(cboBuoiLamViecTK, 0, 340, Short.MAX_VALUE))))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jpnTimKiemLayout.setVerticalGroup(
            jpnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTimKiemLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jpnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuoiLamViecTK)
                    .addComponent(cboBuoiLamViecTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtKhuVucTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblKhuVucTK))
                .addGap(55, 55, 55)
                .addComponent(btnTimKiem)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        lblTimKiem.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblTimKiem.setText("Tìm kiếm Thông Tin ");

        javax.swing.GroupLayout jpnQuanLyTacVuLayout = new javax.swing.GroupLayout(jpnQuanLyTacVu);
        jpnQuanLyTacVu.setLayout(jpnQuanLyTacVuLayout);
        jpnQuanLyTacVuLayout.setHorizontalGroup(
            jpnQuanLyTacVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQuanLyTacVuLayout.createSequentialGroup()
                .addGroup(jpnQuanLyTacVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnQuanLyTacVuLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(lblQuanLyCaLamViec))
                    .addGroup(jpnQuanLyTacVuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTimKiem))
                    .addGroup(jpnQuanLyTacVuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpnQuanLyTacVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpnQuanLyCaLamViec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jpnBangKhuVuc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnQuanLyTacVuLayout.setVerticalGroup(
            jpnQuanLyTacVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnQuanLyTacVuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnQuanLyTacVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpnBangKhuVuc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpnQuanLyTacVuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblQuanLyCaLamViec)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpnQuanLyCaLamViec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblTimKiem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
        );

        lbllogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/coffee.png"))); // NOI18N
        lbllogo.setFocusable(false);

        javax.swing.GroupLayout jpnTongLayout = new javax.swing.GroupLayout(jpnTong);
        jpnTong.setLayout(jpnTongLayout);
        jpnTongLayout.setHorizontalGroup(
            jpnTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTongLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnDanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpnTongLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lbllogo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnQuanLyTacVu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );
        jpnTongLayout.setVerticalGroup(
            jpnTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnTongLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnTongLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbllogo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jpnDanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jpnQuanLyTacVu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnTong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jpnTong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(QuanlyCaLamViec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanlyCaLamViec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanlyCaLamViec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanlyCaLamViec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                QuanlyCaLamViec dialog = new QuanlyCaLamViec(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChucVu;
    private javax.swing.JButton btnDoUong;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnHoaDon;
    private javax.swing.JButton btnKho;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnNhanVien;
    private javax.swing.JButton btnNhapHang;
    private javax.swing.JButton btnNhapLaiKV;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnSuaKV;
    private javax.swing.JButton btnThemKV;
    private javax.swing.JButton btnThongKe;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnViTri;
    private javax.swing.JButton btnXoaKhuVuc;
    private javax.swing.JComboBox<String> cboBuoiLamViec;
    private javax.swing.JComboBox<String> cboBuoiLamViecTK;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpnBangKhuVuc;
    private javax.swing.JPanel jpnDanhMuc;
    private javax.swing.JPanel jpnQuanLyCaLamViec;
    private javax.swing.JPanel jpnQuanLyTacVu;
    private javax.swing.JPanel jpnTimKiem;
    private javax.swing.JPanel jpnTong;
    private javax.swing.JLabel lblBuoiLamViec;
    private javax.swing.JLabel lblBuoiLamViecTK;
    private javax.swing.JLabel lblKhuVuc;
    private javax.swing.JLabel lblKhuVucTK;
    private javax.swing.JLabel lblMaNV;
    private javax.swing.JLabel lblQuanLyCaLamViec;
    private javax.swing.JLabel lblTenNV;
    private javax.swing.JLabel lblTimKiem;
    private javax.swing.JLabel lbllogo;
    private javax.swing.JTable tblKhuVuc;
    private javax.swing.JTextField txtKhuVuc;
    private javax.swing.JTextField txtKhuVucTK;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtTenNV;
    // End of variables declaration//GEN-END:variables
}
