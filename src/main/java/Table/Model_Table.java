package Table;

import java.text.DecimalFormat;
import javax.swing.Icon;

public class Model_Table {

    private Icon icon;
    private String name;
    private String sing;
    private String view;
    private String time;

    public Model_Table() {
    }

    public Model_Table(Icon icon, String name, String sing, String view, String time) {
        this.icon = icon;
        this.name = name;
        this.sing = sing;
        this.view = view;
        this.time = time;
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSing() {
        return sing;
    }

    public void setSing(String sing) {
        this.sing = sing;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Object[] toRowTable() {
        return new Object[]{new Model_ProfileTable(icon, name), sing, view, time};
    }

}
