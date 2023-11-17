package p341ge.bog.mobilebank.categorypackages.data.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.categorypackages.data.entity.PackageDelReasonsEntity */
public final class PackageDelReasonsEntity {
    private final String delReason;
    private final String delReasonDictionaryKey;
    private final String packageName;

    public PackageDelReasonsEntity(String str, String str2, String str3) {
        this.packageName = str;
        this.delReason = str2;
        this.delReasonDictionaryKey = str3;
    }

    public static /* synthetic */ PackageDelReasonsEntity copy$default(PackageDelReasonsEntity packageDelReasonsEntity, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = packageDelReasonsEntity.packageName;
        }
        if ((i & 2) != 0) {
            str2 = packageDelReasonsEntity.delReason;
        }
        if ((i & 4) != 0) {
            str3 = packageDelReasonsEntity.delReasonDictionaryKey;
        }
        return packageDelReasonsEntity.copy(str, str2, str3);
    }

    public final String component1() {
        return this.packageName;
    }

    public final String component2() {
        return this.delReason;
    }

    public final String component3() {
        return this.delReasonDictionaryKey;
    }

    public final PackageDelReasonsEntity copy(String str, String str2, String str3) {
        return new PackageDelReasonsEntity(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PackageDelReasonsEntity)) {
            return false;
        }
        PackageDelReasonsEntity packageDelReasonsEntity = (PackageDelReasonsEntity) obj;
        return C41536l.m120484d(this.packageName, packageDelReasonsEntity.packageName) && C41536l.m120484d(this.delReason, packageDelReasonsEntity.delReason) && C41536l.m120484d(this.delReasonDictionaryKey, packageDelReasonsEntity.delReasonDictionaryKey);
    }

    public final String getDelReason() {
        return this.delReason;
    }

    public final String getDelReasonDictionaryKey() {
        return this.delReasonDictionaryKey;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public int hashCode() {
        String str = this.packageName;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.delReason;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.delReasonDictionaryKey;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        String str = this.packageName;
        String str2 = this.delReason;
        String str3 = this.delReasonDictionaryKey;
        return "PackageDelReasonsEntity(packageName=" + str + ", delReason=" + str2 + ", delReasonDictionaryKey=" + str3 + ")";
    }
}
