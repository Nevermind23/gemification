package p341ge.bog.mobilebank.bnpl.data.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.bnpl.data.entity.BnplInvoiceItemApiEntity */
public final class BnplInvoiceItemApiEntity {
    private final Double amount;
    private final String ccy;
    private final String feeType;
    private final String invoiceType;
    private final String invoiceTypeDictionaryKey;
    private final Long loanKey;
    private final Long paymentDate;

    public BnplInvoiceItemApiEntity(Long l, Long l2, String str, String str2, String str3, Double d, String str4) {
        this.loanKey = l;
        this.paymentDate = l2;
        this.invoiceType = str;
        this.feeType = str2;
        this.ccy = str3;
        this.amount = d;
        this.invoiceTypeDictionaryKey = str4;
    }

    public static /* synthetic */ BnplInvoiceItemApiEntity copy$default(BnplInvoiceItemApiEntity bnplInvoiceItemApiEntity, Long l, Long l2, String str, String str2, String str3, Double d, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            l = bnplInvoiceItemApiEntity.loanKey;
        }
        if ((i & 2) != 0) {
            l2 = bnplInvoiceItemApiEntity.paymentDate;
        }
        Long l3 = l2;
        if ((i & 4) != 0) {
            str = bnplInvoiceItemApiEntity.invoiceType;
        }
        String str5 = str;
        if ((i & 8) != 0) {
            str2 = bnplInvoiceItemApiEntity.feeType;
        }
        String str6 = str2;
        if ((i & 16) != 0) {
            str3 = bnplInvoiceItemApiEntity.ccy;
        }
        String str7 = str3;
        if ((i & 32) != 0) {
            d = bnplInvoiceItemApiEntity.amount;
        }
        Double d2 = d;
        if ((i & 64) != 0) {
            str4 = bnplInvoiceItemApiEntity.invoiceTypeDictionaryKey;
        }
        return bnplInvoiceItemApiEntity.copy(l, l3, str5, str6, str7, d2, str4);
    }

    public final Long component1() {
        return this.loanKey;
    }

    public final Long component2() {
        return this.paymentDate;
    }

    public final String component3() {
        return this.invoiceType;
    }

    public final String component4() {
        return this.feeType;
    }

    public final String component5() {
        return this.ccy;
    }

    public final Double component6() {
        return this.amount;
    }

    public final String component7() {
        return this.invoiceTypeDictionaryKey;
    }

    public final BnplInvoiceItemApiEntity copy(Long l, Long l2, String str, String str2, String str3, Double d, String str4) {
        return new BnplInvoiceItemApiEntity(l, l2, str, str2, str3, d, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BnplInvoiceItemApiEntity)) {
            return false;
        }
        BnplInvoiceItemApiEntity bnplInvoiceItemApiEntity = (BnplInvoiceItemApiEntity) obj;
        return C41536l.m120484d(this.loanKey, bnplInvoiceItemApiEntity.loanKey) && C41536l.m120484d(this.paymentDate, bnplInvoiceItemApiEntity.paymentDate) && C41536l.m120484d(this.invoiceType, bnplInvoiceItemApiEntity.invoiceType) && C41536l.m120484d(this.feeType, bnplInvoiceItemApiEntity.feeType) && C41536l.m120484d(this.ccy, bnplInvoiceItemApiEntity.ccy) && C41536l.m120484d(this.amount, bnplInvoiceItemApiEntity.amount) && C41536l.m120484d(this.invoiceTypeDictionaryKey, bnplInvoiceItemApiEntity.invoiceTypeDictionaryKey);
    }

    public final Double getAmount() {
        return this.amount;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final String getFeeType() {
        return this.feeType;
    }

    public final String getInvoiceType() {
        return this.invoiceType;
    }

    public final String getInvoiceTypeDictionaryKey() {
        return this.invoiceTypeDictionaryKey;
    }

    public final Long getLoanKey() {
        return this.loanKey;
    }

    public final Long getPaymentDate() {
        return this.paymentDate;
    }

    public int hashCode() {
        Long l = this.loanKey;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.paymentDate;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.invoiceType;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.feeType;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ccy;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d = this.amount;
        int hashCode6 = (hashCode5 + (d == null ? 0 : d.hashCode())) * 31;
        String str4 = this.invoiceTypeDictionaryKey;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode6 + i;
    }

    public String toString() {
        Long l = this.loanKey;
        Long l2 = this.paymentDate;
        String str = this.invoiceType;
        String str2 = this.feeType;
        String str3 = this.ccy;
        Double d = this.amount;
        String str4 = this.invoiceTypeDictionaryKey;
        return "BnplInvoiceItemApiEntity(loanKey=" + l + ", paymentDate=" + l2 + ", invoiceType=" + str + ", feeType=" + str2 + ", ccy=" + str3 + ", amount=" + d + ", invoiceTypeDictionaryKey=" + str4 + ")";
    }
}
