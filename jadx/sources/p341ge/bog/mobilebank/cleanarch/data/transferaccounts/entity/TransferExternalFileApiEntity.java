package p341ge.bog.mobilebank.cleanarch.data.transferaccounts.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.transferaccounts.entity.TransferExternalFileApiEntity */
public final class TransferExternalFileApiEntity {
    private final String fileUrl;
    private final YesNoApiEntity isDark;

    public TransferExternalFileApiEntity(YesNoApiEntity yesNoApiEntity, String str) {
        this.isDark = yesNoApiEntity;
        this.fileUrl = str;
    }

    public static /* synthetic */ TransferExternalFileApiEntity copy$default(TransferExternalFileApiEntity transferExternalFileApiEntity, YesNoApiEntity yesNoApiEntity, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            yesNoApiEntity = transferExternalFileApiEntity.isDark;
        }
        if ((i & 2) != 0) {
            str = transferExternalFileApiEntity.fileUrl;
        }
        return transferExternalFileApiEntity.copy(yesNoApiEntity, str);
    }

    public final YesNoApiEntity component1() {
        return this.isDark;
    }

    public final String component2() {
        return this.fileUrl;
    }

    public final TransferExternalFileApiEntity copy(YesNoApiEntity yesNoApiEntity, String str) {
        return new TransferExternalFileApiEntity(yesNoApiEntity, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferExternalFileApiEntity)) {
            return false;
        }
        TransferExternalFileApiEntity transferExternalFileApiEntity = (TransferExternalFileApiEntity) obj;
        return this.isDark == transferExternalFileApiEntity.isDark && C41536l.m120484d(this.fileUrl, transferExternalFileApiEntity.fileUrl);
    }

    public final String getFileUrl() {
        return this.fileUrl;
    }

    public int hashCode() {
        YesNoApiEntity yesNoApiEntity = this.isDark;
        int i = 0;
        int hashCode = (yesNoApiEntity == null ? 0 : yesNoApiEntity.hashCode()) * 31;
        String str = this.fileUrl;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final YesNoApiEntity isDark() {
        return this.isDark;
    }

    public String toString() {
        YesNoApiEntity yesNoApiEntity = this.isDark;
        String str = this.fileUrl;
        return "TransferExternalFileApiEntity(isDark=" + yesNoApiEntity + ", fileUrl=" + str + ")";
    }
}
