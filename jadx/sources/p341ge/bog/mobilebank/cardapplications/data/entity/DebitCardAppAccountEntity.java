package p341ge.bog.mobilebank.cardapplications.data.entity;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.cardapplications.data.entity.DebitCardAppAccountEntity */
public final class DebitCardAppAccountEntity {
    private final String acctDesc;
    private final long acctKey;
    private final String acctNo;
    private final String availableAmount;
    private final String cardClass;
    private final String cardType;
    private final String ccy;
    private final long clientKey;
    private final String planCode;
    private final String planType;

    public DebitCardAppAccountEntity(long j, String str, String str2, String str3, String str4, long j2, String str5, String str6, String str7, String str8) {
        C41536l.m120489i(str, "acctNo");
        C41536l.m120489i(str2, "ccy");
        C41536l.m120489i(str3, "planType");
        C41536l.m120489i(str4, "planCode");
        C41536l.m120489i(str5, "cardClass");
        C41536l.m120489i(str6, "cardType");
        C41536l.m120489i(str7, "availableAmount");
        this.acctKey = j;
        this.acctNo = str;
        this.ccy = str2;
        this.planType = str3;
        this.planCode = str4;
        this.clientKey = j2;
        this.cardClass = str5;
        this.cardType = str6;
        this.availableAmount = str7;
        this.acctDesc = str8;
    }

    public static /* synthetic */ DebitCardAppAccountEntity copy$default(DebitCardAppAccountEntity debitCardAppAccountEntity, long j, String str, String str2, String str3, String str4, long j2, String str5, String str6, String str7, String str8, int i, Object obj) {
        DebitCardAppAccountEntity debitCardAppAccountEntity2 = debitCardAppAccountEntity;
        int i2 = i;
        return debitCardAppAccountEntity.copy((i2 & 1) != 0 ? debitCardAppAccountEntity2.acctKey : j, (i2 & 2) != 0 ? debitCardAppAccountEntity2.acctNo : str, (i2 & 4) != 0 ? debitCardAppAccountEntity2.ccy : str2, (i2 & 8) != 0 ? debitCardAppAccountEntity2.planType : str3, (i2 & 16) != 0 ? debitCardAppAccountEntity2.planCode : str4, (i2 & 32) != 0 ? debitCardAppAccountEntity2.clientKey : j2, (i2 & 64) != 0 ? debitCardAppAccountEntity2.cardClass : str5, (i2 & 128) != 0 ? debitCardAppAccountEntity2.cardType : str6, (i2 & C11398b.f33139r) != 0 ? debitCardAppAccountEntity2.availableAmount : str7, (i2 & C11398b.f33140s) != 0 ? debitCardAppAccountEntity2.acctDesc : str8);
    }

    public final long component1() {
        return this.acctKey;
    }

    public final String component10() {
        return this.acctDesc;
    }

    public final String component2() {
        return this.acctNo;
    }

    public final String component3() {
        return this.ccy;
    }

    public final String component4() {
        return this.planType;
    }

    public final String component5() {
        return this.planCode;
    }

    public final long component6() {
        return this.clientKey;
    }

    public final String component7() {
        return this.cardClass;
    }

    public final String component8() {
        return this.cardType;
    }

    public final String component9() {
        return this.availableAmount;
    }

    public final DebitCardAppAccountEntity copy(long j, String str, String str2, String str3, String str4, long j2, String str5, String str6, String str7, String str8) {
        String str9 = str;
        C41536l.m120489i(str9, "acctNo");
        String str10 = str2;
        C41536l.m120489i(str10, "ccy");
        String str11 = str3;
        C41536l.m120489i(str11, "planType");
        String str12 = str4;
        C41536l.m120489i(str12, "planCode");
        String str13 = str5;
        C41536l.m120489i(str13, "cardClass");
        String str14 = str6;
        C41536l.m120489i(str14, "cardType");
        String str15 = str7;
        C41536l.m120489i(str15, "availableAmount");
        return new DebitCardAppAccountEntity(j, str9, str10, str11, str12, j2, str13, str14, str15, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DebitCardAppAccountEntity)) {
            return false;
        }
        DebitCardAppAccountEntity debitCardAppAccountEntity = (DebitCardAppAccountEntity) obj;
        return this.acctKey == debitCardAppAccountEntity.acctKey && C41536l.m120484d(this.acctNo, debitCardAppAccountEntity.acctNo) && C41536l.m120484d(this.ccy, debitCardAppAccountEntity.ccy) && C41536l.m120484d(this.planType, debitCardAppAccountEntity.planType) && C41536l.m120484d(this.planCode, debitCardAppAccountEntity.planCode) && this.clientKey == debitCardAppAccountEntity.clientKey && C41536l.m120484d(this.cardClass, debitCardAppAccountEntity.cardClass) && C41536l.m120484d(this.cardType, debitCardAppAccountEntity.cardType) && C41536l.m120484d(this.availableAmount, debitCardAppAccountEntity.availableAmount) && C41536l.m120484d(this.acctDesc, debitCardAppAccountEntity.acctDesc);
    }

    public final String getAcctDesc() {
        return this.acctDesc;
    }

    public final long getAcctKey() {
        return this.acctKey;
    }

    public final String getAcctNo() {
        return this.acctNo;
    }

    public final String getAvailableAmount() {
        return this.availableAmount;
    }

    public final String getCardClass() {
        return this.cardClass;
    }

    public final String getCardType() {
        return this.cardType;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final long getClientKey() {
        return this.clientKey;
    }

    public final String getPlanCode() {
        return this.planCode;
    }

    public final String getPlanType() {
        return this.planType;
    }

    public int hashCode() {
        int a = ((((((((((((((((C7397t.m28148a(this.acctKey) * 31) + this.acctNo.hashCode()) * 31) + this.ccy.hashCode()) * 31) + this.planType.hashCode()) * 31) + this.planCode.hashCode()) * 31) + C7397t.m28148a(this.clientKey)) * 31) + this.cardClass.hashCode()) * 31) + this.cardType.hashCode()) * 31) + this.availableAmount.hashCode()) * 31;
        String str = this.acctDesc;
        return a + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        long j = this.acctKey;
        String str = this.acctNo;
        String str2 = this.ccy;
        String str3 = this.planType;
        String str4 = this.planCode;
        long j2 = this.clientKey;
        String str5 = this.cardClass;
        String str6 = this.cardType;
        String str7 = this.availableAmount;
        String str8 = this.acctDesc;
        return "DebitCardAppAccountEntity(acctKey=" + j + ", acctNo=" + str + ", ccy=" + str2 + ", planType=" + str3 + ", planCode=" + str4 + ", clientKey=" + j2 + ", cardClass=" + str5 + ", cardType=" + str6 + ", availableAmount=" + str7 + ", acctDesc=" + str8 + ")";
    }
}
