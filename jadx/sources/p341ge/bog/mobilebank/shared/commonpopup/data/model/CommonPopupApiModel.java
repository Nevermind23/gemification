package p341ge.bog.mobilebank.shared.commonpopup.data.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.shared.data.ExternalFileEntity;

@Keep
/* renamed from: ge.bog.mobilebank.shared.commonpopup.data.model.CommonPopupApiModel */
public final class CommonPopupApiModel {
    private final String animation;
    private final String closable;
    private final String descriptionDictionaryKey;
    private final ExternalFileEntity externalFile;
    private final int frequency;
    private final String headerDictionaryKey;
    private final int orderNumber;
    private final List<PopupActionApiModel> popupActions;
    private final String popupType;

    public CommonPopupApiModel(String str, String str2, String str3, int i, int i2, String str4, List<PopupActionApiModel> list, ExternalFileEntity externalFileEntity, String str5) {
        C41536l.m120489i(str, "popupType");
        C41536l.m120489i(str2, "headerDictionaryKey");
        C41536l.m120489i(str3, "descriptionDictionaryKey");
        C41536l.m120489i(list, "popupActions");
        C41536l.m120489i(externalFileEntity, "externalFile");
        C41536l.m120489i(str5, "closable");
        this.popupType = str;
        this.headerDictionaryKey = str2;
        this.descriptionDictionaryKey = str3;
        this.orderNumber = i;
        this.frequency = i2;
        this.animation = str4;
        this.popupActions = list;
        this.externalFile = externalFileEntity;
        this.closable = str5;
    }

    public static /* synthetic */ CommonPopupApiModel copy$default(CommonPopupApiModel commonPopupApiModel, String str, String str2, String str3, int i, int i2, String str4, List list, ExternalFileEntity externalFileEntity, String str5, int i3, Object obj) {
        CommonPopupApiModel commonPopupApiModel2 = commonPopupApiModel;
        int i4 = i3;
        return commonPopupApiModel.copy((i4 & 1) != 0 ? commonPopupApiModel2.popupType : str, (i4 & 2) != 0 ? commonPopupApiModel2.headerDictionaryKey : str2, (i4 & 4) != 0 ? commonPopupApiModel2.descriptionDictionaryKey : str3, (i4 & 8) != 0 ? commonPopupApiModel2.orderNumber : i, (i4 & 16) != 0 ? commonPopupApiModel2.frequency : i2, (i4 & 32) != 0 ? commonPopupApiModel2.animation : str4, (i4 & 64) != 0 ? commonPopupApiModel2.popupActions : list, (i4 & 128) != 0 ? commonPopupApiModel2.externalFile : externalFileEntity, (i4 & C11398b.f33139r) != 0 ? commonPopupApiModel2.closable : str5);
    }

    public final String component1() {
        return this.popupType;
    }

    public final String component2() {
        return this.headerDictionaryKey;
    }

    public final String component3() {
        return this.descriptionDictionaryKey;
    }

    public final int component4() {
        return this.orderNumber;
    }

    public final int component5() {
        return this.frequency;
    }

    public final String component6() {
        return this.animation;
    }

    public final List<PopupActionApiModel> component7() {
        return this.popupActions;
    }

    public final ExternalFileEntity component8() {
        return this.externalFile;
    }

    public final String component9() {
        return this.closable;
    }

    public final CommonPopupApiModel copy(String str, String str2, String str3, int i, int i2, String str4, List<PopupActionApiModel> list, ExternalFileEntity externalFileEntity, String str5) {
        C41536l.m120489i(str, "popupType");
        C41536l.m120489i(str2, "headerDictionaryKey");
        C41536l.m120489i(str3, "descriptionDictionaryKey");
        List<PopupActionApiModel> list2 = list;
        C41536l.m120489i(list2, "popupActions");
        ExternalFileEntity externalFileEntity2 = externalFileEntity;
        C41536l.m120489i(externalFileEntity2, "externalFile");
        String str6 = str5;
        C41536l.m120489i(str6, "closable");
        return new CommonPopupApiModel(str, str2, str3, i, i2, str4, list2, externalFileEntity2, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonPopupApiModel)) {
            return false;
        }
        CommonPopupApiModel commonPopupApiModel = (CommonPopupApiModel) obj;
        return C41536l.m120484d(this.popupType, commonPopupApiModel.popupType) && C41536l.m120484d(this.headerDictionaryKey, commonPopupApiModel.headerDictionaryKey) && C41536l.m120484d(this.descriptionDictionaryKey, commonPopupApiModel.descriptionDictionaryKey) && this.orderNumber == commonPopupApiModel.orderNumber && this.frequency == commonPopupApiModel.frequency && C41536l.m120484d(this.animation, commonPopupApiModel.animation) && C41536l.m120484d(this.popupActions, commonPopupApiModel.popupActions) && C41536l.m120484d(this.externalFile, commonPopupApiModel.externalFile) && C41536l.m120484d(this.closable, commonPopupApiModel.closable);
    }

    public final String getAnimation() {
        return this.animation;
    }

    public final String getClosable() {
        return this.closable;
    }

    public final String getDescriptionDictionaryKey() {
        return this.descriptionDictionaryKey;
    }

    public final ExternalFileEntity getExternalFile() {
        return this.externalFile;
    }

    public final int getFrequency() {
        return this.frequency;
    }

    public final String getHeaderDictionaryKey() {
        return this.headerDictionaryKey;
    }

    public final int getOrderNumber() {
        return this.orderNumber;
    }

    public final List<PopupActionApiModel> getPopupActions() {
        return this.popupActions;
    }

    public final String getPopupType() {
        return this.popupType;
    }

    public int hashCode() {
        int hashCode = ((((((((this.popupType.hashCode() * 31) + this.headerDictionaryKey.hashCode()) * 31) + this.descriptionDictionaryKey.hashCode()) * 31) + this.orderNumber) * 31) + this.frequency) * 31;
        String str = this.animation;
        return ((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.popupActions.hashCode()) * 31) + this.externalFile.hashCode()) * 31) + this.closable.hashCode();
    }

    public String toString() {
        String str = this.popupType;
        String str2 = this.headerDictionaryKey;
        String str3 = this.descriptionDictionaryKey;
        int i = this.orderNumber;
        int i2 = this.frequency;
        String str4 = this.animation;
        List<PopupActionApiModel> list = this.popupActions;
        ExternalFileEntity externalFileEntity = this.externalFile;
        String str5 = this.closable;
        return "CommonPopupApiModel(popupType=" + str + ", headerDictionaryKey=" + str2 + ", descriptionDictionaryKey=" + str3 + ", orderNumber=" + i + ", frequency=" + i2 + ", animation=" + str4 + ", popupActions=" + list + ", externalFile=" + externalFileEntity + ", closable=" + str5 + ")";
    }
}
