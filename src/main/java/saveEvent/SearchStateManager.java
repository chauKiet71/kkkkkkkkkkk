package saveEvent;

import entity.BaiHatEntity;

public class SearchStateManager {

    public static BaiHatEntity searched;

    public SearchStateManager() {
    }

    public static BaiHatEntity getSelectedBaiHat() {
        return searched;
    }

    public static void setSelectedBaiHat(BaiHatEntity baiHat) {
        searched = baiHat;
    }
}
