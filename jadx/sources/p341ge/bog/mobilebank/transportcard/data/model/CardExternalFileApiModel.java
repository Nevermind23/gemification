package p341ge.bog.mobilebank.transportcard.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.transportcard.data.model.CardExternalFileApiModel */
public final class CardExternalFileApiModel {
    private final String fileType;
    private final String fileUrl;
    private final String isDark;

    public CardExternalFileApiModel(String str, String str2, String str3) {
        C41536l.m120489i(str, "isDark");
        C41536l.m120489i(str3, "fileType");
        this.isDark = str;
        this.fileUrl = str2;
        this.fileType = str3;
    }

    public static /* synthetic */ CardExternalFileApiModel copy$default(CardExternalFileApiModel cardExternalFileApiModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cardExternalFileApiModel.isDark;
        }
        if ((i & 2) != 0) {
            str2 = cardExternalFileApiModel.fileUrl;
        }
        if ((i & 4) != 0) {
            str3 = cardExternalFileApiModel.fileType;
        }
        return cardExternalFileApiModel.copy(str, str2, str3);
    }

    public final String component1() {
        return this.isDark;
    }

    public final String component2() {
        return this.fileUrl;
    }

    public final String component3() {
        return this.fileType;
    }

    public final CardExternalFileApiModel copy(String str, String str2, String str3) {
        C41536l.m120489i(str, "isDark");
        C41536l.m120489i(str3, "fileType");
        return new CardExternalFileApiModel(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardExternalFileApiModel)) {
            return false;
        }
        CardExternalFileApiModel cardExternalFileApiModel = (CardExternalFileApiModel) obj;
        return C41536l.m120484d(this.isDark, cardExternalFileApiModel.isDark) && C41536l.m120484d(this.fileUrl, cardExternalFileApiModel.fileUrl) && C41536l.m120484d(this.fileType, cardExternalFileApiModel.fileType);
    }

    public final String getFileType() {
        return this.fileType;
    }

    public final String getFileUrl() {
        return this.fileUrl;
    }

    public int hashCode() {
        int hashCode = this.isDark.hashCode() * 31;
        String str = this.fileUrl;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.fileType.hashCode();
    }

    public final String isDark() {
        return this.isDark;
    }

    public String toString() {
        String str = this.isDark;
        String str2 = this.fileUrl;
        String str3 = this.fileType;
        return "CardExternalFileApiModel(isDark=" + str + ", fileUrl=" + str2 + ", fileType=" + str3 + ")";
    }
}
