package p341ge.bog.mobilebank.products.data.model;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.products.data.model.CashAgreementApiModel */
public final class CashAgreementApiModel {
    private final String ccy;

    /* renamed from: id */
    private final long f82304id;
    private final String note;
    private final BigDecimal quantity;

    public CashAgreementApiModel(long j, String str, String str2, BigDecimal bigDecimal) {
        this.f82304id = j;
        this.ccy = str;
        this.note = str2;
        this.quantity = bigDecimal;
    }

    public static /* synthetic */ CashAgreementApiModel copy$default(CashAgreementApiModel cashAgreementApiModel, long j, String str, String str2, BigDecimal bigDecimal, int i, Object obj) {
        if ((i & 1) != 0) {
            j = cashAgreementApiModel.f82304id;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = cashAgreementApiModel.ccy;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = cashAgreementApiModel.note;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            bigDecimal = cashAgreementApiModel.quantity;
        }
        return cashAgreementApiModel.copy(j2, str3, str4, bigDecimal);
    }

    public final long component1() {
        return this.f82304id;
    }

    public final String component2() {
        return this.ccy;
    }

    public final String component3() {
        return this.note;
    }

    public final BigDecimal component4() {
        return this.quantity;
    }

    public final CashAgreementApiModel copy(long j, String str, String str2, BigDecimal bigDecimal) {
        return new CashAgreementApiModel(j, str, str2, bigDecimal);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashAgreementApiModel)) {
            return false;
        }
        CashAgreementApiModel cashAgreementApiModel = (CashAgreementApiModel) obj;
        return this.f82304id == cashAgreementApiModel.f82304id && C41536l.m120484d(this.ccy, cashAgreementApiModel.ccy) && C41536l.m120484d(this.note, cashAgreementApiModel.note) && C41536l.m120484d(this.quantity, cashAgreementApiModel.quantity);
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final long getId() {
        return this.f82304id;
    }

    public final String getNote() {
        return this.note;
    }

    public final BigDecimal getQuantity() {
        return this.quantity;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f82304id) * 31;
        String str = this.ccy;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.note;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal = this.quantity;
        if (bigDecimal != null) {
            i = bigDecimal.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        long j = this.f82304id;
        String str = this.ccy;
        String str2 = this.note;
        BigDecimal bigDecimal = this.quantity;
        return "CashAgreementApiModel(id=" + j + ", ccy=" + str + ", note=" + str2 + ", quantity=" + bigDecimal + ")";
    }
}
