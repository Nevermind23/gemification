package p341ge.bog.mobilebank.cleanarch.data.products.entity;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.products.entity.AccountDetailsApiEntity */
public final class AccountDetailsApiEntity {
    private final String acctBranch;
    private final String acctName;
    private final String acctNo;
    private final List<AccountAmountApiEntity> availableAmountSums;
    private final List<AccountAmountApiEntity> availableAmounts;
    private final String ccy;
    private final String displayWarning;
    private final YesNoApiEntity isCardExpiring;
    private final String isCardInactive;
    private final boolean isScoolcard;
    private final String ownerFirstName;
    private final String ownerLastName;
    private final Long pfmAcctId;
    private final String productCode;
    private final String productDictionaryKey;
    private final BigDecimal realAmount;
    private final double scoolas;
    private final List<AccountStudDepInfoApiEntity> studDepInfos;
    private final List<AccountSubAccountsApiEntity> subAccounts;
    private final List<AccountAmountApiEntity> subAccountsSums;

    public AccountDetailsApiEntity(String str, String str2, BigDecimal bigDecimal, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, YesNoApiEntity yesNoApiEntity, String str9, List<AccountSubAccountsApiEntity> list, List<AccountAmountApiEntity> list2, List<AccountAmountApiEntity> list3, List<AccountAmountApiEntity> list4, List<AccountStudDepInfoApiEntity> list5, double d, Long l, String str10) {
        String str11 = str;
        String str12 = str4;
        String str13 = str5;
        String str14 = str6;
        String str15 = str7;
        String str16 = str8;
        YesNoApiEntity yesNoApiEntity2 = yesNoApiEntity;
        String str17 = str9;
        List<AccountSubAccountsApiEntity> list6 = list;
        List<AccountAmountApiEntity> list7 = list2;
        List<AccountAmountApiEntity> list8 = list3;
        List<AccountAmountApiEntity> list9 = list4;
        List<AccountStudDepInfoApiEntity> list10 = list5;
        String str18 = str10;
        C41536l.m120489i(str11, "acctNo");
        C41536l.m120489i(str12, "ccy");
        C41536l.m120489i(str13, "productCode");
        C41536l.m120489i(str14, "acctBranch");
        C41536l.m120489i(str15, "ownerFirstName");
        C41536l.m120489i(str16, "ownerLastName");
        C41536l.m120489i(yesNoApiEntity2, "isCardExpiring");
        C41536l.m120489i(str17, "isCardInactive");
        C41536l.m120489i(list6, "subAccounts");
        C41536l.m120489i(list7, "availableAmounts");
        C41536l.m120489i(list8, "availableAmountSums");
        C41536l.m120489i(list9, "subAccountsSums");
        C41536l.m120489i(list10, "studDepInfos");
        C41536l.m120489i(str18, "displayWarning");
        this.acctNo = str11;
        this.acctName = str2;
        this.realAmount = bigDecimal;
        this.productDictionaryKey = str3;
        this.ccy = str12;
        this.productCode = str13;
        this.acctBranch = str14;
        this.ownerFirstName = str15;
        this.ownerLastName = str16;
        this.isScoolcard = z;
        this.isCardExpiring = yesNoApiEntity2;
        this.isCardInactive = str17;
        this.subAccounts = list6;
        this.availableAmounts = list7;
        this.availableAmountSums = list8;
        this.subAccountsSums = list9;
        this.studDepInfos = list10;
        this.scoolas = d;
        this.pfmAcctId = l;
        this.displayWarning = str18;
    }

    public static /* synthetic */ AccountDetailsApiEntity copy$default(AccountDetailsApiEntity accountDetailsApiEntity, String str, String str2, BigDecimal bigDecimal, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, YesNoApiEntity yesNoApiEntity, String str9, List list, List list2, List list3, List list4, List list5, double d, Long l, String str10, int i, Object obj) {
        AccountDetailsApiEntity accountDetailsApiEntity2 = accountDetailsApiEntity;
        int i2 = i;
        return accountDetailsApiEntity.copy((i2 & 1) != 0 ? accountDetailsApiEntity2.acctNo : str, (i2 & 2) != 0 ? accountDetailsApiEntity2.acctName : str2, (i2 & 4) != 0 ? accountDetailsApiEntity2.realAmount : bigDecimal, (i2 & 8) != 0 ? accountDetailsApiEntity2.productDictionaryKey : str3, (i2 & 16) != 0 ? accountDetailsApiEntity2.ccy : str4, (i2 & 32) != 0 ? accountDetailsApiEntity2.productCode : str5, (i2 & 64) != 0 ? accountDetailsApiEntity2.acctBranch : str6, (i2 & 128) != 0 ? accountDetailsApiEntity2.ownerFirstName : str7, (i2 & C11398b.f33139r) != 0 ? accountDetailsApiEntity2.ownerLastName : str8, (i2 & C11398b.f33140s) != 0 ? accountDetailsApiEntity2.isScoolcard : z, (i2 & C11398b.f33141t) != 0 ? accountDetailsApiEntity2.isCardExpiring : yesNoApiEntity, (i2 & C11398b.f33142u) != 0 ? accountDetailsApiEntity2.isCardInactive : str9, (i2 & C11398b.f33143v) != 0 ? accountDetailsApiEntity2.subAccounts : list, (i2 & 8192) != 0 ? accountDetailsApiEntity2.availableAmounts : list2, (i2 & 16384) != 0 ? accountDetailsApiEntity2.availableAmountSums : list3, (i2 & 32768) != 0 ? accountDetailsApiEntity2.subAccountsSums : list4, (i2 & 65536) != 0 ? accountDetailsApiEntity2.studDepInfos : list5, (i2 & 131072) != 0 ? accountDetailsApiEntity2.scoolas : d, (i2 & 262144) != 0 ? accountDetailsApiEntity2.pfmAcctId : l, (i2 & 524288) != 0 ? accountDetailsApiEntity2.displayWarning : str10);
    }

    public final String component1() {
        return this.acctNo;
    }

    public final boolean component10() {
        return this.isScoolcard;
    }

    public final YesNoApiEntity component11() {
        return this.isCardExpiring;
    }

    public final String component12() {
        return this.isCardInactive;
    }

    public final List<AccountSubAccountsApiEntity> component13() {
        return this.subAccounts;
    }

    public final List<AccountAmountApiEntity> component14() {
        return this.availableAmounts;
    }

    public final List<AccountAmountApiEntity> component15() {
        return this.availableAmountSums;
    }

    public final List<AccountAmountApiEntity> component16() {
        return this.subAccountsSums;
    }

    public final List<AccountStudDepInfoApiEntity> component17() {
        return this.studDepInfos;
    }

    public final double component18() {
        return this.scoolas;
    }

    public final Long component19() {
        return this.pfmAcctId;
    }

    public final String component2() {
        return this.acctName;
    }

    public final String component20() {
        return this.displayWarning;
    }

    public final BigDecimal component3() {
        return this.realAmount;
    }

    public final String component4() {
        return this.productDictionaryKey;
    }

    public final String component5() {
        return this.ccy;
    }

    public final String component6() {
        return this.productCode;
    }

    public final String component7() {
        return this.acctBranch;
    }

    public final String component8() {
        return this.ownerFirstName;
    }

    public final String component9() {
        return this.ownerLastName;
    }

    public final AccountDetailsApiEntity copy(String str, String str2, BigDecimal bigDecimal, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, YesNoApiEntity yesNoApiEntity, String str9, List<AccountSubAccountsApiEntity> list, List<AccountAmountApiEntity> list2, List<AccountAmountApiEntity> list3, List<AccountAmountApiEntity> list4, List<AccountStudDepInfoApiEntity> list5, double d, Long l, String str10) {
        String str11 = str;
        C41536l.m120489i(str11, "acctNo");
        C41536l.m120489i(str4, "ccy");
        C41536l.m120489i(str5, "productCode");
        C41536l.m120489i(str6, "acctBranch");
        C41536l.m120489i(str7, "ownerFirstName");
        C41536l.m120489i(str8, "ownerLastName");
        C41536l.m120489i(yesNoApiEntity, "isCardExpiring");
        C41536l.m120489i(str9, "isCardInactive");
        C41536l.m120489i(list, "subAccounts");
        C41536l.m120489i(list2, "availableAmounts");
        C41536l.m120489i(list3, "availableAmountSums");
        C41536l.m120489i(list4, "subAccountsSums");
        C41536l.m120489i(list5, "studDepInfos");
        C41536l.m120489i(str10, "displayWarning");
        return new AccountDetailsApiEntity(str11, str2, bigDecimal, str3, str4, str5, str6, str7, str8, z, yesNoApiEntity, str9, list, list2, list3, list4, list5, d, l, str10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountDetailsApiEntity)) {
            return false;
        }
        AccountDetailsApiEntity accountDetailsApiEntity = (AccountDetailsApiEntity) obj;
        return C41536l.m120484d(this.acctNo, accountDetailsApiEntity.acctNo) && C41536l.m120484d(this.acctName, accountDetailsApiEntity.acctName) && C41536l.m120484d(this.realAmount, accountDetailsApiEntity.realAmount) && C41536l.m120484d(this.productDictionaryKey, accountDetailsApiEntity.productDictionaryKey) && C41536l.m120484d(this.ccy, accountDetailsApiEntity.ccy) && C41536l.m120484d(this.productCode, accountDetailsApiEntity.productCode) && C41536l.m120484d(this.acctBranch, accountDetailsApiEntity.acctBranch) && C41536l.m120484d(this.ownerFirstName, accountDetailsApiEntity.ownerFirstName) && C41536l.m120484d(this.ownerLastName, accountDetailsApiEntity.ownerLastName) && this.isScoolcard == accountDetailsApiEntity.isScoolcard && this.isCardExpiring == accountDetailsApiEntity.isCardExpiring && C41536l.m120484d(this.isCardInactive, accountDetailsApiEntity.isCardInactive) && C41536l.m120484d(this.subAccounts, accountDetailsApiEntity.subAccounts) && C41536l.m120484d(this.availableAmounts, accountDetailsApiEntity.availableAmounts) && C41536l.m120484d(this.availableAmountSums, accountDetailsApiEntity.availableAmountSums) && C41536l.m120484d(this.subAccountsSums, accountDetailsApiEntity.subAccountsSums) && C41536l.m120484d(this.studDepInfos, accountDetailsApiEntity.studDepInfos) && Double.compare(this.scoolas, accountDetailsApiEntity.scoolas) == 0 && C41536l.m120484d(this.pfmAcctId, accountDetailsApiEntity.pfmAcctId) && C41536l.m120484d(this.displayWarning, accountDetailsApiEntity.displayWarning);
    }

    public final String getAcctBranch() {
        return this.acctBranch;
    }

    public final String getAcctName() {
        return this.acctName;
    }

    public final String getAcctNo() {
        return this.acctNo;
    }

    public final List<AccountAmountApiEntity> getAvailableAmountSums() {
        return this.availableAmountSums;
    }

    public final List<AccountAmountApiEntity> getAvailableAmounts() {
        return this.availableAmounts;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final String getDisplayWarning() {
        return this.displayWarning;
    }

    public final String getOwnerFirstName() {
        return this.ownerFirstName;
    }

    public final String getOwnerLastName() {
        return this.ownerLastName;
    }

    public final Long getPfmAcctId() {
        return this.pfmAcctId;
    }

    public final String getProductCode() {
        return this.productCode;
    }

    public final String getProductDictionaryKey() {
        return this.productDictionaryKey;
    }

    public final BigDecimal getRealAmount() {
        return this.realAmount;
    }

    public final double getScoolas() {
        return this.scoolas;
    }

    public final List<AccountStudDepInfoApiEntity> getStudDepInfos() {
        return this.studDepInfos;
    }

    public final List<AccountSubAccountsApiEntity> getSubAccounts() {
        return this.subAccounts;
    }

    public final List<AccountAmountApiEntity> getSubAccountsSums() {
        return this.subAccountsSums;
    }

    public int hashCode() {
        int hashCode = this.acctNo.hashCode() * 31;
        String str = this.acctName;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        BigDecimal bigDecimal = this.realAmount;
        int hashCode3 = (hashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str2 = this.productDictionaryKey;
        int hashCode4 = (((((((((((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.ccy.hashCode()) * 31) + this.productCode.hashCode()) * 31) + this.acctBranch.hashCode()) * 31) + this.ownerFirstName.hashCode()) * 31) + this.ownerLastName.hashCode()) * 31;
        boolean z = this.isScoolcard;
        if (z) {
            z = true;
        }
        int hashCode5 = (((((((((((((((((hashCode4 + (z ? 1 : 0)) * 31) + this.isCardExpiring.hashCode()) * 31) + this.isCardInactive.hashCode()) * 31) + this.subAccounts.hashCode()) * 31) + this.availableAmounts.hashCode()) * 31) + this.availableAmountSums.hashCode()) * 31) + this.subAccountsSums.hashCode()) * 31) + this.studDepInfos.hashCode()) * 31) + Double.doubleToLongBits(this.scoolas)) * 31;
        Long l = this.pfmAcctId;
        if (l != null) {
            i = l.hashCode();
        }
        return ((hashCode5 + i) * 31) + this.displayWarning.hashCode();
    }

    public final YesNoApiEntity isCardExpiring() {
        return this.isCardExpiring;
    }

    public final String isCardInactive() {
        return this.isCardInactive;
    }

    public final boolean isScoolcard() {
        return this.isScoolcard;
    }

    public String toString() {
        String str = this.acctNo;
        String str2 = this.acctName;
        BigDecimal bigDecimal = this.realAmount;
        String str3 = this.productDictionaryKey;
        String str4 = this.ccy;
        String str5 = this.productCode;
        String str6 = this.acctBranch;
        String str7 = this.ownerFirstName;
        String str8 = this.ownerLastName;
        boolean z = this.isScoolcard;
        YesNoApiEntity yesNoApiEntity = this.isCardExpiring;
        String str9 = this.isCardInactive;
        List<AccountSubAccountsApiEntity> list = this.subAccounts;
        List<AccountAmountApiEntity> list2 = this.availableAmounts;
        List<AccountAmountApiEntity> list3 = this.availableAmountSums;
        List<AccountAmountApiEntity> list4 = this.subAccountsSums;
        List<AccountAmountApiEntity> list5 = list2;
        List<AccountStudDepInfoApiEntity> list6 = this.studDepInfos;
        double d = this.scoolas;
        Long l = this.pfmAcctId;
        String str10 = this.displayWarning;
        return "AccountDetailsApiEntity(acctNo=" + str + ", acctName=" + str2 + ", realAmount=" + bigDecimal + ", productDictionaryKey=" + str3 + ", ccy=" + str4 + ", productCode=" + str5 + ", acctBranch=" + str6 + ", ownerFirstName=" + str7 + ", ownerLastName=" + str8 + ", isScoolcard=" + z + ", isCardExpiring=" + yesNoApiEntity + ", isCardInactive=" + str9 + ", subAccounts=" + list + ", availableAmounts=" + list5 + ", availableAmountSums=" + list3 + ", subAccountsSums=" + list4 + ", studDepInfos=" + list6 + ", scoolas=" + d + ", pfmAcctId=" + l + ", displayWarning=" + str10 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AccountDetailsApiEntity(String str, String str2, BigDecimal bigDecimal, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, YesNoApiEntity yesNoApiEntity, String str9, List list, List list2, List list3, List list4, List list5, double d, Long l, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, bigDecimal, (i & 8) != 0 ? null : str3, str4, str5, str6, str7, str8, z, yesNoApiEntity, str9, list, list2, list3, list4, list5, d, (i & 262144) != 0 ? null : l, str10);
    }
}
