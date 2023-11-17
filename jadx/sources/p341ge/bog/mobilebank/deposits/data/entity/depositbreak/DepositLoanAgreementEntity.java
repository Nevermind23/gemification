package p341ge.bog.mobilebank.deposits.data.entity.depositbreak;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p277ua.C8664c;

@Keep
/* renamed from: ge.bog.mobilebank.deposits.data.entity.depositbreak.DepositLoanAgreementEntity */
public final class DepositLoanAgreementEntity {
    private final double agreeBalance;
    @C8664c(alternate = {"agree_key"}, value = "agreeKey")
    private final long agreeKey;
    private final String agreeNo;
    private final double agreeRate;
    private final double availableAmount;
    private final String ccy;
    private final long clientKeyMain;
    private final String dictionaryKey;
    private final double intAccrued;
    private final String name;
    private final String prodType;
    private final double provAmount;
    private final double realAmount;

    public DepositLoanAgreementEntity(long j, String str, long j2, String str2, String str3, double d, double d2, double d3, double d4, double d5, String str4, double d6, String str5) {
        String str6 = str5;
        C41536l.m120489i(str, "prodType");
        C41536l.m120489i(str2, "agreeNo");
        C41536l.m120489i(str3, "ccy");
        C41536l.m120489i(str6, "dictionaryKey");
        this.agreeKey = j;
        this.prodType = str;
        this.clientKeyMain = j2;
        this.agreeNo = str2;
        this.ccy = str3;
        this.agreeRate = d;
        this.agreeBalance = d2;
        this.realAmount = d3;
        this.availableAmount = d4;
        this.provAmount = d5;
        this.name = str4;
        this.intAccrued = d6;
        this.dictionaryKey = str6;
    }

    public static /* synthetic */ DepositLoanAgreementEntity copy$default(DepositLoanAgreementEntity depositLoanAgreementEntity, long j, String str, long j2, String str2, String str3, double d, double d2, double d3, double d4, double d5, String str4, double d6, String str5, int i, Object obj) {
        DepositLoanAgreementEntity depositLoanAgreementEntity2 = depositLoanAgreementEntity;
        int i2 = i;
        return depositLoanAgreementEntity.copy((i2 & 1) != 0 ? depositLoanAgreementEntity2.agreeKey : j, (i2 & 2) != 0 ? depositLoanAgreementEntity2.prodType : str, (i2 & 4) != 0 ? depositLoanAgreementEntity2.clientKeyMain : j2, (i2 & 8) != 0 ? depositLoanAgreementEntity2.agreeNo : str2, (i2 & 16) != 0 ? depositLoanAgreementEntity2.ccy : str3, (i2 & 32) != 0 ? depositLoanAgreementEntity2.agreeRate : d, (i2 & 64) != 0 ? depositLoanAgreementEntity2.agreeBalance : d2, (i2 & 128) != 0 ? depositLoanAgreementEntity2.realAmount : d3, (i2 & C11398b.f33139r) != 0 ? depositLoanAgreementEntity2.availableAmount : d4, (i2 & C11398b.f33140s) != 0 ? depositLoanAgreementEntity2.provAmount : d5, (i2 & C11398b.f33141t) != 0 ? depositLoanAgreementEntity2.name : str4, (i2 & C11398b.f33142u) != 0 ? depositLoanAgreementEntity2.intAccrued : d6, (i2 & C11398b.f33143v) != 0 ? depositLoanAgreementEntity2.dictionaryKey : str5);
    }

    public final long component1() {
        return this.agreeKey;
    }

    public final double component10() {
        return this.provAmount;
    }

    public final String component11() {
        return this.name;
    }

    public final double component12() {
        return this.intAccrued;
    }

    public final String component13() {
        return this.dictionaryKey;
    }

    public final String component2() {
        return this.prodType;
    }

    public final long component3() {
        return this.clientKeyMain;
    }

    public final String component4() {
        return this.agreeNo;
    }

    public final String component5() {
        return this.ccy;
    }

    public final double component6() {
        return this.agreeRate;
    }

    public final double component7() {
        return this.agreeBalance;
    }

    public final double component8() {
        return this.realAmount;
    }

    public final double component9() {
        return this.availableAmount;
    }

    public final DepositLoanAgreementEntity copy(long j, String str, long j2, String str2, String str3, double d, double d2, double d3, double d4, double d5, String str4, double d6, String str5) {
        long j3 = j;
        C41536l.m120489i(str, "prodType");
        C41536l.m120489i(str2, "agreeNo");
        C41536l.m120489i(str3, "ccy");
        C41536l.m120489i(str5, "dictionaryKey");
        return new DepositLoanAgreementEntity(j, str, j2, str2, str3, d, d2, d3, d4, d5, str4, d6, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DepositLoanAgreementEntity)) {
            return false;
        }
        DepositLoanAgreementEntity depositLoanAgreementEntity = (DepositLoanAgreementEntity) obj;
        return this.agreeKey == depositLoanAgreementEntity.agreeKey && C41536l.m120484d(this.prodType, depositLoanAgreementEntity.prodType) && this.clientKeyMain == depositLoanAgreementEntity.clientKeyMain && C41536l.m120484d(this.agreeNo, depositLoanAgreementEntity.agreeNo) && C41536l.m120484d(this.ccy, depositLoanAgreementEntity.ccy) && Double.compare(this.agreeRate, depositLoanAgreementEntity.agreeRate) == 0 && Double.compare(this.agreeBalance, depositLoanAgreementEntity.agreeBalance) == 0 && Double.compare(this.realAmount, depositLoanAgreementEntity.realAmount) == 0 && Double.compare(this.availableAmount, depositLoanAgreementEntity.availableAmount) == 0 && Double.compare(this.provAmount, depositLoanAgreementEntity.provAmount) == 0 && C41536l.m120484d(this.name, depositLoanAgreementEntity.name) && Double.compare(this.intAccrued, depositLoanAgreementEntity.intAccrued) == 0 && C41536l.m120484d(this.dictionaryKey, depositLoanAgreementEntity.dictionaryKey);
    }

    public final double getAgreeBalance() {
        return this.agreeBalance;
    }

    public final long getAgreeKey() {
        return this.agreeKey;
    }

    public final String getAgreeNo() {
        return this.agreeNo;
    }

    public final double getAgreeRate() {
        return this.agreeRate;
    }

    public final double getAvailableAmount() {
        return this.availableAmount;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final long getClientKeyMain() {
        return this.clientKeyMain;
    }

    public final String getDictionaryKey() {
        return this.dictionaryKey;
    }

    public final double getIntAccrued() {
        return this.intAccrued;
    }

    public final String getName() {
        return this.name;
    }

    public final String getProdType() {
        return this.prodType;
    }

    public final double getProvAmount() {
        return this.provAmount;
    }

    public final double getRealAmount() {
        return this.realAmount;
    }

    public int hashCode() {
        int a = ((((((((((((((((((C7397t.m28148a(this.agreeKey) * 31) + this.prodType.hashCode()) * 31) + C7397t.m28148a(this.clientKeyMain)) * 31) + this.agreeNo.hashCode()) * 31) + this.ccy.hashCode()) * 31) + Double.doubleToLongBits(this.agreeRate)) * 31) + Double.doubleToLongBits(this.agreeBalance)) * 31) + Double.doubleToLongBits(this.realAmount)) * 31) + Double.doubleToLongBits(this.availableAmount)) * 31) + Double.doubleToLongBits(this.provAmount)) * 31;
        String str = this.name;
        return ((((a + (str == null ? 0 : str.hashCode())) * 31) + Double.doubleToLongBits(this.intAccrued)) * 31) + this.dictionaryKey.hashCode();
    }

    public String toString() {
        long j = this.agreeKey;
        String str = this.prodType;
        long j2 = this.clientKeyMain;
        String str2 = this.agreeNo;
        String str3 = this.ccy;
        double d = this.agreeRate;
        double d2 = this.agreeBalance;
        double d3 = this.realAmount;
        double d4 = this.availableAmount;
        double d5 = this.provAmount;
        String str4 = this.name;
        double d6 = this.intAccrued;
        String str5 = this.dictionaryKey;
        return "DepositLoanAgreementEntity(agreeKey=" + j + ", prodType=" + str + ", clientKeyMain=" + j2 + ", agreeNo=" + str2 + ", ccy=" + str3 + ", agreeRate=" + d + ", agreeBalance=" + d2 + ", realAmount=" + d3 + ", availableAmount=" + d4 + ", provAmount=" + d5 + ", name=" + str4 + ", intAccrued=" + d6 + ", dictionaryKey=" + str5 + ")";
    }
}
