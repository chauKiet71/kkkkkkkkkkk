package form;

import SlideShow.Slide1;
import SlideShow.Slide2;
import SlideShow.Slide3;
import SlideShow.Slide4;
import Table.Model_Table;
import component2.ListChill;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JTable;

public class Form_TrangChu extends javax.swing.JLayeredPane {

    public Form_TrangChu() {
        initComponents();
        init();
        initTableData();

    }

    public void init() {
        slideShow1.initSlideshow(new Slide1(), new Slide2(), new Slide3(), new Slide4());
    }

    private void initTableData() {
        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/nhiptraitim.jpg")), "Nhịp Trái Tim", "Ai Biết", "120K", "03:50").toRowTable());
        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/anhsedoi.jpg")), "Anh Sẽ Đợi", "Ai Biết", "120K", "03:50").toRowTable());
        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/nangamxadan.jpg")), "Nắng Ấm Xa Dần", "Sơn Tùng M-TP", "120K", "03:50").toRowTable());
        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/codonglon.jpg")), "Cổ Đông Lớn", "Ai Biết", "120K", "03:50").toRowTable());
        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/dungsai.jpg")), "Đừng Sai", "Ai Biết", "120K", "03:50").toRowTable());
        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/tungquen.jpg")), "Từng Quen", "Ai Biết", "120K", "03:50").toRowTable());
        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/nolovenolife.jpg")), "No Love No Life", "Ai Biết", "120K", "03:50").toRowTable());
        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/saitrongnucuoi.jpg")), "Say Trong Nụ Cười", "Ai Biết", "120K", "03:50").toRowTable());
        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/vuonhoaconca.jpg")), "Vườn Hoa Con Cá", "Ai Biết", "120K", "03:50").toRowTable());
        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
        setHoverCursor(table1);
    }

    private static void setHoverCursor(JTable listChill) {
        listChill.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setHandCursor(listChill);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setDefaultCursor(listChill);
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

        jTable1 = new Table.TableMusic();
        slideShow1 = new SlideShow.SlideShow();
        vuTruNhacViet2 = new List.VuTruNhacViet();
        quocTeNoiBat2 = new List.QuocTeNoiBat();
        tamTrangHomNay1 = new List.TamTrangHomNay();
        chuDeHot2 = new List.ChuDeHot();
        top1001 = new List.Top100();
        table1 = new Table.TableMusic();
        jLabel1 = new javax.swing.JLabel();
        videoHot1 = new List.VideoHot();

        setBackground(new java.awt.Color(29, 38, 49));
        setOpaque(true);

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Sing", "View", "Time"
            }
        ));
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Dành Riêng Cho Bạn");

        setLayer(slideShow1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        setLayer(vuTruNhacViet2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        setLayer(quocTeNoiBat2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        setLayer(tamTrangHomNay1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        setLayer(chuDeHot2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        setLayer(top1001, javax.swing.JLayeredPane.DEFAULT_LAYER);
        setLayer(table1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        setLayer(videoHot1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(slideShow1, javax.swing.GroupLayout.PREFERRED_SIZE, 841, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(videoHot1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(table1, javax.swing.GroupLayout.PREFERRED_SIZE, 885, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(top1001, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chuDeHot2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tamTrangHomNay1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(quocTeNoiBat2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(vuTruNhacViet2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(slideShow1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(vuTruNhacViet2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(quocTeNoiBat2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(tamTrangHomNay1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(videoHot1, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(table1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(chuDeHot2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(top1001, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

    }// </editor-fold>//GEN-END:initComponents

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked

    }//GEN-LAST:event_table1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private List.ChuDeHot chuDeHot2;
    private javax.swing.JLabel jLabel1;
    private Table.TableMusic jTable1;
    private List.QuocTeNoiBat quocTeNoiBat2;
    private SlideShow.SlideShow slideShow1;
    private Table.TableMusic table1;
    private List.TamTrangHomNay tamTrangHomNay1;
    private List.Top100 top1001;
    private List.VideoHot videoHot1;
    private List.VuTruNhacViet vuTruNhacViet2;
    // End of variables declaration//GEN-END:variables
}
