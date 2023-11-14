package entity;

public class BaiHatStateManager {

    private static BaiHatEntity selectedBaiHat;

    private BaiHatStateManager() {
    }

    public static BaiHatEntity getSelectedBaiHat() {
        return selectedBaiHat;
    }

    public static void setSelectedBaiHat(BaiHatEntity baiHat) {
        selectedBaiHat = baiHat;
    }
}
