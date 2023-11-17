package p341ge.bog.mobilebank.cleanarch.presentation.home.model;

import androidx.annotation.Keep;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.presentation.home.model.LayoutType */
public enum LayoutType {
    IMG_TXT("IMG_TXT"),
    IMG_TXT_BTN("IMG_TXT_BTN"),
    IMG_TXT_BTN_HDR("IMG_TXT_BTN_HDR"),
    IMG_TXT_VL_BTN("IMG_TXT_VL_BTN"),
    IMG_TXT_VL_BTN_VL("IMG_TXT_VL_BTN_VL"),
    BKG_IMG("BKG_IMG");
    
    private final String value;

    private LayoutType(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
