package p341ge.bog.mobilebank.loans.data.model;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.loans.data.model.LoanPlnHistorySummaryApiModel */
public final class LoanPlnHistorySummaryApiModel {
    private final BigDecimal amount;
    private final String ccy;
    private final Long operDate;
    private final String operType;
    private final String operTypeDictionaryKey;
    private final String operTypeDictionaryValue;
    private final String productDictionaryKey;

    public LoanPlnHistorySummaryApiModel(BigDecimal bigDecimal, String str, Long l, String str2, String str3, String str4, String str5) {
        C41536l.m120489i(bigDecimal, "amount");
        C41536l.m120489i(str, "ccy");
        this.amount = bigDecimal;
        this.ccy = str;
        this.operDate = l;
        this.operType = str2;
        this.operTypeDictionaryKey = str3;
        this.operTypeDictionaryValue = str4;
        this.productDictionaryKey = str5;
    }

    public static /* synthetic */ LoanPlnHistorySummaryApiModel copy$default(LoanPlnHistorySummaryApiModel loanPlnHistorySummaryApiModel, BigDecimal bigDecimal, String str, Long l, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = loanPlnHistorySummaryApiModel.amount;
        }
        if ((i & 2) != 0) {
            str = loanPlnHistorySummaryApiModel.ccy;
        }
        String str6 = str;
        if ((i & 4) != 0) {
            l = loanPlnHistorySummaryApiModel.operDate;
        }
        Long l2 = l;
        if ((i & 8) != 0) {
            str2 = loanPlnHistorySummaryApiModel.operType;
        }
        String str7 = str2;
        if ((i & 16) != 0) {
            str3 = loanPlnHistorySummaryApiModel.operTypeDictionaryKey;
        }
        String str8 = str3;
        if ((i & 32) != 0) {
            str4 = loanPlnHistorySummaryApiModel.operTypeDictionaryValue;
        }
        String str9 = str4;
        if ((i & 64) != 0) {
            str5 = loanPlnHistorySummaryApiModel.productDictionaryKey;
        }
        return loanPlnHistorySummaryApiModel.copy(bigDecimal, str6, l2, str7, str8, str9, str5);
    }

    public final BigDecimal component1() {
        return this.amount;
    }

    public final String component2() {
        return this.ccy;
    }

    public final Long component3() {
        return this.operDate;
    }

    public final String component4() {
        return this.operType;
    }

    public final String component5() {
        return this.operTypeDictionaryKey;
    }

    public final String component6() {
        return this.operTypeDictionaryValue;
    }

    public final String component7() {
        return this.productDictionaryKey;
    }

    public final LoanPlnHistorySummaryApiModel copy(BigDecimal bigDecimal, String str, Long l, String str2, String str3, String str4, String str5) {
        C41536l.m120489i(bigDecimal, "amount");
        C41536l.m120489i(str, "ccy");
        return new LoanPlnHistorySummaryApiModel(bigDecimal, str, l, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoanPlnHistorySummaryApiModel)) {
            return false;
        }
        LoanPlnHistorySummaryApiModel loanPlnHistorySummaryApiModel = (LoanPlnHistorySummaryApiModel) obj;
        return C41536l.m120484d(this.amount, loanPlnHistorySummaryApiModel.amount) && C41536l.m120484d(this.ccy, loanPlnHistorySummaryApiModel.ccy) && C41536l.m120484d(this.operDate, loanPlnHistorySummaryApiModel.operDate) && C41536l.m120484d(this.operType, loanPlnHistorySummaryApiModel.operType) && C41536l.m120484d(this.operTypeDictionaryKey, loanPlnHistorySummaryApiModel.operTypeDictionaryKey) && C41536l.m120484d(this.operTypeDictionaryValue, loanPlnHistorySummaryApiModel.operTypeDictionaryValue) && C41536l.m120484d(this.productDictionaryKey, loanPlnHistorySummaryApiModel.productDictionaryKey);
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final Long getOperDate() {
        return this.operDate;
    }

    public final String getOperType() {
        return this.operType;
    }

    public final String getOperTypeDictionaryKey() {
        return this.operTypeDictionaryKey;
    }

    public final String getOperTypeDictionaryValue() {
        return this.operTypeDictionaryValue;
    }

    public final String getProductDictionaryKey() {
        return this.productDictionaryKey;
    }

    public int hashCode() {
        int hashCode = ((this.amount.hashCode() * 31) + this.ccy.hashCode()) * 31;
        Long l = this.operDate;
        int i = 0;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.operType;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.operTypeDictionaryKey;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.operTypeDictionaryValue;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.productDictionaryKey;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        BigDecimal bigDecimal = this.amount;
        String str = this.ccy;
        Long l = this.operDate;
        String str2 = this.operType;
        String str3 = this.operTypeDictionaryKey;
        String str4 = this.operTypeDictionaryValue;
        String str5 = this.productDictionaryKey;
        return "LoanPlnHistorySummaryApiModel(amount=" + bigDecimal + ", ccy=" + str + ", operDate=" + l + ", operType=" + str2 + ", operTypeDictionaryKey=" + str3 + ", operTypeDictionaryValue=" + str4 + ", productDictionaryKey=" + str5 + ")";
    }
}
