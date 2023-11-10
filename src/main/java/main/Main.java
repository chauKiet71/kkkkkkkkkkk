package main;

import KhamPha_BaiHat.BaiHat;
import KhamPha_NgheSi.NgheSi;
import KhamPha_PlayList.PlayList;
import Menu.MenuEvent;
import NgheGiHomNay.Top100;
import NgheGiHomNay.TuyenTap;
import TimKiem.FormTimKiem;
import form.FormTimKiemItem;
import form.Form_ChuDe;
import form.Form_TrangChu;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import swing.ScrollBarr;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        content.setVerticalScrollBar(new ScrollBarr());
        menu1.setEvent(new MenuEvent() {
            @Override
            public void selected(int index, int subIndex) {
                if (index == 0) {
                    FormTimKiemItem wel = new FormTimKiemItem();
                    wel.setSize(926, 3000);
                    wel.setLocation(0, 0);

                    JScrollPane scrollPane = new JScrollPane(wel);
                    scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
                    scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
                    scrollPane.setBorder(null);
                    content.setViewportView(scrollPane);

                    lbTitle.setText("Tìm Kiếm");
                } else if (index == 1) {
                    Form_TrangChu wel = new Form_TrangChu();
                    wel.setSize(926, 3000);
                    wel.setLocation(0, 0);

                    JScrollPane scrollPane = new JScrollPane(wel);
                    scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
                    scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
                    scrollPane.setBorder(null);
                    content.setViewportView(scrollPane);

                    lbTitle.setText("Trang Chủ");
                } else if (index == 2 && subIndex == 1) {
                    BaiHat wel = new BaiHat();
                    wel.setSize(926, 3000);
                    wel.setLocation(0, 0);

                    JScrollPane scrollPane = new JScrollPane(wel);
                    scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
                    scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
                    scrollPane.setBorder(null);
                    content.setViewportView(scrollPane);

                    lbTitle.setText("Trang Chủ");
                } else if (index == 2 && subIndex == 2) {
                    PlayList wel = new PlayList();
                    wel.setSize(926, 3000);
                    wel.setLocation(0, 0);

                    JScrollPane scrollPane = new JScrollPane(wel);
                    scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
                    scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
                    scrollPane.setBorder(null);
                    content.setViewportView(scrollPane);

                    lbTitle.setText("Trang Chủ");
                } else if (index == 2 && subIndex == 4) {
                    NgheSi wel = new NgheSi();
                    wel.setSize(926, 3000);
                    wel.setLocation(0, 0);

                    JScrollPane scrollPane = new JScrollPane(wel);
                    scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
                    scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
                    scrollPane.setBorder(null);
                    content.setViewportView(scrollPane);

                    lbTitle.setText("Trang Chủ");
                } else if (index == 3 && subIndex == 1) {
                    Form_ChuDe wel = new Form_ChuDe();
                    wel.setSize(926, 3000);
                    wel.setLocation(0, 0);

                    JScrollPane scrollPane = new JScrollPane(wel);
                    scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
                    scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
                    scrollPane.setBorder(null);
                    content.setViewportView(scrollPane);

                    lbTitle.setText("Trang Chủ");
                } else if (index == 3 && subIndex == 2) {
                    TuyenTap wel = new TuyenTap();
                    wel.setSize(926, 3000);
                    wel.setLocation(0, 0);

                    JScrollPane scrollPane = new JScrollPane(wel);
                    scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
                    scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
                    scrollPane.setBorder(null);
                    content.setViewportView(scrollPane);

                    lbTitle.setText("Trang Chủ");
                } else if (index == 3 && subIndex == 3) {
                    Top100 wel = new Top100();
                    wel.setSize(926, 3000);
                    wel.setLocation(0, 0);

                    JScrollPane scrollPane = new JScrollPane(wel);
                    scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
                    scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
                    scrollPane.setBorder(null);
                    content.setViewportView(scrollPane);

                    lbTitle.setText("Trang Chủ");
                } else {
                    JOptionPane.showMessageDialog(null, index + " " + subIndex);
                }
            }

        }
        );
    }

//    public void init() {
//
//    }
//    private void showForm(Component com) {
//        ok.removeAll();
//        ok.add(com);
//        ok.repaint();
//        ok.revalidate();
//    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new swing.Panel();
        move = new component.header();
        lbOut = new javax.swing.JLabel();
        lbTitle = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        content = new javax.swing.JScrollPane();
        form_TrangChu1 = new form.Form_TrangChu();
        jPanel2 = new javax.swing.JPanel();
        account1 = new component.Account();
        jSeparator1 = new javax.swing.JSeparator();
        body = new javax.swing.JPanel();
        menu1 = new Menu.Menu();
        formMainMusic1 = new form.FormMainMusic();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));
        setUndecorated(true);

        panel1.setBackground(new java.awt.Color(29, 38, 49));
        panel1.setForeground(new java.awt.Color(255, 255, 255));
        panel1.setOpaque(true);

        move.setBackground(new java.awt.Color(29, 38, 49));
        move.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                moveMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                moveMouseMoved(evt);
            }
        });

        lbOut.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbOut.setForeground(new java.awt.Color(255, 0, 0));
        lbOut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbOut.setText("X");
        lbOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbOutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbOutMouseExited(evt);
            }
        });

        lbTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(255, 255, 255));
        lbTitle.setText("Trang Chủ");

        jSeparator3.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator3.setOpaque(true);

        javax.swing.GroupLayout moveLayout = new javax.swing.GroupLayout(move);
        move.setLayout(moveLayout);
        moveLayout.setHorizontalGroup(
            moveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(moveLayout.createSequentialGroup()
                .addGroup(moveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 916, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbOut, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        moveLayout.setVerticalGroup(
            moveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, moveLayout.createSequentialGroup()
                .addGroup(moveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(moveLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbOut))
                    .addComponent(lbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        content.setBackground(new java.awt.Color(29, 38, 49));
        content.setBorder(null);
        content.setForeground(new java.awt.Color(255, 255, 255));
        content.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        content.setViewportView(form_TrangChu1);

        jPanel2.setBackground(new java.awt.Color(29, 38, 49));

        account1.setBackground(new java.awt.Color(29, 38, 49));
        account1.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator1.setOpaque(true);

        body.setOpaque(false);

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addComponent(menu1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addComponent(menu1, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(body, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(account1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(account1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator1)
        );

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator2.setOpaque(true);

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(move, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, 926, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(formMainMusic1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(move, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator2)
                                    .addComponent(formMainMusic1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbOutMouseExited
        lbOut.setForeground(new Color(255, 0, 0));
    }//GEN-LAST:event_lbOutMouseExited

    private void lbOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbOutMouseEntered
        lbOut.setForeground(new Color(153, 0, 0));
    }//GEN-LAST:event_lbOutMouseEntered

    private void lbOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbOutMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lbOutMouseClicked
    private int x;
    private int y;

    private void moveMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moveMouseMoved
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_moveMouseMoved

    private void moveMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moveMouseDragged
        setLocation(evt.getXOnScreen() - x, evt.getYOnScreen() - y);
    }//GEN-LAST:event_moveMouseDragged

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
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private component.Account account1;
    private javax.swing.JPanel body;
    private javax.swing.JScrollPane content;
    private form.FormMainMusic formMainMusic1;
    private form.Form_TrangChu form_TrangChu1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lbOut;
    private javax.swing.JLabel lbTitle;
    private Menu.Menu menu1;
    private component.header move;
    private swing.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
