package p341ge.bog.mobilebank.products.data.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.products.data.model.AccountApiModel */
public final class AccountApiModel {
    private final long acctKey;
    private final String acctName;
    private final BigDecimal amount;
    private final Long attachmentId;
    private final String attachmentUrl;
    private final BigDecimal availableAmount;
    private final String ccy;
    private final String ccyType;
    private final String displayWarning;
    private final YesNoApiModel hasDigitalCard;
    private final YesNoApiModel isCardExpiring;
    private final String isCardInactive;
    private final YesNoApiModel isDefault;
    private final YesNoApiModel isHidden;
    private final long mainAcctKey;
    private final int orderNo;
    private final BigDecimal overlimitAmountMc;
    private final boolean paymentConversion;
    private final boolean paymentConversionDst;
    private final boolean paymentForeign;
    private final boolean paymentOwnAccounts;
    private final boolean paymentOwnAccountsDst;
    private final boolean paymentWithinBank;
    private final boolean paymentWithinGeorgia;
    private final Long pfmAcctId;
    private final String printAcctNo;
    private final String productCode;
    private final String productDictionaryKey;
    private final List<String> productFunctions;
    private final String productGroup;
    private final long productId;
    private final String subType;

    public AccountApiModel(long j, String str, String str2, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str3, int i, String str4, String str5, String str6, String str7, long j2, String str8, long j3, YesNoApiModel yesNoApiModel, YesNoApiModel yesNoApiModel2, Long l, BigDecimal bigDecimal3, YesNoApiModel yesNoApiModel3, String str9, YesNoApiModel yesNoApiModel4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, List<String> list, String str10, Long l2, String str11) {
        String str12 = str2;
        BigDecimal bigDecimal4 = bigDecimal;
        BigDecimal bigDecimal5 = bigDecimal2;
        String str13 = str3;
        String str14 = str4;
        String str15 = str7;
        String str16 = str8;
        YesNoApiModel yesNoApiModel5 = yesNoApiModel;
        YesNoApiModel yesNoApiModel6 = yesNoApiModel2;
        BigDecimal bigDecimal6 = bigDecimal3;
        YesNoApiModel yesNoApiModel7 = yesNoApiModel3;
        String str17 = str9;
        List<String> list2 = list;
        C41536l.m120489i(str12, "printAcctNo");
        C41536l.m120489i(bigDecimal4, "availableAmount");
        C41536l.m120489i(bigDecimal5, "amount");
        C41536l.m120489i(str13, "ccy");
        C41536l.m120489i(str14, "productCode");
        C41536l.m120489i(str15, "ccyType");
        C41536l.m120489i(str16, "productGroup");
        C41536l.m120489i(yesNoApiModel5, "isDefault");
        C41536l.m120489i(yesNoApiModel6, "isHidden");
        C41536l.m120489i(bigDecimal6, "overlimitAmountMc");
        C41536l.m120489i(yesNoApiModel7, "isCardExpiring");
        C41536l.m120489i(str17, "isCardInactive");
        C41536l.m120489i(list2, "productFunctions");
        C41536l.m120489i(str11, "displayWarning");
        this.acctKey = j;
        this.acctName = str;
        this.printAcctNo = str12;
        this.availableAmount = bigDecimal4;
        this.amount = bigDecimal5;
        this.ccy = str13;
        this.orderNo = i;
        this.productCode = str14;
        this.productDictionaryKey = str5;
        this.subType = str6;
        this.ccyType = str15;
        this.mainAcctKey = j2;
        this.productGroup = str16;
        this.productId = j3;
        this.isDefault = yesNoApiModel5;
        this.isHidden = yesNoApiModel6;
        this.attachmentId = l;
        this.overlimitAmountMc = bigDecimal6;
        this.isCardExpiring = yesNoApiModel7;
        this.isCardInactive = str17;
        this.hasDigitalCard = yesNoApiModel4;
        this.paymentOwnAccounts = z;
        this.paymentConversion = z2;
        this.paymentOwnAccountsDst = z3;
        this.paymentConversionDst = z4;
        this.paymentWithinBank = z5;
        this.paymentWithinGeorgia = z6;
        this.paymentForeign = z7;
        this.productFunctions = list2;
        this.attachmentUrl = str10;
        this.pfmAcctId = l2;
        this.displayWarning = str11;
    }

    public static /* synthetic */ AccountApiModel copy$default(AccountApiModel accountApiModel, long j, String str, String str2, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str3, int i, String str4, String str5, String str6, String str7, long j2, String str8, long j3, YesNoApiModel yesNoApiModel, YesNoApiModel yesNoApiModel2, Long l, BigDecimal bigDecimal3, YesNoApiModel yesNoApiModel3, String str9, YesNoApiModel yesNoApiModel4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, List list, String str10, Long l2, String str11, int i2, Object obj) {
        AccountApiModel accountApiModel2 = accountApiModel;
        int i3 = i2;
        return accountApiModel.copy((i3 & 1) != 0 ? accountApiModel2.acctKey : j, (i3 & 2) != 0 ? accountApiModel2.acctName : str, (i3 & 4) != 0 ? accountApiModel2.printAcctNo : str2, (i3 & 8) != 0 ? accountApiModel2.availableAmount : bigDecimal, (i3 & 16) != 0 ? accountApiModel2.amount : bigDecimal2, (i3 & 32) != 0 ? accountApiModel2.ccy : str3, (i3 & 64) != 0 ? accountApiModel2.orderNo : i, (i3 & 128) != 0 ? accountApiModel2.productCode : str4, (i3 & C11398b.f33139r) != 0 ? accountApiModel2.productDictionaryKey : str5, (i3 & C11398b.f33140s) != 0 ? accountApiModel2.subType : str6, (i3 & C11398b.f33141t) != 0 ? accountApiModel2.ccyType : str7, (i3 & C11398b.f33142u) != 0 ? accountApiModel2.mainAcctKey : j2, (i3 & C11398b.f33143v) != 0 ? accountApiModel2.productGroup : str8, (i3 & 8192) != 0 ? accountApiModel2.productId : j3, (i3 & 16384) != 0 ? accountApiModel2.isDefault : yesNoApiModel, (32768 & i3) != 0 ? accountApiModel2.isHidden : yesNoApiModel2, (i3 & 65536) != 0 ? accountApiModel2.attachmentId : l, (i3 & 131072) != 0 ? accountApiModel2.overlimitAmountMc : bigDecimal3, (i3 & 262144) != 0 ? accountApiModel2.isCardExpiring : yesNoApiModel3, (i3 & 524288) != 0 ? accountApiModel2.isCardInactive : str9, (i3 & 1048576) != 0 ? accountApiModel2.hasDigitalCard : yesNoApiModel4, (i3 & 2097152) != 0 ? accountApiModel2.paymentOwnAccounts : z, (i3 & 4194304) != 0 ? accountApiModel2.paymentConversion : z2, (i3 & 8388608) != 0 ? accountApiModel2.paymentOwnAccountsDst : z3, (i3 & 16777216) != 0 ? accountApiModel2.paymentConversionDst : z4, (i3 & 33554432) != 0 ? accountApiModel2.paymentWithinBank : z5, (i3 & 67108864) != 0 ? accountApiModel2.paymentWithinGeorgia : z6, (i3 & 134217728) != 0 ? accountApiModel2.paymentForeign : z7, (i3 & 268435456) != 0 ? accountApiModel2.productFunctions : list, (i3 & 536870912) != 0 ? accountApiModel2.attachmentUrl : str10, (i3 & 1073741824) != 0 ? accountApiModel2.pfmAcctId : l2, (i3 & Integer.MIN_VALUE) != 0 ? accountApiModel2.displayWarning : str11);
    }

    public final long component1() {
        return this.acctKey;
    }

    public final String component10() {
        return this.subType;
    }

    public final String component11() {
        return this.ccyType;
    }

    public final long component12() {
        return this.mainAcctKey;
    }

    public final String component13() {
        return this.productGroup;
    }

    public final long component14() {
        return this.productId;
    }

    public final YesNoApiModel component15() {
        return this.isDefault;
    }

    public final YesNoApiModel component16() {
        return this.isHidden;
    }

    public final Long component17() {
        return this.attachmentId;
    }

    public final BigDecimal component18() {
        return this.overlimitAmountMc;
    }

    public final YesNoApiModel component19() {
        return this.isCardExpiring;
    }

    public final String component2() {
        return this.acctName;
    }

    public final String component20() {
        return this.isCardInactive;
    }

    public final YesNoApiModel component21() {
        return this.hasDigitalCard;
    }

    public final boolean component22() {
        return this.paymentOwnAccounts;
    }

    public final boolean component23() {
        return this.paymentConversion;
    }

    public final boolean component24() {
        return this.paymentOwnAccountsDst;
    }

    public final boolean component25() {
        return this.paymentConversionDst;
    }

    public final boolean component26() {
        return this.paymentWithinBank;
    }

    public final boolean component27() {
        return this.paymentWithinGeorgia;
    }

    public final boolean component28() {
        return this.paymentForeign;
    }

    public final List<String> component29() {
        return this.productFunctions;
    }

    public final String component3() {
        return this.printAcctNo;
    }

    public final String component30() {
        return this.attachmentUrl;
    }

    public final Long component31() {
        return this.pfmAcctId;
    }

    public final String component32() {
        return this.displayWarning;
    }

    public final BigDecimal component4() {
        return this.availableAmount;
    }

    public final BigDecimal component5() {
        return this.amount;
    }

    public final String component6() {
        return this.ccy;
    }

    public final int component7() {
        return this.orderNo;
    }

    public final String component8() {
        return this.productCode;
    }

    public final String component9() {
        return this.productDictionaryKey;
    }

    public final AccountApiModel copy(long j, String str, String str2, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str3, int i, String str4, String str5, String str6, String str7, long j2, String str8, long j3, YesNoApiModel yesNoApiModel, YesNoApiModel yesNoApiModel2, Long l, BigDecimal bigDecimal3, YesNoApiModel yesNoApiModel3, String str9, YesNoApiModel yesNoApiModel4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, List<String> list, String str10, Long l2, String str11) {
        long j4 = j;
        C41536l.m120489i(str2, "printAcctNo");
        C41536l.m120489i(bigDecimal, "availableAmount");
        C41536l.m120489i(bigDecimal2, "amount");
        C41536l.m120489i(str3, "ccy");
        C41536l.m120489i(str4, "productCode");
        C41536l.m120489i(str7, "ccyType");
        C41536l.m120489i(str8, "productGroup");
        C41536l.m120489i(yesNoApiModel, "isDefault");
        C41536l.m120489i(yesNoApiModel2, "isHidden");
        C41536l.m120489i(bigDecimal3, "overlimitAmountMc");
        C41536l.m120489i(yesNoApiModel3, "isCardExpiring");
        C41536l.m120489i(str9, "isCardInactive");
        C41536l.m120489i(list, "productFunctions");
        C41536l.m120489i(str11, "displayWarning");
        return new AccountApiModel(j, str, str2, bigDecimal, bigDecimal2, str3, i, str4, str5, str6, str7, j2, str8, j3, yesNoApiModel, yesNoApiModel2, l, bigDecimal3, yesNoApiModel3, str9, yesNoApiModel4, z, z2, z3, z4, z5, z6, z7, list, str10, l2, str11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountApiModel)) {
            return false;
        }
        AccountApiModel accountApiModel = (AccountApiModel) obj;
        return this.acctKey == accountApiModel.acctKey && C41536l.m120484d(this.acctName, accountApiModel.acctName) && C41536l.m120484d(this.printAcctNo, accountApiModel.printAcctNo) && C41536l.m120484d(this.availableAmount, accountApiModel.availableAmount) && C41536l.m120484d(this.amount, accountApiModel.amount) && C41536l.m120484d(this.ccy, accountApiModel.ccy) && this.orderNo == accountApiModel.orderNo && C41536l.m120484d(this.productCode, accountApiModel.productCode) && C41536l.m120484d(this.productDictionaryKey, accountApiModel.productDictionaryKey) && C41536l.m120484d(this.subType, accountApiModel.subType) && C41536l.m120484d(this.ccyType, accountApiModel.ccyType) && this.mainAcctKey == accountApiModel.mainAcctKey && C41536l.m120484d(this.productGroup, accountApiModel.productGroup) && this.productId == accountApiModel.productId && this.isDefault == accountApiModel.isDefault && this.isHidden == accountApiModel.isHidden && C41536l.m120484d(this.attachmentId, accountApiModel.attachmentId) && C41536l.m120484d(this.overlimitAmountMc, accountApiModel.overlimitAmountMc) && this.isCardExpiring == accountApiModel.isCardExpiring && C41536l.m120484d(this.isCardInactive, accountApiModel.isCardInactive) && this.hasDigitalCard == accountApiModel.hasDigitalCard && this.paymentOwnAccounts == accountApiModel.paymentOwnAccounts && this.paymentConversion == accountApiModel.paymentConversion && this.paymentOwnAccountsDst == accountApiModel.paymentOwnAccountsDst && this.paymentConversionDst == accountApiModel.paymentConversionDst && this.paymentWithinBank == accountApiModel.paymentWithinBank && this.paymentWithinGeorgia == accountApiModel.paymentWithinGeorgia && this.paymentForeign == accountApiModel.paymentForeign && C41536l.m120484d(this.productFunctions, accountApiModel.productFunctions) && C41536l.m120484d(this.attachmentUrl, accountApiModel.attachmentUrl) && C41536l.m120484d(this.pfmAcctId, accountApiModel.pfmAcctId) && C41536l.m120484d(this.displayWarning, accountApiModel.displayWarning);
    }

    public final long getAcctKey() {
        return this.acctKey;
    }

    public final String getAcctName() {
        return this.acctName;
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final Long getAttachmentId() {
        return this.attachmentId;
    }

    public final String getAttachmentUrl() {
        return this.attachmentUrl;
    }

    public final BigDecimal getAvailableAmount() {
        return this.availableAmount;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final String getCcyType() {
        return this.ccyType;
    }

    public final String getDisplayWarning() {
        return this.displayWarning;
    }

    public final YesNoApiModel getHasDigitalCard() {
        return this.hasDigitalCard;
    }

    public final long getMainAcctKey() {
        return this.mainAcctKey;
    }

    public final int getOrderNo() {
        return this.orderNo;
    }

    public final BigDecimal getOverlimitAmountMc() {
        return this.overlimitAmountMc;
    }

    public final boolean getPaymentConversion() {
        return this.paymentConversion;
    }

    public final boolean getPaymentConversionDst() {
        return this.paymentConversionDst;
    }

    public final boolean getPaymentForeign() {
        return this.paymentForeign;
    }

    public final boolean getPaymentOwnAccounts() {
        return this.paymentOwnAccounts;
    }

    public final boolean getPaymentOwnAccountsDst() {
        return this.paymentOwnAccountsDst;
    }

    public final boolean getPaymentWithinBank() {
        return this.paymentWithinBank;
    }

    public final boolean getPaymentWithinGeorgia() {
        return this.paymentWithinGeorgia;
    }

    public final Long getPfmAcctId() {
        return this.pfmAcctId;
    }

    public final String getPrintAcctNo() {
        return this.printAcctNo;
    }

    public final String getProductCode() {
        return this.productCode;
    }

    public final String getProductDictionaryKey() {
        return this.productDictionaryKey;
    }

    public final List<String> getProductFunctions() {
        return this.productFunctions;
    }

    public final String getProductGroup() {
        return this.productGroup;
    }

    public final long getProductId() {
        return this.productId;
    }

    public final String getSubType() {
        return this.subType;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.acctKey) * 31;
        String str = this.acctName;
        int i = 0;
        int hashCode = (((((((((((((a + (str == null ? 0 : str.hashCode())) * 31) + this.printAcctNo.hashCode()) * 31) + this.availableAmount.hashCode()) * 31) + this.amount.hashCode()) * 31) + this.ccy.hashCode()) * 31) + this.orderNo) * 31) + this.productCode.hashCode()) * 31;
        String str2 = this.productDictionaryKey;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subType;
        int hashCode3 = (((((((((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.ccyType.hashCode()) * 31) + C7397t.m28148a(this.mainAcctKey)) * 31) + this.productGroup.hashCode()) * 31) + C7397t.m28148a(this.productId)) * 31) + this.isDefault.hashCode()) * 31) + this.isHidden.hashCode()) * 31;
        Long l = this.attachmentId;
        int hashCode4 = (((((((hashCode3 + (l == null ? 0 : l.hashCode())) * 31) + this.overlimitAmountMc.hashCode()) * 31) + this.isCardExpiring.hashCode()) * 31) + this.isCardInactive.hashCode()) * 31;
        YesNoApiModel yesNoApiModel = this.hasDigitalCard;
        int hashCode5 = (hashCode4 + (yesNoApiModel == null ? 0 : yesNoApiModel.hashCode())) * 31;
        boolean z = this.paymentOwnAccounts;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode5 + (z ? 1 : 0)) * 31;
        boolean z3 = this.paymentConversion;
        if (z3) {
            z3 = true;
        }
        int i3 = (i2 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.paymentOwnAccountsDst;
        if (z4) {
            z4 = true;
        }
        int i4 = (i3 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.paymentConversionDst;
        if (z5) {
            z5 = true;
        }
        int i5 = (i4 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.paymentWithinBank;
        if (z6) {
            z6 = true;
        }
        int i6 = (i5 + (z6 ? 1 : 0)) * 31;
        boolean z7 = this.paymentWithinGeorgia;
        if (z7) {
            z7 = true;
        }
        int i7 = (i6 + (z7 ? 1 : 0)) * 31;
        boolean z8 = this.paymentForeign;
        if (!z8) {
            z2 = z8;
        }
        int hashCode6 = (((i7 + (z2 ? 1 : 0)) * 31) + this.productFunctions.hashCode()) * 31;
        String str4 = this.attachmentUrl;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l2 = this.pfmAcctId;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return ((hashCode7 + i) * 31) + this.displayWarning.hashCode();
    }

    public final YesNoApiModel isCardExpiring() {
        return this.isCardExpiring;
    }

    public final String isCardInactive() {
        return this.isCardInactive;
    }

    public final YesNoApiModel isDefault() {
        return this.isDefault;
    }

    public final YesNoApiModel isHidden() {
        return this.isHidden;
    }

    public String toString() {
        long j = this.acctKey;
        String str = this.acctName;
        String str2 = this.printAcctNo;
        BigDecimal bigDecimal = this.availableAmount;
        BigDecimal bigDecimal2 = this.amount;
        String str3 = this.ccy;
        int i = this.orderNo;
        String str4 = this.productCode;
        String str5 = this.productDictionaryKey;
        String str6 = this.subType;
        String str7 = this.ccyType;
        long j2 = this.mainAcctKey;
        String str8 = this.productGroup;
        long j3 = j2;
        long j4 = this.productId;
        YesNoApiModel yesNoApiModel = this.isDefault;
        YesNoApiModel yesNoApiModel2 = this.isHidden;
        Long l = this.attachmentId;
        BigDecimal bigDecimal3 = this.overlimitAmountMc;
        YesNoApiModel yesNoApiModel3 = this.isCardExpiring;
        String str9 = this.isCardInactive;
        YesNoApiModel yesNoApiModel4 = this.hasDigitalCard;
        boolean z = this.paymentOwnAccounts;
        boolean z2 = this.paymentConversion;
        boolean z3 = this.paymentOwnAccountsDst;
        boolean z4 = this.paymentConversionDst;
        boolean z5 = this.paymentWithinBank;
        boolean z6 = this.paymentWithinGeorgia;
        boolean z7 = this.paymentForeign;
        List<String> list = this.productFunctions;
        String str10 = this.attachmentUrl;
        Long l2 = this.pfmAcctId;
        String str11 = this.displayWarning;
        return "AccountApiModel(acctKey=" + j + ", acctName=" + str + ", printAcctNo=" + str2 + ", availableAmount=" + bigDecimal + ", amount=" + bigDecimal2 + ", ccy=" + str3 + ", orderNo=" + i + ", productCode=" + str4 + ", productDictionaryKey=" + str5 + ", subType=" + str6 + ", ccyType=" + str7 + ", mainAcctKey=" + j3 + ", productGroup=" + str8 + ", productId=" + j4 + ", isDefault=" + yesNoApiModel + ", isHidden=" + yesNoApiModel2 + ", attachmentId=" + l + ", overlimitAmountMc=" + bigDecimal3 + ", isCardExpiring=" + yesNoApiModel3 + ", isCardInactive=" + str9 + ", hasDigitalCard=" + yesNoApiModel4 + ", paymentOwnAccounts=" + z + ", paymentConversion=" + z2 + ", paymentOwnAccountsDst=" + z3 + ", paymentConversionDst=" + z4 + ", paymentWithinBank=" + z5 + ", paymentWithinGeorgia=" + z6 + ", paymentForeign=" + z7 + ", productFunctions=" + list + ", attachmentUrl=" + str10 + ", pfmAcctId=" + l2 + ", displayWarning=" + str11 + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AccountApiModel(long r40, java.lang.String r42, java.lang.String r43, java.math.BigDecimal r44, java.math.BigDecimal r45, java.lang.String r46, int r47, java.lang.String r48, java.lang.String r49, java.lang.String r50, java.lang.String r51, long r52, java.lang.String r54, long r55, p341ge.bog.mobilebank.products.data.model.YesNoApiModel r57, p341ge.bog.mobilebank.products.data.model.YesNoApiModel r58, java.lang.Long r59, java.math.BigDecimal r60, p341ge.bog.mobilebank.products.data.model.YesNoApiModel r61, java.lang.String r62, p341ge.bog.mobilebank.products.data.model.YesNoApiModel r63, boolean r64, boolean r65, boolean r66, boolean r67, boolean r68, boolean r69, boolean r70, java.util.List r71, java.lang.String r72, java.lang.Long r73, java.lang.String r74, int r75, kotlin.jvm.internal.DefaultConstructorMarker r76) {
        /*
            r39 = this;
            r0 = r75
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r6 = r2
            goto L_0x000b
        L_0x0009:
            r6 = r42
        L_0x000b:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0011
            r13 = r2
            goto L_0x0013
        L_0x0011:
            r13 = r49
        L_0x0013:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0019
            r14 = r2
            goto L_0x001b
        L_0x0019:
            r14 = r50
        L_0x001b:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0023
            r23 = r2
            goto L_0x0025
        L_0x0023:
            r23 = r59
        L_0x0025:
            r1 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x002d
            r27 = r2
            goto L_0x002f
        L_0x002d:
            r27 = r63
        L_0x002f:
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0037
            r36 = r2
            goto L_0x0039
        L_0x0037:
            r36 = r72
        L_0x0039:
            r1 = 1073741824(0x40000000, float:2.0)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0041
            r37 = r2
            goto L_0x0043
        L_0x0041:
            r37 = r73
        L_0x0043:
            r3 = r39
            r4 = r40
            r7 = r43
            r8 = r44
            r9 = r45
            r10 = r46
            r11 = r47
            r12 = r48
            r15 = r51
            r16 = r52
            r18 = r54
            r19 = r55
            r21 = r57
            r22 = r58
            r24 = r60
            r25 = r61
            r26 = r62
            r28 = r64
            r29 = r65
            r30 = r66
            r31 = r67
            r32 = r68
            r33 = r69
            r34 = r70
            r35 = r71
            r38 = r74
            r3.<init>(r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.products.data.model.AccountApiModel.<init>(long, java.lang.String, java.lang.String, java.math.BigDecimal, java.math.BigDecimal, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, long, ge.bog.mobilebank.products.data.model.YesNoApiModel, ge.bog.mobilebank.products.data.model.YesNoApiModel, java.lang.Long, java.math.BigDecimal, ge.bog.mobilebank.products.data.model.YesNoApiModel, java.lang.String, ge.bog.mobilebank.products.data.model.YesNoApiModel, boolean, boolean, boolean, boolean, boolean, boolean, boolean, java.util.List, java.lang.String, java.lang.Long, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
