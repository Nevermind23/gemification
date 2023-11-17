package p341ge.bog.mobilebank.products.data.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.products.data.model.BondApiModel */
public final class BondApiModel {
    private final String agreementNameEn;
    private final String agreementNameGe;
    private final String agreementType;
    private final Object attachmentFileBase64;
    private final BigDecimal cashValue;
    private final String ccy;
    private final String coupon;

    /* renamed from: id */
    private final long f82302id;
    private final String isinCode;
    private final BigDecimal marketPrice;
    private final BigDecimal marketValue;
    private final String note;
    private final BigDecimal purchasePrice;
    private final long quantity;
    private final String securityNameEn;
    private final String securityNameGe;
    private final String tickerCode;
    private final String tickerNameEn;
    private final String tickerNameGe;
    private final BigDecimal unrealisedProfitLoss;

    public BondApiModel(String str, String str2, String str3, Object obj, String str4, long j, String str5, BigDecimal bigDecimal, BigDecimal bigDecimal2, long j2, String str6, String str7, String str8, String str9, String str10, BigDecimal bigDecimal3, BigDecimal bigDecimal4, String str11, String str12, BigDecimal bigDecimal5) {
        this.agreementNameEn = str;
        this.agreementNameGe = str2;
        this.agreementType = str3;
        this.attachmentFileBase64 = obj;
        this.ccy = str4;
        this.f82302id = j;
        this.isinCode = str5;
        this.marketPrice = bigDecimal;
        this.purchasePrice = bigDecimal2;
        this.quantity = j2;
        this.securityNameEn = str6;
        this.securityNameGe = str7;
        this.tickerCode = str8;
        this.tickerNameEn = str9;
        this.tickerNameGe = str10;
        this.marketValue = bigDecimal3;
        this.unrealisedProfitLoss = bigDecimal4;
        this.note = str11;
        this.coupon = str12;
        this.cashValue = bigDecimal5;
    }

    public static /* synthetic */ BondApiModel copy$default(BondApiModel bondApiModel, String str, String str2, String str3, Object obj, String str4, long j, String str5, BigDecimal bigDecimal, BigDecimal bigDecimal2, long j2, String str6, String str7, String str8, String str9, String str10, BigDecimal bigDecimal3, BigDecimal bigDecimal4, String str11, String str12, BigDecimal bigDecimal5, int i, Object obj2) {
        BondApiModel bondApiModel2 = bondApiModel;
        int i2 = i;
        return bondApiModel.copy((i2 & 1) != 0 ? bondApiModel2.agreementNameEn : str, (i2 & 2) != 0 ? bondApiModel2.agreementNameGe : str2, (i2 & 4) != 0 ? bondApiModel2.agreementType : str3, (i2 & 8) != 0 ? bondApiModel2.attachmentFileBase64 : obj, (i2 & 16) != 0 ? bondApiModel2.ccy : str4, (i2 & 32) != 0 ? bondApiModel2.f82302id : j, (i2 & 64) != 0 ? bondApiModel2.isinCode : str5, (i2 & 128) != 0 ? bondApiModel2.marketPrice : bigDecimal, (i2 & C11398b.f33139r) != 0 ? bondApiModel2.purchasePrice : bigDecimal2, (i2 & C11398b.f33140s) != 0 ? bondApiModel2.quantity : j2, (i2 & C11398b.f33141t) != 0 ? bondApiModel2.securityNameEn : str6, (i2 & C11398b.f33142u) != 0 ? bondApiModel2.securityNameGe : str7, (i2 & C11398b.f33143v) != 0 ? bondApiModel2.tickerCode : str8, (i2 & 8192) != 0 ? bondApiModel2.tickerNameEn : str9, (i2 & 16384) != 0 ? bondApiModel2.tickerNameGe : str10, (i2 & 32768) != 0 ? bondApiModel2.marketValue : bigDecimal3, (i2 & 65536) != 0 ? bondApiModel2.unrealisedProfitLoss : bigDecimal4, (i2 & 131072) != 0 ? bondApiModel2.note : str11, (i2 & 262144) != 0 ? bondApiModel2.coupon : str12, (i2 & 524288) != 0 ? bondApiModel2.cashValue : bigDecimal5);
    }

    public final String component1() {
        return this.agreementNameEn;
    }

    public final long component10() {
        return this.quantity;
    }

    public final String component11() {
        return this.securityNameEn;
    }

    public final String component12() {
        return this.securityNameGe;
    }

    public final String component13() {
        return this.tickerCode;
    }

    public final String component14() {
        return this.tickerNameEn;
    }

    public final String component15() {
        return this.tickerNameGe;
    }

    public final BigDecimal component16() {
        return this.marketValue;
    }

    public final BigDecimal component17() {
        return this.unrealisedProfitLoss;
    }

    public final String component18() {
        return this.note;
    }

    public final String component19() {
        return this.coupon;
    }

    public final String component2() {
        return this.agreementNameGe;
    }

    public final BigDecimal component20() {
        return this.cashValue;
    }

    public final String component3() {
        return this.agreementType;
    }

    public final Object component4() {
        return this.attachmentFileBase64;
    }

    public final String component5() {
        return this.ccy;
    }

    public final long component6() {
        return this.f82302id;
    }

    public final String component7() {
        return this.isinCode;
    }

    public final BigDecimal component8() {
        return this.marketPrice;
    }

    public final BigDecimal component9() {
        return this.purchasePrice;
    }

    public final BondApiModel copy(String str, String str2, String str3, Object obj, String str4, long j, String str5, BigDecimal bigDecimal, BigDecimal bigDecimal2, long j2, String str6, String str7, String str8, String str9, String str10, BigDecimal bigDecimal3, BigDecimal bigDecimal4, String str11, String str12, BigDecimal bigDecimal5) {
        return new BondApiModel(str, str2, str3, obj, str4, j, str5, bigDecimal, bigDecimal2, j2, str6, str7, str8, str9, str10, bigDecimal3, bigDecimal4, str11, str12, bigDecimal5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BondApiModel)) {
            return false;
        }
        BondApiModel bondApiModel = (BondApiModel) obj;
        return C41536l.m120484d(this.agreementNameEn, bondApiModel.agreementNameEn) && C41536l.m120484d(this.agreementNameGe, bondApiModel.agreementNameGe) && C41536l.m120484d(this.agreementType, bondApiModel.agreementType) && C41536l.m120484d(this.attachmentFileBase64, bondApiModel.attachmentFileBase64) && C41536l.m120484d(this.ccy, bondApiModel.ccy) && this.f82302id == bondApiModel.f82302id && C41536l.m120484d(this.isinCode, bondApiModel.isinCode) && C41536l.m120484d(this.marketPrice, bondApiModel.marketPrice) && C41536l.m120484d(this.purchasePrice, bondApiModel.purchasePrice) && this.quantity == bondApiModel.quantity && C41536l.m120484d(this.securityNameEn, bondApiModel.securityNameEn) && C41536l.m120484d(this.securityNameGe, bondApiModel.securityNameGe) && C41536l.m120484d(this.tickerCode, bondApiModel.tickerCode) && C41536l.m120484d(this.tickerNameEn, bondApiModel.tickerNameEn) && C41536l.m120484d(this.tickerNameGe, bondApiModel.tickerNameGe) && C41536l.m120484d(this.marketValue, bondApiModel.marketValue) && C41536l.m120484d(this.unrealisedProfitLoss, bondApiModel.unrealisedProfitLoss) && C41536l.m120484d(this.note, bondApiModel.note) && C41536l.m120484d(this.coupon, bondApiModel.coupon) && C41536l.m120484d(this.cashValue, bondApiModel.cashValue);
    }

    public final String getAgreementNameEn() {
        return this.agreementNameEn;
    }

    public final String getAgreementNameGe() {
        return this.agreementNameGe;
    }

    public final String getAgreementType() {
        return this.agreementType;
    }

    public final Object getAttachmentFileBase64() {
        return this.attachmentFileBase64;
    }

    public final BigDecimal getCashValue() {
        return this.cashValue;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final String getCoupon() {
        return this.coupon;
    }

    public final long getId() {
        return this.f82302id;
    }

    public final String getIsinCode() {
        return this.isinCode;
    }

    public final BigDecimal getMarketPrice() {
        return this.marketPrice;
    }

    public final BigDecimal getMarketValue() {
        return this.marketValue;
    }

    public final String getNote() {
        return this.note;
    }

    public final BigDecimal getPurchasePrice() {
        return this.purchasePrice;
    }

    public final long getQuantity() {
        return this.quantity;
    }

    public final String getSecurityNameEn() {
        return this.securityNameEn;
    }

    public final String getSecurityNameGe() {
        return this.securityNameGe;
    }

    public final String getTickerCode() {
        return this.tickerCode;
    }

    public final String getTickerNameEn() {
        return this.tickerNameEn;
    }

    public final String getTickerNameGe() {
        return this.tickerNameGe;
    }

    public final BigDecimal getUnrealisedProfitLoss() {
        return this.unrealisedProfitLoss;
    }

    public int hashCode() {
        String str = this.agreementNameEn;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.agreementNameGe;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.agreementType;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Object obj = this.attachmentFileBase64;
        int hashCode4 = (hashCode3 + (obj == null ? 0 : obj.hashCode())) * 31;
        String str4 = this.ccy;
        int hashCode5 = (((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + C7397t.m28148a(this.f82302id)) * 31;
        String str5 = this.isinCode;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        BigDecimal bigDecimal = this.marketPrice;
        int hashCode7 = (hashCode6 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.purchasePrice;
        int hashCode8 = (((hashCode7 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31) + C7397t.m28148a(this.quantity)) * 31;
        String str6 = this.securityNameEn;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.securityNameGe;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.tickerCode;
        int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.tickerNameEn;
        int hashCode12 = (hashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.tickerNameGe;
        int hashCode13 = (hashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.marketValue;
        int hashCode14 = (hashCode13 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.unrealisedProfitLoss;
        int hashCode15 = (hashCode14 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        String str11 = this.note;
        int hashCode16 = (hashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.coupon;
        int hashCode17 = (hashCode16 + (str12 == null ? 0 : str12.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.cashValue;
        if (bigDecimal5 != null) {
            i = bigDecimal5.hashCode();
        }
        return hashCode17 + i;
    }

    public String toString() {
        String str = this.agreementNameEn;
        String str2 = this.agreementNameGe;
        String str3 = this.agreementType;
        Object obj = this.attachmentFileBase64;
        String str4 = this.ccy;
        long j = this.f82302id;
        String str5 = this.isinCode;
        BigDecimal bigDecimal = this.marketPrice;
        BigDecimal bigDecimal2 = this.purchasePrice;
        long j2 = this.quantity;
        String str6 = this.securityNameEn;
        String str7 = this.securityNameGe;
        String str8 = this.tickerCode;
        String str9 = this.tickerNameEn;
        String str10 = this.tickerNameGe;
        BigDecimal bigDecimal3 = this.marketValue;
        BigDecimal bigDecimal4 = this.unrealisedProfitLoss;
        String str11 = this.note;
        String str12 = this.coupon;
        BigDecimal bigDecimal5 = this.cashValue;
        return "BondApiModel(agreementNameEn=" + str + ", agreementNameGe=" + str2 + ", agreementType=" + str3 + ", attachmentFileBase64=" + obj + ", ccy=" + str4 + ", id=" + j + ", isinCode=" + str5 + ", marketPrice=" + bigDecimal + ", purchasePrice=" + bigDecimal2 + ", quantity=" + j2 + ", securityNameEn=" + str6 + ", securityNameGe=" + str7 + ", tickerCode=" + str8 + ", tickerNameEn=" + str9 + ", tickerNameGe=" + str10 + ", marketValue=" + bigDecimal3 + ", unrealisedProfitLoss=" + bigDecimal4 + ", note=" + str11 + ", coupon=" + str12 + ", cashValue=" + bigDecimal5 + ")";
    }
}
