package p341ge.bog.mobilebank.categorypackages.data.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.categorypackages.data.entity.ExternalFileApiModel */
public final class ExternalFileApiModel {
    private final String fileUrl;

    public ExternalFileApiModel(String str) {
        this.fileUrl = str;
    }

    public static /* synthetic */ ExternalFileApiModel copy$default(ExternalFileApiModel externalFileApiModel, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = externalFileApiModel.fileUrl;
        }
        return externalFileApiModel.copy(str);
    }

    public final String component1() {
        return this.fileUrl;
    }

    public final ExternalFileApiModel copy(String str) {
        return new ExternalFileApiModel(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ExternalFileApiModel) && C41536l.m120484d(this.fileUrl, ((ExternalFileApiModel) obj).fileUrl);
    }

    public final String getFileUrl() {
        return this.fileUrl;
    }

    public int hashCode() {
        String str = this.fileUrl;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        String str = this.fileUrl;
        return "ExternalFileApiModel(fileUrl=" + str + ")";
    }
}
