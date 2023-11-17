package p341ge.bog.mobilebank.lifestyleoffers.data.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.lifestyleoffers.data.entity.LifestyleBnplExternalImageApiModel */
public final class LifestyleBnplExternalImageApiModel {
    private final String fileUrl;

    public LifestyleBnplExternalImageApiModel(String str) {
        this.fileUrl = str;
    }

    public static /* synthetic */ LifestyleBnplExternalImageApiModel copy$default(LifestyleBnplExternalImageApiModel lifestyleBnplExternalImageApiModel, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lifestyleBnplExternalImageApiModel.fileUrl;
        }
        return lifestyleBnplExternalImageApiModel.copy(str);
    }

    public final String component1() {
        return this.fileUrl;
    }

    public final LifestyleBnplExternalImageApiModel copy(String str) {
        return new LifestyleBnplExternalImageApiModel(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LifestyleBnplExternalImageApiModel) && C41536l.m120484d(this.fileUrl, ((LifestyleBnplExternalImageApiModel) obj).fileUrl);
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
        return "LifestyleBnplExternalImageApiModel(fileUrl=" + str + ")";
    }
}
