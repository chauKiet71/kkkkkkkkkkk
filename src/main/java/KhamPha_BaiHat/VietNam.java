package KhamPha_BaiHat;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class VietNam extends javax.swing.JPanel {

    private static JLabel selectedLabel = null;

    public VietNam() {
        initComponents();
        init();
    }

    public void init() {
        hover(lbNhacTre);
        hover(lbCachMang);
        hover(lbRapViet);
        hover(lbRemixViet);
        hover(lbTruTinh);
        hover(lbRock);

    }

    public void hover(JLabel label) {
        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                label.setForeground(new Color(57, 201, 242));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Chỉ thay đổi border nếu label này không phải là label được chọn
                if (label != selectedLabel) {
                    label.setForeground(Color.WHITE);
                }
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                // Nếu có một label khác được chọn, loại bỏ border của nó
                if (selectedLabel != null) {
                    selectedLabel.setForeground(Color.WHITE);
                }

                // Thiết lập border cho label được chọn
                label.setForeground(new Color(57, 201, 242));
                // Cập nhật label được chọn
                selectedLabel = label;
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbNhacTre = new javax.swing.JLabel();
        lbRemixViet = new javax.swing.JLabel();
        lbTruTinh = new javax.swing.JLabel();
        lbRapViet = new javax.swing.JLabel();
        lbRock = new javax.swing.JLabel();
        lbCachMang = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        listBaiHat1 = new KhamPha_BaiHat.ListBaiHat<>();
        listBaiHat2 = new KhamPha_BaiHat.ListBaiHat<>();
        listBaiHat3 = new KhamPha_BaiHat.ListBaiHat<>();
        listBaiHat4 = new KhamPha_BaiHat.ListBaiHat<>();
        listBaiHat5 = new KhamPha_BaiHat.ListBaiHat<>();
        listBaiHat6 = new KhamPha_BaiHat.ListBaiHat<>();
        listBaiHat7 = new KhamPha_BaiHat.ListBaiHat<>();
        listBaiHat8 = new KhamPha_BaiHat.ListBaiHat<>();
        listBaiHat9 = new KhamPha_BaiHat.ListBaiHat<>();
        listBaiHat10 = new KhamPha_BaiHat.ListBaiHat<>();
        listBaiHat11 = new KhamPha_BaiHat.ListBaiHat<>();
        listBaiHat12 = new KhamPha_BaiHat.ListBaiHat<>();
        listBaiHat13 = new KhamPha_BaiHat.ListBaiHat<>();
        listBaiHat14 = new KhamPha_BaiHat.ListBaiHat<>();
        listBaiHat15 = new KhamPha_BaiHat.ListBaiHat<>();
        listBaiHat16 = new KhamPha_BaiHat.ListBaiHat<>();
        listBaiHat17 = new KhamPha_BaiHat.ListBaiHat<>();
        listBaiHat18 = new KhamPha_BaiHat.ListBaiHat<>();
        listBaiHat19 = new KhamPha_BaiHat.ListBaiHat<>();
        listBaiHat20 = new KhamPha_BaiHat.ListBaiHat<>();
        listBaiHat21 = new KhamPha_BaiHat.ListBaiHat<>();
        listBaiHat22 = new KhamPha_BaiHat.ListBaiHat<>();
        listBaiHat23 = new KhamPha_BaiHat.ListBaiHat<>();
        listBaiHat24 = new KhamPha_BaiHat.ListBaiHat<>();
        listBaiHat25 = new KhamPha_BaiHat.ListBaiHat<>();
        listBaiHat26 = new KhamPha_BaiHat.ListBaiHat<>();
        listBaiHat27 = new KhamPha_BaiHat.ListBaiHat<>();
        listBaiHat28 = new KhamPha_BaiHat.ListBaiHat<>();
        listBaiHat29 = new KhamPha_BaiHat.ListBaiHat<>();
        listBaiHat30 = new KhamPha_BaiHat.ListBaiHat<>();
        listBaiHat31 = new KhamPha_BaiHat.ListBaiHat<>();
        listBaiHat32 = new KhamPha_BaiHat.ListBaiHat<>();
        listBaiHat33 = new KhamPha_BaiHat.ListBaiHat<>();
        listBaiHat34 = new KhamPha_BaiHat.ListBaiHat<>();
        listBaiHat35 = new KhamPha_BaiHat.ListBaiHat<>();
        listBaiHat36 = new KhamPha_BaiHat.ListBaiHat<>();
        listBaiHat37 = new KhamPha_BaiHat.ListBaiHat<>();
        listBaiHat38 = new KhamPha_BaiHat.ListBaiHat<>();
        listBaiHat39 = new KhamPha_BaiHat.ListBaiHat<>();
        listBaiHat40 = new KhamPha_BaiHat.ListBaiHat<>();
        listBaiHat41 = new KhamPha_BaiHat.ListBaiHat<>();
        listBaiHat42 = new KhamPha_BaiHat.ListBaiHat<>();
        listBaiHat43 = new KhamPha_BaiHat.ListBaiHat<>();
        listBaiHat44 = new KhamPha_BaiHat.ListBaiHat<>();

        setBackground(new java.awt.Color(29, 38, 49));

        lbNhacTre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbNhacTre.setForeground(new java.awt.Color(255, 255, 255));
        lbNhacTre.setText("Nhạc Trẻ");
        lbNhacTre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbRemixViet.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbRemixViet.setForeground(new java.awt.Color(255, 255, 255));
        lbRemixViet.setText("Remix Việt");
        lbRemixViet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbTruTinh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTruTinh.setForeground(new java.awt.Color(255, 255, 255));
        lbTruTinh.setText("Trữ Tình");
        lbTruTinh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbRapViet.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbRapViet.setForeground(new java.awt.Color(255, 255, 255));
        lbRapViet.setText("Rap Việt");
        lbRapViet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbRock.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbRock.setForeground(new java.awt.Color(255, 255, 255));
        lbRock.setText("Rock Việt");
        lbRock.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbCachMang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbCachMang.setForeground(new java.awt.Color(255, 255, 255));
        lbCachMang.setText("Cách Mạng");
        lbCachMang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jPanel1.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(listBaiHat1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(listBaiHat2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(listBaiHat3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(listBaiHat4, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(listBaiHat5, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(listBaiHat6, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(listBaiHat7, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(listBaiHat8, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(listBaiHat9, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(listBaiHat10, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(listBaiHat11, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(listBaiHat12, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(listBaiHat16, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(listBaiHat13, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(listBaiHat15, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(listBaiHat14, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(listBaiHat19, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(listBaiHat17, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(listBaiHat18, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(listBaiHat20, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(listBaiHat24, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(listBaiHat22, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(listBaiHat21, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(listBaiHat23, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(listBaiHat28, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(listBaiHat26, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(listBaiHat25, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(listBaiHat27, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(listBaiHat35, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(listBaiHat31, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(listBaiHat34, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(listBaiHat29, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(listBaiHat33, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(listBaiHat36, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(listBaiHat32, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(listBaiHat30, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(listBaiHat39, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(listBaiHat41, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(listBaiHat38, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(listBaiHat37, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(listBaiHat42, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(listBaiHat40, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(listBaiHat44, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(listBaiHat43, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listBaiHat1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listBaiHat2, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listBaiHat3, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listBaiHat4, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listBaiHat5, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listBaiHat6, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listBaiHat7, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listBaiHat8, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listBaiHat9, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listBaiHat10, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listBaiHat11, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listBaiHat12, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listBaiHat16, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listBaiHat13, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listBaiHat15, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listBaiHat14, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listBaiHat19, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listBaiHat17, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listBaiHat18, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listBaiHat20, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listBaiHat28, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listBaiHat26, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listBaiHat25, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listBaiHat27, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listBaiHat24, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listBaiHat22, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listBaiHat21, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listBaiHat23, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listBaiHat33, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listBaiHat36, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listBaiHat32, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listBaiHat30, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listBaiHat35, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listBaiHat31, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listBaiHat34, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listBaiHat29, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listBaiHat39, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listBaiHat41, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listBaiHat38, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listBaiHat37, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listBaiHat42, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listBaiHat40, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listBaiHat44, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listBaiHat43, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addComponent(lbNhacTre)
                .addGap(18, 18, 18)
                .addComponent(lbRemixViet)
                .addGap(18, 18, 18)
                .addComponent(lbTruTinh)
                .addGap(18, 18, 18)
                .addComponent(lbRapViet)
                .addGap(18, 18, 18)
                .addComponent(lbRock)
                .addGap(18, 18, 18)
                .addComponent(lbCachMang)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNhacTre)
                    .addComponent(lbRemixViet)
                    .addComponent(lbTruTinh)
                    .addComponent(lbRapViet)
                    .addComponent(lbRock)
                    .addComponent(lbCachMang))
                .addGap(33, 33, 33)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbCachMang;
    private javax.swing.JLabel lbNhacTre;
    private javax.swing.JLabel lbRapViet;
    private javax.swing.JLabel lbRemixViet;
    private javax.swing.JLabel lbRock;
    private javax.swing.JLabel lbTruTinh;
    private KhamPha_BaiHat.ListBaiHat<String> listBaiHat1;
    private KhamPha_BaiHat.ListBaiHat<String> listBaiHat10;
    private KhamPha_BaiHat.ListBaiHat<String> listBaiHat11;
    private KhamPha_BaiHat.ListBaiHat<String> listBaiHat12;
    private KhamPha_BaiHat.ListBaiHat<String> listBaiHat13;
    private KhamPha_BaiHat.ListBaiHat<String> listBaiHat14;
    private KhamPha_BaiHat.ListBaiHat<String> listBaiHat15;
    private KhamPha_BaiHat.ListBaiHat<String> listBaiHat16;
    private KhamPha_BaiHat.ListBaiHat<String> listBaiHat17;
    private KhamPha_BaiHat.ListBaiHat<String> listBaiHat18;
    private KhamPha_BaiHat.ListBaiHat<String> listBaiHat19;
    private KhamPha_BaiHat.ListBaiHat<String> listBaiHat2;
    private KhamPha_BaiHat.ListBaiHat<String> listBaiHat20;
    private KhamPha_BaiHat.ListBaiHat<String> listBaiHat21;
    private KhamPha_BaiHat.ListBaiHat<String> listBaiHat22;
    private KhamPha_BaiHat.ListBaiHat<String> listBaiHat23;
    private KhamPha_BaiHat.ListBaiHat<String> listBaiHat24;
    private KhamPha_BaiHat.ListBaiHat<String> listBaiHat25;
    private KhamPha_BaiHat.ListBaiHat<String> listBaiHat26;
    private KhamPha_BaiHat.ListBaiHat<String> listBaiHat27;
    private KhamPha_BaiHat.ListBaiHat<String> listBaiHat28;
    private KhamPha_BaiHat.ListBaiHat<String> listBaiHat29;
    private KhamPha_BaiHat.ListBaiHat<String> listBaiHat3;
    private KhamPha_BaiHat.ListBaiHat<String> listBaiHat30;
    private KhamPha_BaiHat.ListBaiHat<String> listBaiHat31;
    private KhamPha_BaiHat.ListBaiHat<String> listBaiHat32;
    private KhamPha_BaiHat.ListBaiHat<String> listBaiHat33;
    private KhamPha_BaiHat.ListBaiHat<String> listBaiHat34;
    private KhamPha_BaiHat.ListBaiHat<String> listBaiHat35;
    private KhamPha_BaiHat.ListBaiHat<String> listBaiHat36;
    private KhamPha_BaiHat.ListBaiHat<String> listBaiHat37;
    private KhamPha_BaiHat.ListBaiHat<String> listBaiHat38;
    private KhamPha_BaiHat.ListBaiHat<String> listBaiHat39;
    private KhamPha_BaiHat.ListBaiHat<String> listBaiHat4;
    private KhamPha_BaiHat.ListBaiHat<String> listBaiHat40;
    private KhamPha_BaiHat.ListBaiHat<String> listBaiHat41;
    private KhamPha_BaiHat.ListBaiHat<String> listBaiHat42;
    private KhamPha_BaiHat.ListBaiHat<String> listBaiHat43;
    private KhamPha_BaiHat.ListBaiHat<String> listBaiHat44;
    private KhamPha_BaiHat.ListBaiHat<String> listBaiHat5;
    private KhamPha_BaiHat.ListBaiHat<String> listBaiHat6;
    private KhamPha_BaiHat.ListBaiHat<String> listBaiHat7;
    private KhamPha_BaiHat.ListBaiHat<String> listBaiHat8;
    private KhamPha_BaiHat.ListBaiHat<String> listBaiHat9;
    // End of variables declaration//GEN-END:variables
}
