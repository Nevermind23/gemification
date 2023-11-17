package p341ge.bog.mobilebank.depositapplication.data.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.depositapplication.data.entity.DepositsEntity */
public final class DepositsEntity {
    private final Long agreeKey;
    private final Long appId;
    private final String depositPdfUrl;

    public DepositsEntity(Long l, Long l2, String str) {
        this.agreeKey = l;
        this.appId = l2;
        this.depositPdfUrl = str;
    }

    public static /* synthetic */ DepositsEntity copy$default(DepositsEntity depositsEntity, Long l, Long l2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            l = depositsEntity.agreeKey;
        }
        if ((i & 2) != 0) {
            l2 = depositsEntity.appId;
        }
        if ((i & 4) != 0) {
            str = depositsEntity.depositPdfUrl;
        }
        return depositsEntity.copy(l, l2, str);
    }

    public final Long component1() {
        return this.agreeKey;
    }

    public final Long component2() {
        return this.appId;
    }

    public final String component3() {
        return this.depositPdfUrl;
    }

    public final DepositsEntity copy(Long l, Long l2, String str) {
        return new DepositsEntity(l, l2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DepositsEntity)) {
            return false;
        }
        DepositsEntity depositsEntity = (DepositsEntity) obj;
        return C41536l.m120484d(this.agreeKey, depositsEntity.agreeKey) && C41536l.m120484d(this.appId, depositsEntity.appId) && C41536l.m120484d(this.depositPdfUrl, depositsEntity.depositPdfUrl);
    }

    public final Long getAgreeKey() {
        return this.agreeKey;
    }

    public final Long getAppId() {
        return this.appId;
    }

    public final String getDepositPdfUrl() {
        return this.depositPdfUrl;
    }

    public int hashCode() {
        Long l = this.agreeKey;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.appId;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.depositPdfUrl;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        Long l = this.agreeKey;
        Long l2 = this.appId;
        String str = this.depositPdfUrl;
        return "DepositsEntity(agreeKey=" + l + ", appId=" + l2 + ", depositPdfUrl=" + str + ")";
    }
}
