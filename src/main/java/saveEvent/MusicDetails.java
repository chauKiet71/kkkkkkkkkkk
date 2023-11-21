package saveEvent;

import entity.BaiHatEntity;

public class MusicDetails {

    public static BaiHatEntity selectedBaiHat;

    public MusicDetails() {
    }

    public static BaiHatEntity getSelectedBaiHat() {
        return selectedBaiHat;
    }

    public static void setSelectedBaiHat(BaiHatEntity baiHat) {
        selectedBaiHat = baiHat;
    }
}
