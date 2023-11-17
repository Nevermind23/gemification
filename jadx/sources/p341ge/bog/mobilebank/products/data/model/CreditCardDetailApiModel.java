package p341ge.bog.mobilebank.products.data.model;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.products.data.model.CreditCardDetailApiModel */
public final class CreditCardDetailApiModel {
    private final long acctKey;
    private final BigDecimal atmPercent;
    private final String fileId;
    private final String fileUrl;
    private final BigDecimal overdraftLimit;
    private final BigDecimal posPercent;

    public CreditCardDetailApiModel(long j, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, String str, String str2) {
        this.acctKey = j;
        this.atmPercent = bigDecimal;
        this.posPercent = bigDecimal2;
        this.overdraftLimit = bigDecimal3;
        this.fileUrl = str;
        this.fileId = str2;
    }

    public static /* synthetic */ CreditCardDetailApiModel copy$default(CreditCardDetailApiModel creditCardDetailApiModel, long j, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, String str, String str2, int i, Object obj) {
        CreditCardDetailApiModel creditCardDetailApiModel2 = creditCardDetailApiModel;
        return creditCardDetailApiModel.copy((i & 1) != 0 ? creditCardDetailApiModel2.acctKey : j, (i & 2) != 0 ? creditCardDetailApiModel2.atmPercent : bigDecimal, (i & 4) != 0 ? creditCardDetailApiModel2.posPercent : bigDecimal2, (i & 8) != 0 ? creditCardDetailApiModel2.overdraftLimit : bigDecimal3, (i & 16) != 0 ? creditCardDetailApiModel2.fileUrl : str, (i & 32) != 0 ? creditCardDetailApiModel2.fileId : str2);
    }

    public final long component1() {
        return this.acctKey;
    }

    public final BigDecimal component2() {
        return this.atmPercent;
    }

    public final BigDecimal component3() {
        return this.posPercent;
    }

    public final BigDecimal component4() {
        return this.overdraftLimit;
    }

    public final String component5() {
        return this.fileUrl;
    }

    public final String component6() {
        return this.fileId;
    }

    public final CreditCardDetailApiModel copy(long j, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, String str, String str2) {
        return new CreditCardDetailApiModel(j, bigDecimal, bigDecimal2, bigDecimal3, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreditCardDetailApiModel)) {
            return false;
        }
        CreditCardDetailApiModel creditCardDetailApiModel = (CreditCardDetailApiModel) obj;
        return this.acctKey == creditCardDetailApiModel.acctKey && C41536l.m120484d(this.atmPercent, creditCardDetailApiModel.atmPercent) && C41536l.m120484d(this.posPercent, creditCardDetailApiModel.posPercent) && C41536l.m120484d(this.overdraftLimit, creditCardDetailApiModel.overdraftLimit) && C41536l.m120484d(this.fileUrl, creditCardDetailApiModel.fileUrl) && C41536l.m120484d(this.fileId, creditCardDetailApiModel.fileId);
    }

    public final long getAcctKey() {
        return this.acctKey;
    }

    public final BigDecimal getAtmPercent() {
        return this.atmPercent;
    }

    public final String getFileId() {
        return this.fileId;
    }

    public final String getFileUrl() {
        return this.fileUrl;
    }

    public final BigDecimal getOverdraftLimit() {
        return this.overdraftLimit;
    }

    public final BigDecimal getPosPercent() {
        return this.posPercent;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.acctKey) * 31;
        BigDecimal bigDecimal = this.atmPercent;
        int i = 0;
        int hashCode = (a + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.posPercent;
        int hashCode2 = (hashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.overdraftLimit;
        int hashCode3 = (hashCode2 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        String str = this.fileUrl;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.fileId;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        long j = this.acctKey;
        BigDecimal bigDecimal = this.atmPercent;
        BigDecimal bigDecimal2 = this.posPercent;
        BigDecimal bigDecimal3 = this.overdraftLimit;
        String str = this.fileUrl;
        String str2 = this.fileId;
        return "CreditCardDetailApiModel(acctKey=" + j + ", atmPercent=" + bigDecimal + ", posPercent=" + bigDecimal2 + ", overdraftLimit=" + bigDecimal3 + ", fileUrl=" + str + ", fileId=" + str2 + ")";
    }
}
