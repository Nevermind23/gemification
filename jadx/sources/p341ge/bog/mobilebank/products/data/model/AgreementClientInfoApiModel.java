package p341ge.bog.mobilebank.products.data.model;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.products.data.model.AgreementClientInfoApiModel */
public final class AgreementClientInfoApiModel {
    private final BigDecimal bondsValue;
    private final BigDecimal cashValue;
    private final String ccy;
    private final Long clientKey;
    private final Long insertDate;
    private final BigDecimal sharesValue;
    private final BigDecimal totalValue;

    public AgreementClientInfoApiModel(BigDecimal bigDecimal, BigDecimal bigDecimal2, String str, Long l, Long l2, BigDecimal bigDecimal3, BigDecimal bigDecimal4) {
        this.bondsValue = bigDecimal;
        this.cashValue = bigDecimal2;
        this.ccy = str;
        this.clientKey = l;
        this.insertDate = l2;
        this.sharesValue = bigDecimal3;
        this.totalValue = bigDecimal4;
    }

    public static /* synthetic */ AgreementClientInfoApiModel copy$default(AgreementClientInfoApiModel agreementClientInfoApiModel, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str, Long l, Long l2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = agreementClientInfoApiModel.bondsValue;
        }
        if ((i & 2) != 0) {
            bigDecimal2 = agreementClientInfoApiModel.cashValue;
        }
        BigDecimal bigDecimal5 = bigDecimal2;
        if ((i & 4) != 0) {
            str = agreementClientInfoApiModel.ccy;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            l = agreementClientInfoApiModel.clientKey;
        }
        Long l3 = l;
        if ((i & 16) != 0) {
            l2 = agreementClientInfoApiModel.insertDate;
        }
        Long l4 = l2;
        if ((i & 32) != 0) {
            bigDecimal3 = agreementClientInfoApiModel.sharesValue;
        }
        BigDecimal bigDecimal6 = bigDecimal3;
        if ((i & 64) != 0) {
            bigDecimal4 = agreementClientInfoApiModel.totalValue;
        }
        return agreementClientInfoApiModel.copy(bigDecimal, bigDecimal5, str2, l3, l4, bigDecimal6, bigDecimal4);
    }

    public final BigDecimal component1() {
        return this.bondsValue;
    }

    public final BigDecimal component2() {
        return this.cashValue;
    }

    public final String component3() {
        return this.ccy;
    }

    public final Long component4() {
        return this.clientKey;
    }

    public final Long component5() {
        return this.insertDate;
    }

    public final BigDecimal component6() {
        return this.sharesValue;
    }

    public final BigDecimal component7() {
        return this.totalValue;
    }

    public final AgreementClientInfoApiModel copy(BigDecimal bigDecimal, BigDecimal bigDecimal2, String str, Long l, Long l2, BigDecimal bigDecimal3, BigDecimal bigDecimal4) {
        return new AgreementClientInfoApiModel(bigDecimal, bigDecimal2, str, l, l2, bigDecimal3, bigDecimal4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AgreementClientInfoApiModel)) {
            return false;
        }
        AgreementClientInfoApiModel agreementClientInfoApiModel = (AgreementClientInfoApiModel) obj;
        return C41536l.m120484d(this.bondsValue, agreementClientInfoApiModel.bondsValue) && C41536l.m120484d(this.cashValue, agreementClientInfoApiModel.cashValue) && C41536l.m120484d(this.ccy, agreementClientInfoApiModel.ccy) && C41536l.m120484d(this.clientKey, agreementClientInfoApiModel.clientKey) && C41536l.m120484d(this.insertDate, agreementClientInfoApiModel.insertDate) && C41536l.m120484d(this.sharesValue, agreementClientInfoApiModel.sharesValue) && C41536l.m120484d(this.totalValue, agreementClientInfoApiModel.totalValue);
    }

    public final BigDecimal getBondsValue() {
        return this.bondsValue;
    }

    public final BigDecimal getCashValue() {
        return this.cashValue;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final Long getClientKey() {
        return this.clientKey;
    }

    public final Long getInsertDate() {
        return this.insertDate;
    }

    public final BigDecimal getSharesValue() {
        return this.sharesValue;
    }

    public final BigDecimal getTotalValue() {
        return this.totalValue;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.bondsValue;
        int i = 0;
        int hashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.cashValue;
        int hashCode2 = (hashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str = this.ccy;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.clientKey;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.insertDate;
        int hashCode5 = (hashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.sharesValue;
        int hashCode6 = (hashCode5 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.totalValue;
        if (bigDecimal4 != null) {
            i = bigDecimal4.hashCode();
        }
        return hashCode6 + i;
    }

    public String toString() {
        BigDecimal bigDecimal = this.bondsValue;
        BigDecimal bigDecimal2 = this.cashValue;
        String str = this.ccy;
        Long l = this.clientKey;
        Long l2 = this.insertDate;
        BigDecimal bigDecimal3 = this.sharesValue;
        BigDecimal bigDecimal4 = this.totalValue;
        return "AgreementClientInfoApiModel(bondsValue=" + bigDecimal + ", cashValue=" + bigDecimal2 + ", ccy=" + str + ", clientKey=" + l + ", insertDate=" + l2 + ", sharesValue=" + bigDecimal3 + ", totalValue=" + bigDecimal4 + ")";
    }
}
