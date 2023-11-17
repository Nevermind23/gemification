package p341ge.bog.mobilebank.products.data.model;

import androidx.annotation.Keep;

@Keep
/* renamed from: ge.bog.mobilebank.products.data.model.CardExternalFileApiModel */
public final class CardExternalFileApiModel {
    private final String fileSubType;
    private final String fileType;
    private final String fileUrl;
    private final String isDark;

    public CardExternalFileApiModel(String str, String str2, String str3, String str4) {
        this.isDark = str;
        this.fileUrl = str2;
        this.fileType = str3;
        this.fileSubType = str4;
    }

    public final String getFileSubType() {
        return this.fileSubType;
    }

    public final String getFileType() {
        return this.fileType;
    }

    public final String getFileUrl() {
        return this.fileUrl;
    }

    public final String isDark() {
        return this.isDark;
    }
}
