package p341ge.bog.mobilebank.products.data.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.products.data.model.AccountDetailsApiModel */
public final class AccountDetailsApiModel {
    private final String acctBranch;
    private final long acctKey;
    private final String acctName;
    private final String acctNo;
    private final List<AccountAmountApiModel> availableAmountSums;
    private final List<AccountAmountApiModel> availableAmounts;
    private final String ccy;
    private final String displayWarning;
    private final YesNoApiModel isCardExpiring;
    private final String isCardInactive;
    private final boolean isScoolcard;
    private final String ownerFirstName;
    private final String ownerLastName;
    private final Long pfmAcctId;
    private final String productCode;
    private final String productDictionaryKey;
    private final BigDecimal realAmount;
    private final double scoolas;
    private final List<AccountStudDepInfoApiModel> studDepInfos;
    private final List<AccountSubAccountsApiModel> subAccounts;
    private final List<AccountAmountApiModel> subAccountsSums;

    public AccountDetailsApiModel(String str, long j, String str2, BigDecimal bigDecimal, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, YesNoApiModel yesNoApiModel, String str9, List<AccountSubAccountsApiModel> list, List<AccountAmountApiModel> list2, List<AccountAmountApiModel> list3, List<AccountAmountApiModel> list4, List<AccountStudDepInfoApiModel> list5, double d, Long l, String str10) {
        String str11 = str;
        String str12 = str4;
        String str13 = str5;
        String str14 = str6;
        String str15 = str7;
        String str16 = str8;
        YesNoApiModel yesNoApiModel2 = yesNoApiModel;
        String str17 = str9;
        List<AccountSubAccountsApiModel> list6 = list;
        List<AccountAmountApiModel> list7 = list2;
        List<AccountAmountApiModel> list8 = list3;
        List<AccountAmountApiModel> list9 = list4;
        List<AccountStudDepInfoApiModel> list10 = list5;
        C41536l.m120489i(str11, "acctNo");
        C41536l.m120489i(str12, "ccy");
        C41536l.m120489i(str13, "productCode");
        C41536l.m120489i(str14, "acctBranch");
        C41536l.m120489i(str15, "ownerFirstName");
        C41536l.m120489i(str16, "ownerLastName");
        C41536l.m120489i(yesNoApiModel2, "isCardExpiring");
        C41536l.m120489i(str17, "isCardInactive");
        C41536l.m120489i(list6, "subAccounts");
        C41536l.m120489i(list7, "availableAmounts");
        C41536l.m120489i(list8, "availableAmountSums");
        C41536l.m120489i(list9, "subAccountsSums");
        C41536l.m120489i(list10, "studDepInfos");
        C41536l.m120489i(str10, "displayWarning");
        this.acctNo = str11;
        this.acctKey = j;
        this.acctName = str2;
        this.realAmount = bigDecimal;
        this.productDictionaryKey = str3;
        this.ccy = str12;
        this.productCode = str13;
        this.acctBranch = str14;
        this.ownerFirstName = str15;
        this.ownerLastName = str16;
        this.isScoolcard = z;
        this.isCardExpiring = yesNoApiModel2;
        this.isCardInactive = str17;
        this.subAccounts = list6;
        this.availableAmounts = list7;
        this.availableAmountSums = list8;
        this.subAccountsSums = list9;
        this.studDepInfos = list10;
        this.scoolas = d;
        this.pfmAcctId = l;
        this.displayWarning = str10;
    }

    public static /* synthetic */ AccountDetailsApiModel copy$default(AccountDetailsApiModel accountDetailsApiModel, String str, long j, String str2, BigDecimal bigDecimal, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, YesNoApiModel yesNoApiModel, String str9, List list, List list2, List list3, List list4, List list5, double d, Long l, String str10, int i, Object obj) {
        AccountDetailsApiModel accountDetailsApiModel2 = accountDetailsApiModel;
        int i2 = i;
        return accountDetailsApiModel.copy((i2 & 1) != 0 ? accountDetailsApiModel2.acctNo : str, (i2 & 2) != 0 ? accountDetailsApiModel2.acctKey : j, (i2 & 4) != 0 ? accountDetailsApiModel2.acctName : str2, (i2 & 8) != 0 ? accountDetailsApiModel2.realAmount : bigDecimal, (i2 & 16) != 0 ? accountDetailsApiModel2.productDictionaryKey : str3, (i2 & 32) != 0 ? accountDetailsApiModel2.ccy : str4, (i2 & 64) != 0 ? accountDetailsApiModel2.productCode : str5, (i2 & 128) != 0 ? accountDetailsApiModel2.acctBranch : str6, (i2 & C11398b.f33139r) != 0 ? accountDetailsApiModel2.ownerFirstName : str7, (i2 & C11398b.f33140s) != 0 ? accountDetailsApiModel2.ownerLastName : str8, (i2 & C11398b.f33141t) != 0 ? accountDetailsApiModel2.isScoolcard : z, (i2 & C11398b.f33142u) != 0 ? accountDetailsApiModel2.isCardExpiring : yesNoApiModel, (i2 & C11398b.f33143v) != 0 ? accountDetailsApiModel2.isCardInactive : str9, (i2 & 8192) != 0 ? accountDetailsApiModel2.subAccounts : list, (i2 & 16384) != 0 ? accountDetailsApiModel2.availableAmounts : list2, (i2 & 32768) != 0 ? accountDetailsApiModel2.availableAmountSums : list3, (i2 & 65536) != 0 ? accountDetailsApiModel2.subAccountsSums : list4, (i2 & 131072) != 0 ? accountDetailsApiModel2.studDepInfos : list5, (i2 & 262144) != 0 ? accountDetailsApiModel2.scoolas : d, (i2 & 524288) != 0 ? accountDetailsApiModel2.pfmAcctId : l, (i2 & 1048576) != 0 ? accountDetailsApiModel2.displayWarning : str10);
    }

    public final String component1() {
        return this.acctNo;
    }

    public final String component10() {
        return this.ownerLastName;
    }

    public final boolean component11() {
        return this.isScoolcard;
    }

    public final YesNoApiModel component12() {
        return this.isCardExpiring;
    }

    public final String component13() {
        return this.isCardInactive;
    }

    public final List<AccountSubAccountsApiModel> component14() {
        return this.subAccounts;
    }

    public final List<AccountAmountApiModel> component15() {
        return this.availableAmounts;
    }

    public final List<AccountAmountApiModel> component16() {
        return this.availableAmountSums;
    }

    public final List<AccountAmountApiModel> component17() {
        return this.subAccountsSums;
    }

    public final List<AccountStudDepInfoApiModel> component18() {
        return this.studDepInfos;
    }

    public final double component19() {
        return this.scoolas;
    }

    public final long component2() {
        return this.acctKey;
    }

    public final Long component20() {
        return this.pfmAcctId;
    }

    public final String component21() {
        return this.displayWarning;
    }

    public final String component3() {
        return this.acctName;
    }

    public final BigDecimal component4() {
        return this.realAmount;
    }

    public final String component5() {
        return this.productDictionaryKey;
    }

    public final String component6() {
        return this.ccy;
    }

    public final String component7() {
        return this.productCode;
    }

    public final String component8() {
        return this.acctBranch;
    }

    public final String component9() {
        return this.ownerFirstName;
    }

    public final AccountDetailsApiModel copy(String str, long j, String str2, BigDecimal bigDecimal, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, YesNoApiModel yesNoApiModel, String str9, List<AccountSubAccountsApiModel> list, List<AccountAmountApiModel> list2, List<AccountAmountApiModel> list3, List<AccountAmountApiModel> list4, List<AccountStudDepInfoApiModel> list5, double d, Long l, String str10) {
        String str11 = str;
        C41536l.m120489i(str11, "acctNo");
        C41536l.m120489i(str4, "ccy");
        C41536l.m120489i(str5, "productCode");
        C41536l.m120489i(str6, "acctBranch");
        C41536l.m120489i(str7, "ownerFirstName");
        C41536l.m120489i(str8, "ownerLastName");
        C41536l.m120489i(yesNoApiModel, "isCardExpiring");
        C41536l.m120489i(str9, "isCardInactive");
        C41536l.m120489i(list, "subAccounts");
        C41536l.m120489i(list2, "availableAmounts");
        C41536l.m120489i(list3, "availableAmountSums");
        C41536l.m120489i(list4, "subAccountsSums");
        C41536l.m120489i(list5, "studDepInfos");
        C41536l.m120489i(str10, "displayWarning");
        return new AccountDetailsApiModel(str11, j, str2, bigDecimal, str3, str4, str5, str6, str7, str8, z, yesNoApiModel, str9, list, list2, list3, list4, list5, d, l, str10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountDetailsApiModel)) {
            return false;
        }
        AccountDetailsApiModel accountDetailsApiModel = (AccountDetailsApiModel) obj;
        return C41536l.m120484d(this.acctNo, accountDetailsApiModel.acctNo) && this.acctKey == accountDetailsApiModel.acctKey && C41536l.m120484d(this.acctName, accountDetailsApiModel.acctName) && C41536l.m120484d(this.realAmount, accountDetailsApiModel.realAmount) && C41536l.m120484d(this.productDictionaryKey, accountDetailsApiModel.productDictionaryKey) && C41536l.m120484d(this.ccy, accountDetailsApiModel.ccy) && C41536l.m120484d(this.productCode, accountDetailsApiModel.productCode) && C41536l.m120484d(this.acctBranch, accountDetailsApiModel.acctBranch) && C41536l.m120484d(this.ownerFirstName, accountDetailsApiModel.ownerFirstName) && C41536l.m120484d(this.ownerLastName, accountDetailsApiModel.ownerLastName) && this.isScoolcard == accountDetailsApiModel.isScoolcard && this.isCardExpiring == accountDetailsApiModel.isCardExpiring && C41536l.m120484d(this.isCardInactive, accountDetailsApiModel.isCardInactive) && C41536l.m120484d(this.subAccounts, accountDetailsApiModel.subAccounts) && C41536l.m120484d(this.availableAmounts, accountDetailsApiModel.availableAmounts) && C41536l.m120484d(this.availableAmountSums, accountDetailsApiModel.availableAmountSums) && C41536l.m120484d(this.subAccountsSums, accountDetailsApiModel.subAccountsSums) && C41536l.m120484d(this.studDepInfos, accountDetailsApiModel.studDepInfos) && Double.compare(this.scoolas, accountDetailsApiModel.scoolas) == 0 && C41536l.m120484d(this.pfmAcctId, accountDetailsApiModel.pfmAcctId) && C41536l.m120484d(this.displayWarning, accountDetailsApiModel.displayWarning);
    }

    public final String getAcctBranch() {
        return this.acctBranch;
    }

    public final long getAcctKey() {
        return this.acctKey;
    }

    public final String getAcctName() {
        return this.acctName;
    }

    public final String getAcctNo() {
        return this.acctNo;
    }

    public final List<AccountAmountApiModel> getAvailableAmountSums() {
        return this.availableAmountSums;
    }

    public final List<AccountAmountApiModel> getAvailableAmounts() {
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

    public final List<AccountStudDepInfoApiModel> getStudDepInfos() {
        return this.studDepInfos;
    }

    public final List<AccountSubAccountsApiModel> getSubAccounts() {
        return this.subAccounts;
    }

    public final List<AccountAmountApiModel> getSubAccountsSums() {
        return this.subAccountsSums;
    }

    public int hashCode() {
        int hashCode = ((this.acctNo.hashCode() * 31) + C7397t.m28148a(this.acctKey)) * 31;
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

    public final YesNoApiModel isCardExpiring() {
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
        long j = this.acctKey;
        String str2 = this.acctName;
        BigDecimal bigDecimal = this.realAmount;
        String str3 = this.productDictionaryKey;
        String str4 = this.ccy;
        String str5 = this.productCode;
        String str6 = this.acctBranch;
        String str7 = this.ownerFirstName;
        String str8 = this.ownerLastName;
        boolean z = this.isScoolcard;
        YesNoApiModel yesNoApiModel = this.isCardExpiring;
        String str9 = this.isCardInactive;
        List<AccountSubAccountsApiModel> list = this.subAccounts;
        List<AccountAmountApiModel> list2 = this.availableAmounts;
        List<AccountAmountApiModel> list3 = this.availableAmountSums;
        List<AccountAmountApiModel> list4 = this.subAccountsSums;
        String str10 = str9;
        List<AccountStudDepInfoApiModel> list5 = this.studDepInfos;
        double d = this.scoolas;
        Long l = this.pfmAcctId;
        String str11 = this.displayWarning;
        return "AccountDetailsApiModel(acctNo=" + str + ", acctKey=" + j + ", acctName=" + str2 + ", realAmount=" + bigDecimal + ", productDictionaryKey=" + str3 + ", ccy=" + str4 + ", productCode=" + str5 + ", acctBranch=" + str6 + ", ownerFirstName=" + str7 + ", ownerLastName=" + str8 + ", isScoolcard=" + z + ", isCardExpiring=" + yesNoApiModel + ", isCardInactive=" + str10 + ", subAccounts=" + list + ", availableAmounts=" + list2 + ", availableAmountSums=" + list3 + ", subAccountsSums=" + list4 + ", studDepInfos=" + list5 + ", scoolas=" + d + ", pfmAcctId=" + l + ", displayWarning=" + str11 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AccountDetailsApiModel(String str, long j, String str2, BigDecimal bigDecimal, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, YesNoApiModel yesNoApiModel, String str9, List list, List list2, List list3, List list4, List list5, double d, Long l, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, (i & 4) != 0 ? null : str2, bigDecimal, (i & 16) != 0 ? null : str3, str4, str5, str6, str7, str8, z, yesNoApiModel, str9, list, list2, list3, list4, list5, d, (i & 524288) != 0 ? null : l, str10);
    }
}
