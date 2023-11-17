package p341ge.bog.mobilebank.bnpl.data.entity;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.bnpl.data.entity.BnplItemApiEntity */
public final class BnplItemApiEntity {
    private final String acctRef;
    private final double amount;
    private final String attachmentId;
    private final String attachmentUrl;
    private final BigDecimal bcAmount;
    private final String ccy;
    private final String installmentFlag;
    private final Long linkAcctKey;
    private final long loanKey;
    private final String loanName;
    private final String loanType;
    private final String prodType;
    private final String productDictionaryKey;
    private final String productDictionaryValue;
    private final List<String> productFunctions;
    private final Long productId;
    private final String subProductCode;

    public BnplItemApiEntity(long j, String str, double d, String str2, String str3, BigDecimal bigDecimal, String str4, String str5, Long l, String str6, String str7, String str8, String str9, String str10, String str11, List<String> list, Long l2) {
        C41536l.m120489i(str3, "ccy");
        this.loanKey = j;
        this.prodType = str;
        this.amount = d;
        this.loanName = str2;
        this.ccy = str3;
        this.bcAmount = bigDecimal;
        this.installmentFlag = str4;
        this.loanType = str5;
        this.productId = l;
        this.subProductCode = str6;
        this.attachmentId = str7;
        this.acctRef = str8;
        this.productDictionaryKey = str9;
        this.productDictionaryValue = str10;
        this.attachmentUrl = str11;
        this.productFunctions = list;
        this.linkAcctKey = l2;
    }

    public static /* synthetic */ BnplItemApiEntity copy$default(BnplItemApiEntity bnplItemApiEntity, long j, String str, double d, String str2, String str3, BigDecimal bigDecimal, String str4, String str5, Long l, String str6, String str7, String str8, String str9, String str10, String str11, List list, Long l2, int i, Object obj) {
        BnplItemApiEntity bnplItemApiEntity2 = bnplItemApiEntity;
        int i2 = i;
        return bnplItemApiEntity.copy((i2 & 1) != 0 ? bnplItemApiEntity2.loanKey : j, (i2 & 2) != 0 ? bnplItemApiEntity2.prodType : str, (i2 & 4) != 0 ? bnplItemApiEntity2.amount : d, (i2 & 8) != 0 ? bnplItemApiEntity2.loanName : str2, (i2 & 16) != 0 ? bnplItemApiEntity2.ccy : str3, (i2 & 32) != 0 ? bnplItemApiEntity2.bcAmount : bigDecimal, (i2 & 64) != 0 ? bnplItemApiEntity2.installmentFlag : str4, (i2 & 128) != 0 ? bnplItemApiEntity2.loanType : str5, (i2 & C11398b.f33139r) != 0 ? bnplItemApiEntity2.productId : l, (i2 & C11398b.f33140s) != 0 ? bnplItemApiEntity2.subProductCode : str6, (i2 & C11398b.f33141t) != 0 ? bnplItemApiEntity2.attachmentId : str7, (i2 & C11398b.f33142u) != 0 ? bnplItemApiEntity2.acctRef : str8, (i2 & C11398b.f33143v) != 0 ? bnplItemApiEntity2.productDictionaryKey : str9, (i2 & 8192) != 0 ? bnplItemApiEntity2.productDictionaryValue : str10, (i2 & 16384) != 0 ? bnplItemApiEntity2.attachmentUrl : str11, (i2 & 32768) != 0 ? bnplItemApiEntity2.productFunctions : list, (i2 & 65536) != 0 ? bnplItemApiEntity2.linkAcctKey : l2);
    }

    public final long component1() {
        return this.loanKey;
    }

    public final String component10() {
        return this.subProductCode;
    }

    public final String component11() {
        return this.attachmentId;
    }

    public final String component12() {
        return this.acctRef;
    }

    public final String component13() {
        return this.productDictionaryKey;
    }

    public final String component14() {
        return this.productDictionaryValue;
    }

    public final String component15() {
        return this.attachmentUrl;
    }

    public final List<String> component16() {
        return this.productFunctions;
    }

    public final Long component17() {
        return this.linkAcctKey;
    }

    public final String component2() {
        return this.prodType;
    }

    public final double component3() {
        return this.amount;
    }

    public final String component4() {
        return this.loanName;
    }

    public final String component5() {
        return this.ccy;
    }

    public final BigDecimal component6() {
        return this.bcAmount;
    }

    public final String component7() {
        return this.installmentFlag;
    }

    public final String component8() {
        return this.loanType;
    }

    public final Long component9() {
        return this.productId;
    }

    public final BnplItemApiEntity copy(long j, String str, double d, String str2, String str3, BigDecimal bigDecimal, String str4, String str5, Long l, String str6, String str7, String str8, String str9, String str10, String str11, List<String> list, Long l2) {
        long j2 = j;
        C41536l.m120489i(str3, "ccy");
        return new BnplItemApiEntity(j, str, d, str2, str3, bigDecimal, str4, str5, l, str6, str7, str8, str9, str10, str11, list, l2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BnplItemApiEntity)) {
            return false;
        }
        BnplItemApiEntity bnplItemApiEntity = (BnplItemApiEntity) obj;
        return this.loanKey == bnplItemApiEntity.loanKey && C41536l.m120484d(this.prodType, bnplItemApiEntity.prodType) && Double.compare(this.amount, bnplItemApiEntity.amount) == 0 && C41536l.m120484d(this.loanName, bnplItemApiEntity.loanName) && C41536l.m120484d(this.ccy, bnplItemApiEntity.ccy) && C41536l.m120484d(this.bcAmount, bnplItemApiEntity.bcAmount) && C41536l.m120484d(this.installmentFlag, bnplItemApiEntity.installmentFlag) && C41536l.m120484d(this.loanType, bnplItemApiEntity.loanType) && C41536l.m120484d(this.productId, bnplItemApiEntity.productId) && C41536l.m120484d(this.subProductCode, bnplItemApiEntity.subProductCode) && C41536l.m120484d(this.attachmentId, bnplItemApiEntity.attachmentId) && C41536l.m120484d(this.acctRef, bnplItemApiEntity.acctRef) && C41536l.m120484d(this.productDictionaryKey, bnplItemApiEntity.productDictionaryKey) && C41536l.m120484d(this.productDictionaryValue, bnplItemApiEntity.productDictionaryValue) && C41536l.m120484d(this.attachmentUrl, bnplItemApiEntity.attachmentUrl) && C41536l.m120484d(this.productFunctions, bnplItemApiEntity.productFunctions) && C41536l.m120484d(this.linkAcctKey, bnplItemApiEntity.linkAcctKey);
    }

    public final String getAcctRef() {
        return this.acctRef;
    }

    public final double getAmount() {
        return this.amount;
    }

    public final String getAttachmentId() {
        return this.attachmentId;
    }

    public final String getAttachmentUrl() {
        return this.attachmentUrl;
    }

    public final BigDecimal getBcAmount() {
        return this.bcAmount;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final String getInstallmentFlag() {
        return this.installmentFlag;
    }

    public final Long getLinkAcctKey() {
        return this.linkAcctKey;
    }

    public final long getLoanKey() {
        return this.loanKey;
    }

    public final String getLoanName() {
        return this.loanName;
    }

    public final String getLoanType() {
        return this.loanType;
    }

    public final String getProdType() {
        return this.prodType;
    }

    public final String getProductDictionaryKey() {
        return this.productDictionaryKey;
    }

    public final String getProductDictionaryValue() {
        return this.productDictionaryValue;
    }

    public final List<String> getProductFunctions() {
        return this.productFunctions;
    }

    public final Long getProductId() {
        return this.productId;
    }

    public final String getSubProductCode() {
        return this.subProductCode;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.loanKey) * 31;
        String str = this.prodType;
        int i = 0;
        int hashCode = (((a + (str == null ? 0 : str.hashCode())) * 31) + Double.doubleToLongBits(this.amount)) * 31;
        String str2 = this.loanName;
        int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.ccy.hashCode()) * 31;
        BigDecimal bigDecimal = this.bcAmount;
        int hashCode3 = (hashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str3 = this.installmentFlag;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.loanType;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l = this.productId;
        int hashCode6 = (hashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        String str5 = this.subProductCode;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.attachmentId;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.acctRef;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.productDictionaryKey;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.productDictionaryValue;
        int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.attachmentUrl;
        int hashCode12 = (hashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        List<String> list = this.productFunctions;
        int hashCode13 = (hashCode12 + (list == null ? 0 : list.hashCode())) * 31;
        Long l2 = this.linkAcctKey;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return hashCode13 + i;
    }

    public String toString() {
        long j = this.loanKey;
        String str = this.prodType;
        double d = this.amount;
        String str2 = this.loanName;
        String str3 = this.ccy;
        BigDecimal bigDecimal = this.bcAmount;
        String str4 = this.installmentFlag;
        String str5 = this.loanType;
        Long l = this.productId;
        String str6 = this.subProductCode;
        String str7 = this.attachmentId;
        String str8 = this.acctRef;
        String str9 = this.productDictionaryKey;
        String str10 = this.productDictionaryValue;
        String str11 = this.attachmentUrl;
        List<String> list = this.productFunctions;
        Long l2 = this.linkAcctKey;
        return "BnplItemApiEntity(loanKey=" + j + ", prodType=" + str + ", amount=" + d + ", loanName=" + str2 + ", ccy=" + str3 + ", bcAmount=" + bigDecimal + ", installmentFlag=" + str4 + ", loanType=" + str5 + ", productId=" + l + ", subProductCode=" + str6 + ", attachmentId=" + str7 + ", acctRef=" + str8 + ", productDictionaryKey=" + str9 + ", productDictionaryValue=" + str10 + ", attachmentUrl=" + str11 + ", productFunctions=" + list + ", linkAcctKey=" + l2 + ")";
    }
}
