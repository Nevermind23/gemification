package p341ge.bog.mobilebank.deposits.data.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.deposits.data.entity.CdsDetailsEntity */
public final class CdsDetailsEntity {
    private final String agreeNo;
    private final Number cdGroupId;
    private final Number clientKey;

    public CdsDetailsEntity(Number number, Number number2, String str) {
        this.clientKey = number;
        this.cdGroupId = number2;
        this.agreeNo = str;
    }

    public static /* synthetic */ CdsDetailsEntity copy$default(CdsDetailsEntity cdsDetailsEntity, Number number, Number number2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            number = cdsDetailsEntity.clientKey;
        }
        if ((i & 2) != 0) {
            number2 = cdsDetailsEntity.cdGroupId;
        }
        if ((i & 4) != 0) {
            str = cdsDetailsEntity.agreeNo;
        }
        return cdsDetailsEntity.copy(number, number2, str);
    }

    public final Number component1() {
        return this.clientKey;
    }

    public final Number component2() {
        return this.cdGroupId;
    }

    public final String component3() {
        return this.agreeNo;
    }

    public final CdsDetailsEntity copy(Number number, Number number2, String str) {
        return new CdsDetailsEntity(number, number2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CdsDetailsEntity)) {
            return false;
        }
        CdsDetailsEntity cdsDetailsEntity = (CdsDetailsEntity) obj;
        return C41536l.m120484d(this.clientKey, cdsDetailsEntity.clientKey) && C41536l.m120484d(this.cdGroupId, cdsDetailsEntity.cdGroupId) && C41536l.m120484d(this.agreeNo, cdsDetailsEntity.agreeNo);
    }

    public final String getAgreeNo() {
        return this.agreeNo;
    }

    public final Number getCdGroupId() {
        return this.cdGroupId;
    }

    public final Number getClientKey() {
        return this.clientKey;
    }

    public int hashCode() {
        Number number = this.clientKey;
        int i = 0;
        int hashCode = (number == null ? 0 : number.hashCode()) * 31;
        Number number2 = this.cdGroupId;
        int hashCode2 = (hashCode + (number2 == null ? 0 : number2.hashCode())) * 31;
        String str = this.agreeNo;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        Number number = this.clientKey;
        Number number2 = this.cdGroupId;
        String str = this.agreeNo;
        return "CdsDetailsEntity(clientKey=" + number + ", cdGroupId=" + number2 + ", agreeNo=" + str + ")";
    }
}
