package p341ge.bog.mobilebank.cleanarch.application.data.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.application.data.entity.ApplicationTypeEntity */
public final class ApplicationTypeEntity {
    private final String appType;
    private final String dictionaryKey;

    public ApplicationTypeEntity(String str, String str2) {
        C41536l.m120489i(str2, "dictionaryKey");
        this.appType = str;
        this.dictionaryKey = str2;
    }

    public static /* synthetic */ ApplicationTypeEntity copy$default(ApplicationTypeEntity applicationTypeEntity, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = applicationTypeEntity.appType;
        }
        if ((i & 2) != 0) {
            str2 = applicationTypeEntity.dictionaryKey;
        }
        return applicationTypeEntity.copy(str, str2);
    }

    public final String component1() {
        return this.appType;
    }

    public final String component2() {
        return this.dictionaryKey;
    }

    public final ApplicationTypeEntity copy(String str, String str2) {
        C41536l.m120489i(str2, "dictionaryKey");
        return new ApplicationTypeEntity(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplicationTypeEntity)) {
            return false;
        }
        ApplicationTypeEntity applicationTypeEntity = (ApplicationTypeEntity) obj;
        return C41536l.m120484d(this.appType, applicationTypeEntity.appType) && C41536l.m120484d(this.dictionaryKey, applicationTypeEntity.dictionaryKey);
    }

    public final String getAppType() {
        return this.appType;
    }

    public final String getDictionaryKey() {
        return this.dictionaryKey;
    }

    public int hashCode() {
        String str = this.appType;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.dictionaryKey.hashCode();
    }

    public String toString() {
        String str = this.appType;
        String str2 = this.dictionaryKey;
        return "ApplicationTypeEntity(appType=" + str + ", dictionaryKey=" + str2 + ")";
    }
}
