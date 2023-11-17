package form;

import SlideShow.Slide1;
import SlideShow.Slide2;
import SlideShow.Slide3;
import SlideShow.Slide4;
import SlideShow.Slide5;
import SlideShow.Slide6;
import Table.Model_Table;
import Table.tableDAO;
import dao.BaiHatDAO;
import entity.BaiHatEntity;
import entity.BaiHatStateManager;
//import static form.Form_TrangChu.BAI_HAT_SELECTED_EVENT;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import model.Model_Profile;
import utils.EventManager;

public class FormTrangChu extends javax.swing.JPanel {

    private FormMainMusic formMainMusic;
    tableDAO tbdao = new tableDAO();
    BaiHatDAO bhDao = new BaiHatDAO();
    public static final String BAI_HAT_SELECTED_EVENT = "BAI_HAT_SELECTED_EVENT";

    public FormTrangChu() {
        initComponents();
        init();
        fillTable();
    }

    public void init() {
        slideShow1.initSlideshow(new Slide1(), new Slide2(), new Slide3(), new Slide4(), new Slide5(), new Slide6());
        setHoverCursor(table1);
        TableColumn nameColumn = table1.getColumnModel().getColumn(0);
        nameColumn.setPreferredWidth(350); // Đặt chiều ngang mong muốn

        TableColumn ageColumn = table1.getColumnModel().getColumn(1);
        ageColumn.setPreferredWidth(250); // Đặt chiều ngang mong muốn

        TableColumn genderColumn = table1.getColumnModel().getColumn(2);
        genderColumn.setPreferredWidth(90); // Đặt chiều ngang mong muốn

        TableColumn timeColumn = table1.getColumnModel().getColumn(3);
        timeColumn.setPreferredWidth(40); // Đặt chiều ngang mong muốn

//        ẩn cột thứ 4 (cột mã bài hát)
        TableColumnModel columnModel = table1.getColumnModel();
        TableColumn column = columnModel.getColumn(4);
        column.setMinWidth(0);
        column.setMaxWidth(0);
        column.setWidth(0);
        column.setPreferredWidth(0);
        column.setResizable(false);
    }

    void fillTable() {
        try {
            List<Model_Table> list = tbdao.selectAll();
            for (Model_Table bh : list) {
                table1.addRow(new Model_Table(bh.getIcon(), bh.getName(), bh.getSing(), bh.getView(), bh.getTime(), bh.getMaBh()).toRowTable());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    int row = 0;

    void edit() {
        this.row = table1.getSelectedRow();
        String maBh = (String) table1.getValueAt(this.row, 4);

        BaiHatEntity bh = bhDao.selectById(maBh);
        BaiHatStateManager.setSelectedBaiHat(bh);
        EventQueue.invokeLater(() -> {
            EventManager.fireEvent(BAI_HAT_SELECTED_EVENT, bh);
        });
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        slideShow1 = new SlideShow.SlideShow();
        jLabel1 = new javax.swing.JLabel();
        table1 = new Table.TableMusic();
        trangChuItem11 = new form.TrangChuItem1();
        trangChuItem22 = new form.TrangChuItem2();

        setBackground(new java.awt.Color(29, 38, 49));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-next-24.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 410, 20, 40));

        jLabel3.setText("TẤT CẢ");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 420, -1, 20));

        jLabel4.setText("TẤT CẢ");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 770, -1, 20));

        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-next-24.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 760, 20, 40));

        jLabel6.setText("TẤT CẢ");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 1120, -1, 20));

        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-next-24.png"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 1110, 20, 40));

        slideShow1.setBackground(new java.awt.Color(29, 38, 49));
        add(slideShow1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 922, 340));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Dành Riêng Cho Bạn");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 2138, 236, -1));

        table1.setBorder(null);
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Sing", "View", "Time", "Ma"
            }
        ));
        table1.setFocusable(false);
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        add(table1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 2185, 885, 690));
        add(trangChuItem11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 385, -1, -1));
        add(trangChuItem22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2915, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        edit();
    }//GEN-LAST:event_table1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private SlideShow.SlideShow slideShow1;
    private Table.TableMusic table1;
    private form.TrangChuItem1 trangChuItem11;
    private form.TrangChuItem2 trangChuItem22;
    // End of variables declaration//GEN-END:variables
}
