package utils;

import java.awt.Component;
import javax.swing.JOptionPane;

public class msgBox {

//    hiện thông báo
    public static void alert(Component parent, String mess) {
        String message = "<html><font color='red'>" + mess + "</font></html>";
        JOptionPane.showMessageDialog(parent, message, "EduSys", JOptionPane.ERROR_MESSAGE);
    }
    
    public static void alertSuf(Component parent, String mess) {
        String message = "<html><font color='green'>" + mess + "</font></html>";
        JOptionPane.showMessageDialog(parent, message, "EduSys", JOptionPane.DEFAULT_OPTION);
    }

//    chọn yes or no
    public static boolean confirm(Component parent, String mess) {
        int result = JOptionPane.showConfirmDialog(parent, mess, "EduSys",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        return result == JOptionPane.YES_OPTION;
    }

//    điền thông tin
    public static String promt(Component parent, String mess) {
        return JOptionPane.showInputDialog(parent, mess, "EduSys", JOptionPane.INFORMATION_MESSAGE);
    }
}
