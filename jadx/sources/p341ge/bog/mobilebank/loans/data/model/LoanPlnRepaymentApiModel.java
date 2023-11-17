package p341ge.bog.mobilebank.loans.data.model;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.loans.data.model.LoanPlnRepaymentApiModel */
public final class LoanPlnRepaymentApiModel {
    private final long agreeId;
    private final BigDecimal amount;
    private final String ccy;

    /* renamed from: id */
    private final long f80198id;
    private final long operDate;
    private final String operType;
    private final String operTypeDictionaryKey;
    private final String operTypeDictionaryValue;

    public LoanPlnRepaymentApiModel(long j, BigDecimal bigDecimal, String str, long j2, long j3, String str2, String str3, String str4) {
        C41536l.m120489i(bigDecimal, "amount");
        C41536l.m120489i(str, "ccy");
        this.agreeId = j;
        this.amount = bigDecimal;
        this.ccy = str;
        this.f80198id = j2;
        this.operDate = j3;
        this.operType = str2;
        this.operTypeDictionaryKey = str3;
        this.operTypeDictionaryValue = str4;
    }

    public static /* synthetic */ LoanPlnRepaymentApiModel copy$default(LoanPlnRepaymentApiModel loanPlnRepaymentApiModel, long j, BigDecimal bigDecimal, String str, long j2, long j3, String str2, String str3, String str4, int i, Object obj) {
        LoanPlnRepaymentApiModel loanPlnRepaymentApiModel2 = loanPlnRepaymentApiModel;
        int i2 = i;
        return loanPlnRepaymentApiModel.copy((i2 & 1) != 0 ? loanPlnRepaymentApiModel2.agreeId : j, (i2 & 2) != 0 ? loanPlnRepaymentApiModel2.amount : bigDecimal, (i2 & 4) != 0 ? loanPlnRepaymentApiModel2.ccy : str, (i2 & 8) != 0 ? loanPlnRepaymentApiModel2.f80198id : j2, (i2 & 16) != 0 ? loanPlnRepaymentApiModel2.operDate : j3, (i2 & 32) != 0 ? loanPlnRepaymentApiModel2.operType : str2, (i2 & 64) != 0 ? loanPlnRepaymentApiModel2.operTypeDictionaryKey : str3, (i2 & 128) != 0 ? loanPlnRepaymentApiModel2.operTypeDictionaryValue : str4);
    }

    public final long component1() {
        return this.agreeId;
    }

    public final BigDecimal component2() {
        return this.amount;
    }

    public final String component3() {
        return this.ccy;
    }

    public final long component4() {
        return this.f80198id;
    }

    public final long component5() {
        return this.operDate;
    }

    public final String component6() {
        return this.operType;
    }

    public final String component7() {
        return this.operTypeDictionaryKey;
    }

    public final String component8() {
        return this.operTypeDictionaryValue;
    }

    public final LoanPlnRepaymentApiModel copy(long j, BigDecimal bigDecimal, String str, long j2, long j3, String str2, String str3, String str4) {
        BigDecimal bigDecimal2 = bigDecimal;
        C41536l.m120489i(bigDecimal2, "amount");
        String str5 = str;
        C41536l.m120489i(str5, "ccy");
        return new LoanPlnRepaymentApiModel(j, bigDecimal2, str5, j2, j3, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoanPlnRepaymentApiModel)) {
            return false;
        }
        LoanPlnRepaymentApiModel loanPlnRepaymentApiModel = (LoanPlnRepaymentApiModel) obj;
        return this.agreeId == loanPlnRepaymentApiModel.agreeId && C41536l.m120484d(this.amount, loanPlnRepaymentApiModel.amount) && C41536l.m120484d(this.ccy, loanPlnRepaymentApiModel.ccy) && this.f80198id == loanPlnRepaymentApiModel.f80198id && this.operDate == loanPlnRepaymentApiModel.operDate && C41536l.m120484d(this.operType, loanPlnRepaymentApiModel.operType) && C41536l.m120484d(this.operTypeDictionaryKey, loanPlnRepaymentApiModel.operTypeDictionaryKey) && C41536l.m120484d(this.operTypeDictionaryValue, loanPlnRepaymentApiModel.operTypeDictionaryValue);
    }

    public final long getAgreeId() {
        return this.agreeId;
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final long getId() {
        return this.f80198id;
    }

    public final long getOperDate() {
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

    public int hashCode() {
        int a = ((((((((C7397t.m28148a(this.agreeId) * 31) + this.amount.hashCode()) * 31) + this.ccy.hashCode()) * 31) + C7397t.m28148a(this.f80198id)) * 31) + C7397t.m28148a(this.operDate)) * 31;
        String str = this.operType;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.operTypeDictionaryKey;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.operTypeDictionaryValue;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        long j = this.agreeId;
        BigDecimal bigDecimal = this.amount;
        String str = this.ccy;
        long j2 = this.f80198id;
        long j3 = this.operDate;
        String str2 = this.operType;
        String str3 = this.operTypeDictionaryKey;
        String str4 = this.operTypeDictionaryValue;
        return "LoanPlnRepaymentApiModel(agreeId=" + j + ", amount=" + bigDecimal + ", ccy=" + str + ", id=" + j2 + ", operDate=" + j3 + ", operType=" + str2 + ", operTypeDictionaryKey=" + str3 + ", operTypeDictionaryValue=" + str4 + ")";
    }
}
