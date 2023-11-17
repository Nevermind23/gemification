package p341ge.bog.mobilebank.products.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.products.data.model.ClosableAccountEntity */
public final class ClosableAccountEntity {
    private final Long acctKey;
    private final String acctNo;
    private final Long clientKey;

    public ClosableAccountEntity(Long l, String str, Long l2) {
        this.acctKey = l;
        this.acctNo = str;
        this.clientKey = l2;
    }

    public static /* synthetic */ ClosableAccountEntity copy$default(ClosableAccountEntity closableAccountEntity, Long l, String str, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            l = closableAccountEntity.acctKey;
        }
        if ((i & 2) != 0) {
            str = closableAccountEntity.acctNo;
        }
        if ((i & 4) != 0) {
            l2 = closableAccountEntity.clientKey;
        }
        return closableAccountEntity.copy(l, str, l2);
    }

    public final Long component1() {
        return this.acctKey;
    }

    public final String component2() {
        return this.acctNo;
    }

    public final Long component3() {
        return this.clientKey;
    }

    public final ClosableAccountEntity copy(Long l, String str, Long l2) {
        return new ClosableAccountEntity(l, str, l2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClosableAccountEntity)) {
            return false;
        }
        ClosableAccountEntity closableAccountEntity = (ClosableAccountEntity) obj;
        return C41536l.m120484d(this.acctKey, closableAccountEntity.acctKey) && C41536l.m120484d(this.acctNo, closableAccountEntity.acctNo) && C41536l.m120484d(this.clientKey, closableAccountEntity.clientKey);
    }

    public final Long getAcctKey() {
        return this.acctKey;
    }

    public final String getAcctNo() {
        return this.acctNo;
    }

    public final Long getClientKey() {
        return this.clientKey;
    }

    public int hashCode() {
        Long l = this.acctKey;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.acctNo;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.clientKey;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        Long l = this.acctKey;
        String str = this.acctNo;
        Long l2 = this.clientKey;
        return "ClosableAccountEntity(acctKey=" + l + ", acctNo=" + str + ", clientKey=" + l2 + ")";
    }
}
