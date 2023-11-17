package p341ge.bog.mobilebank.cleanarch.data.creditinfo.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.creditinfo.entity.CreditInfoContractEntity */
public final class CreditInfoContractEntity {
    private final String contractText;
    private final long contractTypeId;

    /* renamed from: id */
    private final long f56448id;
    private final long inpSysdate;
    private final String languageCode;
    private final String templateVersionId;

    public CreditInfoContractEntity(long j, long j2, String str, String str2, long j3, String str3) {
        C41536l.m120489i(str, "contractText");
        C41536l.m120489i(str2, "languageCode");
        this.f56448id = j;
        this.contractTypeId = j2;
        this.contractText = str;
        this.languageCode = str2;
        this.inpSysdate = j3;
        this.templateVersionId = str3;
    }

    public static /* synthetic */ CreditInfoContractEntity copy$default(CreditInfoContractEntity creditInfoContractEntity, long j, long j2, String str, String str2, long j3, String str3, int i, Object obj) {
        CreditInfoContractEntity creditInfoContractEntity2 = creditInfoContractEntity;
        return creditInfoContractEntity.copy((i & 1) != 0 ? creditInfoContractEntity2.f56448id : j, (i & 2) != 0 ? creditInfoContractEntity2.contractTypeId : j2, (i & 4) != 0 ? creditInfoContractEntity2.contractText : str, (i & 8) != 0 ? creditInfoContractEntity2.languageCode : str2, (i & 16) != 0 ? creditInfoContractEntity2.inpSysdate : j3, (i & 32) != 0 ? creditInfoContractEntity2.templateVersionId : str3);
    }

    public final long component1() {
        return this.f56448id;
    }

    public final long component2() {
        return this.contractTypeId;
    }

    public final String component3() {
        return this.contractText;
    }

    public final String component4() {
        return this.languageCode;
    }

    public final long component5() {
        return this.inpSysdate;
    }

    public final String component6() {
        return this.templateVersionId;
    }

    public final CreditInfoContractEntity copy(long j, long j2, String str, String str2, long j3, String str3) {
        String str4 = str;
        C41536l.m120489i(str4, "contractText");
        String str5 = str2;
        C41536l.m120489i(str5, "languageCode");
        return new CreditInfoContractEntity(j, j2, str4, str5, j3, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreditInfoContractEntity)) {
            return false;
        }
        CreditInfoContractEntity creditInfoContractEntity = (CreditInfoContractEntity) obj;
        return this.f56448id == creditInfoContractEntity.f56448id && this.contractTypeId == creditInfoContractEntity.contractTypeId && C41536l.m120484d(this.contractText, creditInfoContractEntity.contractText) && C41536l.m120484d(this.languageCode, creditInfoContractEntity.languageCode) && this.inpSysdate == creditInfoContractEntity.inpSysdate && C41536l.m120484d(this.templateVersionId, creditInfoContractEntity.templateVersionId);
    }

    public final String getContractText() {
        return this.contractText;
    }

    public final long getContractTypeId() {
        return this.contractTypeId;
    }

    public final long getId() {
        return this.f56448id;
    }

    public final long getInpSysdate() {
        return this.inpSysdate;
    }

    public final String getLanguageCode() {
        return this.languageCode;
    }

    public final String getTemplateVersionId() {
        return this.templateVersionId;
    }

    public int hashCode() {
        int a = ((((((((C7397t.m28148a(this.f56448id) * 31) + C7397t.m28148a(this.contractTypeId)) * 31) + this.contractText.hashCode()) * 31) + this.languageCode.hashCode()) * 31) + C7397t.m28148a(this.inpSysdate)) * 31;
        String str = this.templateVersionId;
        return a + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        long j = this.f56448id;
        long j2 = this.contractTypeId;
        String str = this.contractText;
        String str2 = this.languageCode;
        long j3 = this.inpSysdate;
        String str3 = this.templateVersionId;
        return "CreditInfoContractEntity(id=" + j + ", contractTypeId=" + j2 + ", contractText=" + str + ", languageCode=" + str2 + ", inpSysdate=" + j3 + ", templateVersionId=" + str3 + ")";
    }
}
