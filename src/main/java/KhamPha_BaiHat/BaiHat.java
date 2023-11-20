package KhamPha_BaiHat;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.border.Border;
import swing.ScrollBarr;

public class BaiHat extends javax.swing.JPanel {

    private static JLabel selectedLabel = null;

    public BaiHat() {
        initComponents();
        init();
    }

    public void init() {
        hover(lbMoiHot);
        hover(lbVietNam);
        hover(lbAuMy);
        hover(lbChauA);
        hover(lbKhac);
        content.setVerticalScrollBar(new ScrollBarr());
    }

    public void hover(JLabel label) {
        int borderSize = 2;
        Border defaultBorder = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        Border hoverBorder = BorderFactory.createMatteBorder(0, 0, borderSize, 0, new Color(29, 194, 241));

        label.setBorder(defaultBorder);

        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                label.setBorder(hoverBorder);
                setHandCursor(label);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Chỉ thay đổi border nếu label này không phải là label được chọn
                if (label != selectedLabel) {
                    label.setBorder(defaultBorder);
                    setDefaultCursor(label);
                }
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                // Nếu có một label khác được chọn, loại bỏ border của nó
                if (selectedLabel != null) {
                    selectedLabel.setBorder(defaultBorder);
                }

                // Thiết lập border cho label được chọn
                label.setBorder(hoverBorder);

                // Cập nhật label được chọn
                selectedLabel = label;
            }
        });
    }

    private static void setHandCursor(Component component) {
        Cursor handCursor = new Cursor(Cursor.HAND_CURSOR);
        component.setCursor(handCursor);
    }

    // Đặt hình mặc định cho chuột
    private static void setDefaultCursor(Component component) {
        Cursor defaultCursor = new Cursor(Cursor.DEFAULT_CURSOR);
        component.setCursor(defaultCursor);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbMoiHot = new javax.swing.JLabel();
        lbVietNam = new javax.swing.JLabel();
        lbAuMy = new javax.swing.JLabel();
        lbChauA = new javax.swing.JLabel();
        lbKhac = new javax.swing.JLabel();
        content = new javax.swing.JScrollPane();
        moiVaHot1 = new KhamPha_BaiHat.MoiVaHot();

        setBackground(new java.awt.Color(29, 38, 49));

        jPanel1.setOpaque(false);

        lbMoiHot.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lbMoiHot.setForeground(new java.awt.Color(255, 255, 255));
        lbMoiHot.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMoiHot.setText("Mới & Hot");
        lbMoiHot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbMoiHotMouseClicked(evt);
            }
        });

        lbVietNam.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lbVietNam.setForeground(new java.awt.Color(255, 255, 255));
        lbVietNam.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVietNam.setText("Việt Nam");
        lbVietNam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbVietNamMouseClicked(evt);
            }
        });

        lbAuMy.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lbAuMy.setForeground(new java.awt.Color(255, 255, 255));
        lbAuMy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAuMy.setText("Âu Mỹ");
        lbAuMy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbAuMyMouseClicked(evt);
            }
        });

        lbChauA.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lbChauA.setForeground(new java.awt.Color(255, 255, 255));
        lbChauA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbChauA.setText("Châu Á");
        lbChauA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbChauAMouseClicked(evt);
            }
        });

        lbKhac.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lbKhac.setForeground(new java.awt.Color(255, 255, 255));
        lbKhac.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbKhac.setText("Khác");
        lbKhac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbKhacMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbMoiHot, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbVietNam, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbAuMy, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbChauA, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbKhac, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMoiHot, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbVietNam, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAuMy, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbChauA, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbKhac, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        content.setBackground(new java.awt.Color(29, 38, 49));
        content.setBorder(null);
        content.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        content.setViewportView(moiVaHot1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(content)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lbMoiHotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbMoiHotMouseClicked
        MoiVaHot wel = new MoiVaHot();
        wel.setSize(926, 3000);
        wel.setLocation(0, 0);

        JScrollPane scrollPane = new JScrollPane(wel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setBorder(null);
        content.setViewportView(scrollPane);
    }//GEN-LAST:event_lbMoiHotMouseClicked

    private void lbVietNamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbVietNamMouseClicked
        VietNam wel = new VietNam();
        wel.setSize(926, 3000);
        wel.setLocation(0, 0);

        JScrollPane scrollPane = new JScrollPane(wel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setBorder(null);
        content.setViewportView(scrollPane);
    }//GEN-LAST:event_lbVietNamMouseClicked

    private void lbAuMyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAuMyMouseClicked
        AuMy wel = new AuMy();
        wel.setSize(926, 3000);
        wel.setLocation(0, 0);

        JScrollPane scrollPane = new JScrollPane(wel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setBorder(null);
        content.setViewportView(scrollPane);
    }//GEN-LAST:event_lbAuMyMouseClicked

    private void lbChauAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbChauAMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lbChauAMouseClicked

    private void lbKhacMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbKhacMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lbKhacMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane content;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbAuMy;
    private javax.swing.JLabel lbChauA;
    private javax.swing.JLabel lbKhac;
    private javax.swing.JLabel lbMoiHot;
    private javax.swing.JLabel lbVietNam;
    private KhamPha_BaiHat.MoiVaHot moiVaHot1;
    // End of variables declaration//GEN-END:variables
}
