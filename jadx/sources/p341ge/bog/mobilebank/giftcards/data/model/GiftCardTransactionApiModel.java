package p341ge.bog.mobilebank.giftcards.data.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.giftcards.data.model.GiftCardTransactionApiModel */
public final class GiftCardTransactionApiModel {
    private final Long clientKey;
    private final Long giftCardId;

    /* renamed from: id */
    private final Long f62390id;
    private final String merchantAddress;
    private final String merchantName;
    private final long offerId;
    private final String paymentCode;
    private final PaymentType paymentType;
    private final BigDecimal settlementAmount;
    private final String settlementCcy;
    private final String terminalId;
    private final long transactionDate;
    private final Long transactionId;
    private final String transactionRrn;

    @Keep
    /* renamed from: ge.bog.mobilebank.giftcards.data.model.GiftCardTransactionApiModel$PaymentType */
    public enum PaymentType {
        PAYMENT,
        PARTIAL_REVERSAL,
        FULL_REVERSAL
    }

    public GiftCardTransactionApiModel(Long l, Long l2, Long l3, String str, String str2, long j, String str3, PaymentType paymentType2, BigDecimal bigDecimal, String str4, String str5, long j2, Long l4, String str6) {
        PaymentType paymentType3 = paymentType2;
        BigDecimal bigDecimal2 = bigDecimal;
        String str7 = str4;
        C41536l.m120489i(str, "merchantAddress");
        C41536l.m120489i(str2, "merchantName");
        C41536l.m120489i(paymentType3, "paymentType");
        C41536l.m120489i(bigDecimal2, "settlementAmount");
        C41536l.m120489i(str7, "settlementCcy");
        this.clientKey = l;
        this.giftCardId = l2;
        this.f62390id = l3;
        this.merchantAddress = str;
        this.merchantName = str2;
        this.offerId = j;
        this.paymentCode = str3;
        this.paymentType = paymentType3;
        this.settlementAmount = bigDecimal2;
        this.settlementCcy = str7;
        this.terminalId = str5;
        this.transactionDate = j2;
        this.transactionId = l4;
        this.transactionRrn = str6;
    }

    public static /* synthetic */ GiftCardTransactionApiModel copy$default(GiftCardTransactionApiModel giftCardTransactionApiModel, Long l, Long l2, Long l3, String str, String str2, long j, String str3, PaymentType paymentType2, BigDecimal bigDecimal, String str4, String str5, long j2, Long l4, String str6, int i, Object obj) {
        GiftCardTransactionApiModel giftCardTransactionApiModel2 = giftCardTransactionApiModel;
        int i2 = i;
        return giftCardTransactionApiModel.copy((i2 & 1) != 0 ? giftCardTransactionApiModel2.clientKey : l, (i2 & 2) != 0 ? giftCardTransactionApiModel2.giftCardId : l2, (i2 & 4) != 0 ? giftCardTransactionApiModel2.f62390id : l3, (i2 & 8) != 0 ? giftCardTransactionApiModel2.merchantAddress : str, (i2 & 16) != 0 ? giftCardTransactionApiModel2.merchantName : str2, (i2 & 32) != 0 ? giftCardTransactionApiModel2.offerId : j, (i2 & 64) != 0 ? giftCardTransactionApiModel2.paymentCode : str3, (i2 & 128) != 0 ? giftCardTransactionApiModel2.paymentType : paymentType2, (i2 & C11398b.f33139r) != 0 ? giftCardTransactionApiModel2.settlementAmount : bigDecimal, (i2 & C11398b.f33140s) != 0 ? giftCardTransactionApiModel2.settlementCcy : str4, (i2 & C11398b.f33141t) != 0 ? giftCardTransactionApiModel2.terminalId : str5, (i2 & C11398b.f33142u) != 0 ? giftCardTransactionApiModel2.transactionDate : j2, (i2 & C11398b.f33143v) != 0 ? giftCardTransactionApiModel2.transactionId : l4, (i2 & 8192) != 0 ? giftCardTransactionApiModel2.transactionRrn : str6);
    }

    public final Long component1() {
        return this.clientKey;
    }

    public final String component10() {
        return this.settlementCcy;
    }

    public final String component11() {
        return this.terminalId;
    }

    public final long component12() {
        return this.transactionDate;
    }

    public final Long component13() {
        return this.transactionId;
    }

    public final String component14() {
        return this.transactionRrn;
    }

    public final Long component2() {
        return this.giftCardId;
    }

    public final Long component3() {
        return this.f62390id;
    }

    public final String component4() {
        return this.merchantAddress;
    }

    public final String component5() {
        return this.merchantName;
    }

    public final long component6() {
        return this.offerId;
    }

    public final String component7() {
        return this.paymentCode;
    }

    public final PaymentType component8() {
        return this.paymentType;
    }

    public final BigDecimal component9() {
        return this.settlementAmount;
    }

    public final GiftCardTransactionApiModel copy(Long l, Long l2, Long l3, String str, String str2, long j, String str3, PaymentType paymentType2, BigDecimal bigDecimal, String str4, String str5, long j2, Long l4, String str6) {
        Long l5 = l;
        C41536l.m120489i(str, "merchantAddress");
        C41536l.m120489i(str2, "merchantName");
        C41536l.m120489i(paymentType2, "paymentType");
        C41536l.m120489i(bigDecimal, "settlementAmount");
        C41536l.m120489i(str4, "settlementCcy");
        return new GiftCardTransactionApiModel(l, l2, l3, str, str2, j, str3, paymentType2, bigDecimal, str4, str5, j2, l4, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftCardTransactionApiModel)) {
            return false;
        }
        GiftCardTransactionApiModel giftCardTransactionApiModel = (GiftCardTransactionApiModel) obj;
        return C41536l.m120484d(this.clientKey, giftCardTransactionApiModel.clientKey) && C41536l.m120484d(this.giftCardId, giftCardTransactionApiModel.giftCardId) && C41536l.m120484d(this.f62390id, giftCardTransactionApiModel.f62390id) && C41536l.m120484d(this.merchantAddress, giftCardTransactionApiModel.merchantAddress) && C41536l.m120484d(this.merchantName, giftCardTransactionApiModel.merchantName) && this.offerId == giftCardTransactionApiModel.offerId && C41536l.m120484d(this.paymentCode, giftCardTransactionApiModel.paymentCode) && this.paymentType == giftCardTransactionApiModel.paymentType && C41536l.m120484d(this.settlementAmount, giftCardTransactionApiModel.settlementAmount) && C41536l.m120484d(this.settlementCcy, giftCardTransactionApiModel.settlementCcy) && C41536l.m120484d(this.terminalId, giftCardTransactionApiModel.terminalId) && this.transactionDate == giftCardTransactionApiModel.transactionDate && C41536l.m120484d(this.transactionId, giftCardTransactionApiModel.transactionId) && C41536l.m120484d(this.transactionRrn, giftCardTransactionApiModel.transactionRrn);
    }

    public final Long getClientKey() {
        return this.clientKey;
    }

    public final Long getGiftCardId() {
        return this.giftCardId;
    }

    public final Long getId() {
        return this.f62390id;
    }

    public final String getMerchantAddress() {
        return this.merchantAddress;
    }

    public final String getMerchantName() {
        return this.merchantName;
    }

    public final long getOfferId() {
        return this.offerId;
    }

    public final String getPaymentCode() {
        return this.paymentCode;
    }

    public final PaymentType getPaymentType() {
        return this.paymentType;
    }

    public final BigDecimal getSettlementAmount() {
        return this.settlementAmount;
    }

    public final String getSettlementCcy() {
        return this.settlementCcy;
    }

    public final String getTerminalId() {
        return this.terminalId;
    }

    public final long getTransactionDate() {
        return this.transactionDate;
    }

    public final Long getTransactionId() {
        return this.transactionId;
    }

    public final String getTransactionRrn() {
        return this.transactionRrn;
    }

    public int hashCode() {
        Long l = this.clientKey;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.giftCardId;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f62390id;
        int hashCode3 = (((((((hashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31) + this.merchantAddress.hashCode()) * 31) + this.merchantName.hashCode()) * 31) + C7397t.m28148a(this.offerId)) * 31;
        String str = this.paymentCode;
        int hashCode4 = (((((((hashCode3 + (str == null ? 0 : str.hashCode())) * 31) + this.paymentType.hashCode()) * 31) + this.settlementAmount.hashCode()) * 31) + this.settlementCcy.hashCode()) * 31;
        String str2 = this.terminalId;
        int hashCode5 = (((hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + C7397t.m28148a(this.transactionDate)) * 31;
        Long l4 = this.transactionId;
        int hashCode6 = (hashCode5 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str3 = this.transactionRrn;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode6 + i;
    }

    public String toString() {
        Long l = this.clientKey;
        Long l2 = this.giftCardId;
        Long l3 = this.f62390id;
        String str = this.merchantAddress;
        String str2 = this.merchantName;
        long j = this.offerId;
        String str3 = this.paymentCode;
        PaymentType paymentType2 = this.paymentType;
        BigDecimal bigDecimal = this.settlementAmount;
        String str4 = this.settlementCcy;
        String str5 = this.terminalId;
        long j2 = this.transactionDate;
        Long l4 = this.transactionId;
        String str6 = this.transactionRrn;
        return "GiftCardTransactionApiModel(clientKey=" + l + ", giftCardId=" + l2 + ", id=" + l3 + ", merchantAddress=" + str + ", merchantName=" + str2 + ", offerId=" + j + ", paymentCode=" + str3 + ", paymentType=" + paymentType2 + ", settlementAmount=" + bigDecimal + ", settlementCcy=" + str4 + ", terminalId=" + str5 + ", transactionDate=" + j2 + ", transactionId=" + l4 + ", transactionRrn=" + str6 + ")";
    }
}
