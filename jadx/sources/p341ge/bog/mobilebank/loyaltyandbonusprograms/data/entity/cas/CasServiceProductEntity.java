package p341ge.bog.mobilebank.loyaltyandbonusprograms.data.entity.cas;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;

@Keep
/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.data.entity.cas.CasServiceProductEntity */
public final class CasServiceProductEntity {
    private final List<CasAccountEntity> accounts;
    private final double agreeBalance;
    private final String agreeCcy;
    private final long agreeKey;
    private final String agreeNo;
    private final String agreeType;
    private final String agreeTypeDictionaryKey;
    private final String agreeTypeDictionaryValue;
    private final long clientKey;
    private final long clientServiceId;
    private final double currentMonthTotalAmount;
    private final List<DepositAccountEntity> depositAccounts;
    private final String depositAgreeType;
    private final String depositTypeDictionaryKey;
    private final String depositTypeDictionaryValue;
    private final String name;
    private final YesNoApiEntity opensAgrFlag;
    private final String prodType;
    private final Long restEndDate;
    private final YesNoApiEntity restFlag;
    private final Long restStartDate;
    private final String scheme;
    private final String schemeTariffCcy;
    private final long schemeTariffId;
    private final double schemeTariffValue;
    private final String status;
    private final double totalAmount;
    private final Double totalAmountAcct;

    public CasServiceProductEntity(long j, long j2, String str, long j3, double d, String str2, long j4, String str3, String str4, String str5, String str6, String str7, String str8, double d2, Double d3, double d4, String str9, double d5, YesNoApiEntity yesNoApiEntity, Long l, Long l2, YesNoApiEntity yesNoApiEntity2, String str10, String str11, List<CasAccountEntity> list, List<DepositAccountEntity> list2, String str12, String str13) {
        String str14 = str;
        String str15 = str2;
        String str16 = str3;
        String str17 = str4;
        String str18 = str6;
        String str19 = str7;
        String str20 = str8;
        String str21 = str9;
        C41536l.m120489i(str14, "scheme");
        C41536l.m120489i(str15, "schemeTariffCcy");
        C41536l.m120489i(str16, "agreeType");
        C41536l.m120489i(str17, "status");
        C41536l.m120489i(str18, "agreeNo");
        C41536l.m120489i(str19, "prodType");
        C41536l.m120489i(str20, "agreeCcy");
        C41536l.m120489i(str21, "depositAgreeType");
        this.clientServiceId = j;
        this.clientKey = j2;
        this.scheme = str14;
        this.schemeTariffId = j3;
        this.schemeTariffValue = d;
        this.schemeTariffCcy = str15;
        this.agreeKey = j4;
        this.agreeType = str16;
        this.status = str17;
        this.name = str5;
        this.agreeNo = str18;
        this.prodType = str19;
        this.agreeCcy = str20;
        this.totalAmount = d2;
        this.totalAmountAcct = d3;
        this.currentMonthTotalAmount = d4;
        this.depositAgreeType = str21;
        this.agreeBalance = d5;
        this.restFlag = yesNoApiEntity;
        this.restStartDate = l;
        this.restEndDate = l2;
        this.opensAgrFlag = yesNoApiEntity2;
        this.agreeTypeDictionaryKey = str10;
        this.agreeTypeDictionaryValue = str11;
        this.accounts = list;
        this.depositAccounts = list2;
        this.depositTypeDictionaryKey = str12;
        this.depositTypeDictionaryValue = str13;
    }

    public static /* synthetic */ CasServiceProductEntity copy$default(CasServiceProductEntity casServiceProductEntity, long j, long j2, String str, long j3, double d, String str2, long j4, String str3, String str4, String str5, String str6, String str7, String str8, double d2, Double d3, double d4, String str9, double d5, YesNoApiEntity yesNoApiEntity, Long l, Long l2, YesNoApiEntity yesNoApiEntity2, String str10, String str11, List list, List list2, String str12, String str13, int i, Object obj) {
        CasServiceProductEntity casServiceProductEntity2 = casServiceProductEntity;
        int i2 = i;
        return casServiceProductEntity.copy((i2 & 1) != 0 ? casServiceProductEntity2.clientServiceId : j, (i2 & 2) != 0 ? casServiceProductEntity2.clientKey : j2, (i2 & 4) != 0 ? casServiceProductEntity2.scheme : str, (i2 & 8) != 0 ? casServiceProductEntity2.schemeTariffId : j3, (i2 & 16) != 0 ? casServiceProductEntity2.schemeTariffValue : d, (i2 & 32) != 0 ? casServiceProductEntity2.schemeTariffCcy : str2, (i2 & 64) != 0 ? casServiceProductEntity2.agreeKey : j4, (i2 & 128) != 0 ? casServiceProductEntity2.agreeType : str3, (i2 & C11398b.f33139r) != 0 ? casServiceProductEntity2.status : str4, (i2 & C11398b.f33140s) != 0 ? casServiceProductEntity2.name : str5, (i2 & C11398b.f33141t) != 0 ? casServiceProductEntity2.agreeNo : str6, (i2 & C11398b.f33142u) != 0 ? casServiceProductEntity2.prodType : str7, (i2 & C11398b.f33143v) != 0 ? casServiceProductEntity2.agreeCcy : str8, (i2 & 8192) != 0 ? casServiceProductEntity2.totalAmount : d2, (i2 & 16384) != 0 ? casServiceProductEntity2.totalAmountAcct : d3, (32768 & i2) != 0 ? casServiceProductEntity2.currentMonthTotalAmount : d4, (i2 & 65536) != 0 ? casServiceProductEntity2.depositAgreeType : str9, (131072 & i2) != 0 ? casServiceProductEntity2.agreeBalance : d5, (i2 & 262144) != 0 ? casServiceProductEntity2.restFlag : yesNoApiEntity, (524288 & i2) != 0 ? casServiceProductEntity2.restStartDate : l, (i2 & 1048576) != 0 ? casServiceProductEntity2.restEndDate : l2, (i2 & 2097152) != 0 ? casServiceProductEntity2.opensAgrFlag : yesNoApiEntity2, (i2 & 4194304) != 0 ? casServiceProductEntity2.agreeTypeDictionaryKey : str10, (i2 & 8388608) != 0 ? casServiceProductEntity2.agreeTypeDictionaryValue : str11, (i2 & 16777216) != 0 ? casServiceProductEntity2.accounts : list, (i2 & 33554432) != 0 ? casServiceProductEntity2.depositAccounts : list2, (i2 & 67108864) != 0 ? casServiceProductEntity2.depositTypeDictionaryKey : str12, (i2 & 134217728) != 0 ? casServiceProductEntity2.depositTypeDictionaryValue : str13);
    }

    public final long component1() {
        return this.clientServiceId;
    }

    public final String component10() {
        return this.name;
    }

    public final String component11() {
        return this.agreeNo;
    }

    public final String component12() {
        return this.prodType;
    }

    public final String component13() {
        return this.agreeCcy;
    }

    public final double component14() {
        return this.totalAmount;
    }

    public final Double component15() {
        return this.totalAmountAcct;
    }

    public final double component16() {
        return this.currentMonthTotalAmount;
    }

    public final String component17() {
        return this.depositAgreeType;
    }

    public final double component18() {
        return this.agreeBalance;
    }

    public final YesNoApiEntity component19() {
        return this.restFlag;
    }

    public final long component2() {
        return this.clientKey;
    }

    public final Long component20() {
        return this.restStartDate;
    }

    public final Long component21() {
        return this.restEndDate;
    }

    public final YesNoApiEntity component22() {
        return this.opensAgrFlag;
    }

    public final String component23() {
        return this.agreeTypeDictionaryKey;
    }

    public final String component24() {
        return this.agreeTypeDictionaryValue;
    }

    public final List<CasAccountEntity> component25() {
        return this.accounts;
    }

    public final List<DepositAccountEntity> component26() {
        return this.depositAccounts;
    }

    public final String component27() {
        return this.depositTypeDictionaryKey;
    }

    public final String component28() {
        return this.depositTypeDictionaryValue;
    }

    public final String component3() {
        return this.scheme;
    }

    public final long component4() {
        return this.schemeTariffId;
    }

    public final double component5() {
        return this.schemeTariffValue;
    }

    public final String component6() {
        return this.schemeTariffCcy;
    }

    public final long component7() {
        return this.agreeKey;
    }

    public final String component8() {
        return this.agreeType;
    }

    public final String component9() {
        return this.status;
    }

    public final CasServiceProductEntity copy(long j, long j2, String str, long j3, double d, String str2, long j4, String str3, String str4, String str5, String str6, String str7, String str8, double d2, Double d3, double d4, String str9, double d5, YesNoApiEntity yesNoApiEntity, Long l, Long l2, YesNoApiEntity yesNoApiEntity2, String str10, String str11, List<CasAccountEntity> list, List<DepositAccountEntity> list2, String str12, String str13) {
        long j5 = j;
        C41536l.m120489i(str, "scheme");
        C41536l.m120489i(str2, "schemeTariffCcy");
        C41536l.m120489i(str3, "agreeType");
        C41536l.m120489i(str4, "status");
        C41536l.m120489i(str6, "agreeNo");
        C41536l.m120489i(str7, "prodType");
        C41536l.m120489i(str8, "agreeCcy");
        C41536l.m120489i(str9, "depositAgreeType");
        return new CasServiceProductEntity(j, j2, str, j3, d, str2, j4, str3, str4, str5, str6, str7, str8, d2, d3, d4, str9, d5, yesNoApiEntity, l, l2, yesNoApiEntity2, str10, str11, list, list2, str12, str13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CasServiceProductEntity)) {
            return false;
        }
        CasServiceProductEntity casServiceProductEntity = (CasServiceProductEntity) obj;
        return this.clientServiceId == casServiceProductEntity.clientServiceId && this.clientKey == casServiceProductEntity.clientKey && C41536l.m120484d(this.scheme, casServiceProductEntity.scheme) && this.schemeTariffId == casServiceProductEntity.schemeTariffId && Double.compare(this.schemeTariffValue, casServiceProductEntity.schemeTariffValue) == 0 && C41536l.m120484d(this.schemeTariffCcy, casServiceProductEntity.schemeTariffCcy) && this.agreeKey == casServiceProductEntity.agreeKey && C41536l.m120484d(this.agreeType, casServiceProductEntity.agreeType) && C41536l.m120484d(this.status, casServiceProductEntity.status) && C41536l.m120484d(this.name, casServiceProductEntity.name) && C41536l.m120484d(this.agreeNo, casServiceProductEntity.agreeNo) && C41536l.m120484d(this.prodType, casServiceProductEntity.prodType) && C41536l.m120484d(this.agreeCcy, casServiceProductEntity.agreeCcy) && Double.compare(this.totalAmount, casServiceProductEntity.totalAmount) == 0 && C41536l.m120484d(this.totalAmountAcct, casServiceProductEntity.totalAmountAcct) && Double.compare(this.currentMonthTotalAmount, casServiceProductEntity.currentMonthTotalAmount) == 0 && C41536l.m120484d(this.depositAgreeType, casServiceProductEntity.depositAgreeType) && Double.compare(this.agreeBalance, casServiceProductEntity.agreeBalance) == 0 && this.restFlag == casServiceProductEntity.restFlag && C41536l.m120484d(this.restStartDate, casServiceProductEntity.restStartDate) && C41536l.m120484d(this.restEndDate, casServiceProductEntity.restEndDate) && this.opensAgrFlag == casServiceProductEntity.opensAgrFlag && C41536l.m120484d(this.agreeTypeDictionaryKey, casServiceProductEntity.agreeTypeDictionaryKey) && C41536l.m120484d(this.agreeTypeDictionaryValue, casServiceProductEntity.agreeTypeDictionaryValue) && C41536l.m120484d(this.accounts, casServiceProductEntity.accounts) && C41536l.m120484d(this.depositAccounts, casServiceProductEntity.depositAccounts) && C41536l.m120484d(this.depositTypeDictionaryKey, casServiceProductEntity.depositTypeDictionaryKey) && C41536l.m120484d(this.depositTypeDictionaryValue, casServiceProductEntity.depositTypeDictionaryValue);
    }

    public final List<CasAccountEntity> getAccounts() {
        return this.accounts;
    }

    public final double getAgreeBalance() {
        return this.agreeBalance;
    }

    public final String getAgreeCcy() {
        return this.agreeCcy;
    }

    public final long getAgreeKey() {
        return this.agreeKey;
    }

    public final String getAgreeNo() {
        return this.agreeNo;
    }

    public final String getAgreeType() {
        return this.agreeType;
    }

    public final String getAgreeTypeDictionaryKey() {
        return this.agreeTypeDictionaryKey;
    }

    public final String getAgreeTypeDictionaryValue() {
        return this.agreeTypeDictionaryValue;
    }

    public final long getClientKey() {
        return this.clientKey;
    }

    public final long getClientServiceId() {
        return this.clientServiceId;
    }

    public final double getCurrentMonthTotalAmount() {
        return this.currentMonthTotalAmount;
    }

    public final List<DepositAccountEntity> getDepositAccounts() {
        return this.depositAccounts;
    }

    public final String getDepositAgreeType() {
        return this.depositAgreeType;
    }

    public final String getDepositTypeDictionaryKey() {
        return this.depositTypeDictionaryKey;
    }

    public final String getDepositTypeDictionaryValue() {
        return this.depositTypeDictionaryValue;
    }

    public final String getName() {
        return this.name;
    }

    public final YesNoApiEntity getOpensAgrFlag() {
        return this.opensAgrFlag;
    }

    public final String getProdType() {
        return this.prodType;
    }

    public final Long getRestEndDate() {
        return this.restEndDate;
    }

    public final YesNoApiEntity getRestFlag() {
        return this.restFlag;
    }

    public final Long getRestStartDate() {
        return this.restStartDate;
    }

    public final String getScheme() {
        return this.scheme;
    }

    public final String getSchemeTariffCcy() {
        return this.schemeTariffCcy;
    }

    public final long getSchemeTariffId() {
        return this.schemeTariffId;
    }

    public final double getSchemeTariffValue() {
        return this.schemeTariffValue;
    }

    public final String getStatus() {
        return this.status;
    }

    public final double getTotalAmount() {
        return this.totalAmount;
    }

    public final Double getTotalAmountAcct() {
        return this.totalAmountAcct;
    }

    public int hashCode() {
        int a = ((((((((((((((((C7397t.m28148a(this.clientServiceId) * 31) + C7397t.m28148a(this.clientKey)) * 31) + this.scheme.hashCode()) * 31) + C7397t.m28148a(this.schemeTariffId)) * 31) + Double.doubleToLongBits(this.schemeTariffValue)) * 31) + this.schemeTariffCcy.hashCode()) * 31) + C7397t.m28148a(this.agreeKey)) * 31) + this.agreeType.hashCode()) * 31) + this.status.hashCode()) * 31;
        String str = this.name;
        int i = 0;
        int hashCode = (((((((((a + (str == null ? 0 : str.hashCode())) * 31) + this.agreeNo.hashCode()) * 31) + this.prodType.hashCode()) * 31) + this.agreeCcy.hashCode()) * 31) + Double.doubleToLongBits(this.totalAmount)) * 31;
        Double d = this.totalAmountAcct;
        int hashCode2 = (((((((hashCode + (d == null ? 0 : d.hashCode())) * 31) + Double.doubleToLongBits(this.currentMonthTotalAmount)) * 31) + this.depositAgreeType.hashCode()) * 31) + Double.doubleToLongBits(this.agreeBalance)) * 31;
        YesNoApiEntity yesNoApiEntity = this.restFlag;
        int hashCode3 = (hashCode2 + (yesNoApiEntity == null ? 0 : yesNoApiEntity.hashCode())) * 31;
        Long l = this.restStartDate;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.restEndDate;
        int hashCode5 = (hashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        YesNoApiEntity yesNoApiEntity2 = this.opensAgrFlag;
        int hashCode6 = (hashCode5 + (yesNoApiEntity2 == null ? 0 : yesNoApiEntity2.hashCode())) * 31;
        String str2 = this.agreeTypeDictionaryKey;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.agreeTypeDictionaryValue;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<CasAccountEntity> list = this.accounts;
        int hashCode9 = (hashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        List<DepositAccountEntity> list2 = this.depositAccounts;
        int hashCode10 = (hashCode9 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str4 = this.depositTypeDictionaryKey;
        int hashCode11 = (hashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.depositTypeDictionaryValue;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode11 + i;
    }

    public String toString() {
        long j = this.clientServiceId;
        long j2 = this.clientKey;
        String str = this.scheme;
        long j3 = this.schemeTariffId;
        double d = this.schemeTariffValue;
        String str2 = this.schemeTariffCcy;
        long j4 = this.agreeKey;
        String str3 = this.agreeType;
        String str4 = this.status;
        String str5 = this.name;
        String str6 = this.agreeNo;
        String str7 = this.prodType;
        String str8 = str4;
        String str9 = this.agreeCcy;
        double d2 = this.totalAmount;
        Double d3 = this.totalAmountAcct;
        double d4 = this.currentMonthTotalAmount;
        String str10 = this.depositAgreeType;
        double d5 = this.agreeBalance;
        YesNoApiEntity yesNoApiEntity = this.restFlag;
        Long l = this.restStartDate;
        Long l2 = this.restEndDate;
        YesNoApiEntity yesNoApiEntity2 = this.opensAgrFlag;
        String str11 = this.agreeTypeDictionaryKey;
        String str12 = this.agreeTypeDictionaryValue;
        List<CasAccountEntity> list = this.accounts;
        List<DepositAccountEntity> list2 = this.depositAccounts;
        String str13 = this.depositTypeDictionaryKey;
        String str14 = this.depositTypeDictionaryValue;
        return "CasServiceProductEntity(clientServiceId=" + j + ", clientKey=" + j2 + ", scheme=" + str + ", schemeTariffId=" + j3 + ", schemeTariffValue=" + d + ", schemeTariffCcy=" + str2 + ", agreeKey=" + j4 + ", agreeType=" + str3 + ", status=" + str8 + ", name=" + str5 + ", agreeNo=" + str6 + ", prodType=" + str7 + ", agreeCcy=" + str9 + ", totalAmount=" + d2 + ", totalAmountAcct=" + d3 + ", currentMonthTotalAmount=" + d4 + ", depositAgreeType=" + str10 + ", agreeBalance=" + d5 + ", restFlag=" + yesNoApiEntity + ", restStartDate=" + l + ", restEndDate=" + l2 + ", opensAgrFlag=" + yesNoApiEntity2 + ", agreeTypeDictionaryKey=" + str11 + ", agreeTypeDictionaryValue=" + str12 + ", accounts=" + list + ", depositAccounts=" + list2 + ", depositTypeDictionaryKey=" + str13 + ", depositTypeDictionaryValue=" + str14 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CasServiceProductEntity(long j, long j2, String str, long j3, double d, String str2, long j4, String str3, String str4, String str5, String str6, String str7, String str8, double d2, Double d3, double d4, String str9, double d5, YesNoApiEntity yesNoApiEntity, Long l, Long l2, YesNoApiEntity yesNoApiEntity2, String str10, String str11, List list, List list2, String str12, String str13, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, str, j3, d, str2, j4, str3, str4, str5, str6, str7, str8, d2, d3, d4, str9, d5, yesNoApiEntity, (i & 524288) != 0 ? null : l, (i & 1048576) != 0 ? null : l2, yesNoApiEntity2, (i & 4194304) != 0 ? null : str10, (i & 8388608) != 0 ? null : str11, list, list2, (i & 67108864) != 0 ? null : str12, (i & 134217728) != 0 ? null : str13);
    }
}
