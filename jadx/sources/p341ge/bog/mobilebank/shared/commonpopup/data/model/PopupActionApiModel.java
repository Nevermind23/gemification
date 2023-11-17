package p341ge.bog.mobilebank.shared.commonpopup.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.shared.commonpopup.data.model.PopupActionApiModel */
public final class PopupActionApiModel {
    private final String buttonType;
    private final String deepLink;
    private final String dictionaryKey;
    private final String firebaseClickEventName;

    public PopupActionApiModel(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "buttonType");
        C41536l.m120489i(str2, "firebaseClickEventName");
        C41536l.m120489i(str4, "dictionaryKey");
        this.buttonType = str;
        this.firebaseClickEventName = str2;
        this.deepLink = str3;
        this.dictionaryKey = str4;
    }

    public static /* synthetic */ PopupActionApiModel copy$default(PopupActionApiModel popupActionApiModel, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = popupActionApiModel.buttonType;
        }
        if ((i & 2) != 0) {
            str2 = popupActionApiModel.firebaseClickEventName;
        }
        if ((i & 4) != 0) {
            str3 = popupActionApiModel.deepLink;
        }
        if ((i & 8) != 0) {
            str4 = popupActionApiModel.dictionaryKey;
        }
        return popupActionApiModel.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.buttonType;
    }

    public final String component2() {
        return this.firebaseClickEventName;
    }

    public final String component3() {
        return this.deepLink;
    }

    public final String component4() {
        return this.dictionaryKey;
    }

    public final PopupActionApiModel copy(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "buttonType");
        C41536l.m120489i(str2, "firebaseClickEventName");
        C41536l.m120489i(str4, "dictionaryKey");
        return new PopupActionApiModel(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PopupActionApiModel)) {
            return false;
        }
        PopupActionApiModel popupActionApiModel = (PopupActionApiModel) obj;
        return C41536l.m120484d(this.buttonType, popupActionApiModel.buttonType) && C41536l.m120484d(this.firebaseClickEventName, popupActionApiModel.firebaseClickEventName) && C41536l.m120484d(this.deepLink, popupActionApiModel.deepLink) && C41536l.m120484d(this.dictionaryKey, popupActionApiModel.dictionaryKey);
    }

    public final String getButtonType() {
        return this.buttonType;
    }

    public final String getDeepLink() {
        return this.deepLink;
    }

    public final String getDictionaryKey() {
        return this.dictionaryKey;
    }

    public final String getFirebaseClickEventName() {
        return this.firebaseClickEventName;
    }

    public int hashCode() {
        int hashCode = ((this.buttonType.hashCode() * 31) + this.firebaseClickEventName.hashCode()) * 31;
        String str = this.deepLink;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.dictionaryKey.hashCode();
    }

    public String toString() {
        String str = this.buttonType;
        String str2 = this.firebaseClickEventName;
        String str3 = this.deepLink;
        String str4 = this.dictionaryKey;
        return "PopupActionApiModel(buttonType=" + str + ", firebaseClickEventName=" + str2 + ", deepLink=" + str3 + ", dictionaryKey=" + str4 + ")";
    }
}
