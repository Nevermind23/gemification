package p341ge.bog.mobilebank.cardapplications.data.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;

@Keep
/* renamed from: ge.bog.mobilebank.cardapplications.data.entity.DebitCardPayrollInfoEntity */
public final class DebitCardPayrollInfoEntity {
    private final Long acctKey;
    private final YesNoApiEntity isArmyCard;
    private final long orgId;
    private final String orgNameEn;
    private final String orgNameGe;

    public DebitCardPayrollInfoEntity(long j, String str, String str2, Long l, YesNoApiEntity yesNoApiEntity) {
        C41536l.m120489i(yesNoApiEntity, "isArmyCard");
        this.orgId = j;
        this.orgNameGe = str;
        this.orgNameEn = str2;
        this.acctKey = l;
        this.isArmyCard = yesNoApiEntity;
    }

    public static /* synthetic */ DebitCardPayrollInfoEntity copy$default(DebitCardPayrollInfoEntity debitCardPayrollInfoEntity, long j, String str, String str2, Long l, YesNoApiEntity yesNoApiEntity, int i, Object obj) {
        if ((i & 1) != 0) {
            j = debitCardPayrollInfoEntity.orgId;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = debitCardPayrollInfoEntity.orgNameGe;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = debitCardPayrollInfoEntity.orgNameEn;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            l = debitCardPayrollInfoEntity.acctKey;
        }
        Long l2 = l;
        if ((i & 16) != 0) {
            yesNoApiEntity = debitCardPayrollInfoEntity.isArmyCard;
        }
        return debitCardPayrollInfoEntity.copy(j2, str3, str4, l2, yesNoApiEntity);
    }

    public final long component1() {
        return this.orgId;
    }

    public final String component2() {
        return this.orgNameGe;
    }

    public final String component3() {
        return this.orgNameEn;
    }

    public final Long component4() {
        return this.acctKey;
    }

    public final YesNoApiEntity component5() {
        return this.isArmyCard;
    }

    public final DebitCardPayrollInfoEntity copy(long j, String str, String str2, Long l, YesNoApiEntity yesNoApiEntity) {
        C41536l.m120489i(yesNoApiEntity, "isArmyCard");
        return new DebitCardPayrollInfoEntity(j, str, str2, l, yesNoApiEntity);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DebitCardPayrollInfoEntity)) {
            return false;
        }
        DebitCardPayrollInfoEntity debitCardPayrollInfoEntity = (DebitCardPayrollInfoEntity) obj;
        return this.orgId == debitCardPayrollInfoEntity.orgId && C41536l.m120484d(this.orgNameGe, debitCardPayrollInfoEntity.orgNameGe) && C41536l.m120484d(this.orgNameEn, debitCardPayrollInfoEntity.orgNameEn) && C41536l.m120484d(this.acctKey, debitCardPayrollInfoEntity.acctKey) && this.isArmyCard == debitCardPayrollInfoEntity.isArmyCard;
    }

    public final Long getAcctKey() {
        return this.acctKey;
    }

    public final long getOrgId() {
        return this.orgId;
    }

    public final String getOrgNameEn() {
        return this.orgNameEn;
    }

    public final String getOrgNameGe() {
        return this.orgNameGe;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.orgId) * 31;
        String str = this.orgNameGe;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.orgNameEn;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.acctKey;
        if (l != null) {
            i = l.hashCode();
        }
        return ((hashCode2 + i) * 31) + this.isArmyCard.hashCode();
    }

    public final YesNoApiEntity isArmyCard() {
        return this.isArmyCard;
    }

    public String toString() {
        long j = this.orgId;
        String str = this.orgNameGe;
        String str2 = this.orgNameEn;
        Long l = this.acctKey;
        YesNoApiEntity yesNoApiEntity = this.isArmyCard;
        return "DebitCardPayrollInfoEntity(orgId=" + j + ", orgNameGe=" + str + ", orgNameEn=" + str2 + ", acctKey=" + l + ", isArmyCard=" + yesNoApiEntity + ")";
    }
}
